package com.wateryan.matrix.federation.impl;


import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.wateryan.matrix.federation.Transaction;

import java.io.Serializable;
import java.util.List;

/**
 * The transfer of EDUs and PDUs between homeservers is performed by an exchange of TransactionImpl messages, which are encoded as JSON objects, passed over an HTTP PUT request. A TransactionImpl is meaningful only to the pair of homeservers that exchanged it; they are not globally-meaningful.
 */
public class TransactionImpl implements Transaction {

  private static final long serialVersionUID = 6686799661919823159L;
  private final String transactionId;
  private final String origin;
  private final Integer originServerTs;
  private final List<String> previousIds;
  private final List<Serializable> pdus;
  private final List<Serializable> edus;

  private TransactionImpl(TransactionBuilder builder) {
    this.transactionId = builder.transactionId;
    this.origin = builder.origin;
    this.originServerTs = builder.originServerTs;
    this.previousIds = builder.previousIds;
    this.pdus = builder.pdus;
    this.edus = builder.edus;
  }

  public String getTransactionId() {
    return this.transactionId;
  }

  public String getOrigin() {
    return this.origin;
  }

  public Integer getOriginServerTs() {
    return this.originServerTs;
  }

  public List<String> getPreviousIds() {
    return this.previousIds;
  }

  public List<Serializable> getPdus() {
    return this.pdus;
  }

  public List<Serializable> getEdus() {
    return this.edus;
  }

  public static TransactionBuilder getBuilder() {
    return new TransactionBuilder();
  }

  @JsonPOJOBuilder
  public static class TransactionBuilder {

    private String transactionId;
    private String origin;
    private Integer originServerTs;
    private List<String> previousIds;
    private List<Serializable> pdus;
    private List<Serializable> edus;

    private TransactionBuilder() {

    }

    /**
     * @param transactionId An opaque transaction ID.
     * @return Builder
     */
    public TransactionBuilder setTransactionId(String transactionId) {
      this.transactionId = transactionId;
      return this;
    }

    /**
     * @param origin DNS name of homeserver making this transaction.
     * @return Builder
     */
    public TransactionBuilder setOrigin(String origin) {
      this.origin = origin;
      return this;
    }

    /**
     * @param originServerTs Timestamp in milliseconds on originating homeserver when this transaction started.
     * @return Builder
     */
    public TransactionBuilder setOriginServerTs(Integer originServerTs) {
      this.originServerTs = originServerTs;
      return this;
    }

    /**
     * @param previousIds List of transactions that were sent immediately prior to this transaction.
     * @return Builder
     */
    public TransactionBuilder setPreviousIds(List<String> previousIds) {
      this.previousIds = previousIds;
      return this;
    }

    /**
     * @param pdus List of persistent updates to rooms.
     * @return Builder
     */
    public TransactionBuilder setPdus(List<Serializable> pdus) {
      this.pdus = pdus;
      return this;
    }

    /**
     * @param edus List of ephemeral messages.
     * @return Builder
     */
    public TransactionBuilder setEdus(List<Serializable> edus) {
      this.edus = edus;
      return this;
    }
  }
}
