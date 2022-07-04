package ar.com.ib.suscription.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbProperty;

@Getter
@Setter
@Builder
@Schema(description = "Entidad Banco")
public class Bank {

    @JsonbProperty("nombre")
    public String name;

    @JsonbProperty("cuenta")
    public BankAccount bankAccount;

}
