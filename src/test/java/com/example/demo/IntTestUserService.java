package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(properties = {"data.store.type =IN_MEMORY"})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class IntTestUserService {

  @Autowired
  private UserService userService;

  @BeforeAll
  void setUp() {
    userService.add(new User("Bob"));
  }

  @Test
  void getAllUsersTest(){
    assertEquals(1,  userService.getAll().size());
  }

  @AfterAll
  void tierDown(){
    User user = userService.getAll().stream().findFirst().orElseThrow();
    userService.remove(user.getId());
  }
}
