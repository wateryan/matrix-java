package com.wateryan.matrix.client.rooms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

public class Room {

  @Id
  @JsonProperty("room_id")
  private String roomId;
  private String name;
  private String topic;
  private Visibility visibility;
  private List<String> invite;
  @JsonProperty("invite_3pid")
  private List<ThirdPartyInvite> thirdPartyInvites;
  @JsonProperty("creation_content")
  private Map<String, Object> creationContent;
  @JsonProperty("initial_state")
  private List<StateEvent> initialState;
  private String roomAliasName;

  public Room() {

  }

  public String getRoomId() {
    return roomId;
  }

  public String getName() {
    return name;
  }

  public String getTopic() {
    return topic;
  }

  public Visibility getVisibility() {
    return visibility;
  }

  public List<String> getInvite() {
    return invite;
  }

  public List<ThirdPartyInvite> getThirdPartyInvites() {
    return thirdPartyInvites;
  }

  public Map<String, Object> getCreationContent() {
    return creationContent;
  }

  public List<StateEvent> getInitialState() {
    return initialState;
  }

  public String getRoomAliasName() {
    return roomAliasName;
  }

  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public void setVisibility(Visibility visibility) {
    this.visibility = visibility;
  }

  public void setInvite(List<String> invite) {
    this.invite = invite;
  }

  public void setThirdPartyInvites(List<ThirdPartyInvite> thirdPartyInvites) {
    this.thirdPartyInvites = thirdPartyInvites;
  }

  public void setCreationContent(Map<String, Object> creationContent) {
    this.creationContent = creationContent;
  }

  public void setInitialState(List<StateEvent> initialState) {
    this.initialState = initialState;
  }

  public void setRoomAliasName(String roomAliasName) {
    this.roomAliasName = roomAliasName;
  }

  public static class ThirdPartyInvite {

    @NotNull
    @JsonProperty("id_server")
    private String idServer;
    @NotNull
    private String medium;
    @NotNull
    private String address;

    public ThirdPartyInvite() {

    }

    public String getIdServer() {
      return idServer;
    }

    public String getMedium() {
      return medium;
    }

    public String getAddress() {
      return address;
    }

    public void setIdServer(String idServer) {
      this.idServer = idServer;
    }

    public void setMedium(String medium) {
      this.medium = medium;
    }

    public void setAddress(String address) {
      this.address = address;
    }
  }


}
