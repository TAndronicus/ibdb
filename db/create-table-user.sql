-- Table: public."user"

-- DROP TABLE public."user";

CREATE TABLE public."user"
(
  id bigint NOT NULL DEFAULT nextval('user_id_seq'::regclass),
  surname character varying(30) NOT NULL,
  name character varying(30) NOT NULL,
  date_of_birth date,
  place_of_birth character varying(30),
  CONSTRAINT "primaryKey" PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public."user"
  OWNER TO jb;
COMMENT ON TABLE public."user"
  IS 'User data.';

