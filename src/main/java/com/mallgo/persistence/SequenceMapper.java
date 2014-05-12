package com.mallgo.persistence;

import com.mallgo.domain.Sequence;

public interface SequenceMapper {

  Sequence getSequence(Sequence sequence);
  void updateSequence(Sequence sequence);
}
