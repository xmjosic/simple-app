package hr.xmjosic.simpleapp.dto;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ErrorDto(String error, String path, LocalDateTime timestamp) {}
