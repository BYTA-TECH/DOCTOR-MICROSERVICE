package com.bytatech.ayoos.service.mapper;

import com.bytatech.ayoos.domain.Doctor;
import com.bytatech.ayoos.domain.Review;
import com.bytatech.ayoos.service.dto.ReviewDTO;
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
public class ReviewMapperImpl implements ReviewMapper {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public List<Review> toEntity(List<ReviewDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Review> list = new ArrayList<Review>( dtoList.size() );
        for ( ReviewDTO reviewDTO : dtoList ) {
            list.add( toEntity( reviewDTO ) );
        }

        return list;
    }

    @Override
    public List<ReviewDTO> toDto(List<Review> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ReviewDTO> list = new ArrayList<ReviewDTO>( entityList.size() );
        for ( Review review : entityList ) {
            list.add( toDto( review ) );
        }

        return list;
    }

    @Override
    public ReviewDTO toDto(Review review) {
        if ( review == null ) {
            return null;
        }

        ReviewDTO reviewDTO = new ReviewDTO();

        Long id = reviewDoctorId( review );
        if ( id != null ) {
            reviewDTO.setDoctorId( id );
        }
        reviewDTO.setId( review.getId() );
        reviewDTO.setUserName( review.getUserName() );
        reviewDTO.setReview( review.getReview() );
        reviewDTO.setReviewedOn( review.getReviewedOn() );

        return reviewDTO;
    }

    @Override
    public Review toEntity(ReviewDTO reviewDTO) {
        if ( reviewDTO == null ) {
            return null;
        }

        Review review = new Review();

        review.setDoctor( doctorMapper.fromId( reviewDTO.getDoctorId() ) );
        review.setId( reviewDTO.getId() );
        review.setUserName( reviewDTO.getUserName() );
        review.setReview( reviewDTO.getReview() );
        review.setReviewedOn( reviewDTO.getReviewedOn() );

        return review;
    }

    private Long reviewDoctorId(Review review) {
        if ( review == null ) {
            return null;
        }
        Doctor doctor = review.getDoctor();
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
