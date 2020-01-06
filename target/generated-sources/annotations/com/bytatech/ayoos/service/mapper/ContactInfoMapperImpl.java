package com.bytatech.ayoos.service.mapper;

import com.bytatech.ayoos.domain.ContactInfo;
import com.bytatech.ayoos.service.dto.ContactInfoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-06T17:45:52+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_222 (Private Build)"
)
@Component
public class ContactInfoMapperImpl implements ContactInfoMapper {

    @Override
    public ContactInfo toEntity(ContactInfoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ContactInfo contactInfo = new ContactInfo();

        contactInfo.setId( dto.getId() );
        contactInfo.setFacebookURL( dto.getFacebookURL() );
        contactInfo.setTwitterURL( dto.getTwitterURL() );

        return contactInfo;
    }

    @Override
    public ContactInfoDTO toDto(ContactInfo entity) {
        if ( entity == null ) {
            return null;
        }

        ContactInfoDTO contactInfoDTO = new ContactInfoDTO();

        contactInfoDTO.setId( entity.getId() );
        contactInfoDTO.setFacebookURL( entity.getFacebookURL() );
        contactInfoDTO.setTwitterURL( entity.getTwitterURL() );

        return contactInfoDTO;
    }

    @Override
    public List<ContactInfo> toEntity(List<ContactInfoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ContactInfo> list = new ArrayList<ContactInfo>( dtoList.size() );
        for ( ContactInfoDTO contactInfoDTO : dtoList ) {
            list.add( toEntity( contactInfoDTO ) );
        }

        return list;
    }

    @Override
    public List<ContactInfoDTO> toDto(List<ContactInfo> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ContactInfoDTO> list = new ArrayList<ContactInfoDTO>( entityList.size() );
        for ( ContactInfo contactInfo : entityList ) {
            list.add( toDto( contactInfo ) );
        }

        return list;
    }
}
