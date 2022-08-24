package ar.com.ib.suscription.adapter.out.persistence.mapper;

import ar.com.ib.suscription.adapter.out.persistence.model.BankModel;
import ar.com.ib.suscription.domain.Bank;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BankMapper {

    BankMapper INSTANCE = Mappers.getMapper( BankMapper.class );

    Bank bankModelTobank(BankModel bankModel);

    BankModel bankToBankModel(Bank bank);
}
