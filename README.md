# API de Gestión de Usuarios y Ventas

Este proyecto es un backend desarrollado en Java con Spring Boot que permite la gestión de usuarios y ventas.

## Requisitos

Para poder probar y ejecutar este backend, necesitas tener instalados los siguientes componentes:

- **OpenJDK 17**: La versión de Java utilizada para desarrollar y ejecutar el proyecto.
- **MySQL**: Base de datos donde se almacenan los datos de usuarios y ventas.
- **Visual Studio Code (VSCode)**: El editor de código recomendado para trabajar con el proyecto.
- **Extension Pack for Java**: Paquete de extensiones necesario para ejecutar proyectos Java dentro de VSCode.

## Endpoints

### 1. Obtener Usuarios Activos

**Descripción**: Obtiene la lista de usuarios que están activos en el sistema.

- **Método**: `GET`
- **URL**: `http://localhost:8094/usuarios/activos`

### 2. Crear Usuario

**Descripción**: Crea un nuevo usuario en el sistema.

- **Método**: `POST`
- **URL**: `http://localhost:8094/usuarios/crear`
- **Body (JSON)**:
  ```json
  {
    "nombre": "Pedro García",
    "email": "pedro.garcia@example.com",
    "rol": "Administrador",
    "estado": true
  }

### 3. Desactivar Usuario

**Descripción**: Desactiva un usuario en el sistema.

- **Método**: `PUT`
- **URL**: `http://localhost:8094/usuarios/desactivar/{IdUsuario}`

### 4. Cambiar Rol de Usuario

**Descripción**: Cambia el rol de un usuario existente.

- **Método**: `PUT`
- **URL**: `http://localhost:8094/usuarios/cambiarRol/{IdUsuario}?nuevoRol={Administrador/Analista}`

### 5. Listar Ventas

**Descripción**: Lista todas las ventas registradas en el sistema.

- **Método**: `GET`
- **URL**: `http://localhost:8094/ventas/listar`

### 6. Registrar Venta

**Descripción**: Registra una nueva venta en el sistema.

- **Método**: `POST`
- **URL**: `http://localhost:8094/ventas/registrar?nombreComprador={NombreUsuario}&totalCompra={ValorCompra}`

### Ejecución

1. Clona este repositorio en tu máquina local.
2. Configura las propiedades de conexión a la base de datos en `application.properties`.
3. Ejecuta el proyecto en VSCode utilizando la extensión "Extension Pack for Java".
4. Usa Postman u otra herramienta similar para probar los endpoints descritos.
