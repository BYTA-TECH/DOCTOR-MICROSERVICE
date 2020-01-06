package com.bytatech.ayoos.service.mapper;

import com.bytatech.ayoos.domain.Reply;
import com.bytatech.ayoos.domain.Review;
import com.bytatech.ayoos.service.dto.ReplyDTO;
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
public class ReplyMapperImpl implements ReplyMapper {

    @Autowired
    private ReviewMapper reviewMapper;

    @Override
    public List<Reply> toEntity(List<ReplyDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Reply> list = new ArrayList<Reply>( dtoList.size() );
        for ( ReplyDTO replyDTO : dtoList ) {
            list.add( toEntity( replyDTO ) );
        }

        return list;
    }

    @Override
    public List<ReplyDTO> toDto(List<Reply> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ReplyDTO> list = new ArrayList<ReplyDTO>( entityList.size() );
        for ( Reply reply : entityList ) {
            list.add( toDto( reply ) );
        }

        return list;
    }

    @Override
    public ReplyDTO toDto(Reply reply) {
        if ( reply == null ) {
            return null;
        }

        ReplyDTO replyDTO = new ReplyDTO();

        Long id = replyReviewId( reply );
        if ( id != null ) {
            replyDTO.setReviewId( id );
        }
        replyDTO.setId( reply.getId() );
        replyDTO.setReply( reply.getReply() );

        return replyDTO;
    }

    @Override
    public Reply toEntity(ReplyDTO replyDTO) {
        if ( replyDTO == null ) {
            return null;
        }

        Reply reply = new Reply();

        reply.setReview( reviewMapper.fromId( replyDTO.getReviewId() ) );
        reply.setId( replyDTO.getId() );
        reply.setReply( replyDTO.getReply() );

        return reply;
    }

    private Long replyReviewId(Reply reply) {
        if ( reply == null ) {
            return null;
        }
        Review review = reply.getReview();
        if ( review == null ) {
            return null;
        }
        Long id = review.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
