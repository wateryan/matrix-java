package com.wateryan.matrix.domain.federation;


import java.io.Serializable;

public interface Edu extends Serializable {

  String getEduType();

  Serializable getContent();

}