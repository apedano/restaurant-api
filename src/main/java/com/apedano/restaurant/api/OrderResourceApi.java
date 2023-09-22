package com.apedano.restaurant.api;

import com.apedano.restaurant.api.model.OrderDto;
import com.apedano.restaurant.api.model.OrderedDishes;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("/api/restaurant/orders/")
@RegisterRestClient(configKey = "order-resource")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface OrderResourceApi {

    @GET
    @Path("open")
    List<OrderDto> getOpenOrders();

    @GET
    @Path("available-tables")
    List<String> getAvailableTables();


    @POST
    @Path("{orderId}/add-dishes")
    void addDishesToOrder(OrderedDishes orderedDishes);








//
//    @POST
//    @Path("/{orderId}/add-dishes")
//    void addOrderedDishes(@PathParam("orderId")String orderId, List<OrderedDish> orderedDishList);
//
//    @POST
//    @Path("/{orderedDishId}/serve-dish")
//    void serveOrderedDish(@PathParam("orderedDishId")String orderedDishId);
//
//    @PUT
//    @Path("/{orderId}/close")
//    void close(@PathParam("orderId")String orderId);
//
//    @GET
//    @Path("/{orderId}")
//    OrderDetails getTotal(@PathParam("orderId")String orderId);
//
//    @PUT
//    @Path("/{orderId}/pay")
//    void pay(@PathParam("orderId")String orderId);

}
