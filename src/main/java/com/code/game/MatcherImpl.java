package com.code.game;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MatcherImpl implements Matcher {

  private static final Logger LOGGER = LoggerFactory.getLogger(MatcherImpl.class);

  public MatcherImpl(CsvStream moviesCsv, CsvStream actorsAndDirectorsCsv) {
    LOGGER.info("Importing database");
    // TODO implement me
    LOGGER.info("Database imported");
  }

  @Override
  public List<IdMapping> match(DatabaseType databaseType, CsvStream externalDb) {
    // TODO implement me
    return List.of();
  }
}
