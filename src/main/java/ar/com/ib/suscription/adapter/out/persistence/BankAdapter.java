package ar.com.ib.suscription.adapter.out.persistence;

import ar.com.ib.suscription.adapter.out.persistence.mapper.BankMapper;
import ar.com.ib.suscription.adapter.out.persistence.model.BankModel;
import ar.com.ib.suscription.adapter.out.persistence.repository.BankRepository;
import ar.com.ib.suscription.application.port.out.BankPort;
import ar.com.ib.suscription.domain.Bank;
import ar.com.ib.suscription.domain.BankAccount;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
@Slf4j
@Transactional
class BankAdapter implements BankPort {

    BankRepository bankRepository;

    BankMapper bankMapper;

    @Inject
    public BankAdapter(BankRepository bankRepository, BankMapper bankMapper){
        this.bankRepository = bankRepository;
        this.bankMapper = bankMapper;
    }

    @Override
    public Bank createBank(String name, List<BankAccount> bankAccounts) {

        log.info("BankAdapter createBank()".concat(name));
        Optional<BankModel> optionalBankModel = findByBankName(name);

        BankModel bankModel = null;
        if (!optionalBankModel.isPresent()){

            bankModel = new BankModel(name, bankAccounts);
            log.info("bankRepository.persist() NEW Bank with params: "
                    .concat(bankModel.toString()));
            bankRepository.persist(bankModel);
        }
        return bankMapper.bankModelTobank(bankModel);
    }

    @Override
    public Optional<BankModel> findByBankName(String bankName) {
        return Optional.empty();
    }

    @Override
    public boolean existById(ObjectId id) {
        return false;
    }
}
