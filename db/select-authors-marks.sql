SELECT m.id, m."user", m.book, m.mark
  FROM public.mark m 
  INNER JOIN public.book b on m.book = b.id
  WHERE 1 = ANY(b.author);
