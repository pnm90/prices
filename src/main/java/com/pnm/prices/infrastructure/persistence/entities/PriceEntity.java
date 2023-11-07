package com.pnm.prices.infrastructure.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Entity
@Table(name = "PRICES", schema = "PRICES")
public class PriceEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "BRAND_ID")
  private BrandEntity brand;

  @Column(name = "START_DATE")
  private LocalDateTime startDate;

  @Column(name = "END_DATE")
  private LocalDateTime endDate;

  @Column(name = "PRICE_LIST")
  private int priceList;

  @Column(name = "PRODUCT_ID", nullable = false)
  private int productId;

  @Column(name = "PRIORITY")
  private int priority;

  @Column(name = "PRICE", nullable = false)
  private BigDecimal price;

  @Column(name = "CURR", length = 3, nullable = false)
  private String currency;


}
