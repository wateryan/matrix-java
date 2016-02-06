package com.wateryan.matrix.client.rooms.controller;

import com.sun.glass.ui.Application;
import com.wateryan.matrix.api.Version;
import com.wateryan.matrix.client.rooms.domain.Room;
import com.wateryan.matrix.client.rooms.service.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class RoomsController {

  public static final String CREATE_URL = Version.R_0 + "/createRoom";

  private RoomsService roomsService;

  @RequestMapping(method = RequestMethod.POST, value = CREATE_URL)
  public String createRoom(@RequestBody Room room) {
    return this.roomsService.createRoom(room);
  }

  @Autowired
  public void setRoomsService(RoomsService roomsService) {
    this.roomsService = roomsService;
  }

}
