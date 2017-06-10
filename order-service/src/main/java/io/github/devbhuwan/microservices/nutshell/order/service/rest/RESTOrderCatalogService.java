package io.github.devbhuwan.microservices.nutshell.order.service.rest;

import io.github.devbhuwan.microservices.nutshell.order.model.Order;
import io.github.devbhuwan.microservices.nutshell.order.model.contracts.OrderCatalogService;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/05/19
 */
@Path(OrderCatalogService.SERVICE_URI)
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class RESTOrderCatalogService implements OrderCatalogService {

    @Override
    public Response createNewOrder(Order order) {
        return null;
    }

    @Override
    public Response getOrder(String orderId, String fields) {
        return Response.ok("{id : 1, name: 'ok'}").build();
    }

}
