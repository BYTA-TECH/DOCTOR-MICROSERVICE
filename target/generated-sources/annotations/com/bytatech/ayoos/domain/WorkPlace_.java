package com.bytatech.ayoos.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(WorkPlace.class)
public abstract class WorkPlace_ {

	public static volatile SingularAttribute<WorkPlace, Doctor> doctor;
	public static volatile SetAttribute<WorkPlace, SessionInfo> sessionInfos;
	public static volatile SingularAttribute<WorkPlace, String> locationName;
	public static volatile SingularAttribute<WorkPlace, String> name;
	public static volatile SingularAttribute<WorkPlace, String> location;
	public static volatile SingularAttribute<WorkPlace, Long> id;

}

