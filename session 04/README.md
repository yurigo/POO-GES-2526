# Constructores, Paso de Parámetros y `this` en Java

## 1. Constructores

Un **constructor** es un método especial que se ejecuta automáticamente al crear un objeto con `new`. Su función principal es **inicializar el estado** (atributos) del objeto.

Características clave:

- Tiene el mismo nombre que la clase.
- No tiene tipo de retorno (ni siquiera `void`).
- Se invoca con `new Clase(...)`.

### 1.1. Constructor por defecto (implícito)

Si no defines ningún constructor, Java genera uno vacío (sin parámetros) que no inicializa atributos (quedan con valores por defecto: `0`, `false`, `null`, etc.). En cuanto defines **cualquier** constructor, el constructor por defecto deja de generarse automáticamente.

### 1.2. Constructor con parámetros (personalizado)

Ejemplo real de `Pokemon`:

```java
public Pokemon(int idPokedex,
			   String nickname,
			   String specie,
			   String type1,
			   String type2,
			   int hp,
			   int lvl){
	this.idPokedex = idPokedex;
	this.nickname = nickname;
	this.specie = specie;
	this.typePrimary = type1;
	this.typeSecondary = type2;
	this.hp = hp;

	if (lvl > 100){
		this.lvl = 100;      // Normalizamos el nivel máximo
	} else {
		this.lvl = lvl;
	}
}
```

Ventajas frente a crear el objeto vacío y usar muchos `setters`: el objeto queda listo y válido desde el inicio (menor riesgo de estados incompletos).

Ejemplo en `Main` (creación):

```java
Pokemon pikachu = new Pokemon(25, "pikachu", "Pikachu", "Electric", null, 300, 555);
```

Aquí el nivel pedido es 555 pero se limita a 100 dentro del constructor.

### 1.3. Constructor en `Trainer`

```java
public Trainer(int id, int lvl, String name){
	this.id = id;
	this.lvl = lvl;
	this.name = name;
}
```

Observa el uso de `this` para diferenciar atributos de parámetros con el mismo nombre.

### 1.4. Sobrecarga de constructores (idea para extender)

Podrías añadir múltiples constructores con distinta lista de parámetros:

```java
public Trainer(int id, String name){
	this(id, 1, name); // Llama al constructor principal (chaining)
}
```

Esto permite ofrecer valores por defecto de forma limpia. (Actualmente no está implementado, pero es una mejora sugerida.)

### 1.5. Buenas prácticas en constructores

- Validar rangos (como el nivel máximo).
- Evitar lógica pesada (no conectarse a BD, no leer ficheros extensos).
- Mantener invariante del objeto: si algo es obligatorio, exigirlo en parámetros.
- Si la lista de parámetros es muy larga, evaluar patrón Builder o agrupar datos en otra clase.

---

## 2. Paso de Parámetros en Java

En Java **todo** se pasa **por valor**. Lo que cambia es _qué valor_ se copia:

- Para tipos primitivos (`int`, `double`, `boolean` ...): se copia directamente el valor numérico / booleano.
- Para objetos: se copia la **referencia** al objeto (el puntero), NO se clona el objeto. Por eso, dentro del método podemos modificar el estado del objeto referenciado, pero no podemos cambiar qué objeto ve el llamador reasignando la variable local.

### 2.1. Ejemplo

Cuando haces:

```java
ash.setP1(pikachu);
```

Se pasa por valor la referencia a `pikachu`; dentro de `setP1` se asigna al atributo `this.p1`. Ahora ambos (`pikachu` y `ash.p1`) apuntan al mismo objeto. Si ese objeto cambia (por ejemplo `pikachu.show()` mostraría actualizaciones), ambos lo "ven".

### 2.2. Implicaciones

- No existe el "paso por referencia" al estilo de C++ (no se puede hacer que un método reasigne la variable del llamador).
- Para simular que un método devuelva múltiples cosas, se usan objetos contenedores o se retorna un objeto/modificación interna.
- Mutabilidad importa: si quieres evitar modificaciones inesperadas, haz objetos inmutables (atributos `final`, sin setters) o copia defensiva.

---

## 3. La referencia `this`

`this` es una palabra clave que hace referencia al **objeto actual** (la instancia sobre la que se invoca el método / constructor).

Usos principales:

1. Diferenciar atributos de parámetros con el mismo nombre:
   ```java
   this.name = name; // atributo = parámetro
   ```
2. Pasar el propio objeto a otro método:
   ```java
   registrar(this);
   ```
3. Encadenar constructores dentro de la misma clase (`this(...)`), y debe ser la primera línea del constructor.
4. Devolver la instancia actual para permitir un estilo fluido (builder / chaining):
   ```java
   return this;
   ```

### 3.1. Ejemplo en `Trainer`

```java
public void show(){
	System.out.println("ID: " + this.id);
	// Uso explícito de this (no obligatorio, pero hace claro que son atributos)
}
```

Podrías omitir `this.` salvo que haya ambigüedad, pero usarlo mejora la legibilidad y evita errores cuando los parámetros comparten nombre.

### 3.2. Ejemplo de encadenamiento (no implementado aún)

```java
public Trainer(int id, String name){
	this(id, 1, name); // Llama al constructor principal
}
```

---

## 4. Resumen rápido

| Concepto                  | Idea clave                             | Ejemplo                           |
| ------------------------- | -------------------------------------- | --------------------------------- |
| Constructor               | Inicializa objeto                      | `new Pokemon(25, "pikachu", ...)` |
| Validación en constructor | Garantiza invariantes                  | Límite `lvl <= 100`               |
| Paso de parámetros        | Siempre por valor                      | Copia de referencia para objetos  |
| Efecto en objetos         | Modificar atributos afecta al original | `ash.setP1(pikachu)`              |
| `this`                    | Referencia a la instancia actual       | `this.id = id;`                   |
| `this(...)`               | Llamar a otro constructor              | `this(id, 1, name);`              |

---
