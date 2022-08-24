package ar.com.ib.suscription.adapter.out.persistence.mapper;

import ar.com.ib.suscription.adapter.out.persistence.model.BankAccountModel;
import ar.com.ib.suscription.domain.BankAccount;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BankAccountMapper {

    BankAccountMapper INSTANCE = Mappers.getMapper( BankAccountMapper.class );

    BankAccount bankAccountModelToBankAccount(BankAccountModel bankAccountModel);

    BankAccountModel bankAccountToBankAccountModel(BankAccount bankAccount);

}
