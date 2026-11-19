# Práctica 1: Ordenamiento Natural y Comparadores en Java

* **Autores:** Bruno Isaac Obelencio Merchán, Ismael Alejandro Pauta Sotelo
* **Carrera:** Ingeniería en Ciencias de la Computación — Universidad Politécnica Salesiana
* **Objetivo:** Implementar el ordenamiento natural mediante la interfaz `Comparable` y criterios de ordenamiento personalizados utilizando `Comparator`, expresiones lambda, referencias a métodos y encadenamiento (`thenComparing`, `reversed`) sobre colecciones en Java[cite: 1, 4].
* **Versión del JDK:** Java 8 (1.8.0_491)

---

## Estructura del Proyecto

```text
icc-est-u1-Practica1/
├── evidencias/
│   ├── c1_codigo.png
│   ├── c1_consola.png
│   ├── c2_codigo.png
│   ├── c2_consola.png
│   ├── c3_codigo.png
│   ├── c3_consola.png
│   ├── c4_codigo.png
│   ├── c4_consola.png
│   ├── c5_codigo.png
│   ├── c5_consola.png
│   ├── c6_codigo.png
│   ├── c6_consola.png
│   ├── c7_codigo.png
│   ├── c7_consola.png
│   ├── salidas_consola.txt
│   └── README.md
├── EXPLICACION/
│   └── ExplicacionC4-C5.md
├── src/
│   ├── models/
│   │   └── Estudiante.java
│   ├── App.java
│   └── Comparadores.java
└── README.md
```

---

## Comandos de Compilación y Ejecución

Desde la carpeta raíz del proyecto (`icc-est-u1-Practica1`), ejecuta los siguientes comandos en la terminal[cite: 7]:

```bash
# 1. Compilar los archivos fuente hacia la carpeta bin
javac -d bin src/models/Estudiante.java src/Comparadores.java src/App.java

# 2. Ejecutar la clase principal
java -cp bin App
```

---

## Tabla de Consultas (C1–C7)

| ID | Criterio de Ordenamiento | Método en el Proyecto | Implementación Técnica |
| :--- | :--- | :--- | :--- |
| **C1** | Código ascendente (Orden natural)[cite: 4] | `Estudiante.compareTo()` / `Comparadores.c1()` | Implementación de `Comparable<Estudiante>` en el modelo y ordenamiento sobre copia de la lista[cite: 1, 4]. |
| **C2** | Nombre ascendente; código ascendente[cite: 4] | `Comparadores.c2()` | `Comparator` mediante expresión lambda de dos parámetros `(e1, e2)` con desempate condicional[cite: 4]. |
| **C3** | Nota ascendente, sin desempate[cite: 4] | `Comparadores.c3()` | `Comparator.comparingDouble(Estudiante::getNota)` usando referencia a método[cite: 4]. |
| **C4** | Nota descendente; nombre ascendente | `Comparadores.c4()` | `Comparator.comparingDouble(Estudiante::getNota).reversed().thenComparing(Estudiante::getNombre)` |
| **C5** | Edad ascendente; nombre descendente | `Comparadores.c5()` | `Comparator.comparingInt(Estudiante::getEdad).thenComparing(Estudiante::getNombre, Comparator.reverseOrder())` |
| **C6** | Carrera asc; nota desc; nombre asc; código asc | `Comparadores.c6()` | Encadenamiento múltiple con `comparing`, `thenComparing` con `reversed()` y criterios de desempate. |
| **C7** | Nota ajustada desc (`+0.5` a Computación, máx. `10.0`); nombre asc; código asc | `Comparadores.c7()` | `ToDoubleFunction<Estudiante>` con ajuste condicional, `comparingDouble(ajustada).reversed()` y desempate. |

---

## Evidencias y Pruebas

Las capturas de código, salidas reales de consola y la tabla completa de verificación de escenarios (`C1–C7`) se encuentran documentadas en la carpeta [evidencias/](evidencias/README.md)[cite: 7].

---

## Conclusiones

1. *Esta práctica se basa en separar el orden natural de una clase usando comparable de los criterios externos con comparator, siendo bastante útil si se necesita ordenar los mismos datos de distinta forma sin alterar el código ni la lista original, sea nota ascendente, descendente, ajustada, etc. Además probar la estabilidad ayuda a confirmar que el algoritmo funciona adecuadamente y como se espera*
2. *Los criterios de desempate se usan para definir un orden claro cuando varios registros coinciden en el primer campo. En C2 hay tres Ana según la lista original, si se ordenara solo por nombre, conservarían ese orden de entrada, mientras que al añadir el código ascendente como segundo criterio pasan a quedar E005, E010 y E014. Algo parecido se ve al revisar los estudiantes con nota 8.5 entre C3 y C4 en C3, al no haber desempate, mantienen su orden de entrada, mientras que en C4 el criterio secundario por nombre los reordena y entre las Ana de ese grupo vuelve a notarse que no hay desempate por código y queda sujeto al orden de entrada*
3. *La estabilidad se nota al revisar los registros con nota 8.5 en C3, donde salen en el orden E014, E007, E005, E008 y E010, respetando cómo venían en la lista. También se ve en la prueba de C4 con E014, E005 y E010, que mantienen su secuencia porque empatan tanto en nota como en nombre. Cuando el comparador dice que dos elementos son iguales, no hace falta reordenarlos y se respeta el orden de entrada de esa consulta, que es justo respecto a dónde se mide la estabilidad.*
