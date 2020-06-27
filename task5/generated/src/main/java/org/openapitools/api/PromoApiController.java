package org.openapitools.api;

import org.openapitools.model.PromoMatrix;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-27T13:37:56.950+03:00[Europe/Moscow]")

@Controller
@RequestMapping("${openapi..base-path:}")
public class PromoApiController implements PromoApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PromoApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Void> setMatrix(@Valid PromoMatrix body) {
        return null;
    }
}
