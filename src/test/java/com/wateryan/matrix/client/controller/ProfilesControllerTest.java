package com.wateryan.matrix.client.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wateryan.matrix.Server;
import com.wateryan.matrix.client.dao.UserRepository;
import com.wateryan.matrix.client.domain.profile.User;
import com.wateryan.matrix.client.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.UUID;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringApplicationConfiguration(Server.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ProfilesControllerTest {

  private ObjectMapper objectMapper = new ObjectMapper();
  private ProfilesController profilesController;
  private MockMvc mockMvc;

  @Before
  public void setUp() throws Exception {
    this.profilesController = new ProfilesController();
    this.mockMvc = MockMvcBuilders.standaloneSetup(this.profilesController).build();
  }

  @Test
  public void testPutDisplayName() throws Exception {
    String userId = UUID.randomUUID().toString();
    User user = mockUser(userId, "testUser", "url", "password");
    UserRepository userRepository = mockUserRepository(user);
    UserService userService = new UserService();
    userService.setUserRepository(userRepository);
    this.profilesController.setUserService(userService);
    String jsonRequest = this.objectMapper.writeValueAsString(user);
    this.mockMvc.perform(put(ProfilesController.DISPLAY_NAME_URL, userId).contentType(MediaType.APPLICATION_JSON)
            .content(jsonRequest)).andExpect(status().is2xxSuccessful()).andReturn();
  }

  @Test
  public void testGetDisplayName() throws Exception {
    String userId = UUID.randomUUID().toString();
    User user = mockUser(userId, "testUser", "url", "password");
    UserRepository userRepository = mockUserRepository(user);
    UserService userService = new UserService();
    userService.setUserRepository(userRepository);
    this.profilesController.setUserService(userService);
    String jsonRequest = this.objectMapper.writeValueAsString(user);
    this.mockMvc.perform(get(ProfilesController.DISPLAY_NAME_URL, userId).contentType(MediaType.APPLICATION_JSON)
            .content(jsonRequest)).andExpect(status().is2xxSuccessful())
            .andExpect(jsonPath("$.displayname").value("testUser")).andReturn();
  }

  @Test
  public void testPutAvatarUrl() throws Exception {
    String userId = UUID.randomUUID().toString();
    User user = mockUser(userId, "testUser", "url", "password");
    UserRepository userRepository = mockUserRepository(user);
    UserService userService = new UserService();
    userService.setUserRepository(userRepository);
    this.profilesController.setUserService(userService);
    String jsonRequest = this.objectMapper.writeValueAsString(user);
    this.mockMvc.perform(
            put(ProfilesController.AVATAR_URL, userId).contentType(MediaType.APPLICATION_JSON).content(jsonRequest))
            .andExpect(status().is2xxSuccessful()).andReturn();
  }

  @Test
  public void testGetAvatarUrl() throws Exception {
    String userId = UUID.randomUUID().toString();
    User user = mockUser(userId, "testUser", "url", "password");
    UserRepository userRepository = mockUserRepository(user);
    UserService userService = new UserService();
    userService.setUserRepository(userRepository);
    this.profilesController.setUserService(userService);
    String jsonRequest = this.objectMapper.writeValueAsString(user);
    this.mockMvc.perform(
            get(ProfilesController.AVATAR_URL, userId).contentType(MediaType.APPLICATION_JSON).content(jsonRequest))
            .andExpect(status().is2xxSuccessful()).andExpect(jsonPath("$.avatar_url").value("url")).andReturn();
  }

  @Test
  public void testGetProfile() throws Exception {
    String userId = UUID.randomUUID().toString();
    User user = mockUser(userId, "testUser", "url", "password");
    UserRepository userRepository = mockUserRepository(user);
    UserService userService = new UserService();
    userService.setUserRepository(userRepository);
    this.profilesController.setUserService(userService);
    String jsonRequest = this.objectMapper.writeValueAsString(user);
    this.mockMvc.perform(
            get(ProfilesController.PROFILE_URL, userId).contentType(MediaType.APPLICATION_JSON).content(jsonRequest))
            .andExpect(status().is2xxSuccessful()).andExpect(jsonPath("$.displayname").value("testUser"))
            .andExpect(jsonPath("$.avatar_url").value("url")).andReturn();
  }

  private User mockUser(String userId, String displayName, String avatarUrl, String password) {
    User user = new User();
    user.setUserId(userId);
    user.setDisplayName(displayName);
    user.setAvatarUrl(avatarUrl);
    user.setPassword(password);
    return user;
  }

  private UserRepository mockUserRepository(User user) {
    UserRepository userRepository = Mockito.mock(UserRepository.class);
    when(userRepository.findOne(Matchers.any())).thenReturn(user);
    return userRepository;
  }

}