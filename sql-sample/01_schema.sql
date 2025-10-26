CREATE TABLE `tb_order` (
                            `id` bigint NOT NULL AUTO_INCREMENT COMMENT '주문 고유 번호',
                            `shop_cd` varchar(6) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '매장코드',
                            `sale_date` date DEFAULT NULL COMMENT '매장코드',
                            `member_id` bigint DEFAULT NULL COMMENT '주문 회원 ID',
                            `order_status` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '주문 상태 (PENDING, PAID, SHIPPING, COMPLETED 등)',
                            `orderer_name` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '주문자 이름',
                            `orderer_email` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '주문자 이메일',
                            `orderer_phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '주문자 연락처',
                            `order_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '주문 번호 (외부 시스템 연동용)',
                            `total_price` decimal(10,2) DEFAULT NULL COMMENT '주문 총 금액',
                            `sale_price` decimal(10,2) DEFAULT NULL COMMENT '판매 가격 (할인 적용 전)',
                            `discount_price` decimal(10,2) DEFAULT NULL COMMENT '할인 금액',
                            `order_date` datetime NOT NULL COMMENT '주문 일시',
                            `create_time` datetime NOT NULL COMMENT '데이터 생성 일시',
                            `update_time` datetime NOT NULL COMMENT '데이터 수정 일시',
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='주문 정보 테이블';