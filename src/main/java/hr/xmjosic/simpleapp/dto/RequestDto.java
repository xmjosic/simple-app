package hr.xmjosic.simpleapp.dto;

import lombok.Builder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Builder
public record RequestDto(@NotBlank(message = "First name must not be empty.") String firstName, @NotBlank(message = "Last name must not be empty.") String lastName, @NotNull(message = "Age must not be null.") Integer age) {}
