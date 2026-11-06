# APE 5 - Manejo de Archivos y Flujos de Datos (java.io)

**Nombre:** Anthony Daniel Armas Jaya
**Curso:** 1er Semestre
**Carrera:** Ingeniería en Software
**Fecha:** 05/11/2026

## Descripción

Repositorio con los programas de la guía APE 5, módulo Manejo de Archivos y Flujos de Datos. Los ejercicios trabajan con las clases `File`, `FileWriter` y `BufferedWriter` del paquete `java.io`: comprobación de existencia, creación, escritura por líneas, modo append y eliminación de ficheros, con manejo de `IOException`.

## Estructura

```
APE5-Manejo-de-Archivos/
├── Ejercicio1MetadatosFile.java
├── Ejercicio2EscrituraBufferedWriter.java
├── Ejercicio3ModoAppendFileWriter.java
├── Ejercicio4CicloVidaYBorradoSeguro.java
└── README.md
```

## Requisitos

- JDK 11 o superior (se probó con OpenJDK 21)
- Terminal abierta en la carpeta del proyecto

## Compilación y ejecución

```bash
javac Ejercicio1MetadatosFile.java
java Ejercicio1MetadatosFile
```

Con JDK 11 o superior también se puede ejecutar directamente el archivo fuente:

```bash
java Ejercicio1MetadatosFile.java
```

El Ejercicio 3 requiere que el Ejercicio 2 se haya ejecutado antes, porque agrega contenido a `materias.txt`.

## Ejercicios

### Ejercicio 1 - Exploración y gestión de metadatos con File

Archivo: `Ejercicio1MetadatosFile.java`

Trabaja con la ruta `datos/prueba.txt`. Verifica con `exists()` si el recurso está disponible, lo crea con `createNewFile()` si no existe (dentro de un bloque `try-catch` para `IOException`) y muestra el nombre con `getName()` y la ruta con `getPath()`.

Salida en la primera ejecución:

```
El archivo fue creado correctamente.
Nombre del archivo: prueba.txt
Ruta del archivo: datos/prueba.txt
```

Salida en la segunda ejecución:

```
El archivo ya existe.
Nombre del archivo: prueba.txt
Ruta del archivo: datos/prueba.txt
```

### Ejercicio 2 - Escritura estructurada por líneas con BufferedWriter

Archivo: `Ejercicio2EscrituraBufferedWriter.java`

Crea `materias.txt` mediante un `BufferedWriter` enlazado con un `FileWriter`. Escribe cinco asignaturas y usa `newLine()` para dejar una por línea. El flujo se cierra con `close()` en el bloque `finally`.

Contenido de `materias.txt`:

```
Álgebra Lineal
Física
Lógica
Programación
Matemática Discreta
```

### Ejercicio 3 - Control del modo de apertura (append vs sobrescribir)

Archivo: `Ejercicio3ModoAppendFileWriter.java`

Abre `materias.txt` con `new FileWriter("materias.txt", true)`. El segundo parámetro en `true` activa el modo de adición, por lo que las dos nuevas asignaturas se agregan al final sin borrar el contenido anterior.

Contenido de `materias.txt` después de la ejecución:

```
Álgebra Lineal
Física
Lógica
Programación
Matemática Discreta
Inglés
Fundamentos de Software
```

### Ejercicio 4 - Ciclo de vida completo y borrado seguro

Archivo: `Ejercicio4CicloVidaYBorradoSeguro.java`

Representa `datos/temporal.txt` con un objeto `File`. Si no existe, lo crea controlando `IOException`. La variable `boolean confirmarBorrado = true;` simula la confirmación del usuario, y `delete()` solo se ejecuta cuando es verdadera. Al final imprime el resultado booleano de la eliminación.

Salida:

```
El archivo fue creado correctamente.
Resultado de la eliminación: true
```

## Notas

- Los programas crean la carpeta `datos` si no existe, porque `createNewFile()` falla cuando la carpeta contenedora no está creada.
- Los archivos de texto se guardan con la codificación predeterminada de Java. En Java 18 o superior es UTF-8, por lo que las tildes se conservan correctamente.
