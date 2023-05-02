package com.javatechie.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
/**
 * Order class contains the details of an order:
 *
 * @param id The unique id of the order
 * @param name The name of the order
 * @param qty The quantity of the order
 * @param price The price of the order
 * @param transactionId The unique transactionid for the order
 * @param orderPlacedDate The date when the order was placed
 */
public class Order {

    private int id;
    private String name;
    private int qty;
    private double price;
    private String transactionId;
    private Date orderPlacedDate;
}
