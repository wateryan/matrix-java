package com.wateryan.matrix;

public enum EventType {

  M_ROOM_POWER_LEVELS("m.room.power_levels"),
  M_ROOM_JOIN_RULES("m.room.join_rules");

  private final String value;

  public String getValue() {
    return this.value;
  }

  EventType(String value) {
    this.value = value;
  }


}
