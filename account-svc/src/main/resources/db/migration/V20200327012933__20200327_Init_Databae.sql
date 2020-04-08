--
-- For PostgreSQL database only
--

-- Author <zhiliang.im@gmail.com>
-- Init database, create table and index
-- date: 2020-02-01

CREATE TABLE sys_user
(
    id         BIGSERIAL PRIMARY KEY,
    name       VARCHAR(128) UNIQUE      NOT NULL,
    nick_name  VARCHAR(128),
    time_zone  VARCHAR(8),
    created_id BIGINT,
    gender     SMALLINT,
    is_active  BOOLEAN                  NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW()
);
CREATE INDEX idx_name_sys_user ON sys_user (name);

CREATE TABLE local_auth
(
    id         BIGSERIAL PRIMARY KEY,
    user_id    BIGINT UNIQUE,
    password   VARCHAR(512),
    is_active  BOOLEAN                  NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW()
);

CREATE TABLE api_auth
(
    id         BIGSERIAL PRIMARY KEY,
    user_id    BIGINT,
    api_key    VARCHAR(64),
    api_secret VARCHAR(64),
    is_active  BOOLEAN                  NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW()
);

CREATE TABLE role
(
    id         BIGSERIAL PRIMARY KEY,
    name       VARCHAR(32),
    is_active  BOOLEAN                  NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW()
);

CREATE TABLE user_role
(
    id         BIGSERIAL PRIMARY KEY,
    user_id    BIGINT,
    role_id    BIGINT,
    is_active  BOOLEAN                  NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT NOW(),
    UNIQUE (user_id, role_id)
);
