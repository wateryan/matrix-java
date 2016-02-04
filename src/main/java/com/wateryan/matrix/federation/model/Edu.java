package com.wateryan.matrix.federation.model;


import java.io.Serializable;

public interface Edu extends Serializable {

  String getEduType();

  Serializable getContent();

}