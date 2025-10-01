# Constructores y Variables en Java

Esta sesión profundiza en la mejora del ejercicio del centro de salud usando constructores (sesión 4) y añade el estudio de miembros estáticos y tipos de variables.

## Constructor vs Método

| | constructor | método |
| - | - | - |
| tipo de retorno | no tiene | tiene un tipo de retorno |
| tipo de ejecucion | `new Clase` | `objeto.nombreMetodo` |
| finalidad | instanciar un objeto | realizar una operación, accion (lo que sea) |
| repetición | 1 sola vez (por objeto) | tantas veces como quiera (por objeto) |
| nombre | el nombre de la clase | el que yo quiera (excepto el nombre de la clase)
| retorno | instancia el objeto | lo que retorne el método |

---

## Miembros Estáticos (Static)

Los miembros **estáticos** pertenecen a la **clase**, no a las instancias individuales. Todos los objetos de esa clase comparten el mismo valor de un atributo estático.

### Variables estáticas

Se declaran con la palabra clave `static`. Útiles para:

- **Contadores globales**: llevar la cuenta de cuántos objetos se han creado
- **Configuraciones compartidas**: valores comunes a todas las instancias
- **Constantes de clase**: combinando `static final`

**Ejemplo en `Appointment`:**

```java
public class Appointment {
    private static int numAppointments; // Variable de clase (compartida)
    private final int id;               // Variable de instancia (única por objeto)
    
    public Appointment(Date date, Doctor doctor, Patient patient, Diagnosis diagnosis) {
        // ... otros atributos
        numAppointments++;              // Incrementa el contador de clase
        this.id = numAppointments;      // Asigna ID único basado en el contador
    }
}
```

En este ejemplo:
- `numAppointments` es compartido por todas las citas
- Cada vez que se crea una `Appointment`, se incrementa
- `id` es único para cada cita (copia del valor actual del contador)

### Métodos estáticos

Se declaran con `static` y pueden invocarse directamente desde la clase, sin necesidad de crear un objeto:

```java
public static int getNumAppointments() {
    return numAppointments;
}
```

**Uso:**

```java
System.out.println("Num appointments: " + Appointment.getNumAppointments());
```

**Restricciones de los métodos estáticos:**

- ❌ NO pueden acceder a atributos de instancia (no tienen `this`)
- ❌ NO pueden llamar a métodos de instancia directamente
- ✅ SÍ pueden acceder a otros miembros estáticos
- ✅ SÍ pueden recibir objetos como parámetros y trabajar con ellos

### Factory Methods (Métodos de Fábrica)

Un patrón útil que combina métodos estáticos con constructores privados para controlar la creación de objetos:

**Ejemplo en `Patient`:**

```java
public class Patient {
    // Constructor privado - no se puede llamar desde fuera
    private Patient(String name, String lastName, int cardNumber) {
        this.name = name;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
    }
    
    // Factory method público - forma controlada de crear objetos
    public static Patient createNewPatient(String name, String lastName, int cardNumber) {
        return new Patient(name, lastName, cardNumber);
    }
}
```

**Uso:**

```java
// ❌ Esto no funciona (constructor privado):
// Patient p = new Patient("John", "Doe", 123456722);

// ✅ Esto sí funciona (factory method):
Patient p = Patient.createNewPatient("John", "Doe", 123456722);
```

**Ventajas:**

- Control de la creación (validaciones, pools de objetos, caché, etc.)
- Nombres descriptivos (más claro que múltiples constructores)
- Posibilidad de devolver subtipos o instancias ya existentes

---

## Tipos de Variables

En Java existen diferentes modificadores y tipos de variables según su ámbito y comportamiento:

### 1. Variables de instancia (atributos)

Pertenecen a cada objeto individual. Cada instancia tiene su propia copia.

```java
public class Doctor {
    private String name;        // Variable de instancia
    private String specialty;   // Variable de instancia
}
```

### 2. Variables de clase (static)

Pertenecen a la clase. Todas las instancias comparten el mismo valor.

```java
public class Appointment {
    private static int numAppointments; // Variable de clase
}
```

### 3. Variables finales (final)

No pueden ser modificadas después de su inicialización. Útiles para valores inmutables.

```java
public class Appointment {
    private final int id;           // Constante de instancia
    private final Date date;        // Referencia inmutable (el objeto puede cambiar)
}
```

**Importante:** `final` en una referencia significa que la referencia no puede cambiar (no se puede reasignar), pero el objeto referenciado sí puede mutar (a menos que sea inmutable por diseño).

### 4. Constantes (static final)

Valores que no cambian y son compartidos por toda la clase. Convencionalmente se escriben en MAYÚSCULAS:

```java
public class Patient {
    private final String ESTO_ES_UNA_CONSTANTE = "NOMBRE";
}
```

O más típicamente:

```java
public class MathUtils {
    public static final double PI = 3.14159265359;
    public static final int MAX_ATTEMPTS = 3;
}
```

### 5. Variables locales

Se declaran dentro de métodos. Solo existen durante la ejecución del método:

```java
public void processAppointment() {
    Date now = new Date();      // Variable local
    int counter = 0;            // Variable local
}
```

### Resumen de modificadores

| Modificador      | Ubicación      | Compartido | Modificable | Uso típico                |
| ---------------- | -------------- | ---------- | ----------- | ------------------------- |
| (ninguno)        | Instancia      | No         | Sí          | Atributos normales        |
| `static`         | Clase          | Sí         | Sí          | Contadores, configuración |
| `final`          | Instancia      | No         | No          | Valores inmutables        |
| `static final`   | Clase          | Sí         | No          | Constantes globales       |

---

## Ejemplos de código

Esta sesión incluye dos ejemplos prácticos basados en el sistema de gestión de citas médicas:

### 1. Health Center con Constructores

Mejora del ejercicio de la sesión 3 añadiendo constructores robustos con validaciones.

- [Código fuente](./health-center-with-constructors/src/)

**Conceptos demostrados:**
- Constructores con parámetros
- Validación en constructores
- Uso de `this`
- Variables estáticas para contar citas

### 2. Health Center con Variables y Static

Extensión que profundiza en tipos de variables y miembros estáticos.

- [Código fuente](./health-center-variables-and-static/src/)

**Conceptos demostrados:**
- Variables `static` (contador de citas)
- Variables `final` (ID inmutable, fecha inmutable)
- Factory methods (creación controlada de pacientes)
- Constructores privados
- Constantes de instancia

**Ejemplo de ejecución:**

```java
Date now = new Date();
Doctor doc = new Doctor("Alice", "Doe", "Cardiologist", 12345);
Patient p = Patient.createNewPatient("John", "Doe", 123456722);
Diagnosis diagnosis = new Diagnosis("Está muy malito, voy a darle un ibuprofeno");

Appointment a = new Appointment(now, doc, p, diagnosis);
Appointment b = new Appointment(now, doc, p, diagnosis);
Appointment c = new Appointment(now, doc, p, diagnosis);

System.out.println("Num appointments: " + Appointment.getNumAppointments()); // Muestra: 3
```

---

## Resumen rápido

| Concepto               | Idea clave                                  | Ejemplo                                |
| ---------------------- | ------------------------------------------- | -------------------------------------- |
| Variable de instancia  | Cada objeto tiene su copia                  | `private String name;`                 |
| Variable estática      | Compartida por todos los objetos            | `private static int count;`            |
| Variable final         | No se puede reasignar                       | `private final int id;`                |
| Constante              | Valor fijo compartido                       | `public static final double PI = 3.14;`|
| Método estático        | Se invoca desde la clase                    | `Appointment.getNumAppointments()`     |
| Factory method         | Control de creación de objetos              | `Patient.createNewPatient(...)`        |
| Constructor privado    | Evita creación directa (solo via factory)   | `private Patient(...)`                 |

---
