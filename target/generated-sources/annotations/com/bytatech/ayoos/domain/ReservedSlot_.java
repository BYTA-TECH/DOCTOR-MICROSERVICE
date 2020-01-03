package com.bytatech.ayoos.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ReservedSlot.class)
public abstract class ReservedSlot_ {

	public static volatile SingularAttribute<ReservedSlot, LocalDate> date;
	public static volatile SingularAttribute<ReservedSlot, Doctor> doctor;
	public static volatile SingularAttribute<ReservedSlot, Integer> tokenNumber;
	public static volatile SetAttribute<ReservedSlot, Status> statuses;
	public static volatile SingularAttribute<ReservedSlot, Double> startTime;
	public static volatile SingularAttribute<ReservedSlot, Long> id;
	public static volatile SingularAttribute<ReservedSlot, Double> endTime;

}

