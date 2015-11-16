# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table m_domain (
  id                        varchar(255) not null,
  name                      varchar(255),
  pinyin                    varchar(255),
  pinyin_sx                 varchar(255),
  description               varchar(255),
  constraint pk_m_domain primary key (id))
;

create table m_entity (
  id                        varchar(255) not null,
  name                      varchar(255),
  pinyin                    varchar(255),
  pinyin_sx                 varchar(255),
  description               varchar(255),
  constraint pk_m_entity primary key (id))
;

create table m_entity_event (
  m_entity_from_id          varchar(255),
  m_entity_to_id            varchar(255),
  m_event_id                varchar(255))
;

create table m_entity_relation (
  m_entity_from_id          varchar(255),
  m_entity_to_id            varchar(255),
  relation_id               varchar(255))
;

create table m_event (
  id                        varchar(255) not null,
  name                      varchar(255),
  pinyin                    varchar(255),
  pinyin_sx                 varchar(255),
  description               varchar(255),
  constraint pk_m_event primary key (id))
;

create table m_property (
  id                        varchar(255) not null,
  name                      varchar(255),
  pinyin                    varchar(255),
  pinyin_sx                 varchar(255),
  description               varchar(255),
  type_id                   varchar(255),
  constraint pk_m_property primary key (id))
;

create table m_property_value_type (
  id                        varchar(255) not null,
  name                      varchar(255),
  value_type                varchar(255),
  constraint pk_m_property_value_type primary key (id))
;

create table m_relation (
  id                        varchar(255) not null,
  name                      varchar(255),
  pinyin                    varchar(255),
  pinyin_sx                 varchar(255),
  desc                      varchar(255),
  direction                 tinyint(1) default 0,
  constraint pk_m_relation primary key (id))
;

create table t_entity (
  id                        varchar(255) not null,
  name                      varchar(255),
  pinyin                    varchar(255),
  pingyin_sx                varchar(255),
  m_entity_id               varchar(255),
  constraint pk_t_entity primary key (id))
;

create table t_event (
  id                        varchar(255) not null,
  time                      datetime(6),
  m_enent_id                varchar(255),
  t_entity_from_id          varchar(255),
  t_entity_to_id            varchar(255),
  constraint pk_t_event primary key (id))
;

create table t_property (
  id                        varchar(255) not null,
  value                     varchar(255),
  value_type                varchar(255),
  owner_type                integer,
  owner_id                  varchar(255),
  m_property_id             varchar(255),
  constraint pk_t_property primary key (id))
;

create table t_relation (
  id                        varchar(255) not null,
  m_relation_id             varchar(255),
  t_entity_from_id          varchar(255),
  t_entity_to_id            varchar(255),
  constraint pk_t_relation primary key (id))
;


create table m_entity_domain (
  m_entity_id                    varchar(255) not null,
  m_domain_id                    varchar(255) not null,
  constraint pk_m_entity_domain primary key (m_entity_id, m_domain_id))
;

create table m_property_entity (
  m_property_id                  varchar(255) not null,
  m_entity_id                    varchar(255) not null,
  constraint pk_m_property_entity primary key (m_property_id, m_entity_id))
;

create table m_property_event (
  m_property_id                  varchar(255) not null,
  m_event_id                     varchar(255) not null,
  constraint pk_m_property_event primary key (m_property_id, m_event_id))
;

create table m_relation_domain (
  m_relation_id                  varchar(255) not null,
  m_domain_id                    varchar(255) not null,
  constraint pk_m_relation_domain primary key (m_relation_id, m_domain_id))
;
alter table m_entity_event add constraint fk_m_entity_event_m_entity_from_1 foreign key (m_entity_from_id) references m_entity (id) on delete restrict on update restrict;
create index ix_m_entity_event_m_entity_from_1 on m_entity_event (m_entity_from_id);
alter table m_entity_event add constraint fk_m_entity_event_m_entity_to_2 foreign key (m_entity_to_id) references m_entity (id) on delete restrict on update restrict;
create index ix_m_entity_event_m_entity_to_2 on m_entity_event (m_entity_to_id);
alter table m_entity_event add constraint fk_m_entity_event_m_event_3 foreign key (m_event_id) references m_event (id) on delete restrict on update restrict;
create index ix_m_entity_event_m_event_3 on m_entity_event (m_event_id);
alter table m_entity_relation add constraint fk_m_entity_relation_m_entity_from_4 foreign key (m_entity_from_id) references m_entity (id) on delete restrict on update restrict;
create index ix_m_entity_relation_m_entity_from_4 on m_entity_relation (m_entity_from_id);
alter table m_entity_relation add constraint fk_m_entity_relation_m_entity_to_5 foreign key (m_entity_to_id) references m_entity (id) on delete restrict on update restrict;
create index ix_m_entity_relation_m_entity_to_5 on m_entity_relation (m_entity_to_id);
alter table m_entity_relation add constraint fk_m_entity_relation_relation_6 foreign key (relation_id) references m_relation (id) on delete restrict on update restrict;
create index ix_m_entity_relation_relation_6 on m_entity_relation (relation_id);
alter table m_property add constraint fk_m_property_type_7 foreign key (type_id) references m_property_value_type (id) on delete restrict on update restrict;
create index ix_m_property_type_7 on m_property (type_id);
alter table t_entity add constraint fk_t_entity_mEntity_8 foreign key (m_entity_id) references m_entity (id) on delete restrict on update restrict;
create index ix_t_entity_mEntity_8 on t_entity (m_entity_id);
alter table t_event add constraint fk_t_event_m_enent_9 foreign key (m_enent_id) references m_event (id) on delete restrict on update restrict;
create index ix_t_event_m_enent_9 on t_event (m_enent_id);
alter table t_event add constraint fk_t_event_t_entity_from_10 foreign key (t_entity_from_id) references t_entity (id) on delete restrict on update restrict;
create index ix_t_event_t_entity_from_10 on t_event (t_entity_from_id);
alter table t_event add constraint fk_t_event_t_entity_to_11 foreign key (t_entity_to_id) references t_entity (id) on delete restrict on update restrict;
create index ix_t_event_t_entity_to_11 on t_event (t_entity_to_id);
alter table t_property add constraint fk_t_property_owner_12 foreign key (owner_id) references t_entity (id) on delete restrict on update restrict;
create index ix_t_property_owner_12 on t_property (owner_id);
alter table t_property add constraint fk_t_property_OWNER_13 foreign key (owner_id) references t_event (id) on delete restrict on update restrict;
create index ix_t_property_OWNER_13 on t_property (owner_id);
alter table t_property add constraint fk_t_property_mProperty_14 foreign key (m_property_id) references m_property (id) on delete restrict on update restrict;
create index ix_t_property_mProperty_14 on t_property (m_property_id);
alter table t_relation add constraint fk_t_relation_m_relation_15 foreign key (m_relation_id) references m_relation (id) on delete restrict on update restrict;
create index ix_t_relation_m_relation_15 on t_relation (m_relation_id);
alter table t_relation add constraint fk_t_relation_t_entity_from_16 foreign key (t_entity_from_id) references t_entity (id) on delete restrict on update restrict;
create index ix_t_relation_t_entity_from_16 on t_relation (t_entity_from_id);
alter table t_relation add constraint fk_t_relation_t_entity_to_17 foreign key (t_entity_to_id) references t_entity (id) on delete restrict on update restrict;
create index ix_t_relation_t_entity_to_17 on t_relation (t_entity_to_id);



alter table m_entity_domain add constraint fk_m_entity_domain_m_entity_01 foreign key (m_entity_id) references m_entity (id) on delete restrict on update restrict;

alter table m_entity_domain add constraint fk_m_entity_domain_m_domain_02 foreign key (m_domain_id) references m_domain (id) on delete restrict on update restrict;

alter table m_property_entity add constraint fk_m_property_entity_m_property_01 foreign key (m_property_id) references m_property (id) on delete restrict on update restrict;

alter table m_property_entity add constraint fk_m_property_entity_m_entity_02 foreign key (m_entity_id) references m_entity (id) on delete restrict on update restrict;

alter table m_property_event add constraint fk_m_property_event_m_property_01 foreign key (m_property_id) references m_property (id) on delete restrict on update restrict;

alter table m_property_event add constraint fk_m_property_event_m_event_02 foreign key (m_event_id) references m_event (id) on delete restrict on update restrict;

alter table m_relation_domain add constraint fk_m_relation_domain_m_relation_01 foreign key (m_relation_id) references m_relation (id) on delete restrict on update restrict;

alter table m_relation_domain add constraint fk_m_relation_domain_m_domain_02 foreign key (m_domain_id) references m_domain (id) on delete restrict on update restrict;

# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table m_domain;

drop table m_entity_domain;

drop table m_relation_domain;

drop table m_entity;

drop table m_property_entity;

drop table m_entity_event;

drop table m_entity_relation;

drop table m_event;

drop table m_property_event;

drop table m_property;

drop table m_property_value_type;

drop table m_relation;

drop table t_entity;

drop table t_event;

drop table t_property;

drop table t_relation;

SET FOREIGN_KEY_CHECKS=1;

