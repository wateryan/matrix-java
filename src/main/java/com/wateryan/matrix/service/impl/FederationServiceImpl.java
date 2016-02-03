package com.wateryan.matrix.service.impl;

import com.wateryan.matrix.domain.federation.Transaction;
import com.wateryan.matrix.service.FederationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FederationServiceImpl implements FederationService {


  @Override
  public void putTransaction(int transactionId, Transaction transaction) {

  }

  @Override
  public Transaction getTransactionByRoom(int roomId) {
    return null;
  }

  @Override
  public Transaction getTransactionByEvent(int eventId) {
    return null;
  }

  @Override
  public Transaction getBackfill(int roomId, int v, int limit) {
    return null;
  }

  @Override
  public List<Transaction> pull(int origin, int v) {
    return null;
  }
}

