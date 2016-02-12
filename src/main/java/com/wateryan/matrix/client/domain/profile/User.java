package com.wateryan.matrix.client.domain.profile;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.wateryan.matrix.client.domain.Views;
import org.springframework.data.annotation.Id;

public class User {

  @Id
  private String userId;
  @JsonProperty("password")
  private String password;
  @JsonView(Views.AvatarUrl.class)
  @JsonProperty("avatar_url")
  private String avatarUrl;
  @JsonView(Views.Name.class)
  @JsonProperty("displayname")
  private String displayName;

  public User() {

  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
}
