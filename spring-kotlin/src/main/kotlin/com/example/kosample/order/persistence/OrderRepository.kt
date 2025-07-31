package com.example.kosample.order.persistence

import com.sample.api.order.domain.OrderEntity
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface OrderRepository : CoroutineCrudRepository<OrderEntity, Long> {
}