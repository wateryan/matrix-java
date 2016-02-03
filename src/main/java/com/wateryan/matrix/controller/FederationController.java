package com.wateryan.matrix.controller;

import com.wateryan.matrix.federation.Transaction;
import org.springframework.web.bind.annotation.*;

@RestController
public class FederationController {

  @RequestMapping(method = RequestMethod.PUT, value = "/send/{transaction_id}")
  public void sendTransaction(@PathVariable("transaction_id") int transactionId) {
    System.out.println(transactionId);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/send_join/{room_id}/{event_id}")
  public void sendJoin(@PathVariable("room_id") int roomId, @PathVariable("event_id") int eventId) {

  }

  @RequestMapping(method = RequestMethod.GET, value = "/state/{room_id}")
  public Transaction getRoomState(@PathVariable("room_id") int roomId) {
    System.out.println(roomId);
    return null;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/event/{event_id}")
  public Transaction getEvent(@PathVariable("event_id") int event_id) {
    return null;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/backfill/{room_id}")
  public Transaction getBackfill(@PathVariable("room_id") int roomId) {
    return null;
  }
}
