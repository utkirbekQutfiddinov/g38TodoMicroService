package org.example.cardservice.controller;

import org.example.cardservice.model.Card;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.UUID;


@RestController
@RequestMapping("/cards")
public class CardController {

    private final Environment environment;

    public CardController(Environment environment) {
        this.environment = environment;
    }

    @PostMapping
    public String create(@RequestBody Card card) {
        System.out.println(card);
        card.setCardNumber(UUID.randomUUID().toString());
        card.setExpiryDate(LocalDate.now().toString());
        return card.getCardNumber() + " : " + environment.getProperty("server.port");
    }
}
