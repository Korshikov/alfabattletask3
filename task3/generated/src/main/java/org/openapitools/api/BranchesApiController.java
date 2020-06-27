package org.openapitools.api;

import org.openapitools.model.Branches;
import org.openapitools.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
        return branchService.getById(id);
    }
}
