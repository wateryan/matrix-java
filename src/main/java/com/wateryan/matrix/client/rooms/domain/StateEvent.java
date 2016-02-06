package com.wateryan.matrix.client.rooms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateEvent {

  private String content;
  private String type;
  @JsonProperty("state_key")
  private String stateKey;

  public StateEvent() {

  }

  public String getContent() {
    return content;
  }

  public String getType() {
    return type;
  }

  public String getStateKey() {
    return stateKey;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setStateKey(String stateKey) {
    this.stateKey = stateKey;
  }
}
