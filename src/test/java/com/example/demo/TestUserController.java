//package com.example.demo;
//
//import com.example.demo.controller.UserController;
//import com.example.demo.model.User;
//import com.example.demo.service.UserService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.context.annotation.Import;
//import org.springframework.test.context.bean.override.mockito.MockitoBean;
//import org.springframework.test.web.servlet.MockMvc;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//
//import java.util.List;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(UserController.class)
////@Import(TestConfig.class)
//public class TestUserController {
//
//  @Autowired
//  private MockMvc mockMvc;
//
//  @MockitoBean
//  private UserService userService;
//
//  @Test
//  void getAllUsersTest() throws Exception {
//    when(userService.getAll()).thenReturn(List.of(new User(1, "Bob", "Bob@gmail.com")));
//    mockMvc.perform(get("/users/getAll"))
//            .andExpect(status().isOk())
//            .andExpect(content().string("[{\"id\":1,\"name\":\"Bob\",\"email\":\"Bob@gmail.com\"}]"));
//  }
//}
