package com.wateryan.matrix.client.rooms.service;

import com.wateryan.matrix.client.rooms.domain.Room;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface RoomsService {

  void deleteRoom(String roomId);

  void deleteAlias(String roomId, String roomAlias);

  Room createRoom(@NotNull @Valid Room room);

  Room setTopic(String roomId, String roomTopic);

  Room setName(String roomId, String roomName);

  Room findRoomByAlias(String roomAlias);

  Room findRoomById(String roomId);


}
