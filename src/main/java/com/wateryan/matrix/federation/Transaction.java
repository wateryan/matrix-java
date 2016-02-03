package com.wateryan.matrix.federation;

import java.io.Serializable;
import java.util.List;

public interface Transaction extends Serializable {

  String getTransactionId();

  String getOrigin();

  Integer getOriginServerTs();

  List<String> getPreviousIds();

  List<Serializable> getPdus();

  List<Serializable> getEdus();
}