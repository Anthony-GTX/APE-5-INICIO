# APE 5 – Manejo de archivos en Java

Actividad práctica experimental (APE 5, primera parte) de la asignatura de programación. Reúne seis programas en Java que trabajan con archivos de texto: crear, escribir, agregar información (*append*) y eliminar, usando `File`, `FileWriter`, `BufferedWriter` y `Scanner`.

## Autor

| | |
|---|---|
| **Nombre** | Anthony Daniel Armas Jaya |
| **Curso** | 1er Semestre |
| **Carrera** | Ingeniería en Software |
| **Fecha** | 05/11/2026 |

## Estructura del repositorio

```
APE-5-INICIO/
├── p1_e1/CrearFichero.java
├── p1_e2/EscribirFichero.java
├── p1_e3/EliminarFichero.java
├── p2_e1/RegistroEstudiantes.java
├── p2_e2/RegistroProductos.java
├── p2_e3/RegistroVentas.java
├── APE5_Anthony_Armas.pdf
└── README.md
```

`p1` = Parte 1 (Ejercicios APE) · `p2` = Parte 2 (Ejercicios de APE clase 2) · `eN` = número de ejercicio.

## Ejercicios

### Parte 1 – Ejercicios APE

| # | Programa | Descripción | Conceptos clave |
|---|----------|-------------|-----------------|
| 1 | [`CrearFichero`](p1_e1/CrearFichero.java) | Crea `curso.txt`, indica si se creó o ya existía y muestra su nombre. | `File`, `createNewFile()`, `getName()`, `try-catch` |
| 2 | [`EscribirFichero`](p1_e2/EscribirFichero.java) | Lee un mensaje por teclado y lo agrega al final de `estudiantes.txt` (debe existir). | `Scanner`, `FileWriter(…, true)`, `write()`, `close()` |
| 3 | [`EliminarFichero`](p1_e3/EliminarFichero.java) | Elimina `estudiantes.txt` y confirma el resultado. | `File`, `delete()`, `if-else` |

### Parte 2 – Ejercicios de APE clase 2

| # | Programa | Descripción | Conceptos clave |
|---|----------|-------------|-----------------|
| 1 | [`RegistroEstudiantes`](p2_e1/RegistroEstudiantes.java) | Registra 3 estudiantes en `estudiantes.txt` (nombre y calificación, dos líneas cada uno). | `Scanner`, `BufferedWriter`, `FileWriter`, `finally` |
| 2 | [`RegistroProductos`](p2_e2/RegistroProductos.java) | Registra productos con precio y cantidad, calcula el valor total y lo guarda en `productos.txt` sin borrar los anteriores. | `BufferedWriter`, modo *append*, cálculo `precio × cantidad` |
| 3 | [`RegistroVentas`](p2_e3/RegistroVentas.java) | Registra ventas hasta escribir `fin`; aplica 10 % de descuento si el subtotal es ≥ $100 y guarda el total acumulado en `ventas.txt`. | `while`, condicionales, *append*, acumuladores |

## Requisitos

- Java JDK 8 o superior (`java -version` y `javac -version` para comprobarlo).
- Una terminal, o un IDE como IntelliJ IDEA, NetBeans, Eclipse o VS Code.

## Cómo compilar y ejecutar

Cada ejercicio es independiente. Por ejemplo, para el ejercicio 3 de la Parte 2:

```bash
cd p2_e3
javac RegistroVentas.java
java RegistroVentas
```

Los archivos `.txt` se generan en la carpeta desde la que se ejecuta el programa.

> **Orden recomendado para la Parte 1:** ejecuta primero `CrearFichero`; luego crea o copia un `estudiantes.txt` en la carpeta de `EscribirFichero` (el enunciado exige que exista); por último ejecuta `EliminarFichero` en la carpeta donde está `estudiantes.txt`.

## Ejemplos de ejecución

**Registro de ventas (`RegistroVentas`)**

```
Nombre del producto (o 'fin' para terminar): Cuaderno
Precio: 2.5
Cantidad vendida: 10
Subtotal: $25.00 | Descuento: $0.00 | Total a pagar: $25.00
Nombre del producto (o 'fin' para terminar): Laptop
Precio: 450
Cantidad vendida: 1
Subtotal: $450.00 | Descuento: $45.00 | Total a pagar: $405.00
Nombre del producto (o 'fin' para terminar): fin
Total acumulado de ventas: $430.00
```

Contenido resultante de `ventas.txt`:

```
Producto: Cuaderno | Subtotal: $25.00 | Descuento: $0.00 | Total: $25.00
Producto: Laptop | Subtotal: $450.00 | Descuento: $45.00 | Total: $405.00
TOTAL ACUMULADO DE VENTAS: $430.00
```

**Registro de productos (`RegistroProductos`)**

```
Nombre del producto: Teclado
Precio: 25.50
Cantidad disponible: 10
Producto guardado. Valor total: $255.00
```

Contenido de `productos.txt` tras dos ejecuciones (se conserva el registro anterior):

```
Producto: Teclado | Precio: $25.50 | Cantidad: 10 | Valor total: $255.00
Producto: Mouse | Precio: $12.00 | Cantidad: 5 | Valor total: $60.00
```

## Entrega

El documento [`APE5_Anthony_Armas.pdf`](APE5_Anthony_Armas.pdf) incluye el código y la salida de cada uno de los seis programas.
