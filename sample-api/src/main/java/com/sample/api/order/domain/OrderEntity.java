package com.sample.api.order.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Table("tb_order")
public class OrderEntity {

    @Id
    private Long id;

    @Column("shop_cd")
    private String shopCd;

    @Column("sale_date")
    private LocalDate saleDate;

    @Column("member_id")
    private Long memberId;

    @Column("order_status")
    private String orderStatus;

    @Column("orderer_name")
    private String ordererName;

    @Column("orderer_email")
    private String ordererEmail;

    @Column("orderer_phone")
    private String ordererPhone;

    @Column("order_number")
    private String orderNumber;

    @Column("total_price")
    private BigDecimal totalPrice;

    @Column("sale_price")
    private BigDecimal salePrice;

    @Column("discount_price")
    private BigDecimal discountPrice;

    @Column("order_date")
    private LocalDateTime orderDate;

    @CreatedDate
    @Column("create_time")
    private LocalDateTime createTime;

    @LastModifiedDate
    @Column("update_time")
    private LocalDateTime updateTime;
}
