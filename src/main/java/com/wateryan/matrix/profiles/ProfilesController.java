package com.wateryan.matrix.profiles;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.wateryan.matrix.profiles.domain.AvatarUrl;
import com.wateryan.matrix.profiles.domain.DisplayName;
import com.wateryan.matrix.profiles.domain.Profile;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfilesController {

  @RequestMapping(method = RequestMethod.PUT, value = "/profile/{userId}/displayname")
  public void setDisplayName(@PathVariable("userId") String userId, @RequestBody DisplayName displayName) {
    Assert.notNull(userId);
    // TODO
  }

  @RequestMapping(method = RequestMethod.GET, value = "profile/{userId}/displayname")
  public DisplayName getDisplayName(@PathVariable("userId") String userId) {
    Assert.notNull(userId);
    // TODO
    return null;
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/profile/{userId}/avatar_url")
  public void putAvatarUrl(@PathVariable("userId") String userId, @RequestBody AvatarUrl avatarUrl) {
    // TODO
  }

  @RequestMapping(method = RequestMethod.GET, value = "/profile/{userId}/avatar_url")
  public AvatarUrl getAvatarUrl(@PathVariable("userId") String userId) {

    return null;
  }

  @RequestMapping(method = RequestMethod.GET, value = "/profile/{userId}")
  public Profile getProfile(@PathVariable("userId") String userId) {
    Assert.notNull(userId);

    return null;
  }

}
