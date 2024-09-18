package org.example.cardservice.model;

import lombok.Data;

@Data
public class Card {
    private String ownerId;
    private String cardNumber;
    private String expiryDate;
    private String cvv;
}
