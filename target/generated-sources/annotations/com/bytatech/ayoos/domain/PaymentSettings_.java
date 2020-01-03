package com.bytatech.ayoos.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PaymentSettings.class)
public abstract class PaymentSettings_ {

	public static volatile SingularAttribute<PaymentSettings, Double> amount;
	public static volatile SingularAttribute<PaymentSettings, Boolean> isPaymentEnabled;
	public static volatile SingularAttribute<PaymentSettings, String> noteToPayer;
	public static volatile SingularAttribute<PaymentSettings, String> paymentGatewayProvider;
	public static volatile SingularAttribute<PaymentSettings, String> paymentGatewayCredentials;
	public static volatile SingularAttribute<PaymentSettings, String> paymentMethod;
	public static volatile SingularAttribute<PaymentSettings, String> currency;
	public static volatile SingularAttribute<PaymentSettings, Long> id;
	public static volatile SingularAttribute<PaymentSettings, String> intent;

}

