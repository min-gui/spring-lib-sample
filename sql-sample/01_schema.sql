-- tb_shop definition
CREATE TABLE `tb_shop` (
                           `id` bigint unsigned NOT NULL AUTO_INCREMENT,
                           `shop_cd` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '매장코드',
                           `shop_nm` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '매장이름',
                           `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '주소',
                           `phone_number` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '연락처',
                           `open_date` date DEFAULT NULL COMMENT '개점날짜',
                           `shop_type` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '매장타입',
                           `ins_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '생성일시',
                           `upd_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정일시',
                           PRIMARY KEY (`id`),
                           UNIQUE KEY `uk_shop_cd` (`shop_cd`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='매장 정보 테이블';


-- tb_prod definition
CREATE TABLE `tb_prod` (
                           `id` bigint NOT NULL AUTO_INCREMENT COMMENT '상품 고유 번호',
                           `shop_cd` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '매장코드',
                           `prod_code` varchar(10) NOT NULL COMMENT '상품코드',
                           `prod_name` varchar(200) NOT NULL COMMENT '상품명',
                           `type` varchar(20) NOT NULL COMMENT '상품 유형(NORMAL:일반상품, SIDE:사이드메뉴, SET:세트메뉴)',
                           `price` decimal(10,2) NOT NULL COMMENT '기본 판매 가격',
                           `description` text COMMENT '상품 설명',
                           `status` varchar(20) NOT NULL DEFAULT 'ACTIVE' COMMENT '상품 상태',
                           `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '생성일시',
                           `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정일시',
                           PRIMARY KEY (`id`),
                           UNIQUE KEY `uk_prod_code` (`shop_cd`, `prod_code`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='상품 기본 정보 테이블';


-- tb_order definition
CREATE TABLE `tb_order` (
                            `id` bigint NOT NULL AUTO_INCREMENT COMMENT '주문 고유 번호',
                            `shop_cd` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '매장코드',
                            `sale_date` date NOT NULL COMMENT '판매일자',
                            `member_id` bigint DEFAULT NULL COMMENT '주문 회원 ID',
                            `order_status` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT 'PENDING' COMMENT '주문 상태(PENDING, PAID, SHIPPING, COMPLETED)',
                            `orderer_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '주문자 이름',
                            `orderer_email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '주문자 이메일',
                            `orderer_phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '주문자 연락처',
                            `order_number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '주문 번호(외부 시스템 연동용)',
                            `total_price` decimal(10,2) NOT NULL COMMENT '주문 총 금액',
                            `sale_price` decimal(10,2) NOT NULL COMMENT '판매 가격(할인 적용 전)',
                            `discount_price` decimal(10,2) DEFAULT 0 COMMENT '할인 금액',
                            `order_date` datetime NOT NULL COMMENT '주문 일시',
                            `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '생성일시',
                            `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '수정일시',
                            PRIMARY KEY (`id`, `sale_date`),
                            KEY `idx_order_date` (`order_date`),
                            KEY `idx_shop_cd` (`shop_cd`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='주문 정보 테이블';