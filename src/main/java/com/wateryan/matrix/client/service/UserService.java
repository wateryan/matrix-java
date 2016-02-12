package com.wateryan.matrix.client.service;

import com.wateryan.matrix.client.dao.UserRepository;
import com.wateryan.matrix.client.domain.profile.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class UserService {

  private UserRepository userRepository;

  public UserService() {

  }

  public void setUserDisplayName(String userId, User user) {
    User originalUser = getUser(userId);
    Assert.notNull(originalUser, "Invalid user.");
    Assert.notNull(user.getDisplayName(), "Display name value required.");
    originalUser.setDisplayName(user.getDisplayName());
    this.userRepository.save(originalUser);
  }

  public User getUser(String userId) {
    return this.userRepository.findOne(userId);
  }

  public void setUserAvatarUrl(String userId, User user) {
    User originalUser = getUser(userId);
    Assert.notNull(originalUser, "Invalid user.");
    Assert.notNull(user.getAvatarUrl(), "AvatarUrl required.");
    originalUser.setAvatarUrl(user.getAvatarUrl());
    this.userRepository.save(originalUser);
  }

  private void save(User user) {
    this.userRepository.save(user);
  }

  @Autowired
  public void setUserRepository(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

}
