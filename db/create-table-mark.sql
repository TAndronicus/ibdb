-- Table: public.mark

-- DROP TABLE public.mark;

CREATE TABLE public.mark
(
  id bigint NOT NULL DEFAULT nextval('mark_id_seq'::regclass),
  "user" bigint NOT NULL,
  book bigint NOT NULL,
  mark smallint,
  CONSTRAINT mark_primary_key PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE public.mark
  OWNER TO jb;

-- Index: public.fki_mark_book

-- DROP INDEX public.fki_mark_book;

CREATE INDEX fki_mark_book
  ON public.mark
  USING btree
  (book);

-- Index: public.fki_mark_user

-- DROP INDEX public.fki_mark_user;

CREATE INDEX fki_mark_user
  ON public.mark
  USING btree
  ("user");

