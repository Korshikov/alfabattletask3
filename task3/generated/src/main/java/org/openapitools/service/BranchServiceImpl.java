package org.openapitools.service;

import org.modelmapper.ModelMapper;
import org.openapitools.exception.BranchEntityNotFoundException;
import org.openapitools.model.Branches;
import org.openapitools.model.BranchesWithDistance;
import org.openapitools.repository.BranchRepository;
import org.openapitools.utils.EarthDistanceUtil;
import org.springframework.stereotype.Service;

import java.util.Comparator;

@Service
public class BranchServiceImpl implements BranchService {
    private final BranchRepository branchRepository;
    private final ModelMapper modelMapper;

    public BranchServiceImpl(BranchRepository branchRepository, ModelMapper modelMapper) {
        this.branchRepository = branchRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Branches getBranchById(Long blanchId) {
        var branchEntity = branchRepository.findById(blanchId).orElseThrow(BranchEntityNotFoundException::new);
        return modelMapper.map(branchEntity, Branches.class);
    }

    @Override
    public BranchesWithDistance getNearBranchByLatAndLon(Double lat, Double lon) {
        return branchRepository.findAll().parallelStream().map(branch -> {
            var branchesWithDistance = modelMapper.map(branch, BranchesWithDistance.class);
            branchesWithDistance.setDistance(Math.round(EarthDistanceUtil.calculateDistanceBetweenLatLon(lat, lon, branchesWithDistance.getLat(), branchesWithDistance.getLon())));
            return branchesWithDistance;
        }).min(Comparator.comparing(BranchesWithDistance::getDistance)).orElseThrow(BranchEntityNotFoundException::new);
    }
}
