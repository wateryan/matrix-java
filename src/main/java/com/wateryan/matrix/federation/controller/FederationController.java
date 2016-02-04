package com.wateryan.matrix.federation.controller;

import com.wateryan.matrix.federation.model.Transaction;
import com.wateryan.matrix.federation.service.FederationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FederationController {

  private static final Logger LOGGER = LoggerFactory.getLogger(FederationController.class);
  private final FederationService federationService;

  @Autowired
  public FederationController(FederationService federationService) {
    this.federationService = federationService;
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/send/{transaction_id}")
  public void sendTransaction(@PathVariable("transaction_id") int transactionId, @RequestBody Transaction transaction) {
    LOGGER.debug("/send/{}", transactionId);
    this.federationService.putTransaction(transactionId, transaction);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/send_join/{room_id}/{event_id}")
  public void sendJoin(@PathVariable("room_id") int roomId, @PathVariable("event_id") int eventId) {
    LOGGER.debug("/send_join/{}/{}", roomId, eventId);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/state/{room_id}")
  public Transaction getRoomState(@PathVariable("room_id") int roomId) {
    LOGGER.debug("/state/{}", roomId);
    return null;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/event/{event_id}")
  public Transaction getEvent(@PathVariable("event_id") int eventId) {
    LOGGER.debug("/event/{}", eventId);
    return null;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/backfill/{room_id}")
  public Transaction getBackfill(@PathVariable("room_id") int roomId) {
    LOGGER.debug("/backfill/{}", roomId);
    return null;
  }
}
