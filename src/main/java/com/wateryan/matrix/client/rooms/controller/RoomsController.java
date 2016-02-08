package com.wateryan.matrix.client.rooms.controller;

import com.wateryan.matrix.api.Version;
import com.wateryan.matrix.client.rooms.domain.Room;
import com.wateryan.matrix.client.rooms.service.RoomsService;
import com.wateryan.matrix.client.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class RoomsController {

  public static final String CREATE_URL = Version.R_0 + "/createRoom";
  public static final String INVITE_URL = Version.R_0 + "/rooms/{roomId}/invite";
  public static final String JOIN_URL = Version.R_0 + "/rooms/{roomId}/join";
  public static final String JOIN_URL_ALIAS = Version.R_0 + "/join/{roomId}";
  public static final String BAN_URL = Version.R_0 + "/rooms/{roomId}/ban";
  public static final String FORGET_ROOM_URL = "/rooms/{roomId}/forget";
  public static final String LEAVE_ROOM_URL = "/rooms/{roomId}/leave";

  private RoomsService roomsService;

  @RequestMapping(method = RequestMethod.POST, value = CREATE_URL)
  public String createRoom(@RequestBody Room room) {
    return this.roomsService.createRoom(room);
  }

  @RequestMapping(method = RequestMethod.POST, value = INVITE_URL)
  public void roomInvite(@PathVariable("roomId") String roomId, @RequestBody User user) {
    this.roomsService.roomInvite(roomId, user.getUserId());
  }

  @RequestMapping(method = RequestMethod.POST, value = {JOIN_URL, JOIN_URL_ALIAS})
  public void joinRoom(@PathVariable("roomId") String roomId, @RequestBody Room room) {

  }

  @RequestMapping(method = RequestMethod.POST, value = BAN_URL)
  public void banFromRoom() {
    // TODO
  }

  @RequestMapping(method = RequestMethod.POST, value = FORGET_ROOM_URL)
  public void forgetRoom(@PathVariable("roomId") String roomId) {
    // TODO
  }

  @RequestMapping(method = RequestMethod.POST, value = LEAVE_ROOM_URL)
  public void leaveRoom() {
    // TODO
  }

  @Autowired
  public void setRoomsService(RoomsService roomsService) {
    this.roomsService = roomsService;
  }

}
