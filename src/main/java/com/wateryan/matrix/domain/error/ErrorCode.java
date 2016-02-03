package com.wateryan.matrix.domain.error;

public enum ErrorCode {

  M_FORBIDDEN(""),
  M_UNKNOWN_TOKEN(""),
  M_BAD_JSON(""),
  M_NOT_JSON(""),
  M_NOT_FOUND(""),
  M_LIMIT_EXCEEDED(""),
  M_USER_IN_USE(""),
  M_ROOM_IN_USE(""),
  M_BAD_PAGINATION("");

  private final String error;

  public String getError() {
    return this.error;
  }

  ErrorCode(String error) {
    this.error = error;
  }

}
