-- Parte 1
CREATE DATABASE IF NOT EXISTS clientes;

USE clientes;

CREATE TABLE clientes(
  nombre VARCHAR(50) NOT NULL,
  apellido VARCHAR(50) NOT NULL,
  dni INT NOT NULL,
  edad INT NOT NULL
);

INSERT INTO clientes(nombre, apellido, dni, edad)
VALUES 
('Arturo', 'Vidal', 40128095, 21),
('Felipe', 'Vidal', 40128096, 39),
('Eduardo', 'Lopez', 40128097, 40),
('Facundo', 'Diaz', 40128098, 50);

-- Parte 2
SELECT * FROM clientes WHERE edad < 25;

SELECT * FROM clientes WHERE edad > 35 && edad < 45;