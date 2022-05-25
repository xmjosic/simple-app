package hr.xmjosic.simpleapp.controller;

import hr.xmjosic.simpleapp.dto.ErrorDto;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RestControllerAdvice
public class DummyControllerAdvice {

  @ExceptionHandler(Exception.class)
  @ResponseStatus(INTERNAL_SERVER_ERROR)
  public ErrorDto handle(Exception e, HttpServletRequest request) {
    return ErrorDto.builder()
        .error(e.getMessage())
        .path(request.getRequestURI())
        .timestamp(LocalDateTime.now())
        .build();
  }
}
