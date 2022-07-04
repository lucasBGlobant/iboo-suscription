package ar.com.ib.suscription.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbProperty;
import java.util.List;

@Getter
@Setter
@Builder
@Schema(description = "All the data from collaborators")
public class CollaboratorsData {

    @JsonbProperty("nombre")
    public String name;

    @JsonbProperty("apellido")
    public String lastName;

    @JsonbProperty("correo-electronico")
    public String email;

    @JsonbProperty("rol")
    public String rol;

    @JsonbProperty("bancos")
    public List<Bank> banks;

    @JsonbProperty("colaboradores")
    public List<Collaborator> collaborators;
}
