package com.bytatech.ayoos.domain;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Doctor.class)
public abstract class Doctor_ {

	public static volatile SingularAttribute<Doctor, byte[]> image;
	public static volatile SingularAttribute<Doctor, ContactInfo> contactInfo;
	public static volatile SingularAttribute<Doctor, PaymentSettings> paymentSettings;
	public static volatile SingularAttribute<Doctor, Double> totalRating;
	public static volatile SetAttribute<Doctor, UserRating> userRatings;
	public static volatile SetAttribute<Doctor, ReservedSlot> reservedSlots;
	public static volatile SetAttribute<Doctor, WorkPlace> workPlaces;
	public static volatile SingularAttribute<Doctor, String> firstName;
	public static volatile SetAttribute<Doctor, Qualification> qualifications;
	public static volatile SingularAttribute<Doctor, Long> phoneNumber;
	public static volatile SetAttribute<Doctor, Review> reviews;
	public static volatile SingularAttribute<Doctor, String> doctorId;
	public static volatile SingularAttribute<Doctor, String> imageContentType;
	public static volatile SingularAttribute<Doctor, DoctorSettings> doctorSettings;
	public static volatile SingularAttribute<Doctor, String> specialization;
	public static volatile SingularAttribute<Doctor, Long> id;
	public static volatile SingularAttribute<Doctor, String> registerNumber;
	public static volatile SingularAttribute<Doctor, String> email;
	public static volatile SingularAttribute<Doctor, LocalDate> practiceSince;

}

