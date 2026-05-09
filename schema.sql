CREATE DATABASE IF NOT EXISTS gestionflotas;

USE gestionflotas;

CREATE USER IF NOT EXISTS 'flotauser'@'%' IDENTIFIED BY 'flotapass';
GRANT ALL PRIVILEGES ON gestionflotas.* TO 'flotauser'@'%';
FLUSH PRIVILEGES;

CREATE TABLE IF NOT EXISTS vehiculos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    matricula VARCHAR(255),
    marca VARCHAR(255),
    modelo VARCHAR(255),
    km_actuales INT NOT NULL
);

CREATE TABLE IF NOT EXISTS conductores (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255),
    apellidos VARCHAR(255),
    numero_licencia VARCHAR(255),
    fecha_nacimiento DATE
);