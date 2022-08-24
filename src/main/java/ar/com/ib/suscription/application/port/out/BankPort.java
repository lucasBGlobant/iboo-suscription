package ar.com.ib.suscription.application.port.out;

import ar.com.ib.suscription.adapter.out.persistence.model.BankModel;
import ar.com.ib.suscription.domain.Bank;
import ar.com.ib.suscription.domain.BankAccount;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface BankPort {

    Bank createBank(String name, List<BankAccount> bankAccounts);

    Optional<BankModel> findByBankName(String bankName);

    boolean existById(ObjectId id);
}
