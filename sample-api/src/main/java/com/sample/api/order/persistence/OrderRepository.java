package com.sample.api.order.persistence;


import com.sample.api.order.domain.OrderEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface OrderRepository extends ReactiveCrudRepository<OrderEntity, Long> {
}
