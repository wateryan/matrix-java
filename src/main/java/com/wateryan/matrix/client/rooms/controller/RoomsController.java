package com.wateryan.matrix.client.rooms.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.wateryan.matrix.client.rooms.domain.Room;
import com.wateryan.matrix.client.rooms.domain.Views;
import com.wateryan.matrix.client.rooms.service.RoomsRepository;
import com.wateryan.matrix.client.rooms.service.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

@RestController
public class RoomsController {

  private final RoomsService roomsService;

  @Autowired
  public RoomsController(RoomsService roomsService) {
    this.roomsService = roomsService;
  }

  @JsonView(Views.Create.class)
  @RequestMapping(method = RequestMethod.POST, value = "/client/r0/createRoom")
  public String createRoom(@RequestBody Room createRoom) {
    Room room = this.roomsService.createRoom(createRoom);
    return room.getRoomId();
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/client/r0/directory/room/{roomAlias}")
  public void putRoom(@PathVariable("roomAlias") String roomAlias, @RequestBody Room room) {

  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/client/r0/directory/room/{roomAlias}")
  public void deleteRoom(@PathVariable("roomAlias") String roomAlias) {

  }

  @JsonView(Views.Name.class)
  @RequestMapping(method = RequestMethod.GET, value = "/client/r0/directory/room/{roomAlias}")
  public Room getRoom(@PathVariable("roomAlias") String roomAlias) {
    return null;
  }

  @RequestMapping(method = RequestMethod.POST, value = "/client/r0/rooms/{roomId}/invite")
  public void joinRoom(@PathVariable("roomId") String roomId) {

  }

}
