package hr.xmjosic.simpleapp.service.impl;

import hr.xmjosic.simpleapp.dao.DummyRepository;
import hr.xmjosic.simpleapp.dto.DummyDto;
import hr.xmjosic.simpleapp.dto.RequestDto;
import hr.xmjosic.simpleapp.dto.ResponseDto;
import hr.xmjosic.simpleapp.event.ConversionEventMsg;
import hr.xmjosic.simpleapp.event.ConversionEventPublisher;
import hr.xmjosic.simpleapp.service.DummyService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DummyServiceImpl implements DummyService {

  private final ConversionService conversionService;
  private final ConversionEventPublisher conversionEventPublisher;
  private final DummyRepository dummyRepository;

  @Override
  public ResponseDto execute(RequestDto requestDto) {
    DummyDto dummyDto = conversionService.convert(requestDto, DummyDto.class);
    conversionEventPublisher.publish(new ConversionEventMsg("Converted RequestDto to DummyDto."));
    DummyDto dummyDto1 = dummyRepository.execute(dummyDto);
    ResponseDto retVal = conversionService.convert(dummyDto1, ResponseDto.class);
    conversionEventPublisher.publish(new ConversionEventMsg("Converted DummyDto to ResponseDto."));
    return retVal;
  }
}
