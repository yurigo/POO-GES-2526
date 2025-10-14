# AC1 – Sensors biomètrics

## Processament de mesures de sensors biomètrics

> En un laboratori s’estan recollint mesures de sensors biomètrics (per exemple, temperatura, pols, SpO₂). Disposem d’un fitxer mesures.csv amb dades inicials que volem llegir, llistar, representar en consola i ampliar amb noves mesures introduïdes per teclat.
> 
> Implementaràs la classe Mesura i una aplicació de consola amb menú.

### 1) Classe Mesura
Atributs mínims:

```
id (enter) → autoincremental i únic per instància.
tipus (String) → p. ex. TEMPERATURA, POLS, SPO2.
valor (double) → p. ex. 36.7, 72.0, 97.0.
unitat (String) → p. ex. ºC, bpm, %.
instant (String) → format simple ISO, p. ex. 2025-10-01 10:30.
```
Requisits:

Control d’id autoincremental amb un camp de classe (static).
Dos constructors:
Amb paràmetres (tipus, valor, unitat, instant).
Que permeti construir a partir d’una línia del CSV (ignorant les línies que comencin per #).
Mètodes bàsics (toString(), getters/setters amb validacions).

### 2) Aplicació de consola (menú)

En engegar, el sistema carrega mesures.csv i mostra:

```bash
■■■ Sensors ■■■
1. Llistar mesures
2. Representació ASCII
3. Afegir mesura
4. Buscar per tipus
5. Sortir

Escull una opció:
```

#### Opcions

##### Llistar mesures

Mostra totes les mesures amb format:

```
■ <id>: <tipus> = <valor><unitat> @ <instant>
```

Representació ASCII (resum per tipus)

- Es mostra un “gràfic de barres” per cada tipus de sensor.

- Es pot triar estratègia:

- Últim valor registrat, o
- Mitjana de totes les mesures d’aquell tipus.

Escala senzilla:

- TEMPERATURA (35–40 ºC → cada 0.5 ºC = “#”)
- POLS (40–180 bpm → cada 10 bpm = “#”)
- SPO2 (80–100 % → cada 2 % = “#”)

Exemple:

```
T: #### (36.8 ºC)
P: ### (68.5 bpm)
S: ######### (96 %)
```

##### Afegir mesura

- Demana dades per teclat (tipus, valor, unitat, instant).
- Valida: tipus vàlid (TEMPERATURA|POLS|SPO2), valor numèric, unitat coherent, instant amb format plausible.
- Assigna id automàtic i guarda al CSV.

##### Buscar per tipus

Demana un tipus i mostra totes les mesures d’aquell tipus.

Exemple:

```
Tipus: TEMPERATURA
■ 1: TEMPERATURA = 36.7ºC @ 2025-09-30 10:15
■ 4: TEMPERATURA = 37.2ºC @ 2025-09-30 11:00
■ 7: TEMPERATURA = 36.5ºC @ 2025-09-30 12:20
```

#### Sortir

Finalitza l’aplicació.

 
### 3) Fitxer mesures.csv

Format:

```
id,tipus,valor,unitat,instant
```

Exemple inicial:

```
# id,tipus,valor,unitat,instant
1,TEMPERATURA,36.7,ºC,2025-09-30 10:15
2,POLS,72,bpm,2025-09-30 10:16
3,SPO2,97,%,2025-09-30 10:17
# aqui hi ha un comentari
4,TEMPERATURA,37.2,ºC,2025-09-30 11:00
5,POLS,65,bpm,2025-09-30 11:05
6,SPO2,95,%,2025-09-30 11:10
7,TEMPERATURA,36.5,ºC,2025-09-30 12:20
```

### 4) Lliurament

Data límit: 20/10/2025 a les 23:55.

Entrega un ZIP amb el projecte IntelliJ que contindrà, com a minim:

- Mesura.java i Main.java.
- Fitxer mesures.csv (dades inicials + noves).
- Diagrama UML de la classe Mesura.
- README amb breu explicació de decisions (estratègia ASCII, validacions, etc.).