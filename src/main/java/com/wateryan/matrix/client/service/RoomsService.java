package com.wateryan.matrix.client.service;

import com.wateryan.matrix.client.dao.RoomsRepository;
import com.wateryan.matrix.client.domain.rooms.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RoomsService {

  private RoomsRepository roomsRepository;

  public String createRoom(Room room) {
    String roomId = createRandomRoomId();
    room.setRoomId(roomId);
    this.roomsRepository.save(room);
    // TODO send invites
    // TODO m.toom.name events
    // TODO m.room.topic events
    // TODO 3pid invites
    // TODO alias
    return roomId;
  }

  public void roomInvite(String roomId, String userId) {

  }

  private String createRandomRoomId() {
    return UUID.randomUUID().toString();
  }

  @Autowired
  public void setRoomsRepository(RoomsRepository roomsRepository) {
    this.roomsRepository = roomsRepository;
  }

}
