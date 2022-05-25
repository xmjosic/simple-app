package hr.xmjosic.simpleapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestDto {
  @NotBlank private String firstName;
  @NotBlank private String lastName;
  @NotNull private Integer age;
}
