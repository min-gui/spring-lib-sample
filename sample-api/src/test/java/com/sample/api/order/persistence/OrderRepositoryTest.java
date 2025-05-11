package com.sample.api.order.persistence;

import com.sample.api.order.domain.OrderEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("mslocal")
class OrderRepositoryTest {

    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void 주문_조회() throws Exception {
        //given
        Mono<OrderEntity> byId = orderRepository.findById(1L);

        OrderEntity block = byId.block();
        System.out.println(block.getOrdererEmail());

        StepVerifier.create(byId)
                .expectSubscription()
                .assertNext(order -> Assertions.assertThat(order.getOrdererEmail()).isEqualTo("test@naver.com"))
                .expectComplete()
                .verify();

     }



}