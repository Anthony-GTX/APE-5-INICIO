# APE 5 - Manejo de Ficheros en Java

Programas en Java que practican operaciones básicas con archivos de texto: crear, escribir y eliminar.

## Datos del estudiante

- **Nombre:** Anthony Daniel Armas Jaya
- **Curso:** 1er Semestre
- **Carrera:** Ingeniería en Software

## Contenido del repositorio

| Archivo | Descripción |
|---|---|
| `Ejercicio1.java` | Crea el archivo `curso.txt` y avisa si ya existe. |
| `Ejercicio2.java` | Lee un mensaje por teclado y lo agrega al final de `estudiantes.txt`. |
| `Ejercicio3.java` | Elimina el archivo `estudiantes.txt`. |

## Clases y métodos utilizados

- `File`: `createNewFile()`, `getName()`, `delete()`
- `FileWriter`: `write()`, `close()` (modo `append` con `true`)
- `Scanner`: `nextLine()`
- `IOException` con `try-catch`

## Requisitos

- Java JDK 8 o superior (comprobar con `java -version` y `javac -version`)

## Compilar y ejecutar

```bash
javac Ejercicio1.java
java Ejercicio1
```

Se repite igual para `Ejercicio2` y `Ejercicio3`.

## Orden recomendado de ejecución

1. `Ejercicio1`: crea `curso.txt`.
2. Crear manualmente `estudiantes.txt` (el Ejercicio 2 requiere que ya exista).
3. `Ejercicio2`: guarda un mensaje en `estudiantes.txt`.
4. `Ejercicio3`: elimina `estudiantes.txt`.

## Ejemplo de salida

```
Archivo creado: curso.txt
```
```
Escribe un mensaje: Hola mundo
Información guardada correctamente.
```
```
Archivo eliminado: estudiantes.txt
```
