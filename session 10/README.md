# Actividades

## The curse of laSalle island

En una vieja mansión victoriana, un jugador recorre distintas estancias en busca de una llave legendaria capaz de abrir la puerta principal, sellada desde hace siglos.  
Cada habitación oculta pistas, objetos y pasadizos secretos. Algunos ítems se pueden recoger, otros solo observar, y algunos pueden combinarse para crear herramientas nuevas.

El jugador dispone de un **inventario** donde guarda los objetos que va encontrando, y puede desplazarse por las **escenas** conectadas entre sí.  
Cada **escena** contiene varios ítems distribuidos en el espacio (sobre una mesa, dentro de un cofre, en una estantería…).  
El jugador puede interactuar con ellos: recogerlos, dejarlos o intentar combinarlos con otros.

Durante la partida, el jugador podrá moverse libremente entre las salas, siempre que exista una **conexión** entre ellas (por ejemplo, una puerta o un pasadizo).  
Algunos accesos podrían estar bloqueados, exigiendo resolver un enigma o fabricar un objeto determinado.

También existe un **recetario** (o libro de combinaciones) que define qué ítems pueden fusionarse para crear uno nuevo.


## Imagine pidgeons

Somos un grupo de música que queremos componer canciones pero no tenemos ni instrumentos ni presupuesto, sólo tenemos un ordenador con java e intelliJ (y un ámplio conocimiento de programación orientado a objetos).

Nuestro primer álbum queremos que tenga de 8 a 12 canciones.  Una canción está formada por una secuencia de sonidos, que pueden ser notas o silencios.
Cada sonido tiene una duración (en pulsos/“beats”), una amplitud (volumen) y un timbre (forma de onda: por ejemplo, seno, cuadrada, sierra o triángulo).
Las notas además tienen frecuencia (en Hz) o nombre y octava (por ejemplo, DO4, LA#3).
Los silencios no tienen frecuencia y su amplitud es nula.

El sistema debe permitir crear una canción con un BPM (pulsos por minuto), añadir sonidos a la secuencia y "reproducirla" en consola, mostrando qué ocurre en cada paso.

La duración real en milisegundos de cada sonido depende del BPM (1 beat = 60000/BPM ms).

### Sonidos

#### Nota musical

Necesitaremos:

- Duración en beats (por ejemplo, 1.0 = negra, 0.5 = corchea).
- Amplitud (0.0–1.0).
- Timbre (SINE, SQUARE, SAW, TRIANGLE).
- Frecuencia en Hz o nombre+octava (por ejemplo, DO4).
- Si se usa nombre+octava, la frecuencia se calculará automáticamente.

Al reproducir una nota se mostrará por pantalla:

```
Reproduciendo nota DO4 (261.63 Hz) durante 1.0 beats (600 ms) @0.80 [SINE]
```

La nota debe poder transponerse un número de semitonos (positivo o negativo).

#### Silencio

Necesitaremos:

- Duración en beats.
- Amplitud fija 0.0 (no suena).
- El timbre puede ignorarse o mostrarse como “—”.

Al reproducir un silencio se mostrará:

```
Silencio durante 0.5 beats (300 ms)
```

#### Canción

Una canción tiene:

- Título.
- BPM.
- Una lista ordenada de notas o silencios.

La canción podrá:

- Añadir sonidos a la secuencia.
- "Reproducir" la canción, mostrando cada paso.
- Calcular la duración total en segundos.
- Transponer toda la canción un número de semitonos.

##### Ejemplo de salida

```
Canción: "Creyente" @ 120 BPM

-> Reproduciendo nota LA3 (220.00 Hz) durante 1.0 beats (500 ms) @0.70 [SINE]
-> Reproduciendo nota MI4 (329.63 Hz) durante 1.0 beats (500 ms) @1.00 [SINE]
-> Reproduciendo nota RE4 (293.66 Hz) durante 1.0 beats (500 ms) @0.90 [SINE]
-> Reproduciendo nota RE4 (293.66 Hz) durante 0.5 beats (250 ms) @0.90 [SINE]
-> Reproduciendo nota DO4 (261.63 Hz) durante 0.5 beats (250 ms) @0.90 [SINE]

Duración total: 2 s
```

```
Canción: "Random" @ 100 BPM

-> Reproduciendo nota DO4 (261.63 Hz) durante 1.0 beats (600 ms) @0.80 [SINE]
-> Silencio durante 0.5 beats (300 ms)
-> Reproduciendo nota MI4 (329.63 Hz) durante 0.5 beats (300 ms) @0.70 [SQUARE]
-> Reproduciendo nota SOL4 (392.00 Hz) durante 2.0 beats (1200 ms) @0.90 [SINE]

Duración total: 2.4 s
```

```
Transponer canción "Random" +2 semitonos

-> Reproduciendo nota RE4 (293.66 Hz) durante 1.0 beats (600 ms) @0.80 [SINE]
-> Silencio durante 0.5 beats (300 ms)
-> Reproduciendo nota FA#4 (369.99 Hz) durante 0.5 beats (300 ms) @0.70 [SQUARE]
-> Reproduciendo nota LA4 (440.00 Hz) durante 2.0 beats (1200 ms) @0.90 [SINE]
```

**Detecta clases, atributos, métodos y relaciones. Crea el diagrama UML y el código java**