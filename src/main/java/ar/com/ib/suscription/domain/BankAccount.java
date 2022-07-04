package ar.com.ib.suscription.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbProperty;

@Getter
@Setter
@Builder
@Schema(description = "Cuenta Bancaria")
public class BankAccount {

    @JsonbProperty("nombre-banco")
    public String name;

    @JsonbProperty("cbu")
    public String bankIdentificationNumber;

    @JsonbProperty("moneda")
    public String currency;

    @JsonbProperty("tipo")
    public String type;

}
