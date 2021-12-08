/*
 Navicat Premium Data Transfer

 Source Server         : mygirl
 Source Server Type    : MySQL
 Source Server Version : 50650
 Source Host           : 39.103.166.167:3306
 Source Schema         : openstuLifeSDK

 Target Server Type    : MySQL
 Target Server Version : 50650
 File Encoding         : 65001

 Date: 08/12/2021 23:29:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(6000) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `email` varchar(6000) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  INDEX `id`(`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 71 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (19, 'https://download.csdn.net/download/wxg520cxl/23731468?utm_medium=distribute.pc_relevant_download.none-task-download-2~default~OPENSEARCH~default-2.test_version_3&depth_1-utm_source=distribute.pc_relevant_download.none-task-download-2~default~OPENSEARCH~default-2.test_version_3&dest=https%3A%2F%2Fdownload.csdn.net%2Fdownload%2Fwxg520cxl%2F23731468&spm=1003.2020.3001.6616.2', '870150246@qq.com');
INSERT INTO `user` VALUES (20, 'https://download.csdn.net/download/wxg520cxl/23731468?utm_medium=distribute.pc_relevant_download.none-task-download-2~default~OPENSEARCH~default-2.test_version_3&depth_1-utm_source=distribute.pc_relevant_download.none-task-download-2~default~OPENSEARCH~default-2.test_version_3&dest=https%3A%2F%2Fdownload.csdn.net%2Fdownload%2Fwxg520cxl%2F23731468&spm=1003.2020.3001.6616.2', '1901213430@pku.edu.cn');
INSERT INTO `user` VALUES (21, 'https://download.csdn.net/download/weixin_42126668/18301263', 'wangxin2021@stu.pku.edu.cn');
INSERT INTO `user` VALUES (23, 'https://download.csdn.net/download/lightty/3777661?utm_medium=distribute.pc_relevant_download.none-task-download-2~default~BlogCommendFromBaidu~default-1.test_version_3&depth_1-utm_source=distribute.pc_relevant_download.none-task-download-2~default~BlogCommendFromBaidu~default-1.test_version_3&dest=https%3A%2F%2Fdownload.csdn.net%2Fdownload%2Flightty%2F3777661&spm=1003.2020.3001.6616.1', 'yangkai@stu.pku.edu.cn');
INSERT INTO `user` VALUES (38, 'CNKI:SUN:GJCJ.0.2018-02-170', 'c-xu21@tsinghua.edu.cn');
INSERT INTO `user` VALUES (39, 'https://download.csdn.net/download/pku_zzy/9749743', 'pku_cf@stu.pku.edu.cn');
INSERT INTO `user` VALUES (40, 'https://download.csdn.net/download/zhxkun/12395541?spm=1001.2101.3001.6650.2&utm_medium=distribute.pc_relevant.none-task-download-2%7Edefault%7ECTRLIST%7Edefault-2.no_search_link&depth_1-utm_source=distribute.pc_relevant.none-task-download-2%7Edefault%7ECTRLIST%7Edefault-2.no_search_link', 'pku_cf@stu.pku.edu.cn');
INSERT INTO `user` VALUES (41, 'https://download.csdn.net/download/andyfln/10422851', '2101210251@stu.pku.edu.cn');
INSERT INTO `user` VALUES (42, 'https://download.csdn.net/download/qq_43681296/10780999?utm_medium=distribute.pc_relevant_download.none-task-download-2~default~BlogCommendFromBaidu~default-6.test_version_3&depth_1-utm_source=distribute.pc_relevant_download.none-task-download-2~default~BlogCommendFromBaidu~default-6.test_version_3&dest=https%3A%2F%2Fdownload.csdn.net%2Fdownload%2Fqq_43681296%2F10780999&spm=1003.2020.3001.6616.7', 'sunjianhao@stu.pku.edu.cn');
INSERT INTO `user` VALUES (43, 'https://download.csdn.net/download/qq_25370363/9042439?spm=1001.2101.3001.6661.1&utm_medium=distribute.pc_relevant_t0.none-task-download-2%7Edefault%7ECTRLIST%7Edefault-1.essearch_pc_relevant&depth_1-utm_source=distribute.pc_relevant_t0.none-task-download-2%7Edefault%7ECTRLIST%7Edefault-1.essearch_pc_relevant', 'hf.sun@stu.pku.edu.cn');
INSERT INTO `user` VALUES (44, 'https://download.csdn.net/download/qq_25370363/9042439?spm=1001.2101.3001.6661.1&utm_medium=distribute.pc_relevant_t0.none-task-download-2%7Edefault%7ECTRLIST%7Edefault-1.essearch_pc_relevant&depth_1-utm_source=distribute.pc_relevant_t0.none-task-download-2%7Edefault%7ECTRLIST%7Edefault-1.essearch_pc_relevant', 'hf.sun@stu.pku.edu.cn');
INSERT INTO `user` VALUES (45, '10.7666/d.Y1593025', 'c-xu21@tsinghua.edu.cn');
INSERT INTO `user` VALUES (46, 'https://download.csdn.net/download/u011078253/12847313?spm=1001.2101.3001.6661.1&utm_medium=distribute.pc_relevant_t0.none-task-download-2%7Edefault%7ECTRLIST%7Edefault-1.no_search_link&depth_1-utm_source=distribute.pc_relevant_t0.none-task-download-2%7Edefault%7ECTRLIST%7Edefault-1.no_search_link', '1800013213@pku.edu.cn');
INSERT INTO `user` VALUES (48, 'https://download.csdn.net/download/qq_44143405/12549535', '1800013048@pku.edu.cn');
INSERT INTO `user` VALUES (49, 'https://download.csdn.net/download/qq_41852768/16309424', '1800013048@pku.edu.cn');
INSERT INTO `user` VALUES (50, 'https://download.csdn.net/download/weixin_42126668/18301263?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522163877309116780357246826%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=163877309116780357246826&biz_id=1&utm_medium=distribute.pc_search_result.none-task-download-2~all~first_rank_ecpm_v1~rank_v31_ecpm-1-18301263.first_rank_v2_pc_rank_v29&utm_term=%E7%AC%AC%E5%9B%9B%E5%B1%8A+%E9%98%BF%E9%87%8C%E4%BA%91+%E4%B8%AD%E9%97%B4%E4%BB%B6%E6%80%A7%E8%83%BD%E6%8C%91%E6%88%98%E8%B5%9B+%E5%A4%8D%E8%B5%9B&spm=1018.2226.3001.4187.1', 'liu_tj@stu.pku.edu.cn');
INSERT INTO `user` VALUES (66, 'https://download.csdn.net/download/java2021zk/38051592?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522163884644116780366589392%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=163884644116780366589392&biz_id=1&utm_medium=distribute.pc_search_result.none-task-download-2~all~first_rank_ecpm_v1~rank_v31_ecpm-15-38051592.pc_search_result_control_group&utm_term=acwing', 'changyiming@pku.edu.cn');
INSERT INTO `user` VALUES (67, 'https://download.csdn.net/download/xumaojun/9492022', '2101210464@stu.pku.edu.cn');
INSERT INTO `user` VALUES (68, 'https://download.csdn.net/download/weixin_44035342/12301819?spm=1003.2122.3001.6634.38', '2101210359@stu.pku.edu.cn');
INSERT INTO `user` VALUES (69, 'https://download.csdn.net/download/qq_26907711/12859035?utm_source=bbsseo', 'changyiming@pku.edu.cn');

-- ----------------------------
-- Table structure for visited_data
-- ----------------------------
DROP TABLE IF EXISTS `visited_data`;
CREATE TABLE `visited_data`  (
  `id` bigint(20) NOT NULL,
  `visited_count` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of visited_data
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
