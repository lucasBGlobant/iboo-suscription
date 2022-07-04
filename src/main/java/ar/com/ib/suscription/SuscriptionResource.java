package ar.com.ib.suscription;

import ar.com.ib.suscription.domain.Suscription;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Path("/api/v1/suscription")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SuscriptionResource {

    @GET
    public List<Suscription> list() {
        return Suscription.listAll();
    }

    @POST
    public Response create(Suscription suscription){
        suscription.persist();
        return Response.created(URI.create("/suscription/" + suscription.id)).build();
    }
}