package ar.com.ib.suscription.adapter.in.web;

import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.inject.Inject;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/suscriptor")
@Slf4j
@RequestScoped
@Produces(APPLICATION_JSON)
@Tag(name = "Bancos")
class BankController {


}
