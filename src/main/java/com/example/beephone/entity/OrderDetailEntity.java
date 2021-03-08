package com.example.beephone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_detail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetailEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "unit_price")
	private Double unitPrice;

	@Column
	private int quatity;
	
	@Column(columnDefinition = "int default 1")
	private int status;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrderEntity orderEntity;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity productOrderDetail;

}
