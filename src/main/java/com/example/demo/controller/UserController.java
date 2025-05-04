package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import io.micrometer.core.annotation.Timed;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

  private UserService userService;

  @PostMapping("/add")
  public void add(@RequestBody User user) {
    userService.add(user);
  }
  @PutMapping("/update")
  public void update(@RequestBody User user) {
    userService.update(user);
  }

  @DeleteMapping("/remove")
  public void remove(@RequestParam long id) {
    userService.remove(id);
  }

  @GetMapping("getById/{id}")
  public User getById(@PathVariable long id) {
    return userService.getById(id);
  }

  @GetMapping("getAll")
  @Timed(value = "endpoint.users.getAll", description = "Time taken to execute endpoint")
  public Collection<User> getAll() throws InterruptedException {
    return userService.getAll();
  }
}
