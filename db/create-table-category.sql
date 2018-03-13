-- Table: public.cathegory

-- DROP TABLE public.cathegory;

CREATE TABLE public.cathegory
(
  id smallint NOT NULL,
  name character varying(30) NOT NULL,
  CONSTRAINT cathegory_primary_key PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.cathegory
  OWNER TO jb;

