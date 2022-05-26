package hr.xmjosic.simpleapp.dto;

import lombok.Builder;

@Builder
public record DummyDto(String id, String fullName, int birthYear) {}
