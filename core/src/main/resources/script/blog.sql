-- ----------------------------
-- Table structure for user
-- ----------------------------
create table if not exists "user"
(
	id bigint not null
		constraint user_pkey
			primary key,
	name varchar not null,
	email varchar,
	passwrod varchar,
	image_url varchar not null,
	nick_name varchar,
	address varchar,
	mobile varchar(11),
	wx_id varchar,
	qq_id varchar,
	sex integer,
	birthday date,
	crt date,
	lut date
)
;
--//@formatter:off
comment on table "user" is '用户表';
comment on column "user".id is '主键ｉｄ';
comment on column "user".name is '用户名';
comment on column "user".email is '邮箱';
comment on column "user".passwrod is '密码';
comment on column "user".image_url is '头像';
comment on column "user".nick_name is '昵称';
comment on column "user".address is '地址';
comment on column "user".mobile is '电话';
comment on column "user".wx_id is '微信ｉｄ';
comment on column "user".qq_id is 'qqID';
comment on column "user".sex is 'X性别';
comment on column "user".birthday is '出生日期';
comment on column "user".crt is '创建时间';
comment on column "user".lut is '更新时间';

alter table "user" owner to postgres;
--//@formatter:on
-- ----------------------------
-- Table structure for article
-- ----------------------------
--//@formatter:off
create table if not exists article
(
	id bigint not null
		constraint article_pkey
			primary key,
	title varchar,
	content varchar(5000),
	type integer,
	tag varchar(200),
	is_top boolean,
	is_comment boolean,
	is_publish boolean,
	image_url varchar(200)
)
;

comment on table article is 'bloge文章';
comment on column article.id is '主键';
comment on column article.title is '文章标题';
comment on column article.content is '文章内容';
comment on column article.type is '文章类型';
comment on column article.tag is '标签;
comment on column article.is_top is '是否置顶';
comment on column article.is_comment is '是否开启评论';
comment on column article.is_publish is '是否公开';
comment on column article.image_url is '图片';
alter table article owner to postgres;
--//@formatter:on