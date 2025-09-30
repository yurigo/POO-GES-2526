# Programación Orientada a Objetos (POO) – Guía de Sesiones 2025

Repositorio de apoyo para la asignatura: ejemplos evolutivos, ejercicios guiados y prácticas de modelado pasando de texto → UML → código Java.

## Objetivos de la asignatura (Guía Académica)

O.01 Aprender a diseñar e implementar soluciones usando la POO.  
O.02 Tener una base sólida de programación usando el lenguaje Java.  
O.03 Ser capaz de estructurar, diseñar, programar y coordinar sistemas desarrollados en equipo.

### Síntesis

Diseñar modelos orientados a objetos claros, trasladarlos a código Java mantenible y colaborar en el desarrollo estructurado de soluciones en equipo.

## Resultados de Aprendizaje (RA)

RA.01 Programar de forma estructurada y modular.  
RA.02 Conocer los fundamentos de la programación orientada a objetos.  
RA.03 Desarrollar software según el paradigma orientado a objetos.  
RA.04 Aplicar patrones de diseño software para una alta cohesión y un bajo acoplamiento.  
RA.05 Aprender las bases del lenguaje de modelado UML.

## Requisitos

- Java (JDK) recomendado: 17+ (cualquier LTS >= 11 funciona)
- Editor / IDE (IntelliJ, VS Code con extensión Java, etc.)
- Conocimientos previos básicos de programación imperativa

## Cómo usar este repositorio

1. Lee el resumen de cada sesión abajo para entender el hilo pedagógico.
2. Entra a la carpeta de la sesión y revisa su `README.md` completo.
3. Abre los ejemplos de código y ejecútalos localmente.
4. Realiza los ejercicios al final (o cuando se indiquen) antes de mirar la solución.
5. Vuelve y extiende: añade validaciones, más métodos o nuevas clases.

## Roadmap de sesiones

| Sesión | Tema                                                 | Competencia principal                               | Estado / Enlace                      |
| ------ | ---------------------------------------------------- | --------------------------------------------------- | ------------------------------------ |
| 1      | Fundamentos POO                                      | Diferenciar clase vs objeto; instanciación          | [Sesión 1](./session%2001/README.md) |
| 2      | UML básico: clases, atributos, métodos               | Traducir texto a modelo formal (diagrama de clases) | [Sesión 2](./session%2002/README.md) |
| 3      | Modelado inicial + primeras clases en Java           | Pasar de diagrama simple a código                   | [Sesión 3](./session%2003/README.md) |
| 4      | Constructores, paso de parámetros, referencia `this` | Inicialización segura y control de estado           | [Sesión 4](./session%2004/README.md) |
| 5      | Tipos de variables. Miembros estáticos (clase)       |                                                     | TBD                                  |
| 6      | Clases wrapper, `String`, arrays básicos             |                                                     | TBD                                  |
| 7      | Introducción a Input/Output (I/O)                    |                                                     | TBD                                  |
| 8      | Gestión de excepciones (teoría + práctica)           |                                                     | TBD                                  |
| 9      | Relaciones entre clases: concepto y UML              |                                                     | TBD                                  |
| 10     | Relaciones en Java (implementación)                  |                                                     | TBD                                  |
| 11     | Práctica: relaciones entre clases                    |                                                     | TBD                                  |
| 12     | Encapsulamiento y abstracción                        |                                                     | TBD                                  |
| 13     | Práctica: encapsulamiento y abstracción              |                                                     | TBD                                  |
| 14     | Colecciones: `ArrayList`, `HashMap`                  |                                                     | TBD                                  |
| 15     | Práctica: colecciones                                |                                                     | TBD                                  |
| 16     | Persistencia básica (ficheros de texto)              |                                                     | TBD                                  |
| 17     | Persistencia con JSON (librerías externas)           |                                                     | TBD                                  |
| 18     | Práctica: colecciones y persistencia                 |                                                     | TBD                                  |
| 19     | Práctica: colecciones y persistencia                 |                                                     | TBD                                  |
| 20     | Herencia: concepto, UML y ejemplos                   |                                                     | TBD                                  |
| 21     | Práctica: herencia                                   |                                                     | TBD                                  |
| 22     | Polimorfismo                                         |                                                     | TBD                                  |
| 23     | Clases abstractas                                    |                                                     | TBD                                  |
| 24     | Interfaces                                           |                                                     | TBD                                  |
| 25     | Práctica: herencia, polimorfismo y abstracción       |                                                     | TBD                                  |
| 26     | Repaso general y resolución de dudas                 |                                                     | TBD                                  |

## Resumen por sesión

### Sesión 1 – Introducción a la POO

Conceptos base: clase, objeto, atributos, métodos. Se muestra cómo instanciar y manipular estado. Primer ejercicio de extracción de clases desde un texto informal.

### Sesión 2 – UML y Diagramas de Clases

Representar el modelo: notación básica (clases, visibilidad, relaciones). Puente entre narrativa y estructura formal antes de codificar.

### Sesión 3 – Sistema de Gestión de Citas Médicas

Aplicación guiada: identificar entidades (Doctor, Patient, Appointment, Diagnosis), multiplicidades y responsabilidades; implementación alineada al diagrama.

### Sesión 4 – Constructores, Parámetros y `this`

Profundiza en creación robusta de objetos, validación de invariantes, paso de parámetros (por valor) y uso semántico de `this`.

## Ejercicios globales destacados

### Ejercicio 01 – Centro de Salud

Texto de partida (análisis → clases → UML → Java):

> En un centro de salud, los pacientes piden citas con los médicos. De cada paciente interesa guardar su nombre, apellido y número de tarjeta sanitaria. De cada médico interesa registrar su nombre, especialidad y número de colegiado. Cada cita tiene una fecha y hora, y está asociada a un paciente y a un médico. Los médicos pueden diagnosticar a los pacientes durante la cita. Los pacientes pueden consultar el resumen de su cita, donde aparezca: el nombre del médico, su especialidad y la fecha de la cita.

Objetivo: Detectar clases, atributos, relaciones (asociaciones y multiplicidades), modelar en diagrama de clases UML y codificarlo en Java.

![health center](./session%2003/health-center/healthcenter.drawio.png)

- Diagrama (`.drawio`): [archivo](./session%2003/health-center/healthCenter.drawio)
- Código Java: [carpeta](./session%2003/health-center/)

### Ejercicio 02 – Centro Pokémon

Texto de partida (modelar entrenadores y sus equipos):

> En la región de Kantalunya, los entrenadores registran a sus Pokémon en el Centro Pokémon. Cada entrenador tiene una identidad propia y un nivel de experiencia que refleja cuánto ha progresado en sus viajes. Además, cada uno puede llevar consigo un equipo de hasta seis Pokémon, que puede organizar libremente (añadiendo o retirando miembros). Los Pokémon que forman parte de un equipo se diferencian por su especie y, en ocasiones, por un apodo que les asigna el entrenador. Su fuerza varía según el nivel que alcanzan y su estado de salud se representa en puntos de vida. Para que puedan ser identificados fácilmente en el sistema, cada Pokémon cuenta con un código único en la Pokédex. Durante los combates, cada Pokémon puede atacar a un oponente o defenderse en su turno. Además, cada Pokémon pertenece a un tipo principal (como Agua, Fuego, Planta o Eléctrico) y, en algunos casos, puede contar con un segundo tipo que complementa al primero. En este ejercicio, los tipos se representarán como cadenas de texto.

Objetivo: Identificar entidades (`Trainer`, `Pokemon`), limitar tamaño de equipo, normalizar nivel máximo y sentar base para futuras extensiones (ataques, tipos, etc.).

- Código Java: [carpeta](./session%2004/pokemon/)
