-- Table: public.author

-- DROP TABLE public.author;

CREATE TABLE public.author
(
  id bigint NOT NULL,
  surname character varying(30) NOT NULL,
  name character varying(30),
  pseudonym character varying(30)[],
  date_of_birth date,
  place_of_birth character varying(30),
  date_of_death date,
  place_of_death character varying(30),
  CONSTRAINT author_primary_key PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.author
  OWNER TO jb;

