package ar.com.ib.suscription.domain;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import javax.json.bind.annotation.JsonbProperty;

@Getter
@Setter
@Builder
@Schema(description = "Suscripcion")
@MongoEntity(collection = "Suscripción")
public class Suscription extends PanacheMongoEntity {

    @JsonbProperty("name")
    public String name;

    @JsonbProperty("datos-cuenta")
    public AccountData accountData;

    @JsonbProperty("datos-negocio")
    public BussinesData bussinesData;

    @JsonbProperty("datos-representacion-legal")
    public LegalRepresentativeData legalRepresentativeData;

    @JsonbProperty("plan-banco-cuentas")
    public PlanBankAndAccounts planBankAndAccounts;

    @JsonbProperty("datos-colaboradores")
    public CollaboratorsData collaboratorsData;

}
