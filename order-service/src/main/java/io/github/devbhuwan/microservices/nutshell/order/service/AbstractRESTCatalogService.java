package io.github.devbhuwan.microservices.nutshell.order.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/05/19
 */
abstract class AbstractRESTCatalogService {


    @GET
    @Path("/health")
    public Response health() {
        return Response.ok().build();
    }
}
