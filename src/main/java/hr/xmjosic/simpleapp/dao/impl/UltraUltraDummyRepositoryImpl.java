package hr.xmjosic.simpleapp.dao.impl;

import hr.xmjosic.simpleapp.dao.UltraDummyRepository;
import hr.xmjosic.simpleapp.dto.DummyDto;
import org.springframework.stereotype.Repository;

@Repository
public class UltraUltraDummyRepositoryImpl implements UltraDummyRepository {
  @Override
  public DummyDto execute(final DummyDto dummyDto) {
    return dummyDto;
  }
}
