package com.wateryan.matrix.client.domain.rooms;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.util.List;

public class RoomAlias {

  @Id
  @NotNull
  private String roomAlias;
  @JsonProperty("room_id")
  private String roomId;
  private List<String> servers;

  public RoomAlias() {

  }

  public String getRoomAlias() {
    return roomAlias;
  }

  public void setRoomAlias(String roomAlias) {
    this.roomAlias = roomAlias;
  }

  public String getRoomId() {
    return roomId;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  public List<String> getServers() {
    return servers;
  }

  public void setServers(List<String> servers) {
    this.servers = servers;
  }
}
