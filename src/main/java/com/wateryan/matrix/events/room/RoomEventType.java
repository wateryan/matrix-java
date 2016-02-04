package com.wateryan.matrix.events.room;

public enum RoomEventType {

  M_ROOM_ALIASES("m.room.aliases"),
  M_ROOM_CANONICAL_ALIAS("m.room.canonical_alias"),
  M_ROOM_CREATE("m.room.create"),
  M_ROOM_JOIN_RULES("m.room.join_rules"),
  M_ROOM_MEMBER("m.room.member"),
  M_ROOM_POWER_LEVELS("m.room.power_levels"),
  M_ROOM_REDACTION("m.room.redaction");

  private final String value;

  public String getValue() {
    return this.value;
  }

  RoomEventType(String value) {
    this.value = value;
  }

}
