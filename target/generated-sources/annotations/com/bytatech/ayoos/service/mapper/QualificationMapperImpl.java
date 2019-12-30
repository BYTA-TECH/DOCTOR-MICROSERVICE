package com.bytatech.ayoos.service.mapper;

import com.bytatech.ayoos.domain.Doctor;
import com.bytatech.ayoos.domain.Qualification;
import com.bytatech.ayoos.service.dto.QualificationDTO;
import java.util.ArrayList;
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
public class QualificationMapperImpl implements QualificationMapper {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public List<Qualification> toEntity(List<QualificationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Qualification> list = new ArrayList<Qualification>( dtoList.size() );
        for ( QualificationDTO qualificationDTO : dtoList ) {
            list.add( toEntity( qualificationDTO ) );
        }

        return list;
    }

    @Override
    public List<QualificationDTO> toDto(List<Qualification> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<QualificationDTO> list = new ArrayList<QualificationDTO>( entityList.size() );
        for ( Qualification qualification : entityList ) {
            list.add( toDto( qualification ) );
        }

        return list;
    }

    @Override
    public QualificationDTO toDto(Qualification qualification) {
        if ( qualification == null ) {
            return null;
        }

        QualificationDTO qualificationDTO = new QualificationDTO();

        Long id = qualificationDoctorId( qualification );
        if ( id != null ) {
            qualificationDTO.setDoctorId( id );
        }
        qualificationDTO.setId( qualification.getId() );
        qualificationDTO.setQualification( qualification.getQualification() );

        return qualificationDTO;
    }

    @Override
    public Qualification toEntity(QualificationDTO qualificationDTO) {
        if ( qualificationDTO == null ) {
            return null;
        }

        Qualification qualification = new Qualification();

        qualification.setDoctor( doctorMapper.fromId( qualificationDTO.getDoctorId() ) );
        qualification.setId( qualificationDTO.getId() );
        qualification.setQualification( qualificationDTO.getQualification() );

        return qualification;
    }

    private Long qualificationDoctorId(Qualification qualification) {
        if ( qualification == null ) {
            return null;
        }
        Doctor doctor = qualification.getDoctor();
        if ( doctor == null ) {
            return null;
        }
        Long id = doctor.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
