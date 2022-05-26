package hr.xmjosic.simpleapp.converter;

import hr.xmjosic.simpleapp.dto.DummyDto;
import hr.xmjosic.simpleapp.dto.RequestDto;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.util.UUID;

public class RequestDtoToDummyDtoConverter implements Converter<RequestDto, DummyDto> {
  @Override
  public DummyDto convert(RequestDto source) {
    return DummyDto.builder()
        .id(UUID.randomUUID().toString())
        .fullName(source.firstName().concat(source.lastName()))
        .birthYear(LocalDate.now().getYear() - source.age())
        .build();
  }
}
