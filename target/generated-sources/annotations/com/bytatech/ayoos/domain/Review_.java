package com.bytatech.ayoos.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Review.class)
public abstract class Review_ {

	public static volatile SingularAttribute<Review, Doctor> doctor;
	public static volatile SingularAttribute<Review, LocalDate> reviewedOn;
	public static volatile SetAttribute<Review, Reply> replies;
	public static volatile SingularAttribute<Review, String> review;
	public static volatile SingularAttribute<Review, Long> id;
	public static volatile SingularAttribute<Review, String> userName;

}

