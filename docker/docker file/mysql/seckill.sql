#创建数据库
#DROP database IF EXISTS seckill;
#CREATE database seckill;
#使用数据库
use seckill;
#创建用户表
DROP TABLE IF EXISTS user;
CREATE  TABLE user(
  user_id varchar(18) not null comment '用户编号：共 1-8:注册日期 9:用户类型 0: 普通用户 1：商户 10-18:用户流水号',
  user_phone bigint not null comment '用户绑定手机号',
  password VARCHAR(100) NOT NULL COMMENT '用户密码',
  user_name varchar(100) comment '用户昵称',
  status tinyint NOT NULL DEFAULT 0 COMMENT '用户状态：0：正常 1：封号',
  primary key(user_id),
  key idx_user_id(user_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

#创建用户流水号表
DROP TABLE IF EXISTS user_sequence;
CREATE TABLE user_sequence(
  today_date DATE not null COMMENT '流水号日期',
  max_sequence varchar(120) not null COMMENT '当前序列号',
  update_time timestamp not null comment '更新时间',
  status tinyint NOT NULL DEFAULT 0 COMMENT '用户类型：0：用户 1：商户 2：商品',
  id varchar(9) NOT NULL DEFAULT '' COMMENT '无实意',
  primary key(id),
  key idx_max_sequence(max_sequence)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户流水号表';

#创建用户信息表
DROP TABLE IF EXISTS user_info;
CREATE  TABLE user_info(
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '表主键 自动递增 无实义',
  user_id varchar(18) not null comment '用户编号：共 1-8:注册日期 9-11:注册系统 12:用户状态 0普通用户 1会员 1超级会员 13-18:用户流水号',
  user_img VARCHAR(500) not null default 'img.jpg' comment '用户头像',
  primary key(id),
  key idx_user_id(user_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

#商户表
DROP TABLE IF EXISTS seller;
CREATE TABLE seller(
  seller_id varchar(18) not null comment '商户id 编号：共 1-8:注册日期 9:用户类型 0：普通用户 1：商户 10-18:用户流水号',
  logo varchar(255) DEFAULT NULL COMMENT '头像',
  account varchar(45) DEFAULT NULL COMMENT '账号',
  password varchar(45) DEFAULT NULL COMMENT '密码',
  name varchar(45) DEFAULT NULL COMMENT '名字',
  detail varchar(500) DEFAULT NULL COMMENT '简介',
  phone varchar(45) DEFAULT NULL COMMENT '电话',
  status int(11) DEFAULT NULL COMMENT '状态(1：启用  2：冻结  3：删除 4：待审核）',
  createtime datetime DEFAULT NULL COMMENT '创建时间',
  version int(11) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (seller_id)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='商家表';

#商户信息表
DROP TABLE IF EXISTS seller_info;
CREATE TABLE seller_info (
  seller_id varchar(18) not null comment '商户id 编号：共 1-8:注册日期 9-11:注册系统 12:用户类型 0：普通用户 1：商户 13-18:用户流水号',
  corporation varchar(45) DEFAULT NULL COMMENT '法人',
  idcard  varchar(255) DEFAULT NULL COMMENT '法人身份证',
  license varchar(255) DEFAULT NULL COMMENT '营业执照',
  createtime datetime DEFAULT NULL COMMENT '创建时间',
  version int(11) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (seller_id)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='商家表';

#商品表
DROP TABLE IF EXISTS goods;
CREATE TABLE goods (
  goods_id varchar(18) not null comment '商品id 编号：共 1-8:添加日期 9-10所属类型：00-99: 11-18:流水号',
  name varchar(200) DEFAULT NULL COMMENT '名字',
  detail varchar(500) DEFAULT NULL COMMENT '简介',
  image  varchar(255) DEFAULT NULL COMMENT '图片',
  seller_id varchar(18) not null comment '所属商户',
  PRIMARY KEY (goods_id)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='商品表';

#商品信息表
DROP TABLE IF EXISTS goods_info;
CREATE TABLE goods_info (
  goods_id varchar(18) not null comment '商品id 编号：共 1-8:添加日期 9-10所属类型：00-99: 11-18:流水号',
  image  varchar(255) DEFAULT NULL COMMENT '图片',
  price double(15,4) NOT NULL COMMENT '商品价格',
  version int(11) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (goods_id)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='商品信息表';

#商品型号库存表
DROP TABLE IF EXISTS goods_model;
CREATE TABLE goods_model (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '表主键 自动递增 无实义',
  goods_id varchar(18) not null comment '商品id',
  discription varchar(100) DEFAULT NULL COMMENT '描述',
  model_code tinyint NOT NULL DEFAULT 0 COMMENT '型号代码',
  inventry int(11) NOT NULL DEFAULT 0 COMMENT '库存',
  version int(11) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='商品型号库存表';

#秒杀时间表
DROP TABLE IF EXISTS seckill_time;
CREATE TABLE seckill_time (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '表主键 自动递增 无实义',
  goods_id varchar(18) not null comment '商品id',
  begin_time datetime DEFAULT NULL COMMENT '开始时间',
  end_time datetime DEFAULT NULL COMMENT '结束时间',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='秒杀时间表';

#收货地址
DROP TABLE IF EXISTS addr;
CREATE TABLE addr (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '表主键 自动递增 无实义',
  user_id varchar(18) not null comment '用户编号：共 1-8:注册日期 9-11:注册系统 12:用户状态 0普通用户 1会员 1超级会员 13-18:用户流水号',
  province varchar(30) not null comment '省',
  city varchar(30) not null comment '市',
  county varchar(30) not null comment '县/区',
  town varchar(30) not null comment '镇/街道',
  detail varchar(100) not null comment '详细地址',
  tel varchar(45) DEFAULT NULL COMMENT '收货人电话',
  name varchar(45) DEFAULT NULL COMMENT '收货人姓名',
  version int(11) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='收货地址';

#购物车表
DROP TABLE IF EXISTS cart;
CREATE TABLE cart (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '表主键 自动递增 无实义',
  goods_id varchar(18) not null comment '商品id 编号：共 1-8:添加日期 9-10所属类型：00-99: 11-18:流水号',
  user_id varchar(18) not null comment '用户编号：共 1-8:注册日期 9-11:注册系统 12:用户状态 0普通用户 1会员 1超级会员 13-18:用户流水号',
  version int(11) DEFAULT NULL COMMENT '保留字段',
  model tinyint NOT NULL DEFAULT 0 COMMENT '可选型号',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='购物车表';

#订单表
DROP TABLE IF EXISTS order_form;
CREATE TABLE order_form (
  order_id varchar(18) not null comment '订单id',
  user_id varchar(18) not null comment '用户编号',
  goods_id varchar(18) not null comment '商品id',
  version int(11) DEFAULT NULL COMMENT '保留字段',
  model tinyint NOT NULL DEFAULT 0 COMMENT '型号',
  create_time timestamp not null comment '创建时间',
  number int(11) DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (order_id)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='订单表';

#创建订单流水号表
DROP TABLE IF EXISTS order_sequence;
CREATE TABLE order_sequence(
  today_date DATE not null COMMENT '流水号日期',
  max_sequence varchar(120) not null COMMENT '当前序列号',
  update_time timestamp not null comment '更新时间',
  primary key(today_date),
  key idx_max_sequence(max_sequence)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='订单流水号表';

DROP TABLE IF EXISTS order_info;
CREATE TABLE order_info (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '表主键 自动递增 无实义',
  order_id varchar(18) not null comment '订单id',
  money double(15,4) NOT NULL COMMENT '订单金额',
  addr BIGINT NOT NULL COMMENT '收货地址id',
  payCode  varchar(255) DEFAULT NULL COMMENT '支付二维码',
  state tinyint NOT NULL DEFAULT 0 COMMENT '型号 0：创建成功 1:支付完成  2:商家已发货 3：已签收',
  reserved_fields varchar(20) DEFAULT NULL COMMENT '保留字段',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8 COMMENT='订单信息表';

#搜索记录
#当前最热
#官方推荐


