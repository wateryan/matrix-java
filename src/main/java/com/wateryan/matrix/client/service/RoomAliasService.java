package com.wateryan.matrix.client.service;

import com.wateryan.matrix.client.dao.RoomAliasRepository;
import com.wateryan.matrix.client.domain.rooms.RoomAlias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
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

  public void deleteAlias(String roomAlias) {
    Assert.notNull(roomAlias, "Room alias cannot be null");
    this.roomAliasRepository.delete(roomAlias);
  }

  public RoomAlias getRoomByAlias(String roomAlias) {
    return this.roomAliasRepository.findOne(roomAlias);
  }

  @Autowired
  public void setRoomAliasRepository(RoomAliasRepository roomAliasRepository) {
    this.roomAliasRepository = roomAliasRepository;
  }
}
