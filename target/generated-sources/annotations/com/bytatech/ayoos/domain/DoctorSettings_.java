package com.bytatech.ayoos.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DoctorSettings.class)
public abstract class DoctorSettings_ {

	public static volatile SingularAttribute<DoctorSettings, String> approvalType;
	public static volatile SingularAttribute<DoctorSettings, Boolean> isMailNotificationsEnabled;
	public static volatile SingularAttribute<DoctorSettings, Boolean> isSMSNotificationsEnabled;
	public static volatile SingularAttribute<DoctorSettings, Long> id;

}

