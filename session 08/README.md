# Sesión 8 - Gestión de Excepciones

## Objetivo

Profundizar en el manejo de excepciones en Java: captura, lanzamiento, y creación de excepciones personalizadas.

## Contenidos

### 1. Lanzamiento de excepciones (`throw`)

Aprender a lanzar excepciones de forma explícita cuando se detectan condiciones de error.

**Ejemplo**: [exception-example](./exception-example/)

Este ejemplo muestra:
- Lanzamiento de excepciones con `throw`
- Declaración de métodos que lanzan excepciones (`throws`)
- Creación de nuevas excepciones con mensajes descriptivos
- Captura y re-lanzamiento de excepciones

### 2. Ejemplos complementarios

**Otros ejemplos disponibles**:
- [inheritance-example](./inheritance-example/)
- [example-inheritance-02](./example-inheritance-02/)

## Conceptos clave

- **throw**: Palabra clave para lanzar una excepción
- **throws**: Declaración en la firma de un método indicando qué excepciones puede lanzar
- **try-catch**: Captura de excepciones para manejar errores
- **Propagación de excepciones**: Cómo se transfieren las excepciones por la pila de llamadas
- **Excepciones personalizadas**: Creación de mensajes de error descriptivos

## Buenas prácticas

1. Siempre capturar excepciones específicas antes que las genéricas
2. Proporcionar mensajes de error claros y descriptivos
3. Liberar recursos en bloques `finally` o usar try-with-resources
4. No capturar excepciones sin manejarlas adecuadamente

## Relación con otras sesiones

- **Sesión 7**: Introduce conceptos básicos de try-catch y I/O
- **Futuras sesiones**: Las excepciones se usarán en persistencia, colecciones y otras operaciones propensas a errores
