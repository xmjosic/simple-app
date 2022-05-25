package hr.xmjosic.simpleapp.controller;

import hr.xmjosic.simpleapp.dto.RequestDto;
import hr.xmjosic.simpleapp.dto.ResponseDto;
import hr.xmjosic.simpleapp.service.DummyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class Controller {

  private final DummyService dummyService;

  @PostMapping("/post-request")
  public ResponseDto postRequest(@Valid @RequestBody RequestDto requestDto) {
    return dummyService.execute(requestDto);
  }
}
