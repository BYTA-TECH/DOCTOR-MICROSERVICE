package com.bytatech.ayoos.service.mapper;

import com.bytatech.ayoos.domain.ReservedSlot;
import com.bytatech.ayoos.domain.Status;
import com.bytatech.ayoos.service.dto.StatusDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-06T17:45:52+0530",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_222 (Private Build)"
)
@Component
public class StatusMapperImpl implements StatusMapper {

    @Autowired
    private ReservedSlotMapper reservedSlotMapper;

    @Override
    public List<Status> toEntity(List<StatusDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Status> list = new ArrayList<Status>( dtoList.size() );
        for ( StatusDTO statusDTO : dtoList ) {
            list.add( toEntity( statusDTO ) );
        }

        return list;
    }

    @Override
    public List<StatusDTO> toDto(List<Status> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<StatusDTO> list = new ArrayList<StatusDTO>( entityList.size() );
        for ( Status status : entityList ) {
            list.add( toDto( status ) );
        }

        return list;
    }

    @Override
    public StatusDTO toDto(Status status) {
        if ( status == null ) {
            return null;
        }

        StatusDTO statusDTO = new StatusDTO();

        Long id = statusReservedSlotId( status );
        if ( id != null ) {
            statusDTO.setReservedSlotId( id );
        }
        statusDTO.setId( status.getId() );
        statusDTO.setStatus( status.getStatus() );

        return statusDTO;
    }

    @Override
    public Status toEntity(StatusDTO statusDTO) {
        if ( statusDTO == null ) {
            return null;
        }

        Status status = new Status();

        status.setReservedSlot( reservedSlotMapper.fromId( statusDTO.getReservedSlotId() ) );
        status.setId( statusDTO.getId() );
        status.setStatus( statusDTO.getStatus() );

        return status;
    }

    private Long statusReservedSlotId(Status status) {
        if ( status == null ) {
            return null;
        }
        ReservedSlot reservedSlot = status.getReservedSlot();
        if ( reservedSlot == null ) {
            return null;
        }
        Long id = reservedSlot.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
