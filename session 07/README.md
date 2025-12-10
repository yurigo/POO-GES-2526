# Sesión 7 - Introducción a Input/Output (I/O)

## Objetivo

Aprender a leer y escribir archivos en Java, manejando excepciones básicas durante operaciones de I/O.

## Contenidos

### 1. Lectura de archivos

Uso de `FileReader` y `BufferedReader` para leer archivos de texto línea por línea.

**Ejemplo**: [fileread](./fileread/)

Este ejemplo muestra cómo:
- Abrir un archivo usando `FileReader`
- Leer el contenido línea por línea con `BufferedReader`
- Procesar el texto (contar palabras)
- Cerrar recursos correctamente

### 2. Manejo básico de excepciones en I/O

Introducción al manejo de excepciones con `try-catch-finally`:
- `try`: bloque de código que puede lanzar excepciones
- `catch`: captura y maneja excepciones específicas
- `finally`: código que se ejecuta siempre (opcional)

**Ejemplo**: [exceptions](./exceptions/)

Este ejemplo muestra:
- Estructura básica de `try-catch-finally`
- Captura de excepciones generales
- Ejecución garantizada del bloque `finally`

## Conceptos clave

- **FileReader**: Clase para leer archivos de texto
- **BufferedReader**: Permite leer texto de forma eficiente (línea por línea)
- **Try-Catch**: Mecanismo para capturar y manejar errores en tiempo de ejecución
- **Finally**: Bloque que se ejecuta siempre, útil para liberar recursos

## Relación con otras sesiones

Esta sesión prepara para la sesión 8, donde se profundizará en la gestión de excepciones de manera más completa.
