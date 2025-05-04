package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.exception.UserNotFoundException;

import java.util.Collection;

@Service
@AllArgsConstructor
public class UserService {

  private UserRepository userRepository;
  public void add(User user) {
    userRepository.add(user);
  }
  public void update(User user) {
    userRepository.update(user);
  }

  public void remove(long id) {
    userRepository.remove(id);
  }

  public User getById(long id) {
    User user = userRepository.getById(id);
    if (user == null) {
      throw new UserNotFoundException(String.format("User with id %s not found", id));
    }
    return user;
  }

  public User getByEmail(String email) {
    return userRepository.getByEmail(email);
  }

  public Collection<User> getAll() {
    // throw new RuntimeException("Internal error (DB connection failed)");
//    Thread.sleep(500);
    return userRepository.getAll();
  }
}

