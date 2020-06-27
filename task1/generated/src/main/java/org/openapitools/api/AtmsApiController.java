package org.openapitools.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-27T15:58:16.013+03:00[Europe/Moscow]")

@Controller
@RequestMapping("${openapi.apiDocumentation.base-path:}")
public class AtmsApiController implements AtmsApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AtmsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
