package com.bytatech.ayoos.service.mapper;

import com.bytatech.ayoos.domain.ContactInfo;
import com.bytatech.ayoos.domain.Doctor;
import com.bytatech.ayoos.domain.DoctorSettings;
import com.bytatech.ayoos.domain.PaymentSettings;
import com.bytatech.ayoos.service.dto.DoctorDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-30T14:00:23+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_222 (Private Build)"
)
@Component
public class DoctorMapperImpl implements DoctorMapper {

    @Autowired
    private ContactInfoMapper contactInfoMapper;
    @Autowired
    private PaymentSettingsMapper paymentSettingsMapper;
    @Autowired
    private DoctorSettingsMapper doctorSettingsMapper;

    @Override
    public List<Doctor> toEntity(List<DoctorDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Doctor> list = new ArrayList<Doctor>( dtoList.size() );
        for ( DoctorDTO doctorDTO : dtoList ) {
            list.add( toEntity( doctorDTO ) );
        }

        return list;
    }

    @Override
    public List<DoctorDTO> toDto(List<Doctor> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DoctorDTO> list = new ArrayList<DoctorDTO>( entityList.size() );
        for ( Doctor doctor : entityList ) {
            list.add( toDto( doctor ) );
        }

        return list;
    }

    @Override
    public DoctorDTO toDto(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }

        DoctorDTO doctorDTO = new DoctorDTO();

        Long id = doctorContactInfoId( doctor );
        if ( id != null ) {
            doctorDTO.setContactInfoId( id );
        }
        Long id1 = doctorDoctorSettingsId( doctor );
        if ( id1 != null ) {
            doctorDTO.setDoctorSettingsId( id1 );
        }
        Long id2 = doctorPaymentSettingsId( doctor );
        if ( id2 != null ) {
            doctorDTO.setPaymentSettingsId( id2 );
        }
        doctorDTO.setId( doctor.getId() );
        byte[] image = doctor.getImage();
        if ( image != null ) {
            doctorDTO.setImage( Arrays.copyOf( image, image.length ) );
        }
        doctorDTO.setImageContentType( doctor.getImageContentType() );
        doctorDTO.setDoctorId( doctor.getDoctorId() );
        doctorDTO.setSpecialization( doctor.getSpecialization() );
        doctorDTO.setRegisterNumber( doctor.getRegisterNumber() );
        doctorDTO.setPracticeSince( doctor.getPracticeSince() );
        doctorDTO.setTotalRating( doctor.getTotalRating() );
        doctorDTO.setFirstName( doctor.getFirstName() );
        doctorDTO.setEmail( doctor.getEmail() );
        doctorDTO.setPhoneNumber( doctor.getPhoneNumber() );

        return doctorDTO;
    }

    @Override
    public Doctor toEntity(DoctorDTO doctorDTO) {
        if ( doctorDTO == null ) {
            return null;
        }

        Doctor doctor = new Doctor();

        doctor.setContactInfo( contactInfoMapper.fromId( doctorDTO.getContactInfoId() ) );
        doctor.setDoctorSettings( doctorSettingsMapper.fromId( doctorDTO.getDoctorSettingsId() ) );
        doctor.setPaymentSettings( paymentSettingsMapper.fromId( doctorDTO.getPaymentSettingsId() ) );
        doctor.setId( doctorDTO.getId() );
        byte[] image = doctorDTO.getImage();
        if ( image != null ) {
            doctor.setImage( Arrays.copyOf( image, image.length ) );
        }
        doctor.setImageContentType( doctorDTO.getImageContentType() );
        doctor.setDoctorId( doctorDTO.getDoctorId() );
        doctor.setSpecialization( doctorDTO.getSpecialization() );
        doctor.setRegisterNumber( doctorDTO.getRegisterNumber() );
        doctor.setPracticeSince( doctorDTO.getPracticeSince() );
        doctor.setTotalRating( doctorDTO.getTotalRating() );
        doctor.setFirstName( doctorDTO.getFirstName() );
        doctor.setEmail( doctorDTO.getEmail() );
        doctor.setPhoneNumber( doctorDTO.getPhoneNumber() );

        return doctor;
    }

    private Long doctorContactInfoId(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }
        ContactInfo contactInfo = doctor.getContactInfo();
        if ( contactInfo == null ) {
            return null;
        }
        Long id = contactInfo.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long doctorDoctorSettingsId(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }
        DoctorSettings doctorSettings = doctor.getDoctorSettings();
        if ( doctorSettings == null ) {
            return null;
        }
        Long id = doctorSettings.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long doctorPaymentSettingsId(Doctor doctor) {
        if ( doctor == null ) {
            return null;
        }
        PaymentSettings paymentSettings = doctor.getPaymentSettings();
        if ( paymentSettings == null ) {
            return null;
        }
        Long id = paymentSettings.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
