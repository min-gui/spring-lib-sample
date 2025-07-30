package com.sample.api.order.service;

import com.sample.api.order.persistence.OrderRepository;
import com.sample.api.order.presentation.request.OrderRequest;
import com.sample.api.order.presentation.response.OrderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;


    public Mono<OrderResponse> findOrder(OrderRequest orderRequest) {
        return orderRepository.findById(orderRequest.getOrderId())
                .map(OrderResponse::of);

    }
}
