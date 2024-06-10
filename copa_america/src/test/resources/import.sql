-- Insertar en la tabla Usuario
INSERT INTO usuarios (id, email, password) VALUES (6, 'user1@example.com', 'password1');
INSERT INTO usuarios (id, email, password) VALUES (7, 'user2@example.com', 'password2');

-- Insertar en la tabla Estado
INSERT INTO estados (id, nombre) VALUES (6, 'Nevada');
INSERT INTO estados (id, nombre) VALUES (7, 'California');

-- Insertar en la tabla Localidad
INSERT INTO localidades (id, nombre, estado_id) VALUES (6, 'Las Vegas', 6);
INSERT INTO localidades (id, nombre, estado_id) VALUES (7, 'Los Angeles', 7);

-- Insertar en la tabla Estadio
INSERT INTO estadios (id, nombre, capacidad, descripcion,localidad_id) VALUES (6, 'Estadio Monumental', 60000, 'Principal estadio en Las Vegas',6);
INSERT INTO estadios (id, nombre, capacidad, descripcion,localidad_id) VALUES (7, 'Estadio Azteca', 87000, 'Principal estadio en Los Angeles',7);

-- Insertar en la tabla Puntaje
INSERT INTO puntajes (id, puntos, partidos_jugados, victoria, empate, derrota, goles_favor, goles_encontra, diferencia_gol) VALUES (6, 10, 5, 3, 1, 1, 8, 5, 3);
INSERT INTO puntajes (id, puntos, partidos_jugados, victoria, empate, derrota, goles_favor, goles_encontra, diferencia_gol) VALUES (7, 7, 5, 2, 1, 2, 6, 7, -1);
INSERT INTO puntajes (id, puntos, partidos_jugados, victoria, empate, derrota, goles_favor, goles_encontra, diferencia_gol) VALUES (8, 7, 5, 2, 1, 2, 6, 7, -1);

-- Insertar en la tabla Grupo
INSERT INTO grupos (id, nombre) VALUES (6, 'A');
INSERT INTO grupos (id, nombre) VALUES (7, 'B');

-- Insertar en la tabla Selecciones
INSERT INTO selecciones (id, grupo_id, nombre, apodo, debut, participaciones, titulos, puntaje_id) VALUES (6, 6, 'Argentina', 'La Albiceleste', '1902', 17, 2, 6);
INSERT INTO selecciones (id, grupo_id, nombre, apodo, debut, participaciones, titulos, puntaje_id) VALUES (7, 7, 'Brasil', 'La Verde-Amarela', '1914', 21, 5, 7);
INSERT INTO selecciones (id, grupo_id, nombre, apodo, debut, participaciones, titulos, puntaje_id) VALUES (8, 6, 'Bolivia', 'alalla', '1914', 9, 1, 8);

-- Insertar en la tabla Partido
INSERT INTO partidos (id, local_id, visitante_id, estadio_id, fase, dia_partido) VALUES (6, 6, 7, 6, 'GRUPOS', '2024-06-07T10:30:00');
INSERT INTO partidos (id, local_id, visitante_id, estadio_id, fase, dia_partido) VALUES (7, 7, 6, 7, 'GRUPOS', '2024-06-08T15:30:00');

-- Insertar en la tabla Noticia
INSERT INTO noticias (id, titulo, contenido) VALUES (6, 'Titulo Noticia 1', 'Contenido de la noticia 1');
INSERT INTO noticias (id, titulo, contenido) VALUES (7, 'Titulo Noticia 2', 'Contenido de la noticia 2');

