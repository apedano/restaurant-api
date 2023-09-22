package com.apedano.restaurant.api.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class KitchenOrderDto {
    String orderId;
    String dishName;
}
