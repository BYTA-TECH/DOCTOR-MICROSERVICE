package com.bytatech.ayoos.service.mapper;

import com.bytatech.ayoos.domain.Doctor;
import com.bytatech.ayoos.domain.WorkPlace;
import com.bytatech.ayoos.service.dto.WorkPlaceDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-03T14:46:02+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_222 (Private Build)"
)
@Component
public class WorkPlaceMapperImpl implements WorkPlaceMapper {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public List<WorkPlace> toEntity(List<WorkPlaceDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<WorkPlace> list = new ArrayList<WorkPlace>( dtoList.size() );
        for ( WorkPlaceDTO workPlaceDTO : dtoList ) {
            list.add( toEntity( workPlaceDTO ) );
        }

        return list;
    }

    @Override
    public List<WorkPlaceDTO> toDto(List<WorkPlace> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<WorkPlaceDTO> list = new ArrayList<WorkPlaceDTO>( entityList.size() );
        for ( WorkPlace workPlace : entityList ) {
            list.add( toDto( workPlace ) );
        }

        return list;
    }

    @Override
    public WorkPlaceDTO toDto(WorkPlace workPlace) {
        if ( workPlace == null ) {
            return null;
        }

        WorkPlaceDTO workPlaceDTO = new WorkPlaceDTO();

        Long id = workPlaceDoctorId( workPlace );
        if ( id != null ) {
            workPlaceDTO.setDoctorId( id );
        }
        workPlaceDTO.setId( workPlace.getId() );
        workPlaceDTO.setName( workPlace.getName() );
        workPlaceDTO.setLocationName( workPlace.getLocationName() );
        workPlaceDTO.setLocation( workPlace.getLocation() );

        return workPlaceDTO;
    }

    @Override
    public WorkPlace toEntity(WorkPlaceDTO workPlaceDTO) {
        if ( workPlaceDTO == null ) {
            return null;
        }

        WorkPlace workPlace = new WorkPlace();

        workPlace.setDoctor( doctorMapper.fromId( workPlaceDTO.getDoctorId() ) );
        workPlace.setId( workPlaceDTO.getId() );
        workPlace.setName( workPlaceDTO.getName() );
        workPlace.setLocationName( workPlaceDTO.getLocationName() );
        workPlace.setLocation( workPlaceDTO.getLocation() );

        return workPlace;
    }

    private Long workPlaceDoctorId(WorkPlace workPlace) {
        if ( workPlace == null ) {
            return null;
        }
        Doctor doctor = workPlace.getDoctor();
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
