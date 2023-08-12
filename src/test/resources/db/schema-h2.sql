DROP TABLE IF EXISTS sys_user;

CREATE TABLE sys_user
(
    id              int NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    username        VARCHAR(30) NULL DEFAULT NULL COMMENT '用户名',
    password        VARCHAR(30) NULL DEFAULT NULL COMMENT '密码',
    age             INT NULL DEFAULT NULL COMMENT '年龄',
    total_add_money int          DEFAULT null comment '累计充值金额',
    total_use_money int          DEFAULT null,
    remain_money    int          DEFAULT null comment '可用余额',
    score           int          DEFAULT null comment '消费积分',
    create_time     datetime     DEFAULT null comment '创建时间',
    update_time     datetime     DEFAULT null comment '更新时间',
    remark          varchar(500) DEFAULT null comment '备注',
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS recharge_record;

CREATE TABLE recharge_record
(
    id          int NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    user_id     int NOT NULL COMMENT '用户id',
    add_money   int          DEFAULT null comment '充值金额',
    create_time datetime     DEFAULT null comment '创建时间',
    update_time datetime     DEFAULT null comment '更新时间',
    remark      varchar(500) DEFAULT null comment '备注',
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS buy_record;

CREATE TABLE buy_record
(
    id          int NOT NULL AUTO_INCREMENT COMMENT '主键ID',
    user_id     int NOT NULL COMMENT '用户id',
    good_name   VARCHAR(30)  DEFAULT null comment '购买商品',
    use_money   int          DEFAULT null comment '消费金额',
    create_time datetime     DEFAULT null comment '创建时间',
    update_time datetime     DEFAULT null comment '更新时间',
    remark      varchar(500) DEFAULT null comment '备注',
    PRIMARY KEY (id)
);