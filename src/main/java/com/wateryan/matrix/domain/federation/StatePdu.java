package com.wateryan.matrix.domain.federation;

/**
 * PDUs fall into two main categories: those that deliver Events, and those that synchronise State. For PDUs that relate to State synchronisation, additional keys exist to support this:
 */
public interface StatePdu extends Pdu {

  /**
   * String	Combined with the pdu_type this identifies the which part of the room state is updated
   */
  default Boolean isState() {
    return true;
  }

  Integer getRequiredPowerLevel();

  String getPrevStateId();

  String getPrevStateOrigin();

}