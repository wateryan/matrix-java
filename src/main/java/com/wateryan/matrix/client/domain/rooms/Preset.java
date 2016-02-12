package com.wateryan.matrix.client.domain.rooms;

/**
 * Convenience parameter for setting various default state events based on a preset
 */
public enum Preset {

  /**
   * private_chat => join_rules is set to invite. history_visibility is set to shared.
   */
  PRIVATE_CHAT("private_chat"),
  /**
   * trusted_private_chat => join_rules is set to invite. history_visibility is set to shared. All invitees are given
   * the same power level as the room creator.
   */
  TRUSTED_PRIVATE_CHAT("trusted_private_chat"),
  /**
   * public_chat: => join_rules is set to public. history_visibility is set to shared. One of:
   * ["private_chat", "public_chat", "trusted_private_chat"]
   */
  PUBLIC_CHAT("public_chat");

  private final String value;

  public String getValue() {
    return this.value;
  }

  Preset(String value) {
    this.value = value;
  }

}
