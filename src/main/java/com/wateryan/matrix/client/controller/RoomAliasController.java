package com.wateryan.matrix.client.controller;

import com.wateryan.matrix.client.domain.rooms.RoomAlias;
import com.wateryan.matrix.client.service.RoomAliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("_matrix/client")
public class RoomAliasController {

  private RoomAliasService roomAliasService;

  @RequestMapping(method = RequestMethod.PUT, value = "/r0/directory/room/{roomAlias}")
  public void createAlias(@PathVariable("roomAlias") String roomAlias, @RequestBody String room_id) {
    this.roomAliasService.createAliasMapping(roomAlias, room_id);
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "/r0/directory/room/{roomAlias}")
  public void deleteAlias(@PathVariable("roomAlias") String roomAlias) {
    this.roomAliasService.deleteAlias(roomAlias);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/r0/directory/room/{roomAlias}")
  public RoomAlias getRoomId(@PathVariable("roomAlias") String roomAlias) {
    return this.roomAliasService.getRoomByAlias(roomAlias);
  }

  @Autowired
  public void setRoomAliasService(RoomAliasService roomAliasService) {
    this.roomAliasService = roomAliasService;
  }
}
