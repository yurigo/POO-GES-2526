# Actividad de Herencia 

En un centro de salud se administran diferentes tipos de tratamientos a los pacientes.  Cada tratamiento tiene una duración y un coste, peros según el tipo, la manera de aplicarlo y su cálculo final varían.

Tratamientos:
- Medicamento
- Físico
- Quirurgico

## Tratamiento médico

Necesitaremos saber la dosis diaria.
El coste total se calcula como coste base por los dias de duración por la dosis diaria
Al aplicar este tratamiento deberemos mostrar por pantalla:

```
Administrando medicación 3 veces al dia durante 5 días.
```

## Tratamiento físico

Necesitaremos conocer las sesiones.
El coste total se calcula como el coste base por las sesiones realizadas.
Al aplicar este tratamiento deberemos mostrar por pantalla:

```
Aplicando sesión de fisioterapia número 3
```

## Tratamiento quirúrgico

Necesitaremos conocer si se requiere o no anestesia.
Si requiere anestesia, el coste total se incrementa un 20%.
Al aplicar este tratamiento deberemos mostrar por pantalla:

```
Realizando intervención quirúrgica con anestesia general.
```


## Ejemplo de salida:

```
Tratamiento: ibuprofeno (5 días)
-> Administrando medicación 3 veces al día durante 5 días.
-> Coste total: 150.0€

Tratamiento: Rehabilitación rodilla (10 días)
-> Aplicando sesión de fisioterapia nº10.
-> Coste total: 500.0€

Tratamiento: Cirugía apendicitis
-> Realizando intervención qurúrgica con anestesia general.
-> Coste total: 1200.0€
```