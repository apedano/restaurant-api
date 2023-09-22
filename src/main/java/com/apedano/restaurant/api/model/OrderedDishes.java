package com.apedano.restaurant.api.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OrderedDishes {

    String orderId;
    List<String> dishNames;

}
