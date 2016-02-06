package com.wateryan.matrix.client.rooms.controller;

import com.wateryan.matrix.client.rooms.service.RoomAliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("_matrix/client")
public class RoomAliasController {

  private RoomAliasService roomAliasService;

  @RequestMapping(method = RequestMethod.PUT, value = "r0/directory/room/{roomAlias}")
  public void createAlias(@PathVariable("roomAlias") String roomAlias, @RequestBody String room_id) {
    this.roomAliasService.createAliasMapping(roomAlias, room_id);
  }

  @Autowired
  public void setRoomAliasService(RoomAliasService roomAliasService) {
    this.roomAliasService = roomAliasService;
  }
}
