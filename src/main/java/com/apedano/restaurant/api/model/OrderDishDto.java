package com.apedano.restaurant.api.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OrderDishDto {
    private String dishName;
    private OrderDishStatus orderDishStatus;

}
