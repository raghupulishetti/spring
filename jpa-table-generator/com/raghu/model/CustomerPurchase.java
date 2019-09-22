package com.raghu.medical.model;
// Generated Nov 24, 2016 6:48:19 AM by Hibernate Tools 4.3.5.Final

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * CustomerPurchase generated by hbm2java
 */
@Entity
@Table(name = "customer_purchase", catalog = "mms")
public class CustomerPurchase extends BaseEntity<Long> implements java.io.Serializable {

	private Customer customer;
	private MedicalStore medicalStore;
	private Medicine medicine;
	private Float price;
	private Float discount;
	private Integer quantity;
	private Invoice invoice;
	// private Set<Invoice> invoices = new HashSet<Invoice>(0);

	public CustomerPurchase() {
	}

	public CustomerPurchase(Customer customer, MedicalStore medicalStore, Medicine medicine, Float price) {
		this.customer = customer;
		this.medicalStore = medicalStore;
		this.medicine = medicine;
		this.price = price;
	}

	public CustomerPurchase(Customer customer, MedicalStore medicalStore, Medicine medicine, Float price, Float discount,
			Integer quantity, Long lastModifiedBy, Date lastModifiedDate, Long createdBy, Date createdDate) {
		this.customer = customer;
		this.medicalStore = medicalStore;
		this.medicine = medicine;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedDate = lastModifiedDate;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MEDICAL_STORE_ID", nullable = false)
	public MedicalStore getMedicalStore() {
		return this.medicalStore;
	}

	public void setMedicalStore(MedicalStore medicalStore) {
		this.medicalStore = medicalStore;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MEDICINE_ID", nullable = false)
	public Medicine getMedicine() {
		return this.medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	@Column(name = "PRICE", nullable = false)
	public Float getPrice() {
		return this.price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Column(name = "DISCOUNT")
	public Float getDiscount() {
		return this.discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	@Column(name = "QUANTITY")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "INVOICE_ID", nullable = false)
	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	
	

}
