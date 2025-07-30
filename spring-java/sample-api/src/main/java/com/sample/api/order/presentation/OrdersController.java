package com.sample.api.order.presentation;

import com.sample.api.order.presentation.request.OrderRequest;
import com.sample.api.order.presentation.response.OrderResponse;
import com.sample.api.order.service.OrderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@Tag(name = "orders", description = "주문 관련 API")
public class OrdersController {


    private final OrderService orderService;

    @PostMapping("")
    public Mono<OrderResponse> findOrder(@RequestBody OrderRequest orderRequest) {

        return orderService.findOrder(orderRequest);
    }


}
