package org.openapitools.api;

import io.swagger.annotations.ApiParam;
import org.openapitools.model.Branches;
import org.openapitools.model.BranchesWithDistance;
import org.openapitools.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("${openapi.apiDocumentation.base-path:}")
public class BranchesApiController  {

    private final BranchService branchService;

    @Autowired
    public BranchesApiController( BranchService branchService) {
        this.branchService = branchService;
    }


    @ResponseBody
    @RequestMapping(value = "/branches/{id}",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public Branches getBranchUsingGET(@PathVariable("id") Long id) {
        return branchService.getBranchById(id);
    }

    @RequestMapping(value = "/branches",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public BranchesWithDistance getNearBranchUsingGET(@NotNull @ApiParam(value = "lat", required = true) @Valid @RequestParam(value = "lat") Double lat, @NotNull @ApiParam(value = "lon", required = true) @Valid @RequestParam(value = "lon") Double lon) {
        return branchService.getNearBranchByLatAndLon(lat, lon);
    }
}
