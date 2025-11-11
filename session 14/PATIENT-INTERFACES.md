# Ejercicio: Registro y ordenación de pacientes

## Contexto

Un centro de salud necesita mantener un registro de sus pacientes. Cada paciente tiene un nombre, una edad y un nivel de prioridad (de 1 a 5, siendo 1 la máxima urgencia).

El objetivo es implementar un sistema que permita añadir pacientes, listar todos y ordenarlos según distintos criterios.

## Requisitos

Crea la clase Paciente con los atributos:

- `String nombre`
- `int edad`
- `int prioridad (1 a 5)`

Implementa en la clase la interfaz Comparable:

- El método compareTo debe ordenar por prioridad ascendente (prioridad 1 va antes que prioridad 2).

- Si dos pacientes tienen la misma prioridad, ordénalos por edad descendente.

Sobrescribe `toString()` para mostrar la información de forma legible:

```java
@Override
public String toString() {
    return nombre + " (edad: " + edad + ", prioridad: " + prioridad + ")";
}
```

Crea una clase Main que contenga un ArrayList y un menú con las opciones:

```
1. Añadir paciente
2. Listar pacientes (orden de inserción)
3. Listar pacientes (orden natural = prioridad)
4. Listar pacientes (orden alfabético)
5. Salir
```

Para la opción 4, crea un Comparator que ordene por nombre:

```java
Comparator<Paciente> porNombre = Comparator.comparing(Paciente::getNombre);
```

Usa Collections.sort(lista) para aplicar el orden natural (por prioridad). Usa lista.sort(porNombre) para el orden alfabético.

```bash
Ejemplo de ejecución
1. Añadir paciente
2. Listar pacientes (orden de inserción)
3. Listar pacientes (orden por prioridad)
4. Listar pacientes (orden alfabético)
5. Salir
> 1

Nombre: Ana
Edad: 45
Prioridad (1-5): 3

> 1
Nombre: Luis
Edad: 60
Prioridad (1-5): 1

> 3

Listado por prioridad:
Luis (edad: 60, prioridad: 1)
Ana (edad: 45, prioridad: 3)
```
