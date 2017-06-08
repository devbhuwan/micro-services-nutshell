package io.github.devbhuwan.microservices.nutshell.order.model.contracts;

import io.github.devbhuwan.microservices.nutshell.order.model.Order;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/05/19
 */
public interface OrderCatalogService {

    String SERVICE_URI = "order";
    String FIELD_SEPARATOR = ",";

    @POST
    Response createNewOrder(Order order);

    @GET
    @Path("/{id}")
    Response getOrder(@PathParam("id") String orderId, @QueryParam("fields") String fields);

}
