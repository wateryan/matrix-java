package com.wateryan.matrix.client.rooms.service;

import com.wateryan.matrix.client.rooms.dao.RoomAliasRepository;
import com.wateryan.matrix.client.rooms.domain.RoomAlias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import javax.validation.Valid;

public class RoomAliasService {

  private RoomAliasRepository roomAliasRepository;

  public RoomAliasService() {

  }

  public void createAliasMapping(String roomAlias, String roomId) {
    Assert.notNull(roomAlias, "Room alias cannot be null");
    Assert.notNull(roomId, "Room_id cannot be null");
    RoomAlias alias = new RoomAlias();
    alias.setRoomId(roomId);
    alias.setRoomAlias(roomAlias);
    this.roomAliasRepository.save(alias);
  }

  @Autowired
  public void setRoomAliasRepository(RoomAliasRepository roomAliasRepository) {
    this.roomAliasRepository = roomAliasRepository;
  }
}
