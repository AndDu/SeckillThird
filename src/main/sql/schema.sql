
CREATE  dataBase seckill;

use seckill;

CREATE TABLE seckill(
    'seckill_id' BIGINT NOT NULL  AUTO_INCREATMENT  COMMENT '秒杀ID',
    'name' varchar(120) NOT  NULL COMMENT '秒杀商品名',
    'num' int NOT NULL COMMENT '秒杀库存数量',
) ENGINE=INnoDB  AUTO_INCREATMENT 1000 DEFAULT CHARSET=UFF8 COMMENT '秒杀库存表'