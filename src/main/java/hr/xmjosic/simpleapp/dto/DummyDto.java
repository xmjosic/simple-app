package hr.xmjosic.simpleapp.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DummyDto {
  private String id;
  private String fullName;
  private int birthYear;
}
