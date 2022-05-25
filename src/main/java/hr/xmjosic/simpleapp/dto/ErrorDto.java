package hr.xmjosic.simpleapp.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@EqualsAndHashCode
@Getter
@Builder
public class ErrorDto {
  private final String error;
  private final String path;
  private final LocalDateTime timestamp;
}
