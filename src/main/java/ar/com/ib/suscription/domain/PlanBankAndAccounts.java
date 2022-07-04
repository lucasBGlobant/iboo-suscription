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
@Schema(description = "Plan banco y cuentas")
public class PlanBankAndAccounts {

    @JsonbProperty("plan")
    public String plan;

    @JsonbProperty("bancos")
    public List<Bank> banks;

    @JsonbProperty("tipo-suscripcion")
    public String suscriptionType;

    @JsonbProperty("claves-bancarias-uniformes-basicas")
    public List<String> basicCBUs;

    @JsonbProperty("planes-claves-bancarias-uniformes")
    public List<String> planCBUs;

}
