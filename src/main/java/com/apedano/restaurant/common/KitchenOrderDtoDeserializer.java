package com.apedano.restaurant.common;

import com.apedano.restaurant.api.model.KitchenOrderDto;

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class KitchenOrderDtoDeserializer extends ObjectMapperDeserializer<KitchenOrderDto> {
    public KitchenOrderDtoDeserializer() {
        super(KitchenOrderDto.class);
    }
}
