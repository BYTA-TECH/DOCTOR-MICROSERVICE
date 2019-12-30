package com.bytatech.ayoos.repository;

import com.bytatech.ayoos.domain.SessionInfo;
import com.bytatech.ayoos.service.dto.SessionInfoDTO;

import feign.Param;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the SessionInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SessionInfoRepository extends JpaRepository<SessionInfo, Long> {
	List<SessionInfo> findByDate(LocalDate date);

	@Query(value="Select distinct s from SessionInfo s Join s.workPlace w where s.sessionName =:sessionName And s.date =:date And s.weekDay =:weekDay And s.fromTime =:fromTime And s.toTime =:toTime And w.id=:workPlaceId")
	SessionInfo findBysessionNameAndDateAndWeekDayAndFromTimeAndToTimeAndWorkPlaceId(@Param("sessionName")String sessionName,@Param("date")LocalDate date,@Param("weekDay")Integer weekDay,@Param("fromTime")Double fromTime,@Param("toTime")Double toTime,@Param("workPlaceId") Long workPlaceId);
	
}
