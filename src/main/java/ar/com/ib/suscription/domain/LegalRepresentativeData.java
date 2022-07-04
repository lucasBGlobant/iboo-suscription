package ar.com.ib.suscription.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbProperty;

@Getter
@Setter
@Builder
@Schema(description = "Datos representante legal")
public class LegalRepresentativeData {

    @JsonbProperty("nombre")
    public String name;

    @JsonbProperty("apellidos")
    public String lastName;

    @JsonbProperty("email")
    public String email;

    @JsonbProperty("archivo-url")
    public String file;

}
