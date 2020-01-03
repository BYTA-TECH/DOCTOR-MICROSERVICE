package com.bytatech.ayoos.service.mapper;

import com.bytatech.ayoos.domain.SessionInfo;
import com.bytatech.ayoos.domain.WorkPlace;
import com.bytatech.ayoos.service.dto.SessionInfoDTO;
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
public class SessionInfoMapperImpl implements SessionInfoMapper {

    @Autowired
    private WorkPlaceMapper workPlaceMapper;

    @Override
    public List<SessionInfo> toEntity(List<SessionInfoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SessionInfo> list = new ArrayList<SessionInfo>( dtoList.size() );
        for ( SessionInfoDTO sessionInfoDTO : dtoList ) {
            list.add( toEntity( sessionInfoDTO ) );
        }

        return list;
    }

    @Override
    public List<SessionInfoDTO> toDto(List<SessionInfo> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SessionInfoDTO> list = new ArrayList<SessionInfoDTO>( entityList.size() );
        for ( SessionInfo sessionInfo : entityList ) {
            list.add( toDto( sessionInfo ) );
        }

        return list;
    }

    @Override
    public SessionInfoDTO toDto(SessionInfo sessionInfo) {
        if ( sessionInfo == null ) {
            return null;
        }

        SessionInfoDTO sessionInfoDTO = new SessionInfoDTO();

        Long id = sessionInfoWorkPlaceId( sessionInfo );
        if ( id != null ) {
            sessionInfoDTO.setWorkPlaceId( id );
        }
        sessionInfoDTO.setId( sessionInfo.getId() );
        sessionInfoDTO.setSessionName( sessionInfo.getSessionName() );
        sessionInfoDTO.setDate( sessionInfo.getDate() );
        sessionInfoDTO.setWeekDay( sessionInfo.getWeekDay() );
        sessionInfoDTO.setFromTime( sessionInfo.getFromTime() );
        sessionInfoDTO.setToTime( sessionInfo.getToTime() );
        sessionInfoDTO.setInterval( sessionInfo.getInterval() );

        return sessionInfoDTO;
    }

    @Override
    public SessionInfo toEntity(SessionInfoDTO sessionInfoDTO) {
        if ( sessionInfoDTO == null ) {
            return null;
        }

        SessionInfo sessionInfo = new SessionInfo();

        sessionInfo.setWorkPlace( workPlaceMapper.fromId( sessionInfoDTO.getWorkPlaceId() ) );
        sessionInfo.setId( sessionInfoDTO.getId() );
        sessionInfo.setSessionName( sessionInfoDTO.getSessionName() );
        sessionInfo.setDate( sessionInfoDTO.getDate() );
        sessionInfo.setWeekDay( sessionInfoDTO.getWeekDay() );
        sessionInfo.setFromTime( sessionInfoDTO.getFromTime() );
        sessionInfo.setToTime( sessionInfoDTO.getToTime() );
        sessionInfo.setInterval( sessionInfoDTO.getInterval() );

        return sessionInfo;
    }

    private Long sessionInfoWorkPlaceId(SessionInfo sessionInfo) {
        if ( sessionInfo == null ) {
            return null;
        }
        WorkPlace workPlace = sessionInfo.getWorkPlace();
        if ( workPlace == null ) {
            return null;
        }
        Long id = workPlace.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
