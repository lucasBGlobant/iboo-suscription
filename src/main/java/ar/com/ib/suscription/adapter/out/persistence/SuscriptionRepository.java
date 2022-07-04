package ar.com.ib.suscription.adapter.out.persistence;

import ar.com.ib.suscription.domain.AccountData;
import ar.com.ib.suscription.domain.Suscription;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SuscriptionRepository implements PanacheMongoRepository<Suscription> {

    public Suscription findByBankName(AccountData bankName){
        return Suscription.find("names", bankName.names).firstResult();
    }
}
