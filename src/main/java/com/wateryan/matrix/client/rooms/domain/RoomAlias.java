package com.wateryan.matrix.client.rooms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class RoomAlias {

  @NotNull
  private String roomAlias;
  @JsonProperty("room_id")
  private String roomId;

  public RoomAlias() {

  }

  public String getRoomAlias() {
    return roomAlias;
  }

  public void setRoomAlias(String roomAlias) {
    this.roomAlias = roomAlias;
  }

  public String getRoomId() {
    return roomId;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }
}
