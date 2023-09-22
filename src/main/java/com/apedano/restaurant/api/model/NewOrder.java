package com.apedano.restaurant.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NewOrder {
    private String name;
    private String tableName;
    private Integer numberOfPeople;
}
