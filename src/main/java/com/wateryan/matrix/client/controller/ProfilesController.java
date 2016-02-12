package com.wateryan.matrix.client.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.wateryan.matrix.api.Version;
import com.wateryan.matrix.client.domain.Views;
import com.wateryan.matrix.client.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController("/client")
public class ProfilesController {

  public static final String PUT_DISPLAY_NAME_URL = Version.R_0 + "/profile/{userId}/displayname";
  public static final String GET_DISPLAY_NAME_URL = Version.R_0 + "/profile/{userId}/displayname";

  @RequestMapping(method = RequestMethod.PUT, value = PUT_DISPLAY_NAME_URL)
  public void putDisplayName(@PathVariable("userId") String userId, @RequestBody User user) {

  }

  @JsonView(Views.Name.class)
  @RequestMapping(method = RequestMethod.GET, value = GET_DISPLAY_NAME_URL)
  public User getDisplayName() {
    return null;
  }


}
