package com.bytatech.ayoos.service.mapper;

import com.bytatech.ayoos.domain.Doctor;
import com.bytatech.ayoos.domain.UserRating;
import com.bytatech.ayoos.service.dto.UserRatingDTO;
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
public class UserRatingMapperImpl implements UserRatingMapper {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public List<UserRating> toEntity(List<UserRatingDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<UserRating> list = new ArrayList<UserRating>( dtoList.size() );
        for ( UserRatingDTO userRatingDTO : dtoList ) {
            list.add( toEntity( userRatingDTO ) );
        }

        return list;
    }

    @Override
    public List<UserRatingDTO> toDto(List<UserRating> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<UserRatingDTO> list = new ArrayList<UserRatingDTO>( entityList.size() );
        for ( UserRating userRating : entityList ) {
            list.add( toDto( userRating ) );
        }

        return list;
    }

    @Override
    public UserRatingDTO toDto(UserRating userRating) {
        if ( userRating == null ) {
            return null;
        }

        UserRatingDTO userRatingDTO = new UserRatingDTO();

        Long id = userRatingDoctorId( userRating );
        if ( id != null ) {
            userRatingDTO.setDoctorId( id );
        }
        userRatingDTO.setId( userRating.getId() );
        userRatingDTO.setUserName( userRating.getUserName() );
        userRatingDTO.setRating( userRating.getRating() );
        userRatingDTO.setRatedOn( userRating.getRatedOn() );

        return userRatingDTO;
    }

    @Override
    public UserRating toEntity(UserRatingDTO userRatingDTO) {
        if ( userRatingDTO == null ) {
            return null;
        }

        UserRating userRating = new UserRating();

        userRating.setDoctor( doctorMapper.fromId( userRatingDTO.getDoctorId() ) );
        userRating.setId( userRatingDTO.getId() );
        userRating.setUserName( userRatingDTO.getUserName() );
        userRating.setRating( userRatingDTO.getRating() );
        userRating.setRatedOn( userRatingDTO.getRatedOn() );

        return userRating;
    }

    private Long userRatingDoctorId(UserRating userRating) {
        if ( userRating == null ) {
            return null;
        }
        Doctor doctor = userRating.getDoctor();
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
