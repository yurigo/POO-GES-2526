# POO-GES-2526

# Session 1

## Paradigmas de programación

- [x] Programación imperativa
- [x] Programación funcional
- [x] Programación lógica
- [x] Programación orientada a objetos

## Introducción a la Programación orientada a objetos

### Definición

La Programación Orientada a Objetos (POO) es un paradigma de programación que se basa en el concepto de "objetos". Estos objetos pueden contener datos, en forma de atributos (propiedades), y código, en forma de métodos (funciones). La POO se centra en la creación y manipulación de estos objetos para modelar y resolver problemas del mundo real.

### Ventajas de la POO

- Los objetos son más fáciles de entender
- Los especialistas pueden comunicarse mejor
- Los datos y los procesos relacionados están agrupados
- Mayor capacidad de reutilización
- Es una metodología de programación probada y madura

### Conceptos básicos

- [x] Clase
- [x] Objeto

### Clase

Una clase es una plantilla o un molde que define las características y comportamientos comunes de un conjunto de objetos. Es una estructura que agrupa datos y funciones relacionadas.

### Objeto

Un objeto es una instancia de una clase. Es una entidad que combina datos y comportamiento. Los objetos tienen atributos (propiedades) y métodos (funciones) que definen su estado y comportamiento.

### Ejemplo

![class-object-instantiation](./assets/class-object-instantiation.png)

```java
class Moto{
    // Atributos
    String color;
    String marca;
    int velocidad;

    // Métodos
    void acelerar(int incremento){
        velocidad += incremento;
    }

    void frenar(int decremento){
        velocidad -= decremento;
    }
    void mostrarVelocidad(){
        System.out.println("Velocidad actual: " + velocidad + " km/h");
    }
```

```java
class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Moto
        Moto miMoto = new Moto();

        // Asignar valores a los atributos
        miMoto.color = "Rojo";
        miMoto.marca = "Yamaha";
        miMoto.velocidad = 0;

        // Usar los métodos del objeto
        miMoto.acelerar(50);
        miMoto.mostrarVelocidad(); // Velocidad actual: 50 km/h

        miMoto.frenar(20);
        miMoto.mostrarVelocidad(); // Velocidad actual: 30 km/h
    }
}
```

### Detectar clases y atributos

Las áreas de tipo producción gestionan una o varias cadenas de producción. Una cadena de producción sólo puede estar gestionada por una única área de producción. Las cadenas de producción presentan un estado, en funcionamiento o paro, producen productos y abastecen los almacenes. Un producto tiene un identificador numérico, un peso y un precio. Un almacén es gestionado por una única área comercial, mientras que un área comercial puede gestionar uno o varios almacenes al mismo tiempo. Un almacén está caracterizado por una capacidad y un porcentaje de ocupación.

![example-text-to-class](./assets/example-text-to-class.png)

### Code examples

- [Hospital](./session%2001/example%20Hospital)

# Session 2

## UML (Unified Modeling Language)

**UML** es un lenguaje de modelado estandarizado que permite representar de manera gráfica la estructura y el comportamiento de un sistema de software.  
No es un lenguaje de programación, sino una herramienta para **diseñar, visualizar y comunicar** cómo se organiza y funciona una aplicación antes (o durante) su implementación.

### Diagrama de Clases

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
  - [x] **Asociación**: conexión entre clases (ej. *Paciente – Médico*).  
  - [x] **Agregación**: relación débil de "todo-parte" (ej. *Hospital – Paciente*).  
  - [x] **Composición**: relación fuerte de "todo-parte", donde el ciclo de vida de la parte depende del todo (ej. *Historia clínica – Entrada médica*).  
  - [ ] **Herencia (Generalización)**: relación jerárquica (ej. *Usuario → Paciente / Médico*).  
  - [x] **Dependencia**: una clase usa a otra de forma temporal, sin necesidad de relación estructural (ej. *Médico → Receta*).  

### Beneficios de usar UML

- Facilita la **comunicación** entre desarrolladores, diseñadores y no técnicos.  
- Sirve como **documentación viva** del sistema.  
- Ayuda a **detectar errores de diseño** antes de programar.  
- Permite una **visión global** de la arquitectura del software.  

### Code examples

- [Point](./session%2002/example%20Point)
- [Company](./session%2002/example%20Company)
- [Moto](./session%2002/example%20Moto)
