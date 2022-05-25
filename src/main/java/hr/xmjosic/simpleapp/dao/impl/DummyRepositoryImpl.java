package hr.xmjosic.simpleapp.dao.impl;

import hr.xmjosic.simpleapp.dao.DummyRepository;
import hr.xmjosic.simpleapp.dto.DummyDto;
import org.springframework.stereotype.Repository;

@Repository
public class DummyRepositoryImpl implements DummyRepository {
  @Override
  public DummyDto execute(final DummyDto dummyDto) {
    return dummyDto;
  }
}
