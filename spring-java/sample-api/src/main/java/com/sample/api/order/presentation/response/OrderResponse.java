package com.sample.api.order.presentation.response;

import com.sample.library.order.domain.OrderEntity;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class OrderResponse {


    @Schema(description = "주문번호")
    private Long orderNo;

    @Schema(description = "매장코드")
    private String shopCd;

    @Schema(description = "판매일자")
    private String saleDate;

    @Schema(description = "회원ID")
    private Long memberId;

    private String orderStatus;
    private String ordererName;
    private String ordererEmail;
    private String ordererPhone;
    private String orderNumber;
    private BigDecimal totalPrice;
    private BigDecimal salePrice;
    private BigDecimal discountPrice;
    private LocalDateTime orderDate;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    public static OrderResponse of(OrderEntity orderEntity) {
        return OrderResponse.builder()
                .orderNo(orderEntity.getId())
                .shopCd(orderEntity.getShopCd())
                .build();
    }
}
