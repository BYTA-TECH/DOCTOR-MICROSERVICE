package com.bytatech.ayoos.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SessionInfo.class)
public abstract class SessionInfo_ {

	public static volatile SingularAttribute<SessionInfo, LocalDate> date;
	public static volatile SingularAttribute<SessionInfo, String> sessionName;
	public static volatile SingularAttribute<SessionInfo, Integer> weekDay;
	public static volatile SingularAttribute<SessionInfo, Double> fromTime;
	public static volatile SingularAttribute<SessionInfo, Double> interval;
	public static volatile SingularAttribute<SessionInfo, Long> id;
	public static volatile SingularAttribute<SessionInfo, Double> toTime;
	public static volatile SingularAttribute<SessionInfo, WorkPlace> workPlace;

}

