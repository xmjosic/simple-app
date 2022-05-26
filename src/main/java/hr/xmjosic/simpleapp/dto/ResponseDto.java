package hr.xmjosic.simpleapp.dto;

import lombok.Builder;

@Builder
public record ResponseDto(StatusEnum status, String id) {}
