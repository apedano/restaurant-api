package com.apedano.restaurant.common;

import com.apedano.restaurant.api.model.NewOrder;
import com.apedano.restaurant.api.model.OrderDto;
import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class OrderDtoDeserializer extends ObjectMapperDeserializer<OrderDto> {
    public OrderDtoDeserializer() {
        super(OrderDto.class);
    }
}
