### Criterios de Ordenamiento con `Comparator`

* **C4 (Nota descendente; Nombre ascendente):**
  El método `reversed()` invierte todo lo que ya está armado hasta ese punto en la cadena. Como se llama justo después de `comparingDouble(Estudiante::getNota)`, solo se invierte el orden de la nota. El nombre se agrega después con `thenComparing()`, manteniéndose ascendente (si se pusiera `reversed()` al final, también invertiría el nombre).

* **C5 (Edad ascendente; Nombre descendente):**
  Aquí un solo `reversed()` al final no sirve, porque invertiría también la edad. Por eso el segundo criterio lleva su propio sentido mediante `thenComparing(Estudiante::getNombre, Comparator.reverseOrder())`. De esta forma, la edad permanece ascendente y únicamente el desempate por nombre va en orden inverso.