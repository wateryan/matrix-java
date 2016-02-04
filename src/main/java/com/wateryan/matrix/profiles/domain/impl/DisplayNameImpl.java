package com.wateryan.matrix.profiles.domain.impl;

import com.wateryan.matrix.profiles.domain.DisplayName;

public class DisplayNameImpl implements DisplayName {

  private final String displayName;

  public DisplayNameImpl(String displayName) {
    this.displayName = displayName;
  }

  public String getDisplayName() {
    return this.displayName;
  }
}
