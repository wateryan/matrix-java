package com.wateryan.matrix.events;

import com.wateryan.matrix.events.room.RoomEvent;

public interface StateEvent extends RoomEvent {

  Object getPrevContent();

  String getStateKey();

}
