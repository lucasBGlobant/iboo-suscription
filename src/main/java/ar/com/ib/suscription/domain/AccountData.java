package ar.com.ib.suscription.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbProperty;

@Getter
@Setter
@Builder
@Schema(description = "Datos cuenta")
public class AccountData {

    @JsonbProperty("nacionalidad")
    public String nationality;

    @JsonbProperty("tipo-documento")
    public String docType;

    @JsonbProperty("tipo-número")
    public String numberType;

    @JsonbProperty("nombres")
    public String names;

    @JsonbProperty("apellidos")
    public String lastNames;

    @JsonbProperty("email")
    public String email;

}
