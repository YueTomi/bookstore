package hhekbonnbook.com.api;

import io.smallrye.common.constraint.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api")
public interface BookStoreResource {

    @GET
    @Path("/addBook")
    @Produces(MediaType.APPLICATION_JSON)
    Response addBook(@NotNull String isbn);
}
