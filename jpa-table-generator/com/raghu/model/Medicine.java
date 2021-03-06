package com.raghu.medical.model;
// Generated Nov 23, 2016 7:14:15 AM by Hibernate Tools 4.3.5.Final

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Medicine generated by hbm2java
 */
@Entity
@Table(name = "medicine", catalog = "mms")
public class Medicine extends BaseEntity<Long> implements java.io.Serializable {

	private MedicalStore medicalStore;
	private MedicineType medicineType;
	private String name;
	private String manufacturedBy;
	private Date manufactureDate;
	private Date expiryDate;
	private String contents;
	private Double mrp;
	private Double maxDiscount;
	private String batchNumber;
	private String doseage;
	private Stock stock;

	public Medicine() {
	}

	public Medicine(MedicalStore medicalStore, MedicineType medicineType, String name) {
		this.medicalStore = medicalStore;
		this.medicineType = medicineType;
		this.name = name;
	}

	public Medicine(MedicalStore medicalStore, MedicineType medicineType, String name, String manufacturedBy,
			Date manufactureDate, Date expiryDate, String contents, Double mrp, Double maxDiscount, String batchNumber,
			String doseage, Long lastModifiedBy, Date lastModifiedDate, Long createdBy, Date createdDate) {
		this.medicalStore = medicalStore;
		this.medicineType = medicineType;
		this.name = name;
		this.manufacturedBy = manufacturedBy;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
		this.contents = contents;
		this.mrp = mrp;
		this.maxDiscount = maxDiscount;
		this.batchNumber = batchNumber;
		this.doseage = doseage;
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

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "medical_store_id", nullable = false)
	public MedicalStore getMedicalStore() {
		return this.medicalStore;
	}

	public void setMedicalStore(MedicalStore medicalStore) {
		this.medicalStore = medicalStore;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "MEDICINE_TYPE", nullable = false)
	public MedicineType getMedicineType() {
		return this.medicineType;
	}

	public void setMedicineType(MedicineType medicineType) {
		this.medicineType = medicineType;
	}

	@Column(name = "name", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "manufactured_by", length = 100)
	public String getManufacturedBy() {
		return this.manufacturedBy;
	}

	public void setManufacturedBy(String manufacturedBy) {
		this.manufacturedBy = manufacturedBy;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "manufacture_date", length = 10)
	public Date getManufactureDate() {
		return this.manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "expiry_date", length = 10)
	public Date getExpiryDate() {
		return this.expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Column(name = "contents", length = 100)
	public String getContents() {
		return this.contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Column(name = "mrp", precision = 10, scale = 3)
	public Double getMrp() {
		return this.mrp;
	}

	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

	@Column(name = "max_discount", precision = 10, scale = 3)
	public Double getMaxDiscount() {
		return this.maxDiscount;
	}

	public void setMaxDiscount(Double maxDiscount) {
		this.maxDiscount = maxDiscount;
	}

	@Column(name = "batch_number", length = 50)
	public String getBatchNumber() {
		return this.batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	@Column(name = "doseage", length = 50)
	public String getDoseage() {
		return this.doseage;
	}

	public void setDoseage(String doseage) {
		this.doseage = doseage;
	}

	@OneToOne(fetch = FetchType.EAGER, mappedBy = "medicine")
	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}
