package com.wateryan.matrix.events.room;

import javax.validation.constraints.Max;

public interface RoomEvent {

  String getEventId();

  String getRoomId();

  String getSender();

  Object getUnsigned();

}
