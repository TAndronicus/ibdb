-- Table: public.book

-- DROP TABLE public.book;

CREATE TABLE public.book
(
  id bigint NOT NULL,
  title character varying(60) NOT NULL,
  year date,
  publisher character varying(30),
  author bigint[] NOT NULL,
  cathegory smallint[],
  CONSTRAINT book_primary_key PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.book
  OWNER TO jb;

