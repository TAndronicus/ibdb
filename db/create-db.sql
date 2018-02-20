-- Database: ibdb

-- DROP DATABASE ibdb;

CREATE DATABASE ibdb
  WITH OWNER = jb
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'en_US.UTF-8'
       LC_CTYPE = 'en_US.UTF-8'
       CONNECTION LIMIT = -1;

COMMENT ON DATABASE ibdb
  IS 'Internet book database.';

