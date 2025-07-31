package com.sample.api.order.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.math.BigDecimal
import java.time.LocalDate
import java.time.LocalDateTime

@Table("tb_order")
data class OrderEntity(

    @field:Id
    val id: Long? = null,

    @field:Column("shop_cd")
    val shopCd: String,

    @field:Column("sale_date")
    val saleDate: LocalDate,

    @field:Column("member_id")
    val memberId: Long,

    @field:Column("order_status")
    val orderStatus: String,

    @field:Column("orderer_name")
    val ordererName: String,

    @field:Column("orderer_email")
    val ordererEmail: String,

    @field:Column("orderer_phone")
    val ordererPhone: String,

    @field:Column("order_number")
    val orderNumber: String,

    @field:Column("total_price")
    val totalPrice: BigDecimal,

    @field:Column("sale_price")
    val salePrice: BigDecimal,

    @field:Column("discount_price")
    val discountPrice: BigDecimal,

    @field:Column("order_date")
    val orderDate: LocalDateTime,

    // CreatedDate, LastModifiedDate는 프레임워크가 관리하므로 nullable 및 기본값 null 지정
    @field:CreatedDate
    @field:Column("create_time")
    val createTime: LocalDateTime? = null,

    @field:LastModifiedDate
    @field:Column("update_time")
    val updateTime: LocalDateTime? = null
)