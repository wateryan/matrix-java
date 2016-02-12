package com.wateryan.matrix.client.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.wateryan.matrix.api.Version;
import com.wateryan.matrix.client.domain.Views;
import com.wateryan.matrix.client.domain.profile.User;
import com.wateryan.matrix.client.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController("/client")
public class ProfilesController {

  public static final String DISPLAY_NAME_URL = "/" + Version.R_0 + "/profile/{userId}/displayname";
  public static final String AVATAR_URL = "/" + Version.R_0 + "/profile/{userId}/avatar_url";

  private UserService userService;

  @RequestMapping(method = RequestMethod.PUT, value = DISPLAY_NAME_URL)
  public void putDisplayName(@PathVariable("userId") String userId, @RequestBody User user) {
    this.userService.setUserDisplayName(userId, user);
  }

  @JsonView(Views.Name.class)
  @RequestMapping(method = RequestMethod.GET, value = DISPLAY_NAME_URL)
  public User getDisplayName(@PathVariable("userId") String userId) {
    return this.userService.getUser(userId);
  }

  @RequestMapping(method = RequestMethod.PUT, value = AVATAR_URL)
  public void putAvatarUrl(@PathVariable("userId") String userId, @RequestBody User user) {
    this.userService.setUserAvatarUrl(userId, user);
  }

  @JsonView(Views.AvatarUrl.class)
  @RequestMapping(method = RequestMethod.GET, value = AVATAR_URL)
  public User getAvatarUrl(@PathVariable("userId") String userId) {
    return this.userService.getUser(userId);
  }

  public void setUserService(UserService userService) {
    this.userService = userService;
  }
}
