package com.sample.api.order.presentation.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class OrderRequest {


    @Schema(title = "주문 고유번호", description = "주문 고유번호")
    private Long orderId;


}
