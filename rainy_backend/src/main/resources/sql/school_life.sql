/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50739
 Source Host           : localhost:3306
 Source Schema         : school_life

 Target Server Type    : MySQL
 Target Server Version : 50739
 File Encoding         : 65001

 Date: 13/07/2023 10:24:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for rainy_shop_appeal
-- ----------------------------
DROP TABLE IF EXISTS `rainy_shop_appeal`;
CREATE TABLE `rainy_shop_appeal`  (
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '顾客姓名',
  `img_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '图片',
  `money` double NULL DEFAULT NULL COMMENT '消费数额',
  `comment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '顾客评论',
  `active_or_not` int(11) NULL DEFAULT NULL COMMENT '活跃状态',
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '申诉' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rainy_shop_appeal
-- ----------------------------
INSERT INTO `rainy_shop_appeal` VALUES ('小光', '123', 23.99, '一般，不太推荐', 1, 2);
INSERT INTO `rainy_shop_appeal` VALUES ('小美', '123', 23.99, '一般，不太推荐', 1, 3);
INSERT INTO `rainy_shop_appeal` VALUES ('小光', '123', 23.99, '一般，不太推荐', 1, 4);
INSERT INTO `rainy_shop_appeal` VALUES ('小美', '123', 23.99, '一般，不太推荐', 1, 5);
INSERT INTO `rainy_shop_appeal` VALUES ('小光', '123', 23.99, '一般，不太推荐', 1, 6);
INSERT INTO `rainy_shop_appeal` VALUES ('小美', '123', 23.99, '一般，不太推荐', 1, 7);
INSERT INTO `rainy_shop_appeal` VALUES ('小光', '123', 23.99, '一般，不太推荐', 1, 8);
INSERT INTO `rainy_shop_appeal` VALUES ('小美', '123', 23.99, '一般，不太推荐', 1, 9);
INSERT INTO `rainy_shop_appeal` VALUES ('小光', '123', 23.99, '一般，不太推荐', 1, 10);
INSERT INTO `rainy_shop_appeal` VALUES ('小美', '123', 23.99, '一般，不太推荐', 1, 11);

-- ----------------------------
-- Table structure for rainy_shop_classify
-- ----------------------------
DROP TABLE IF EXISTS `rainy_shop_classify`;
CREATE TABLE `rainy_shop_classify`  (
  `shop_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `id` int(11) NULL DEFAULT NULL,
  `status` int(10) NULL DEFAULT NULL,
  `modify_time` datetime(0) NULL DEFAULT NULL,
  `sort` int(11) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '店铺分类' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rainy_shop_classify
-- ----------------------------
INSERT INTO `rainy_shop_classify` VALUES ('饮料', 2, 1, '2023-06-18 12:16:16', 1);
INSERT INTO `rainy_shop_classify` VALUES ('零食', 3, 1, '2023-06-18 12:16:16', 2);
INSERT INTO `rainy_shop_classify` VALUES ('鲜花', 4, 1, '2023-06-18 12:16:16', 3);
INSERT INTO `rainy_shop_classify` VALUES ('蔬菜', 5, 1, '2023-06-18 12:16:16', 4);
INSERT INTO `rainy_shop_classify` VALUES ('早餐', 6, 1, '2023-06-18 12:16:16', 5);
INSERT INTO `rainy_shop_classify` VALUES ('水果', 8, 1, '2023-06-18 12:16:16', 7);
INSERT INTO `rainy_shop_classify` VALUES ('快餐', 9, 1, '2023-06-18 12:16:16', 8);
INSERT INTO `rainy_shop_classify` VALUES ('书店', 10, 1, '2023-06-18 12:16:16', 9);
INSERT INTO `rainy_shop_classify` VALUES ('主食', 1, 1, '2023-06-18 12:16:16', 10);
INSERT INTO `rainy_shop_classify` VALUES ('服装', 11, 1, '2023-06-24 11:37:05', 11);
INSERT INTO `rainy_shop_classify` VALUES ('卡', 222, 0, '2023-07-12 21:15:41', 45);

-- ----------------------------
-- Table structure for rainy_shop_employee
-- ----------------------------
DROP TABLE IF EXISTS `rainy_shop_employee`;
CREATE TABLE `rainy_shop_employee`  (
  `employee_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `isdroped` smallint(6) NOT NULL,
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `email` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `gender` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '员工表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rainy_shop_employee
-- ----------------------------
INSERT INTO `rainy_shop_employee` VALUES ('许利伟', 1, 'Rain', 'rain', 1, '18570573216', 'amixrip@163.com', '男');
INSERT INTO `rainy_shop_employee` VALUES ('小明', 2, 'ming', 'ming', 0, '18570473236', '11@qq.com', '女');
INSERT INTO `rainy_shop_employee` VALUES ('梨花', 3, 'Sun', '00c66aaf5f2c3f49946f15c1ad2ea0d3', 0, '18570473233', '11@qq.com', '女');
INSERT INTO `rainy_shop_employee` VALUES ('你好', 12, '春江花朝秋月夜', '21212121', 1, '18778965678', '99@qq.com', '女');
INSERT INTO `rainy_shop_employee` VALUES ('你好', 13, '月夜额', '1212121212', 1, '18778965678', '99@qq.com', '女');
INSERT INTO `rainy_shop_employee` VALUES ('原俩', 34, '新员工', '12121', 1, '18778965678', '99@qq.com', '女');
INSERT INTO `rainy_shop_employee` VALUES ('梨花', 35, '3', '00c66aaf5f2c3f49946f15c1ad2ea0d3', 0, '18778965678', '99@qq.com', '女');
INSERT INTO `rainy_shop_employee` VALUES ('你好', 36, '34', '00c66aaf5f2c3f49946f15c1ad2ea0d3', 0, '18778965678', '99@qq.com', '女');
INSERT INTO `rainy_shop_employee` VALUES ('你好', 37, '4535', '00c66aaf5f2c3f49946f15c1ad2ea0d3', 0, '18778965678', '99@qq.com', '女');
INSERT INTO `rainy_shop_employee` VALUES ('梨花', 38, 'name', 'username', 0, '18776903218', '11@qq.com', '女');
INSERT INTO `rainy_shop_employee` VALUES ('你好', 39, '123', '00c66aaf5f2c3f49946f15c1ad2ea0d3', 1, '18890785672', '11@qq.com', '男');

-- ----------------------------
-- Table structure for rainy_shop_good_comment
-- ----------------------------
DROP TABLE IF EXISTS `rainy_shop_good_comment`;
CREATE TABLE `rainy_shop_good_comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `content` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `comment_time` datetime(0) NOT NULL,
  `isdeleted` smallint(6) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `rainy_shop_good_comment_id_uindex`(`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2023960595 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '商品评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rainy_shop_good_comment
-- ----------------------------
INSERT INTO `rainy_shop_good_comment` VALUES (1, 12, 'dsadas', '2023-05-17 13:59:09', 0);
INSERT INTO `rainy_shop_good_comment` VALUES (2, 12, 'dsadas', '2023-05-17 13:59:09', 0);
INSERT INTO `rainy_shop_good_comment` VALUES (3, 12, 'dsadas', '2023-05-17 13:59:09', 0);
INSERT INTO `rainy_shop_good_comment` VALUES (4, 12, 'dsadas', '2023-05-17 13:59:09', 0);
INSERT INTO `rainy_shop_good_comment` VALUES (5, 12, 'dsadas', '2023-05-17 13:59:09', 0);
INSERT INTO `rainy_shop_good_comment` VALUES (6, 12, 'dsadas', '2023-05-17 13:59:09', 0);
INSERT INTO `rainy_shop_good_comment` VALUES (2023960594, 12, 'dsadas', '2023-05-17 13:59:09', 0);

-- ----------------------------
-- Table structure for rainy_shop_goods
-- ----------------------------
DROP TABLE IF EXISTS `rainy_shop_goods`;
CREATE TABLE `rainy_shop_goods`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL,
  `goods_price` double NOT NULL,
  `goods_image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NULL DEFAULT NULL,
  `goods_description` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NULL DEFAULT NULL,
  `goods_isdroped` smallint(6) NOT NULL,
  `shop_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '商品表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rainy_shop_goods
-- ----------------------------
INSERT INTO `rainy_shop_goods` VALUES (1, '辣子鸡', 78, 'img.png', '来自鲜嫩美味的小鸡，值得一尝', 1, '湘军木桶饭');
INSERT INTO `rainy_shop_goods` VALUES (2, '毛氏红烧肉', 68, 'img.png', '毛氏红烧肉毛氏红烧肉，确定不来一份？', 1, '湘军木桶饭');
INSERT INTO `rainy_shop_goods` VALUES (3, '组庵鱼翅', 48, 'img.png', '组庵鱼翅，看图足以表明好吃程度', 0, '湘军木桶饭');
INSERT INTO `rainy_shop_goods` VALUES (4, '霸王别姬', 128, 'img.png', '还有什么比霸王别姬更美味的呢？', 1, '湘军木桶饭');
INSERT INTO `rainy_shop_goods` VALUES (5, '益和烤奶', 23, 'img.png', '好喝的', 1, '益和堂');
INSERT INTO `rainy_shop_goods` VALUES (6, '益和烤奶', 23, 'img.png', '好喝的', 0, '益和堂');
INSERT INTO `rainy_shop_goods` VALUES (7, '益和烤奶', 23, 'img.png', '好喝的', 0, '益和堂');
INSERT INTO `rainy_shop_goods` VALUES (8, '烧仙草', 16, 'img.png', '好喝的', 1, '书亦烧仙草');
INSERT INTO `rainy_shop_goods` VALUES (9, '烧仙草', 16, 'img.png', '好喝的', 0, '书亦烧仙草');
INSERT INTO `rainy_shop_goods` VALUES (11, '烧仙草', 16, 'img.png', '好喝的', 0, '书亦烧仙草');

-- ----------------------------
-- Table structure for rainy_shop_history_orders
-- ----------------------------
DROP TABLE IF EXISTS `rainy_shop_history_orders`;
CREATE TABLE `rainy_shop_history_orders`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `signature` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `user_phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `gender` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rainy_shop_history_orders
-- ----------------------------
INSERT INTO `rainy_shop_history_orders` VALUES (1, 12, '每天好心情', '18978906785', '女');
INSERT INTO `rainy_shop_history_orders` VALUES (2, 13, '每天好心情', '18978906785', '女');
INSERT INTO `rainy_shop_history_orders` VALUES (3, 14, '每天好心情', '18978906785', '女');
INSERT INTO `rainy_shop_history_orders` VALUES (4, 15, '每天好心情', '18978906785', '女');
INSERT INTO `rainy_shop_history_orders` VALUES (5, 16, '每天好心情', '18978906785', '女');

-- ----------------------------
-- Table structure for rainy_shop_info
-- ----------------------------
DROP TABLE IF EXISTS `rainy_shop_info`;
CREATE TABLE `rainy_shop_info`  (
  `shop_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `shop_rank` int(11) NULL DEFAULT NULL,
  `shop_type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `shop_img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `shop_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `shop_phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `update_time` date NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '店铺信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rainy_shop_info
-- ----------------------------
INSERT INTO `rainy_shop_info` VALUES ('湘军木桶饭', 6, '主食', NULL, '南堕', '18896738898', 7, '2023-04-11');
INSERT INTO `rainy_shop_info` VALUES ('益和堂', 1, '饮料', NULL, '南堕', '18896738898', 8, '2023-04-11');
INSERT INTO `rainy_shop_info` VALUES ('书亦烧仙草', 4, '饮料', NULL, '南堕', '18896738898', 9, '2023-04-11');
INSERT INTO `rainy_shop_info` VALUES ('蜜雪冰城', 2, '饮料', NULL, '南堕', '18896738898', 10, '2023-04-11');
INSERT INTO `rainy_shop_info` VALUES ('华纳影院', 3, '演出', NULL, '南堕', '18896738898', 11, '2023-04-11');
INSERT INTO `rainy_shop_info` VALUES ('纤纤花点', 7, '鲜花', NULL, '南堕', '18896738898', 12, '2023-04-11');
INSERT INTO `rainy_shop_info` VALUES ('科大书城', 5, '书店', NULL, '南堕', '18896738898', 13, '2023-04-11');

-- ----------------------------
-- Table structure for rainy_shop_orders
-- ----------------------------
DROP TABLE IF EXISTS `rainy_shop_orders`;
CREATE TABLE `rainy_shop_orders`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_time` datetime(0) NOT NULL,
  `user_address` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `user_phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `all_money` double NOT NULL,
  `user_id` int(11) NOT NULL,
  `goods_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '商家订单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rainy_shop_orders
-- ----------------------------

-- ----------------------------
-- Table structure for rainy_user
-- ----------------------------
DROP TABLE IF EXISTS `rainy_user`;
CREATE TABLE `rainy_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `nick_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  `user_role` smallint(6) NULL DEFAULT NULL COMMENT 'userrole',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rainy_user
-- ----------------------------
INSERT INTO `rainy_user` VALUES (1, 'admin', '123', 'xlw', 1, NULL);
INSERT INTO `rainy_user` VALUES (2, 'user', 'username', 'username', 0, NULL);
INSERT INTO `rainy_user` VALUES (3, 'idea', '3423', 'idea', 0, NULL);

-- ----------------------------
-- Table structure for rainy_user_history_orders
-- ----------------------------
DROP TABLE IF EXISTS `rainy_user_history_orders`;
CREATE TABLE `rainy_user_history_orders`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_status` int(11) NULL DEFAULT NULL COMMENT '订单状态',
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '电话',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '地址',
  `order_time` datetime(0) NULL DEFAULT NULL COMMENT '下单时间',
  `user_id` int(11) NOT NULL,
  `goods_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `all_money` double NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '历史订单' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of rainy_user_history_orders
-- ----------------------------
INSERT INTO `rainy_user_history_orders` VALUES (1, 1, '18908976788', '哆啦A梦大道3号路', '2023-07-12 21:26:54', 12, '烤奶', 100);
INSERT INTO `rainy_user_history_orders` VALUES (2, 1, '18908976788', '哆啦A梦大道3号路', '2023-07-12 21:26:54', 12, '烤奶', 100);
INSERT INTO `rainy_user_history_orders` VALUES (3, 1, '18908976788', '哆啦A梦大道3号路', '2023-07-12 21:26:54', 12, '烤奶', 100);
INSERT INTO `rainy_user_history_orders` VALUES (4, 1, '18908976788', '哆啦A梦大道3号路', '2023-07-12 21:26:54', 12, '烤奶', 100);
INSERT INTO `rainy_user_history_orders` VALUES (5, 1, '18908976788', '哆啦A梦大道3号路', '2023-07-12 21:26:54', 12, '烤奶', 100);
INSERT INTO `rainy_user_history_orders` VALUES (6, 1, '18908976788', '哆啦A梦大道3号路', '2023-07-12 21:26:54', 12, '烤奶', 100);
INSERT INTO `rainy_user_history_orders` VALUES (7, 1, '18908976788', '哆啦A梦大道3号路', '2023-07-12 21:26:54', 12, '烤奶', 100);
INSERT INTO `rainy_user_history_orders` VALUES (8, 1, '18908976788', '哆啦A梦大道3号路', '2023-07-12 21:26:54', 12, '烤奶', 100);
INSERT INTO `rainy_user_history_orders` VALUES (9, 1, '18908976788', '哆啦A梦大道3号路', '2023-07-12 21:26:54', 12, '烤奶', 100);
INSERT INTO `rainy_user_history_orders` VALUES (10, 1, '18908976788', '哆啦A梦大道3号路', '2023-07-12 21:26:54', 12, '烤奶', 100);

SET FOREIGN_KEY_CHECKS = 1;
