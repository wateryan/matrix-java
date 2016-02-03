package com.wateryan.matrix.federation;


import java.io.Serializable;

public interface Edu extends Serializable {

  String getEduType();

  Serializable getContent();

}