package com.javatechie.service;

import com.javatechie.dto.Order;
import com.javatechie.util.Mapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {

    Logger logger= LogManager.getLogger(OrderService.class);


    private List<Order> orderList = new ArrayList<>();

    /**
     * addOrder() is a method to add an order to the list.
     * It takes an Order type as input parameter and returns the Order type as output.
     * It also sets the order placed date and transaction ID for the order added.
     */
    public Order addOrder(Order order) {
        logger.info("OrderService:addOrder() execution started..");
        logger.info("OrderService:addOrder request payload {} ", Mapper.mapToJsonString(order));
        order.setOrderPlacedDate(new Date());
        order.setTransactionId(UUID.randomUUID().toString());
        orderList.add(order);
        logger.info("OrderService:addOrder response  {} ", Mapper.mapToJsonString(order));
        logger.info("OrderService:addOrder execution ended..");
        return order;
    }

    /**
     * getOrders() method is used to get all orders in system..
     *
     * @return List<Order> list of orders
     */
    public List<Order> getOrders() {
        logger.info("OrderService:getOrders() execution started..");
        List<Order> list = null;
        list = orderList;
        logger.info("OrderService:getOrders response  {} ", Mapper.mapToJsonString(orderList));
        logger.info("OrderService:getOrders execution ended..");
        return list;
    }

    /**
     * getOrder(int id) method is used to get the order details based on the given order id
     * @param id This is the id of the particular order
     * @return Order object corresponding to the given order id
     */

    public Order getOrder(int id) {
        logger.info("OrderService:getOrder() execution started..");
        Order order = orderList.stream()
                .filter(ord -> ord.getId() == id)
                .findAny().orElseThrow(() -> new RuntimeException("Order not found with id : " + id));
        logger.info("OrderService:getOrder execution ended..");
        return order;
    }
}
