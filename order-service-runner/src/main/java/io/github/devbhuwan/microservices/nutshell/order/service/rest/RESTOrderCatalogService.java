package io.github.devbhuwan.microservices.nutshell.order.service.rest;

import io.github.devbhuwan.microservices.nutshell.order.model.contracts.OrderCatalogService;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/05/19
 */
@Component
@Path(OrderCatalogService.SERVICE_URI)
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class RESTOrderCatalogService {

    @GET
    @Path("/health")
    public Response health() {
        return Response.ok("alive").build();
    }
}
