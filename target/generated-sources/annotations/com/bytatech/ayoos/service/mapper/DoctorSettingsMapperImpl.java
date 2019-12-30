package com.bytatech.ayoos.service.mapper;

import com.bytatech.ayoos.domain.DoctorSettings;
import com.bytatech.ayoos.service.dto.DoctorSettingsDTO;
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
public class DoctorSettingsMapperImpl implements DoctorSettingsMapper {

    @Override
    public DoctorSettings toEntity(DoctorSettingsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        DoctorSettings doctorSettings = new DoctorSettings();

        doctorSettings.setId( dto.getId() );
        doctorSettings.setApprovalType( dto.getApprovalType() );
        doctorSettings.setIsMailNotificationsEnabled( dto.isIsMailNotificationsEnabled() );
        doctorSettings.setIsSMSNotificationsEnabled( dto.isIsSMSNotificationsEnabled() );

        return doctorSettings;
    }

    @Override
    public DoctorSettingsDTO toDto(DoctorSettings entity) {
        if ( entity == null ) {
            return null;
        }

        DoctorSettingsDTO doctorSettingsDTO = new DoctorSettingsDTO();

        doctorSettingsDTO.setId( entity.getId() );
        doctorSettingsDTO.setApprovalType( entity.getApprovalType() );
        doctorSettingsDTO.setIsMailNotificationsEnabled( entity.isIsMailNotificationsEnabled() );
        doctorSettingsDTO.setIsSMSNotificationsEnabled( entity.isIsSMSNotificationsEnabled() );

        return doctorSettingsDTO;
    }

    @Override
    public List<DoctorSettings> toEntity(List<DoctorSettingsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<DoctorSettings> list = new ArrayList<DoctorSettings>( dtoList.size() );
        for ( DoctorSettingsDTO doctorSettingsDTO : dtoList ) {
            list.add( toEntity( doctorSettingsDTO ) );
        }

        return list;
    }

    @Override
    public List<DoctorSettingsDTO> toDto(List<DoctorSettings> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DoctorSettingsDTO> list = new ArrayList<DoctorSettingsDTO>( entityList.size() );
        for ( DoctorSettings doctorSettings : entityList ) {
            list.add( toDto( doctorSettings ) );
        }

        return list;
    }
}
