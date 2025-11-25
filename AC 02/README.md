# AC - Json Persistence

En la última [sesión](../session%2015/solucion-interfaces-exercise/) refactorizamos el sistema de gestión de pacientes (solucion-interfaces-exercise) para separar responsabilidades y desacoplara la persistencia creando:

- Una interfaz PatientsDAO
- Una implementación concreta de PatientsDAO que trabaja con ficheros CSV
- Código que usa PatientsDAO (no la implementación concreta) para cargar y guardar pacientes


## 1) Objetivo

La persistencia de los pacientes actualmente se realiza mediante un fichero CSV.
Para mejorar la aplicación, se nos pide que esta persistencia pase a hacerse mediante un fichero JSON:

`pacientes.json`

Tu tarea es:

- Mejorar el codebase
- Integrar GSON
- Implementar una nueva implementación de la interfaz PatientsDAO que permita cargar y guardar pacientes en JSON
- *Además, para no perder la costumbre, se debe realizar el diagrama UML de la nueva solución.* 

## 2) Entrega

La entrega debe incluir:

Código del proyecto actualizado con:

- La nueva clase que implementa PatientsDAO usando JSON + GSON
- Integración de GSON (imports, creación del objeto Gson, etc.)
- Un fichero pacientes.json generado por vuestra aplicación
- Diagrama UML (imagen, PDF o similar)

## 3) Fecha límite

Martes 2 de diciembre a las 11:00 h, justo antes de la sesión.


