package org.openapitools.api;

import org.openapitools.exception.BranchEntityNotFoundException;
import org.openapitools.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {



  @ExceptionHandler({BranchEntityNotFoundException.class})
  @ResponseBody
  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  ErrorResponse handleBranchEntityNotFoundException(BranchEntityNotFoundException exc) {
    return ErrorResponse.builder().status("branch not found").build();
  }

}
