create database small_shop;

create table user
(
    id              int          not null comment '主键'
        primary key,
    username        varchar(20)  null comment '用户名',
    password        varchar(20)  null comment '密码',
    age             int          null comment '年龄',
    total_add_money int          null comment '累计充值金额',
    total_use_money int          null,
    remain_money    int          null comment '可用余额',
    score           int          null comment '消费积分',
    create_time     datetime     null comment '创建时间',
    update_time     datetime     null comment '更新时间',
    remark          varchar(500) null comment '备注'
) comment '用户表';

create table recharge_record
(
    id          int          not null comment '主键'
        primary key,
    user_id     varchar(20)  null comment '用户id',
    add_money   int          null comment '充值金额',
    create_time datetime     null comment '创建时间',
    remark      varchar(500) null comment '备注'
) comment '充值记录';

create table buy_record
(
    id          int          not null comment '主键'
        primary key,
    user_id     varchar(20)  null comment '用户id',
    good_name   varchar(20)  null comment '购买商品',
    use_money   int          null comment '消费金额',
    create_time datetime     null comment '创建时间',
    remark      varchar(500) null comment '备注'
) comment '购买记录';