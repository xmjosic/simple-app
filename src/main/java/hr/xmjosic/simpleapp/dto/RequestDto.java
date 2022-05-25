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
  @NotBlank(message = "First name must not be empty.") private String firstName;
  @NotBlank(message = "Last name must not be empty.") private String lastName;
  @NotNull(message = "Age must not be null.") private Integer age;
}
