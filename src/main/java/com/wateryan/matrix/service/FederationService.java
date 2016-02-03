package com.wateryan.matrix.service;

import com.wateryan.matrix.domain.federation.Pdu;
import com.wateryan.matrix.domain.federation.Transaction;

import java.util.List;

public interface FederationService {

  /**
   * For active pushing of messages representing live activity "as it happens".
   * The transaction_id path argument will override any ID given in the JSON body.
   * The destination name will be set to that of the receiving server itself. Each embedded PDU in the transaction body will be processed.
   */
  void putTransaction(int transactionId, Transaction transaction);


  /**
   * To fetch all the state of a given room. Retrieves a snapshot of the entire current state of the given room.
   * The response will contain a single Transaction, inside which will be a list of PDUs that encode the state.
   */
  Transaction getTransactionByRoom(int roomId);

  /**
   * Retrieves a single event. The response will contain a partial Transaction, having just the origin, origin_server_ts
   * and pdus fields; the event will be encoded as the only PDU in the pdus list.
   */
  Transaction getTransactionByEvent(int eventId);

  /**
   * Retrieves a sliding-window history of previous PDUs that occurred on the given room. Starting from the PDU ID(s)
   * given in the "v" argument, the PDUs that preceded it are retrieved, up to a total number given by the "limit" argument.
   */
  Transaction getBackfill(int roomId, int v, int limit);

  /**
   * Retrieves all of the transactions later than any version given by the "v" arguments.
   */
  List<Transaction> pull(int origin, int v);

  // TODO Query Type

  // TODO join room

}
