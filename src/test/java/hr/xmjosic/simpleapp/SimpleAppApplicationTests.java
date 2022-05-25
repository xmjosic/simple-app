package hr.xmjosic.simpleapp;

import hr.xmjosic.simpleapp.controller.Controller;
import hr.xmjosic.simpleapp.dto.RequestDto;
import hr.xmjosic.simpleapp.dto.ResponseDto;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static java.util.Objects.nonNull;

@SpringBootTest
class SimpleAppApplicationTests {

  @Autowired private Controller controller;

  @Test
  void contextLoads() {
    ResponseDto result =
        controller.postRequest(
            RequestDto.builder().firstName("Joe").lastName("Doe").age(25).build());

    Assertions.assertThat(result)
        .isNotNull()
        .matches(responseDto -> nonNull(responseDto.getId()) && nonNull(responseDto.getStatus()));
  }
}
