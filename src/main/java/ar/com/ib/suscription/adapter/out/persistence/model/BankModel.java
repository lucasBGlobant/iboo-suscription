package ar.com.ib.suscription.adapter.out.persistence.model;

import ar.com.ib.suscription.domain.BankAccount;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@MongoEntity(collection = "bancos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankModel extends PanacheMongoEntity {

    @NotNull
    private String name;

    @NotNull
    private List<BankAccount> bankAccounts;
}
