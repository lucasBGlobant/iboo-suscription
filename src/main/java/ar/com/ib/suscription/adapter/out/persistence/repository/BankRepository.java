package ar.com.ib.suscription.adapter.out.persistence.repository;

import ar.com.ib.suscription.adapter.out.persistence.model.BankModel;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.bson.types.ObjectId;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class BankRepository implements PanacheMongoRepository<BankModel> {

    Optional<BankModel> findByBankName(String bankName){
        return find("name", bankName).firstResultOptional();
    }

    boolean existById(ObjectId id) { return find("bankId", id).firstResultOptional().isPresent(); }

}
