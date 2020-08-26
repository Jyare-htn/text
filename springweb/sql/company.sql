/*
Navicat MySQL Data Transfer

Source Server         : com257
Source Server Version : 50618
Source Host           : 127.0.0.1:3306
Source Database       : company

Target Server Type    : MYSQL
Target Server Version : 50618
File Encoding         : 65001

Date: 2020-08-14 14:37:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `departmentName` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', 'D-A');
INSERT INTO `department` VALUES ('2', 'D-B');
INSERT INTO `department` VALUES ('3', 'D-C');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lastName` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gender` int(11) NOT NULL,
  `departmentId` int(11) NOT NULL,
  `birth` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '小黑', 'aa@163.com', '1', '1', '2000-06-14');
INSERT INTO `employee` VALUES ('2', '小白', 'bb@163.com', '1', '2', '2004-06-23');
INSERT INTO `employee` VALUES ('3', '小蓝', 'cc@163.com', '0', '3', '2000-06-22');
INSERT INTO `employee` VALUES ('4', '小红', 'dd@163.com', '0', '1', '1990-07-05');
INSERT INTO `employee` VALUES ('5', '小绿', 'ee@163.com', '1', '1', '2002-08-23');
