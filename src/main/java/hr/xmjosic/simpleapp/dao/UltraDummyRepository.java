package hr.xmjosic.simpleapp.dao;

import hr.xmjosic.simpleapp.dto.DummyDto;

public interface UltraDummyRepository {
  DummyDto execute(final DummyDto dummyDto);
}
