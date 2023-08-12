DELETE
FROM sys_user;

insert into sys_user (username, password, age, total_add_money, total_use_money, remain_money, score, create_time,
                      update_time, remark)
values ('张三', '123456', 18, 1000, 500, 500, 900, '2023-01-01 00:00:00', '2023-01-01 00:00:00', '测试用户');

DELETE
FROM recharge_record;

insert into recharge_record (user_id, add_money, create_time, update_time, remark)
values (1, 1000, '2023-01-01 00:00:00', '2023-01-01 00:00:00', '测试');

DELETE
FROM buy_record;

insert into buy_record (user_id, good_name, use_money, create_time, update_time, remark)
values (1, 'apple', 1000, '2023-01-01 00:00:00', '2023-01-01 00:00:00', '测试');



