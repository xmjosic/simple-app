package hr.xmjosic.simpleapp.dao;

import hr.xmjosic.simpleapp.dto.DummyDto;

public interface DummyRepository {
  DummyDto execute(final DummyDto dummyDto);
}
