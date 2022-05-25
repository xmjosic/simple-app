package hr.xmjosic.simpleapp.service;

import hr.xmjosic.simpleapp.dto.RequestDto;
import hr.xmjosic.simpleapp.dto.ResponseDto;

public interface DummyService {
  ResponseDto execute(final RequestDto requestDto);
}
