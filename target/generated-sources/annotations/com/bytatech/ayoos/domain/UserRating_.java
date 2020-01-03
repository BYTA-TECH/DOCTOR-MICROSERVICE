package com.bytatech.ayoos.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserRating.class)
public abstract class UserRating_ {

	public static volatile SingularAttribute<UserRating, Doctor> doctor;
	public static volatile SingularAttribute<UserRating, Double> rating;
	public static volatile SingularAttribute<UserRating, Long> id;
	public static volatile SingularAttribute<UserRating, String> userName;
	public static volatile SingularAttribute<UserRating, LocalDate> ratedOn;

}

