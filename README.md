# Programación Orientada a Objetos (POO) – Guía de Sesiones 2025

## Objetivos de la asignatura

- Aprender a diseñar e implementar soluciones usando la POO.
- Tener una base sólida de programación usando el lenguaje Java.
- Ser capaz de estructurar, diseñar, programar y coordinar sistemas desarrollados en equipo.

### Síntesis

Diseñar modelos orientados a objetos claros, trasladarlos a código Java mantenible y colaborar en el desarrollo estructurado de soluciones en equipo.

## Resultados de Aprendizaje

- Programar de forma estructurada y modular.
- Conocer los fundamentos de la programación orientada a objetos.
- Desarrollar software según el paradigma orientado a objetos.
- Aplicar patrones de diseño software para una alta cohesión y un bajo acoplamiento.
- Aprender las bases del lenguaje de modelado UML.

## Requisitos

- Java (JDK) recomendado: 17+ (cualquier LTS >= 11 funciona)
- Editor / IDE (IntelliJ, VS Code con extensión Java, etc.)
- Conocimientos previos básicos de programación imperativa

## Roadmap de sesiones

| Sesión | Tema                                                 | Competencia principal                               | Estado / Enlace                      |
| ------ | ---------------------------------------------------- | --------------------------------------------------- | ------------------------------------ |
| 1      | Fundamentos POO                                      | Diferenciar clase vs objeto; instanciación          | [Sesión 1](./session%2001/README.md) |
| 2      | UML básico: clases, atributos, métodos               | Traducir texto a modelo formal (diagrama de clases) | [Sesión 2](./session%2002/README.md) |
| 3      | Modelado inicial + primeras clases en Java           | Pasar de diagrama simple a código                   | [Sesión 3](./session%2003/README.md) |
| 4      | Constructores, paso de parámetros, referencia `this` | Inicialización segura y control de estado           | [Sesión 4](./session%2004/README.md) |
| 5      | Tipos de variables. Miembros estáticos (clase)       | Gestión de estado compartido y factory methods      | [Sesión 5](./session%2005/README.md) |
| 6      | Clases wrapper, `String`, arrays básicos             | Manipulación de tipos, strings y colecciones básicas| [Sesión 6](./session%2006/README.md) |
| 7      | Introducción a Input/Output (I/O)                    | Lectura de archivos y manejo básico de excepciones | [Sesión 7](./session%2007/README.md) |
| 8      | Gestión de excepciones (teoría + práctica)           | Lanzar, capturar y propagar excepciones            | [Sesión 8](./session%2008/README.md) |
| 9      | Relaciones entre clases: concepto y UML              | Modelar asociaciones, composición y agregación     | [Sesión 9](./session%2009/README.md) |
| 10     | Relaciones en Java (implementación)                  | Implementar relaciones entre objetos en código     | [Sesión 10](./session%2010/README.md) |
| 11     | Práctica: relaciones entre clases                    | Aplicar relaciones en casos prácticos              | [Sesión 11](./session%2011/README.md) |
| 12     | Encapsulamiento y abstracción                        | Ocultar implementación y exponer interfaces claras | [Sesión 12](./session%2012/README.md) |
| 13     | Práctica: encapsulamiento y abstracción              | Aplicar principios de encapsulamiento              | [Sesión 13](./session%2013/README.md) |
| 14     | Colecciones: `ArrayList`, `HashMap`                  | Gestionar conjuntos de objetos dinámicamente       | [Sesión 14](./session%2014/README.md) |
| 15     | Práctica: colecciones                                | Aplicar colecciones en problemas reales            | [Sesión 15](./session%2015/README.md) |
| 16     | Persistencia básica (ficheros de texto)              | Guardar y recuperar datos en archivos de texto     | TBD                                  |
| 17     | Persistencia con JSON (librerías externas)           | Serializar objetos a JSON y deserializar           | TBD                                  |
| 18     | Práctica: colecciones y persistencia                 | Integrar colecciones con persistencia de datos     | TBD                                  |
| 19     | Práctica: colecciones y persistencia                 | Consolidar conocimientos de colecciones y I/O      | TBD                                  |
| 20     | Herencia: concepto, UML y ejemplos                   | Reutilizar código mediante jerarquías de clases    | TBD                                  |
| 21     | Práctica: herencia                                   | Diseñar e implementar jerarquías de herencia       | TBD                                  |
| 22     | Polimorfismo                                         | Aplicar polimorfismo para código flexible          | TBD                                  |
| 23     | Clases abstractas                                    | Definir plantillas con métodos abstractos          | TBD                                  |
| 24     | Interfaces                                           | Diseñar contratos y abstracciones con interfaces   | TBD                                  |
| 25     | Práctica: herencia, polimorfismo y abstracción       | Integrar herencia, polimorfismo e interfaces       | TBD                                  |
| 26     | Repaso general y resolución de dudas                 | Consolidar conceptos y preparar evaluación         | TBD                                  |

## Resumen por sesión

### Sesión 1 – Introducción a la POO

Conceptos base: clase, objeto, atributos, métodos. Se muestra cómo instanciar y manipular estado. Primer ejercicio de extracción de clases desde un texto informal.

[Ver contenido completo de la sesión 1](./session%2001/README.md)

### Sesión 2 – UML y Diagramas de Clases

Representar el modelo: notación básica (clases, visibilidad, relaciones). Puente entre narrativa y estructura formal antes de codificar.

[Ver contenido completo de la sesión 2](./session%2002/README.md)

### Sesión 3 – Sistema de Gestión de Citas Médicas

Aplicación guiada: identificar entidades (Doctor, Patient, Appointment, Diagnosis), multiplicidades y responsabilidades; implementación alineada al diagrama.

[Ver contenido completo de la sesión 3](./session%2003/README.md)

### Sesión 4 – Constructores, Parámetros y `this`

Profundiza en creación robusta de objetos, validación de invariantes, paso de parámetros (por valor) y uso semántico de `this`.

[Ver contenido completo de la sesión 4](./session%2004/README.md)

### Sesión 5 – Variables Estáticas y Tipos de Variables

Introduce miembros estáticos (variables y métodos de clase), factory methods, constructores privados y distintos tipos de variables (instancia, clase, final, constantes).

[Ver contenido completo de la sesión 5](./session%2005/README.md)

### Sesión 6 – Clases Wrapper, String y Arrays

Introduce clases wrapper (Integer, Double, Float, Boolean) para tipos primitivos, manipulación de cadenas con String (split, equals, parsing), trabajo con arrays básicos y diferentes formas de iteración (for tradicional vs for-each). Se practican principios de encapsulamiento separando responsabilidades (lógica vs I/O) a través de tres ejemplos: calculadora con evolución de código imperativo a OOP, procesamiento de strings y arrays, y encapsulamiento del cálculo de IMC.

[Ver contenido completo de la sesión 6](./session%2006/README.md)

### Sesión 7 – Introducción a Input/Output (I/O)

Introduce la lectura de archivos de texto en Java usando FileReader y BufferedReader. Se muestra el manejo básico de excepciones con try-catch-finally para gestionar errores durante operaciones de I/O.

[Ver contenido completo de la sesión 7](./session%2007/README.md)

### Sesión 8 – Gestión de Excepciones

Profundiza en el manejo de excepciones: lanzamiento explícito con throw, declaración con throws, captura específica y genérica, y creación de excepciones personalizadas. Se trabaja la propagación de excepciones a través de la pila de llamadas.

[Ver contenido completo de la sesión 8](./session%2008/README.md)

### Sesión 9 – Relaciones entre Clases

Actividad práctica de herencia aplicada a un sistema de tratamientos médicos. Se modelan diferentes tipos de tratamientos (medicamento, físico, quirúrgico) que heredan de una clase base común, cada uno con su propia forma de calcular costes y aplicarse.

[Ver contenido completo de la sesión 9](./session%2009/README.md)

### Sesión 10 – Implementación de Relaciones en Java

Actividades prácticas para implementar relaciones entre clases. Incluye ejercicios como "The curse of laSalle island" e "Imagine pidgeons" para aplicar los conceptos aprendidos.

[Ver contenido completo de la sesión 10](./session%2010/README.md)

### Sesión 11 – Práctica de Relaciones entre Clases

Práctica enfocada en visibilidad y control de acceso entre clases relacionadas. Se trabajan los modificadores de acceso y el encapsulamiento en el contexto de relaciones.

[Ver contenido completo de la sesión 11](./session%2011/README.md)

### Sesión 12 – Encapsulamiento y Abstracción

Introduce los principios fundamentales de encapsulamiento (ocultar detalles de implementación) y abstracción (modelar solo lo esencial). Se enfatiza el uso correcto de modificadores de acceso y el diseño de interfaces públicas claras.

[Ver contenido completo de la sesión 12](./session%2012/README.md)

### Sesión 13 – Práctica de Encapsulamiento y Abstracción

Práctica sobre clases abstractas y aplicación de principios de abstracción. Se trabaja con ejemplos de jerarquías de clases que modelan conceptos del mundo real.

[Ver contenido completo de la sesión 13](./session%2013/README.md)

### Sesión 14 – Colecciones: ArrayList y HashMap

Introduce las colecciones más utilizadas en Java: ArrayList para listas dinámicas y HashMap para mapas clave-valor. Se aprende a gestionar conjuntos de objetos de forma eficiente.

[Ver contenido completo de la sesión 14](./session%2014/README.md)

### Sesión 15 – Práctica de Colecciones

Práctica enfocada en el uso de interfaces y colecciones. Se consolidan los conocimientos sobre ArrayList, HashMap y el diseño de interfaces para abstraer comportamientos comunes.

[Ver contenido completo de la sesión 15](./session%2015/README.md)

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

### Ejercicio 03 - Centro de Salud v2.0

Extensión del ejercicio del centro de salud para practicar constructores, validaciones y referencias `this`.

> En un centro de salud, los pacientes piden citas con los médicos. De cada paciente interesa guardar su nombre, apellido y número de tarjeta sanitaria. De cada médico interesa registrar su nombre, especialidad y número de colegiado. Cada cita tiene una fecha y hora, y está asociada a un paciente y a un médico. Los médicos pueden diagnosticar a los pacientes durante la cita. Los pacientes pueden consultar el resumen de su cita, donde aparezca: el nombre del médico, su especialidad y la fecha de la cita. **Además, el sistema debe poder mostrar en todo momento cuántas citas han sido registradas en total en el centro de salud.**

Objetivo: Mejorar la implementación previa añadiendo constructores con validaciones, uso de `this` y miembros estáticos para contar citas.

## Java
