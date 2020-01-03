package com.bytatech.ayoos.service.mapper;

import com.bytatech.ayoos.domain.Doctor;
import com.bytatech.ayoos.domain.ReservedSlot;
import com.bytatech.ayoos.service.dto.ReservedSlotDTO;
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
public class ReservedSlotMapperImpl implements ReservedSlotMapper {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public List<ReservedSlot> toEntity(List<ReservedSlotDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ReservedSlot> list = new ArrayList<ReservedSlot>( dtoList.size() );
        for ( ReservedSlotDTO reservedSlotDTO : dtoList ) {
            list.add( toEntity( reservedSlotDTO ) );
        }

        return list;
    }

    @Override
    public List<ReservedSlotDTO> toDto(List<ReservedSlot> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ReservedSlotDTO> list = new ArrayList<ReservedSlotDTO>( entityList.size() );
        for ( ReservedSlot reservedSlot : entityList ) {
            list.add( toDto( reservedSlot ) );
        }

        return list;
    }

    @Override
    public ReservedSlotDTO toDto(ReservedSlot reservedSlot) {
        if ( reservedSlot == null ) {
            return null;
        }

        ReservedSlotDTO reservedSlotDTO = new ReservedSlotDTO();

        Long id = reservedSlotDoctorId( reservedSlot );
        if ( id != null ) {
            reservedSlotDTO.setDoctorId( id );
        }
        reservedSlotDTO.setId( reservedSlot.getId() );
        reservedSlotDTO.setDate( reservedSlot.getDate() );
        reservedSlotDTO.setStartTime( reservedSlot.getStartTime() );
        reservedSlotDTO.setEndTime( reservedSlot.getEndTime() );
        reservedSlotDTO.setTokenNumber( reservedSlot.getTokenNumber() );

        return reservedSlotDTO;
    }

    @Override
    public ReservedSlot toEntity(ReservedSlotDTO reservedSlotDTO) {
        if ( reservedSlotDTO == null ) {
            return null;
        }

        ReservedSlot reservedSlot = new ReservedSlot();

        reservedSlot.setDoctor( doctorMapper.fromId( reservedSlotDTO.getDoctorId() ) );
        reservedSlot.setId( reservedSlotDTO.getId() );
        reservedSlot.setDate( reservedSlotDTO.getDate() );
        reservedSlot.setStartTime( reservedSlotDTO.getStartTime() );
        reservedSlot.setEndTime( reservedSlotDTO.getEndTime() );
        reservedSlot.setTokenNumber( reservedSlotDTO.getTokenNumber() );

        return reservedSlot;
    }

    private Long reservedSlotDoctorId(ReservedSlot reservedSlot) {
        if ( reservedSlot == null ) {
            return null;
        }
        Doctor doctor = reservedSlot.getDoctor();
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
