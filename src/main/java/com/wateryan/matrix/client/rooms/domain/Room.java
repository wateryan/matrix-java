package com.wateryan.matrix.client.rooms.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.wateryan.matrix.events.StateEvent;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.validation.constraints.NotNull;
import java.util.List;

public class Room {

  @Id
  @Indexed
  @JsonView({Views.Create.class, Views.Directory.class})
  private String roomId;
  @NotNull
  @JsonView(Views.Name.class)
  private String name;
  private Visibility visibility;
  // TODO 3pid
  @JsonView(Views.Topic.class)
  private String topic;
  private Preset preset;
  @JsonProperty("creation_content")
  private CreationContent creationContent;
  @JsonProperty("initial_state")
  private StateEvent initialState;
  @JsonProperty("room_alias_name")
  private String roomAliasName;
  private List<String> invite;

  public Room() {

  }

  public String getRoomId() {
    return roomId;
  }

  public String getName() {
    return name;
  }

  public Visibility getVisibility() {
    return visibility;
  }

  public String getTopic() {
    return topic;
  }

  public Preset getPreset() {
    return preset;
  }

  public CreationContent getCreationContent() {
    return creationContent;
  }

  public StateEvent getInitialState() {
    return initialState;
  }

  public String getRoomAliasName() {
    return roomAliasName;
  }

  public List<String> getInvite() {
    return invite;
  }

  public Room setRoomId(String roomId) {
    this.roomId = roomId;
    return this;
  }

  public Room setName(String name) {
    this.name = name;
    return this;
  }

  public Room setVisibility(Visibility visibility) {
    this.visibility = visibility;
    return this;
  }

  public Room setTopic(String topic) {
    this.topic = topic;
    return this;
  }

  public Room setPreset(Preset preset) {
    this.preset = preset;
    return this;
  }

  public Room setCreationContent(CreationContent creationContent) {
    this.creationContent = creationContent;
    return this;
  }

  public Room setInitialState(StateEvent initialState) {
    this.initialState = initialState;
    return this;
  }

  public Room setRoomAliasName(String roomAliasName) {
    this.roomAliasName = roomAliasName;
    return this;
  }

  public Room setInvite(List<String> invite) {
    this.invite = invite;
    return this;
  }
}
