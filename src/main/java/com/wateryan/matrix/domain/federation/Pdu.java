package com.wateryan.matrix.domain.federation;

import java.io.Serializable;

public interface Pdu extends Serializable {

  String getContext();

  String getUserId();

  String getOrigin();

  String getPduId();

  Integer getOriginServerTs();

  String getPduType();

  Serializable getContent();

  Integer getDepth();

  Boolean isState();
}