# API_REST_gestion_tareas
Prueba final de Desarrollo Web
![Logo de la ESPE](img/ESPE_encabezado.png)

La API de Gestión de Tareas permite administrar tareas utilizando solicitudes HTTP. Sigue una arquitectura RESTful y facilita operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en tareas.
## Acceso a la API
La API se encuentra alojada en un servidor y se puede acceder a través de la siguiente ruta base:
Base URL: http://localhost:8080/api/tasks

## Ejemplos de Operaciones CRUD

A continuación, se presentan ejemplos de cómo realizar operaciones CRUD utilizando diferentes tipos de solicitudes HTTP en la API de Gestión de Tareas.

### Crear una nueva tarea (POST)

Para crear una nueva tarea, envía una solicitud POST a la ruta base. Incluye los datos de la tarea en el cuerpo de la solicitud en formato JSON.



Para obtener detalles sobre una tarea existente, envía una solicitud GET a la ruta base seguida del ID de la tarea.
GET http://localhost:8080/api/tasks/1

## Actualizar una tarea (PUT)
Para actualizar una tarea, envía una solicitud PUT a la ruta base seguida del ID de la tarea. Incluye los datos actualizados de la tarea en el cuerpo de la solicitud en formato JSON.
PUT http://localhost:8080/api/tasks/1

{
  "nombre": "Completar informe finalizado",
  "descripcion": "Informe del proyecto completado y revisado",
  "fecha": "2023-08-25",
  "estado": "Completado"
}
Eliminar una tarea (DELETE)
Para eliminar una tarea, envía una solicitud DELETE a la ruta base seguida del ID de la tarea.
DELETE http://localhost:8080/api/tasks/1
