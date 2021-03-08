package com.example.beephone.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String name;

	@Column
	private String image;

	@Column(name = "unit_price")
	private String unitPrice;

	@Column
	private Integer stock;

	@Column(name = "man_hinh")
	private String manHinh;

	@Column(name = "he_dieu_hanh")
	private String heDieuHanh;

	@Column(name = "camera_truoc")
	private String cameraTruoc;

	@Column(name = "camera_sau")
	private String cameraSau;

	@Column
	private String cpu;

	@Column
	private String ram;

	@Column(name = "bo_nho_trong")
	private String boNhoTrong;

	@Column(name = "dung_luong_pin")
	private String dungLuongPin;

	@Column
	private String description;

	@Column(name = "create_date")
	private LocalDate createDate;

	@Column(name = "create_by")
	private String createBy;

	@Column
	private int count;
	
	@Column(columnDefinition = "int default 1")
	private int status;
	
	@OneToMany(mappedBy = "productOrderDetail")
	private List<OrderDetailEntity> products;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private CategoryEntity categoryProduct;

	@ManyToOne
	@JoinColumn(name = "new_id")
	private NewEntity newEntity;

	

}
