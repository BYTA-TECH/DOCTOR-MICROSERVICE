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

	@Query(value="Select  s from SessionInfo s Join s.workPlace w where s.sessionName =:sessionName AND s.date =:date AND s.weekDay =:weekDay AND s.fromTime =:fromTime AND s.toTime =:toTime AND w.id=:workPlaceId")

	
	SessionInfo findBySessionNameAndDateAndWeekDayAndFromTimeAndToTimeAndWorkPlace_Id(String sessionName,LocalDate date,Integer weekDay,Double fromTime,Double toTime,Long workPlaceId);
}
