//package org.example.userservice.controller;
//
////import org.example.userservice.feignClients.CardServiceClient;
//import org.example.userservice.model.Card;
//import org.example.userservice.model.User;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//    private final CardServiceClient cardServiceClient;
//
//    public UserController(CardServiceClient cardServiceClient) {
//        this.cardServiceClient = cardServiceClient;
//    }
//
//
//    @PostMapping
//    public String save(@RequestBody User user) {
//
//        String response = cardServiceClient.create(new Card(user.getId() + "", null, null, null));
//        System.out.println(response);
//
//        return response;
//    }
//
//}
