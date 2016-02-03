package com.wateryan.matrix.federation.impl;


import com.wateryan.matrix.federation.Edu;

import java.io.Serializable;

public class EduImpl implements Edu {

  private static final long serialVersionUID = 8969723726252591553L;
  private final String eduType;
  private final Serializable content;

  private EduImpl(EduImplBuilder builder) {
    this.eduType = builder.eduType;
    this.content = builder.content;
  }

  @Override
  public String getEduType() {
    return this.eduType;
  }

  @Override
  public Serializable getContent() {
    return this.content;
  }

  public static class EduImplBuilder {
    private String eduType;
    private Serializable content;

    private EduImplBuilder() {

    }

    public void setEduType(String eduType) {
      this.eduType = eduType;
    }

    public void setContent(Serializable content) {
      this.content = content;
    }

    public Edu build() {
      return new EduImpl(this);
    }
  }

}