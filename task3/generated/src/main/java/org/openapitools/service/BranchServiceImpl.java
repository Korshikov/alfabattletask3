package org.openapitools.service;

import org.modelmapper.ModelMapper;
import org.openapitools.model.Branches;
import org.openapitools.repository.BranchRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class BranchServiceImpl implements BranchService {
    private final BranchRepository branchRepository;
    private final ModelMapper modelMapper;

    public BranchServiceImpl(BranchRepository branchRepository, ModelMapper modelMapper) {
        this.branchRepository = branchRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Branches getById(Long blanchId){
        var branchEntity  = branchRepository.findById(blanchId).orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(branchEntity, Branches.class);
    }
}
