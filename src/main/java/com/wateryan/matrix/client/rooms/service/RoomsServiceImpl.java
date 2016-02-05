package com.wateryan.matrix.client.rooms.service;

import com.wateryan.matrix.client.rooms.domain.Room;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Service
public class RoomsServiceImpl implements RoomsService {

  private static final Logger LOGGER = LoggerFactory.getLogger(RoomsServiceImpl.class);
  private final RoomsRepository roomsRepository;
  private final RoomAliasRepository roomAliasRepository;

  @Autowired
  public RoomsServiceImpl(RoomsRepository roomsRepository, RoomAliasRepository roomAliasRepository) {
    this.roomsRepository = roomsRepository;
    this.roomAliasRepository = roomAliasRepository;
  }

  @Override
  public void deleteRoom(String roomId) {
    this.roomsRepository.delete(roomId);
    LOGGER.debug("Successfully delete room: {}", roomId);
  }

  @Override
  public void deleteAlias(String roomId, String roomAlias) {
    this.roomAliasRepository.delete(roomAlias);
    LOGGER.debug("Successfully deleted alias {} for roomId {}", roomAlias, roomAlias);
  }

  @Override
  public Room createRoom(@NotNull @Valid Room room) {
    String roomId = UUID.randomUUID().toString();
    room.setRoomId(roomId);
    this.roomsRepository.save(room);
    return room;
  }

  @Override
  public Room setTopic(String roomId, String roomTopic) {
    return null;
  }

  @Override
  public Room setName(String roomId, String roomName) {
    return null;
  }

  @Override
  public Room findRoomByAlias(String roomAlias) {
    return null;
  }

  @Override
  public Room findRoomById(String roomId) {
    return null;
  }
}
