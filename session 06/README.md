# Clases Wrapper, String y Arrays en Java

Esta sesión introduce conceptos fundamentales de Java aplicados a través de ejemplos prácticos: el uso de clases wrapper para tipos primitivos, manipulación de cadenas (`String`), trabajo con arrays y una introducción al patrón iterador. Se practican además principios de encapsulamiento y acoplamiento con Input/Output.

## Objetivos de la sesión

- Comprender el concepto de **clases wrapper** y su relación con tipos primitivos
- Trabajar con la clase `String` y sus métodos principales
- Manipular arrays básicos y entender la iteración
- Practicar encapsulamiento separando responsabilidades (lógica vs I/O)
- Introducir el concepto de **bajo acoplamiento** mediante capas de abstracción

---

## 1. Clases Wrapper

Las **clases wrapper** son clases que "envuelven" (wrap) tipos primitivos de Java, convirtiéndolos en objetos. Esto es necesario porque Java tiene dos sistemas de tipos:

- **Tipos primitivos**: `int`, `double`, `float`, `boolean`, `char`, etc. (valores directos en memoria)
- **Tipos referencia**: Objetos que heredan de `Object`

### ¿Por qué usar clases wrapper?

- Permiten usar tipos primitivos en contextos que requieren objetos (colecciones, genéricos)
- Ofrecen métodos útiles para conversiones y operaciones
- Soportan el valor `null` (los primitivos no pueden ser `null`)

### Principales clases wrapper

| Primitivo | Clase Wrapper | Ejemplo de creación                     |
| --------- | ------------- | --------------------------------------- |
| `int`     | `Integer`     | `Integer num = 42;` (autoboxing)        |
| `double`  | `Double`      | `Double d = 3.14;`                      |
| `float`   | `Float`       | `Float f = 3.6f;`                       |
| `boolean` | `Boolean`     | `Boolean bool = true;`                  |
| `char`    | `Character`   | `Character c = 'A';`                    |

### Autoboxing y Unboxing

Java convierte automáticamente entre primitivos y wrappers:

```java
Integer numero2 = 4;              // Autoboxing: int -> Integer
int valor = numero2;              // Unboxing: Integer -> int
```

### Conversión entre tipos

Las clases wrapper proporcionan métodos de conversión:

```java
// String a Integer
Integer num = Integer.parseInt("123");

// Integer a Double
Integer entrada = 10;
Double resultado = Double.parseDouble(entrada.toString());

// Otras conversiones
String texto = numero2.toString();  // Integer -> String
```

---

## 2. La Clase String

`String` es una clase especial en Java que representa cadenas de texto inmutables.

### Características principales

- **Inmutabilidad**: Una vez creado, un `String` no puede modificarse
- **Pool de strings**: Java optimiza memoria reutilizando strings literales
- **Operador especial**: `+` concatena strings (sobrecarga de operador)

### Métodos útiles de String

```java
String texto = "Hola mama! salgo por la tele!";

// Longitud
int longitud = texto.length();

// Comparación (¡NO usar ==!)
if (operacion.equals("s")) { ... }

// División por delimitador
String nombreCompleto = "Alice Doe";
String[] partes = nombreCompleto.split(" ");
// partes[0] = "Alice"
// partes[1] = "Doe"

// Otras operaciones comunes
String mayusculas = texto.toUpperCase();
String minusculas = texto.toLowerCase();
boolean contiene = texto.contains("mama");
String subcadena = texto.substring(0, 4); // "Hola"
```

### ⚠️ Comparación de Strings

```java
// ❌ INCORRECTO (compara referencias)
if (operacion == "s") { ... }

// ✅ CORRECTO (compara contenido)
if (operacion.equals("s")) { ... }
```

---

## 3. Arrays Básicos

Los arrays son estructuras de datos que almacenan múltiples elementos del mismo tipo en posiciones contiguas de memoria.

### Declaración e inicialización

```java
// Array de enteros con tamaño fijo
int[] numeros = new int[10];

// Array de objetos
Persona[] personas = new Persona[10000];

// Array de strings con valores iniciales
String[] colores = {"rojo", "verde", "azul"};
```

### Acceso a elementos

```java
String[] arrEntrada = entrada.split(" ");

// Acceso por índice (empieza en 0)
String primero = arrEntrada[0];
String segundo = arrEntrada[1];

// Longitud del array
int cantidad = arrEntrada.length;  // ⚠️ Sin paréntesis (es un atributo, no un método)
```

### Iteración sobre arrays

#### Bucle for tradicional (con índice)

```java
for(int i = 0; i < arrEntrada.length; i++){
    System.out.println("has puesto: " + arrEntrada[i]);
}
```

#### Bucle for-each (iterador mejorado)

```java
// Más legible cuando no necesitas el índice
for (String s : arrEntrada) {
    suma += Integer.parseInt(s);
}

// Con objetos
for (Persona persona : personas) {
    persona.showIMC();
}
```

**Ventajas del for-each:**
- Código más limpio y legible
- No necesitas gestionar el índice manualmente
- Menos propenso a errores (no hay riesgo de `IndexOutOfBoundsException`)

**Cuándo usar for tradicional:**
- Cuando necesitas el índice
- Cuando necesitas modificar elementos del array
- Cuando quieres iterar con saltos o en orden inverso

---

## 4. Ejemplos Prácticos

Esta sesión incluye tres ejemplos que aplican los conceptos anteriores:

### Ejemplo 1: Calculadora con I/O

**Ubicación:** [`Calculadora/`](./Calculadora/)

**Objetivo:** Demostrar la evolución de código imperativo a orientado a objetos, y el concepto de encapsulamiento y acoplamiento.

#### Estructura del ejemplo

```
Calculadora/
├── Calculator.java    # Lógica de las operaciones matemáticas
├── Menu.java         # Encapsulación de I/O (versión básica)
├── Menu2.java        # Encapsulación de I/O (versión con formato)
└── Main.java         # Punto de entrada con tres versiones
```

#### Evolución del código

**Versión 1: Programación imperativa (comentada en Main)**

Todo el código está en `main()`: lectura de entrada, lógica de cálculo y salida mezclados.

```java
Scanner sc = new Scanner(System.in);
System.out.print("Pon un numero entero: ");
Integer entrada1 = sc.nextInt();
// ... más lectura

if (operacion.equals("s")){
    Integer resultado = entrada1 + entrada2;  // Lógica inline
    System.out.println(resultado);            // Salida inline
}
```

**Problemas:**
- ❌ Difícil de mantener (todo mezclado)
- ❌ Imposible reutilizar la lógica de cálculo
- ❌ Difícil de testear
- ❌ Alto acoplamiento con I/O

**Versión 2: Separación de responsabilidades con Calculator**

La lógica de cálculo se mueve a la clase `Calculator` con métodos estáticos.

```java
// Calculator.java
public class Calculator {
    static Integer suma(Integer a, Integer b){
        return a + b;
    }
    
    static Double division(Integer a, Integer b){
        Double d1 = Double.parseDouble(a.toString());
        Double d2 = Double.parseDouble(b.toString());
        return d1 / d2;
    }
    // ... otras operaciones
}

// Main.java
Integer result = Calculator.suma(entrada1, entrada2);
System.out.println("El resultado es: " + result);
```

**Mejoras:**
- ✅ Lógica reutilizable
- ✅ Más fácil de testear
- ⚠️ Pero aún hay acoplamiento con `System.out` y `Scanner`

**Versión 3: Encapsulamiento completo con Menu/Menu2 (versión activa)**

Se encapsula también el I/O en clases dedicadas.

```java
// Menu.java - Versión básica
public class Menu {
    Scanner sc;
    
    public Menu(){
        sc = new Scanner(System.in);
    }
    
    public void show(String s){
        System.out.println(s);
    }
    
    public Integer getInt(){
        return sc.nextInt();
    }
    
    public String getString(){
        return sc.next();
    }
}

// Main.java - Uso
Menu menu = new Menu();
menu.show("Pon un numero entero: ");
Integer entrada1 = menu.getInt();

Integer result = Calculator.suma(entrada1, entrada2);
menu.show("El resultado es: " + result);
```

**Concepto clave: Menu vs Menu2**

`Menu2` es una variante que cambia el **formato de salida** sin cambiar la interfaz:

```java
// Menu.java
public void show(String s){
    System.out.println(s);
}

// Menu2.java
public void show(String s){
    System.out.println("++" + s + "++");  // Formato diferente
}
```

**Beneficio:** Cambiando `Menu menu = new Menu();` por `Menu2 menu = new Menu2();` en Main, podemos cambiar completamente la presentación sin tocar la lógica. Esto demuestra **bajo acoplamiento** entre la lógica y la presentación.

#### Conceptos demostrados

- ✅ **Clases wrapper**: `Integer`, `Double`, `Float`, `Boolean`
- ✅ **Conversiones**: `parseInt()`, `parseDouble()`, `toString()`
- ✅ **Métodos estáticos**: `Calculator.suma()`, etc.
- ✅ **Encapsulamiento**: Separar I/O (`Menu`) de lógica (`Calculator`)
- ✅ **Bajo acoplamiento**: `Main` depende de interfaces, no de implementaciones específicas

---

### Ejemplo 2: Calculadora2 - String y Arrays

**Ubicación:** [`Calculadora2/`](./Calculadora2/)

**Objetivo:** Introducir manipulación de `String`, arrays y diferentes formas de iteración.

#### Funcionamiento

El programa pide números separados por espacios, los divide en un array y los suma usando dos técnicas de iteración diferentes.

```java
Scanner input = new Scanner(System.in);

System.out.println("Pon numeros separados por espacio");
String entrada = input.nextLine();  // Ejemplo: "10 20 30 40"

// División del string en array
String[] arrEntrada = entrada.split(" ");
// arrEntrada = ["10", "20", "30", "40"]

// Iteración 1: For tradicional con índice
for(int i = 0; i < arrEntrada.length; i++){
    System.out.println("has puesto: " + arrEntrada[i]);
}

// Suma con for tradicional
int suma = 0;
for(int i = 0; i < arrEntrada.length; i++){
    suma += Integer.parseInt(arrEntrada[i]);
}

// Suma con for-each (iterador mejorado)
int suma2 = 0;
for (String s : arrEntrada) {
    suma2 += Integer.parseInt(s);
}
```

#### Conceptos demostrados

- ✅ **Método `split()`**: Dividir strings en arrays
- ✅ **Arrays de String**: Trabajo básico con arrays
- ✅ **Iteración tradicional**: Bucle `for` con índice
- ✅ **Iterador for-each**: Sintaxis simplificada
- ✅ **Parsing de strings**: Convertir strings a enteros
- ✅ **Comparación de técnicas**: Dos formas de hacer lo mismo

#### Diferencias entre los bucles

| Aspecto | For tradicional | For-each |
|---------|----------------|----------|
| Sintaxis | `for(int i=0; i<arr.length; i++)` | `for(String s : arr)` |
| Acceso al índice | Sí | No |
| Legibilidad | Más verboso | Más limpio |
| Modificación array | Posible | No recomendado |
| Uso típico | Cuando necesitas índice | Solo lectura/procesamiento |

---

### Ejemplo 3: CalculadoraIndiceMasaCorporal - Encapsulación de Lógica

**Ubicación:** [`CalculadoraIndiceMasaCorporal/`](./CalculadoraIndiceMasaCorporal/)

**Objetivo:** Demostrar encapsulamiento de cálculo del IMC en una clase `Persona`, uso de `ArrayList` y lazy initialization.

#### Estructura del ejemplo

```
CalculadoraIndiceMasaCorporal/
├── Persona.java         # Encapsula datos y cálculo del IMC
├── CalculadoraIMC.java  # Utilidad estática para calcular IMC
└── Main.java            # Uso con ArrayList e iteración
```

#### Clase Persona

```java
public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private String nacionalidad;
    private Float peso;
    private Float estatura;
    
    private Float indiceDeMasaCorporal;  // Calculado bajo demanda
    
    public Persona(String nombreYApellido, Integer edad, 
                   String nacionalidad, Float peso, Float estatura){
        // Split del nombre completo
        this.nombre = nombreYApellido.split(" ")[0];
        this.apellido = nombreYApellido.split(" ")[1];
        
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    public void showIMC(){
        // Lazy initialization: calcula solo si no existe
        if (this.indiceDeMasaCorporal == null){
            this.indiceDeMasaCorporal = new Float(
                CalculadoraIMC.calcula(
                    new Double(this.peso), 
                    new Double(this.estatura)
                )
            );
        }
        System.out.println("IMC: " + this.indiceDeMasaCorporal);
    }
}
```

**Concepto clave: Lazy Initialization**

El IMC no se calcula en el constructor, sino la primera vez que se llama a `showIMC()`. Esto:
- ✅ Evita cálculos innecesarios si nunca se usa
- ✅ Cachea el resultado para llamadas posteriores
- ✅ Demuestra encapsulamiento (el usuario no sabe cuándo se calcula)

#### Clase CalculadoraIMC

```java
public class CalculadoraIMC {
    public static Double calcula(Double peso, Double altura){
        return peso / (altura * altura);
    }
}
```

Clase de utilidad con método estático. Podría estar dentro de `Persona`, pero se separa para:
- Reutilización en otros contextos
- Testeo independiente
- Separación de responsabilidades

#### Uso en Main con ArrayList

```java
ArrayList<Persona> personas = new ArrayList();

personas.add(new Persona("Alice Doe", 23, "Española", 100.0f, 1.0f));
personas.add(new Persona("Bob Doe", 45, "Española", 100.0f, 1.8f));
personas.add(new Persona("Charlie Doe", 45, "Española", 80.0f, 1.8f));

// Iteración con for-each
for (Persona persona : personas) {
    persona.showIMC();
}
```

**Diferencia con array tradicional:**

```java
// Array tradicional (tamaño fijo)
Persona[] personas = new Persona[10000];
personas[0] = new Persona(...);

// ArrayList (tamaño dinámico)
ArrayList<Persona> personas = new ArrayList();
personas.add(new Persona(...));  // Más flexible
```

#### Conceptos demostrados

- ✅ **String.split()**: Parsear nombre completo
- ✅ **Encapsulamiento**: Lógica de IMC dentro de `Persona`
- ✅ **Lazy initialization**: Cálculo bajo demanda
- ✅ **Métodos estáticos**: `CalculadoraIMC.calcula()`
- ✅ **ArrayList**: Colección dinámica de objetos
- ✅ **For-each con objetos**: Iteración sobre colección
- ✅ **Conversiones de tipos**: Float ↔ Double

---

## Resumen de Conceptos

### Clases Wrapper

| Concepto | Descripción | Ejemplo |
|----------|-------------|---------|
| Wrapper | Clase que envuelve un tipo primitivo | `Integer`, `Double`, `Boolean` |
| Autoboxing | Conversión automática primitivo → wrapper | `Integer n = 5;` |
| Unboxing | Conversión automática wrapper → primitivo | `int x = n;` |
| Parsing | Convertir String a tipo numérico | `Integer.parseInt("123")` |

### String

| Operación | Método | Ejemplo |
|-----------|--------|---------|
| Comparar contenido | `.equals()` | `if (s.equals("hola"))` |
| Dividir por delimitador | `.split()` | `"a b".split(" ")` → `["a", "b"]` |
| Longitud | `.length()` | `"hola".length()` → `4` |
| Convertir a String | `.toString()` | `num.toString()` |

### Arrays

| Concepto | Sintaxis | Nota |
|----------|----------|------|
| Declaración | `Tipo[] nombre` | Tamaño fijo |
| Creación | `new Tipo[tamaño]` | Todos los elementos inicializados |
| Acceso | `arr[indice]` | Índice empieza en 0 |
| Longitud | `arr.length` | ⚠️ Sin paréntesis |
| For tradicional | `for(int i=0; i<arr.length; i++)` | Con índice |
| For-each | `for(Tipo elem : arr)` | Sin índice, más legible |

### Patrones de Diseño Introducidos

| Patrón | Descripción | Ejemplo en sesión |
|--------|-------------|-------------------|
| Separación de responsabilidades | Dividir código según función | `Calculator` vs `Menu` |
| Encapsulamiento | Ocultar detalles de implementación | `Menu` esconde `Scanner` |
| Bajo acoplamiento | Depender de abstracciones, no implementaciones | `Main` puede usar `Menu` o `Menu2` |
| Lazy initialization | Calcular valores bajo demanda | `Persona.showIMC()` |
| Clase de utilidad | Métodos estáticos sin estado | `CalculadoraIMC` |

---

## Ejercicios Propuestos

1. **Calculadora mejorada**: Añade operaciones (potencia, raíz cuadrada) y manejo de errores (división por cero)

2. **Procesador de notas**: Lee una lista de notas separadas por comas, calcula media, máxima, mínima y muestra cuántas están aprobadas

3. **Gestor de IMC**: Extiende el ejemplo de IMC para:
   - Mostrar categoría (bajo peso, normal, sobrepeso, obesidad)
   - Permitir actualizar peso y recalcular
   - Guardar historial de mediciones

4. **Menu genérico**: Crea una clase `Menu` que pueda cambiar entre modo consola, modo archivo o modo gráfico sin cambiar `Main`

---

## Próxima sesión

En la sesión 7 profundizaremos en **Input/Output (I/O)** más avanzado:
- Lectura y escritura de archivos
- Gestión de excepciones en I/O
- Serialización de objetos
- Buenas prácticas en manejo de recursos

---
