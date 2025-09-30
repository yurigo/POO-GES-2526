# UML (Unified Modeling Language)

**UML** es un lenguaje de modelado estandarizado que permite representar de manera gráfica la estructura y el comportamiento de un sistema de software.  
No es un lenguaje de programación, sino una herramienta para **diseñar, visualizar y comunicar** cómo se organiza y funciona una aplicación antes (o durante) su implementación.

[ver documento](./assets/POO-UML-DiagramaClasses.pdf)

## Diagrama de Clases

En el contexto de la **programación orientada a objetos**, el diagrama más utilizado es el **diagrama de clases**, que describe:

- **Clases**: representadas como rectángulos divididos en:

  - Nombre
  - Atributos
  - Métodos

- **Visibilidad**:

  - [x] `+` público
  - [x] `-` privado
  - [ ] `#` protegido
  - [ ] `~` package (visible solo dentro del mismo paquete)

- **Relaciones**:
  - [x] **Asociación**: conexión entre clases (ej. _Paciente – Médico_).
  - [x] **Agregación**: relación débil de "todo-parte" (ej. _Hospital – Paciente_).
  - [x] **Composición**: relación fuerte de "todo-parte", donde el ciclo de vida de la parte depende del todo (ej. _Historia clínica – Entrada médica_).
  - [ ] **Herencia (Generalización)**: relación jerárquica (ej. _Usuario → Paciente / Médico_).
  - [x] **Dependencia**: una clase usa a otra de forma temporal, sin necesidad de relación estructural (ej. _Médico → Receta_).

## Beneficios de usar UML

- Facilita la **comunicación** entre desarrolladores, diseñadores y no técnicos.
- Sirve como **documentación viva** del sistema.
- Ayuda a **detectar errores de diseño** antes de programar.
- Permite una **visión global** de la arquitectura del software.

## Code examples

- [Point](./example%20Point)
- [Company](./example%20Company)
- [Moto](./example%20Moto)
