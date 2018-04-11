SELECT b.id, b.title, b.year, b.publisher, b.author, b.cathegory
  FROM public.book b
  WHERE 1 = ANY(b.author);