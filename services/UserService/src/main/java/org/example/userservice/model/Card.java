package org.example.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Card {
    private String ownerId;
    private String cardNumber;
    private String expiryDate;
    private String cvv;
}
