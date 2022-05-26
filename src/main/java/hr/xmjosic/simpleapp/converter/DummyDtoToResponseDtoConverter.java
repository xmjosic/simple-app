package hr.xmjosic.simpleapp.converter;

import hr.xmjosic.simpleapp.dto.DummyDto;
import hr.xmjosic.simpleapp.dto.ResponseDto;
import org.springframework.core.convert.converter.Converter;

import static hr.xmjosic.simpleapp.dto.StatusEnum.CREATED;

public class DummyDtoToResponseDtoConverter implements Converter<DummyDto, ResponseDto> {
  @Override
  public ResponseDto convert(DummyDto source) {
    return ResponseDto.builder().id(source.id()).status(CREATED).build();
  }
}
