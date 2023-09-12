-- SHOW TABLES;
-- CREATE TABLE alumnos (
--  	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
-- 		nombre VARCHAR(150) NOT NULL,
--  	apellido VARCHAR(150) NOT NULL,--  	dni VARCHAR(150) NOT NULL,
--  	legajo INT NOT NULL
-- );
-- DESCRIBE alumnos;
-- INSERT INTO alumnos (nombre, apellido, dni, legajo)
-- VALUES ("Juan", "Perez", "12345678", 12345);

-- INSERT INTO alumnos (nombre, apellido, dni, legajo)
-- VALUES
-- ("Emi", "Perez", "54643224244", 12346),
-- ("Marcos", "Gonzalez", "342342", 231232);

-- SELECT
-- SELECT * FROM alumnos; -- * → Todos las columnas
-- SELECT nombre, apellido, id, dni FROM alumnos; 
-- SELECT * FROM alumnos
-- WHERE apellido = "Perez";
-- WHERE id = 2;
-- WHERE dni > 342345;

-- ALTER TABLE alumnos ADD promedio INT;
-- SELECT * FROM alumnos;

-- UPDATE alumnos SET promedio = 4;
-- SELECT * FROM alumnos;

-- DELETE FROM alumnos;

-- Crear tabla notas
-- CREATE TABLE notas (
-- 	id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
-- 	alumno_id INT NOT NULL,
-- 	materia VARCHAR(150) NOT NULL,
-- 	nota INT NOT NULL
-- );