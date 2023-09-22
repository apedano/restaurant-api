package com.apedano.restaurant.api.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OrderDto {
    private String orderId;
    private String orderName;

    private OrderStatus orderStatus;
    private String table;
    private List<OrderDishDto> orderDishes;


}
