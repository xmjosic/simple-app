package hr.xmjosic.simpleapp.config;

import hr.xmjosic.simpleapp.converter.DummyDtoToResponseDtoConverter;
import hr.xmjosic.simpleapp.converter.RequestDtoToDummyDtoConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@Configuration
public class ConverterConfig {

  @Primary
  @Bean
  public ConversionService conversionService() {
    DefaultConversionService retVal = new DefaultConversionService();
    retVal.addConverter(new RequestDtoToDummyDtoConverter());
    retVal.addConverter(new DummyDtoToResponseDtoConverter());
    return retVal;
  }
}
