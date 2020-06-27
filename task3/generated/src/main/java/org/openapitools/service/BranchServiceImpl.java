package org.openapitools.service;

import org.modelmapper.ModelMapper;
import org.openapitools.exception.BranchEntityNotFoundException;
import org.openapitools.model.Branches;
import org.openapitools.repository.BranchRepository;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImpl implements BranchService {
    private final BranchRepository branchRepository;
    private final ModelMapper modelMapper;

    public BranchServiceImpl(BranchRepository branchRepository, ModelMapper modelMapper) {
        this.branchRepository = branchRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Branches getBranchById(Long blanchId){
        var branchEntity  = branchRepository.findById(blanchId).orElseThrow(BranchEntityNotFoundException::new);
        return modelMapper.map(branchEntity, Branches.class);
    }
}
