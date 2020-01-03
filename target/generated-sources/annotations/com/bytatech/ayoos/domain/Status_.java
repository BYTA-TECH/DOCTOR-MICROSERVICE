package com.bytatech.ayoos.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Status.class)
public abstract class Status_ {

	public static volatile SingularAttribute<Status, Long> id;
	public static volatile SingularAttribute<Status, ReservedSlot> reservedSlot;
	public static volatile SingularAttribute<Status, String> status;

}

