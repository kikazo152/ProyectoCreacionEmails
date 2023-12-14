## Novedades

1. Le he proporcionado retroalimentación al usuario al ingresar el correo electrónico para que sepa si es válido o inválido. Suponiendo que sea inválido, se le proporciona una dirección de correo electrónico válida.

2. Se ha añadido una nueva opción al menú desplegable del departamento llamada "Error". Si esta opción es seleccionada y enviada, la respuesta de la API se mostrará como "KO".

3. Todos los comentarios han sido traducidos al inglés. (No estoy seguro si este archivo también debería)



## PruebaBackEnd

Este proyecto consta de 2 partes, la parte del frontEnd la cual está realizada con Angular y la parte del backEnd la cual está realizada con Spring boot y Java.

## Estructura del Proyecto

- `/frontend`: Contiene el código fuente del front-end Angular.
- `/backend`: Contiene el código fuente del back-end Spring Boot.

## Requisitos Previos

Asegúrate de tener instalados los siguientes requisitos antes de comenzar:

- Node.js y npm para el front-end.
- JDK 1.8+ Maven 3+ para el back-end.

## Configuración del Front-end

1. Asegurate de tener Node instalado en tu dispositvo.
2. Navega a la carpeta `frontend/`.
3. Ejecuta `npm install` para instalar las dependencias.
4. Seguido de eso ejecuta el comando ng s para lanzar la app.

## Configuración del Back-end

1. Asegurate de tener instalado JDK 1.8+ y Maven 3+ en tu dispositivo.
2. Navega a la carpeta `backend/`.
3. Ejecuta `mvn spring-boot:run` para construir el proyecto.


## Funcionamiento de la app

1. Una vez esten corriendo las dos partes del servidor ( el front en el puerto http://localhost:4200/ y el back en el http://localhost:8080/ ) la app estará lista para usarse, aunque faltaría por configurar un correo electronico(a su gusto) en el application.properties del backEnd y descomentar las lineas que están marcadas en el EmailController.java para el total funcionamiento de la app.

2. La aplicación DEBERÁ ser vista en la parte del frontEnd aunque es necesario tener corriendo el back.

3. Al darle al botón de enviar del formulario se mostrará el email generado en consola a la vez que la respuesta de la api mockeada.

