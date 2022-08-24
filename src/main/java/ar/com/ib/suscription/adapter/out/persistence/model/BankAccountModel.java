package ar.com.ib.suscription.adapter.out.persistence.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountModel {

    private String name;
    private String bankIdentificationNumber;
    private String currency;
    private String type;

}
