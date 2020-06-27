package org.openapitools.service;

import org.openapitools.model.Branches;
import org.openapitools.model.BranchesWithDistance;

public interface BranchService {
    Branches getBranchById(Long blanchId);
    BranchesWithDistance getNearBranchByLatAndLon(Double lat, Double lon);
}
