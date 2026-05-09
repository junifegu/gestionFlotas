# Gestion de Flotas

Aplicacion web para gestionar vehiculos y conductores de una flota de transporte.
Desarrollada con Spring Boot, JPA/Hibernate, Thymeleaf y MySQL.

Alumno: Juan Nicolas Fernandez Guevara
Curso: C.F.G.S DAW - Programacion UT8

## Descripcion

Aplicacion que permite gestionar una flota de vehiculos y sus conductores.
Permite listar, registrar vehiculos con matricula, marca, modelo y kilometraje,
y conductores con nombre, apellidos, numero de licencia y fecha de nacimiento.

## Requisitos previos

- Java 17 o superior
- MySQL 8.0
- Maven 3.8 o superior
- Spring Boot 4.0.6

## Pasos para ejecutarlo en local

1. Clona el repositorio:
   git clone https://github.com/junifegu/gestionFlotas.git

2. Ejecuta el script SQL en tu MySQL (HeidiSQL o Workbench):
   Abre schema.sql y ejecutalo en tu servidor MySQL

3. Configura src/main/resources/application.properties:
   spring.datasource.url=jdbc:mysql://localhost:3307/gestionflotas
   spring.datasource.username=flotauser
   spring.datasource.password=flotapass

4. Arranca la aplicacion:
   mvn spring-boot:run

5. Abre el navegador en:
   http://localhost:8080/inicio

## Endpoints disponibles

- GET /inicio - Pagina principal
- GET /listadoVehiculos - Listado de todos los vehiculos
- GET /listadoConductores - Listado de todos los conductores
- GET /altaVehiculo - Formulario de alta de vehiculo
- POST /altaVehiculo - Guardar nuevo vehiculo
- GET /altaConductor - Formulario de alta de conductor
- POST /altaConductor - Guardar nuevo conductor

## Pagina de error personalizada

https://gestionflotas-production.up.railway.app/paginaquenoexiste

## URL en Railway

https://gestionflotas-production.up.railway.app/inicio# Gestion de Flotas

Aplicacion web para gestionar vehiculos y conductores de una flota de transporte.
Desarrollada con Spring Boot, JPA/Hibernate, Thymeleaf y MySQL.

Alumno: Juan Nicolas Fernandez Guevara
Curso: C.F.G.S DAW - Programacion UT8

## Descripcion

Aplicacion que permite gestionar una flota de vehiculos y sus conductores.
Permite listar, registrar vehiculos con matricula, marca, modelo y kilometraje,
y conductores con nombre, apellidos, numero de licencia y fecha de nacimiento.

## Requisitos previos

- Java 17 o superior
- MySQL 8.0
- Maven 3.8 o superior
- Spring Boot 4.0.6

## Pasos para ejecutarlo en local

1. Clona el repositorio:
   git clone https://github.com/junifegu/gestionFlotas.git

2. Ejecuta el script SQL en tu MySQL (HeidiSQL o Workbench):
   Abre schema.sql y ejecutalo en tu servidor MySQL

3. Configura src/main/resources/application.properties:
   spring.datasource.url=jdbc:mysql://localhost:3307/gestionflotas
   spring.datasource.username=flotauser
   spring.datasource.password=flotapass

4. Arranca la aplicacion:
   mvn spring-boot:run

5. Abre el navegador en:
   http://localhost:8080/inicio

## Endpoints disponibles

- GET /inicio - Pagina principal
- GET /listadoVehiculos - Listado de todos los vehiculos
- GET /listadoConductores - Listado de todos los conductores
- GET /altaVehiculo - Formulario de alta de vehiculo
- POST /altaVehiculo - Guardar nuevo vehiculo
- GET /altaConductor - Formulario de alta de conductor
- POST /altaConductor - Guardar nuevo conductor

## Pagina de error personalizada

https://gestionflotas-production.up.railway.app/paginaquenoexiste

## URL en Railway

https://gestionflotas-production.up.railway.app/inicio