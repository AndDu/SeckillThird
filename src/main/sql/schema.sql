CREATE dataBase seckill;

use seckill;

CREATE TABLE seckill
(
    seckill_id  bigint                              NOT NULL AUTO_INCREMENT COMMENT '商品ID',
    name        varchar(120)                        NOT NULL COMMENT '秒杀商品名',
    number      int                                 NOT NULL COMMENT '秒杀库存数量',
    start_time  timestamp                           NOT NULL COMMENT '秒杀开始时间',
    end_time    timestamp                           NOT NULL COMMENT '秒杀结束时间',
    create_time timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    primary key (seckill_id),
    key idx_create_time (create_time),
    key idx_end_time (end_time),
    key idx_start_time (start_time)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1000
  DEFAULT CHARSET = utf8 COMMENT '秒杀库存表';

/*初始化数据*/
insert into seckill(name, number, start_time, end_time)
    value
    ('商品1000', 100, '2020-11-01 00:00:00', '2020-12-01 00:00:00'),
    ('商品1001', 100, '2020-11-06 00:00:00', '2020-12-01 00:00:00'),
    ('商品1002', 100, '2020-11-07 00:00:00', '2020-12-01 00:00:00'),
    ('商品1003', 100, '2020-11-08 00:00:00', '2020-12-01 00:00:00'),
    ('商品1004', 100, '2020-11-09 00:00:00', '2020-12-01 00:00:00');

/*秒杀成功表*/

CREATE TABLE seckill_successd
(
    seckill_id  bigint      NOT NULL AUTO_INCREMENT COMMENT '商品ID',
    user_phone  varchar(50) NOT NULL COMMENT '秒杀用户手机',
    create_time timestamp            DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    state       tinyint     NOT NULL DEFAULT -1 comment '秒杀状态，-1 0 1 ： 失败，成功， 已付款',
    primary key (seckill_id, user_phone),
    key idx_create_time (create_time)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1000
  DEFAULT CHARSET = utf8 COMMENT '秒杀成功记录表';


select
    sk.seckill_id,
    sk.user_phone,
    sk.create_time,
    sk.state

from seckill_successd as sk

where sk.seckill_id=1000
  and sk.user_phone=1811111111;

# root and  password root 123456