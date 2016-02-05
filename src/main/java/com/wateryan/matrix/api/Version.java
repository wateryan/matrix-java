package com.wateryan.matrix.api;

public enum Version {
  R_0("r0"),
  V_1("v1");

  private final String versionString;

  Version(String versionString) {
    this.versionString = versionString;
  }

  public String getVersionString() {
    return this.versionString;
  }

}
