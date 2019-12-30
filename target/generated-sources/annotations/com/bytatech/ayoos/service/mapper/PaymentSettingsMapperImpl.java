package com.bytatech.ayoos.service.mapper;

import com.bytatech.ayoos.domain.PaymentSettings;
import com.bytatech.ayoos.service.dto.PaymentSettingsDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-30T14:00:23+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_222 (Private Build)"
)
@Component
public class PaymentSettingsMapperImpl implements PaymentSettingsMapper {

    @Override
    public PaymentSettings toEntity(PaymentSettingsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PaymentSettings paymentSettings = new PaymentSettings();

        paymentSettings.setId( dto.getId() );
        paymentSettings.setIsPaymentEnabled( dto.isIsPaymentEnabled() );
        paymentSettings.setAmount( dto.getAmount() );
        paymentSettings.setPaymentMethod( dto.getPaymentMethod() );
        paymentSettings.setCurrency( dto.getCurrency() );
        paymentSettings.setIntent( dto.getIntent() );
        paymentSettings.setNoteToPayer( dto.getNoteToPayer() );
        paymentSettings.setPaymentGatewayProvider( dto.getPaymentGatewayProvider() );
        paymentSettings.setPaymentGatewayCredentials( dto.getPaymentGatewayCredentials() );

        return paymentSettings;
    }

    @Override
    public PaymentSettingsDTO toDto(PaymentSettings entity) {
        if ( entity == null ) {
            return null;
        }

        PaymentSettingsDTO paymentSettingsDTO = new PaymentSettingsDTO();

        paymentSettingsDTO.setId( entity.getId() );
        paymentSettingsDTO.setIsPaymentEnabled( entity.isIsPaymentEnabled() );
        paymentSettingsDTO.setAmount( entity.getAmount() );
        paymentSettingsDTO.setPaymentMethod( entity.getPaymentMethod() );
        paymentSettingsDTO.setCurrency( entity.getCurrency() );
        paymentSettingsDTO.setIntent( entity.getIntent() );
        paymentSettingsDTO.setNoteToPayer( entity.getNoteToPayer() );
        paymentSettingsDTO.setPaymentGatewayProvider( entity.getPaymentGatewayProvider() );
        paymentSettingsDTO.setPaymentGatewayCredentials( entity.getPaymentGatewayCredentials() );

        return paymentSettingsDTO;
    }

    @Override
    public List<PaymentSettings> toEntity(List<PaymentSettingsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PaymentSettings> list = new ArrayList<PaymentSettings>( dtoList.size() );
        for ( PaymentSettingsDTO paymentSettingsDTO : dtoList ) {
            list.add( toEntity( paymentSettingsDTO ) );
        }

        return list;
    }

    @Override
    public List<PaymentSettingsDTO> toDto(List<PaymentSettings> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PaymentSettingsDTO> list = new ArrayList<PaymentSettingsDTO>( entityList.size() );
        for ( PaymentSettings paymentSettings : entityList ) {
            list.add( toDto( paymentSettings ) );
        }

        return list;
    }
}
