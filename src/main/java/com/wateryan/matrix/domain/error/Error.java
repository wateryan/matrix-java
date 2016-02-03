package com.wateryan.matrix.domain.error;

public class Error {

  private final int errorCode;
  private final String error;

  public Error(int errorCode, String error) {
    this.errorCode = errorCode;
    this.error = error;
  }

  public int getErrorCode() {
    return this.errorCode;
  }

  public String getError() {
    return this.error;
  }

}
