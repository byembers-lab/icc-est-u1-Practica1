# Evidencias y Tabla de Pruebas

## 1. Tabla de Pruebas (C1–C7)

| Escenario | Resultado Esperado | Resultado Obtenido | Estado |
| :--- | :--- | :--- | :--- |
| **C1:** Código ascendente (Orden natural con `Comparable`)[cite: 4] | Lista ordenada de `E001` (Sofia) a `E020` (Carlos) sin alterar el orden de la lista original `estudiantes`[cite: 1, 2]. | Se imprimieron los 20 registros ordenados estrictamente de `E001` a `E020`. | Aprobado |
| **C2:** Nombre ascendente; código ascendente (`Comparator` lambda)[cite: 4] | Nombres ordenados alfabéticamente de `Ana` a `Sofia`. En empates (`Ana` y `Luis`), ordenados por código (`E005`, `E010`, `E014` y `E003`, `E013`)[cite: 2]. | Nombres ordenados de `Ana` a `Sofia`; empates de `Ana` y `Luis` resueltos por código ascendente. | Aprobado |
| **C3:** Nota ascendente, sin desempate (`comparingDouble`)[cite: 4] | Estudiantes ordenados de menor a mayor nota (`6.8` a `9.5`), conservando su orden relativo original cuando tienen la misma nota[cite: 2, 4]. | Lista ordenada desde `Diego` y `Sara` (`6.8`) hasta `Sofia`, `Pablo` y `Andres` (`9.5`), manteniendo el orden relativo en empates. | Aprobado |
| **C4:** Nota descendente; nombre ascendente | Estudiantes ordenados de mayor a menor nota (`9.5` a `6.8`), desempatando por nombre alfabético (`Andres`, `Pablo`, `Sofia` en `9.5`)[cite: 2]. | Encabezado por `Andres`, `Pablo` y `Sofia` (`9.5`) y finalizado por `Diego` y `Sara` (`6.8`). | Aprobado |
| **C5:** Edad ascendente; nombre descendente | Estudiantes ordenados de `18` a `22` años; en empate de edad (ej. `18` años), nombres en orden inverso (`Sofia`, `Mateo`, `Diana`)[cite: 2]. | Primeros registros de 18 años en orden inverso (`Sofia`, `Mateo`, `Diana`) hasta los de 22 años (`Elena`, `Diego`, `Bruno`). | Aprobado |
| **C6:** Carrera asc; nota desc; nombre asc; código asc | Agrupados por carrera (`Computacion`, `Electronica`, `Mecatronica`), dentro de cada carrera de mayor a menor nota, luego por nombre y código[cite: 2]. | Agrupación por carrera verificada; en `Computacion` lidera `Sofia` (`9.5`) y `Ana` (`8.5`) se ordena `E005`, `E010`, `E014`. | Aprobado |
| **C7:** Nota ajustada (`+0.5` a Computación, máx. `10.0`) desc; nombre asc; código asc | A los estudiantes de `Computacion` se les suma `+0.5` (`Sofia` sube a `10.0`, `Maria` a `9.7`, `Ana` a `9.0`) y se ordena descendente[cite: 2]. | `Sofia` (`10.0` ajustada) queda primera sobre `Maria` (`9.7` ajustada) y los `9.5` de `Electronica` (`Andres`, `Pablo`). | Aprobado |

---

## 2. Capturas de Ejecución (C1)
* **Código implementado:** [c1_codigo.png](c1_codigo.png)[cite: 8]
* **Salida en consola:** [c1_consola.png](c1_consola.png)[cite: 8]

---

## 3. Salidas Reales de Consola (C1–C7)

```text
--- c1 Codigo Orden natural con intefaces Comparable ---
Estudiante [codigo=E001, nombre=Sofia, edad=18, nota=9.5, carrera=Computacion]
Estudiante [codigo=E002, nombre=Elena, edad=22, nota=8.0, carrera=Mecatronica]
Estudiante [codigo=E003, nombre=Luis, edad=19, nota=7.8, carrera=Electronica]
Estudiante [codigo=E004, nombre=Diana, edad=18, nota=9.2, carrera=Electronica]
Estudiante [codigo=E005, nombre=Ana, edad=19, nota=8.5, carrera=Computacion]
Estudiante [codigo=E006, nombre=Sara, edad=19, nota=6.8, carrera=Computacion]
Estudiante [codigo=E007, nombre=Pedro, edad=20, nota=8.5, carrera=Mecatronica]
Estudiante [codigo=E008, nombre=Carla, edad=21, nota=8.5, carrera=Mecatronica]
Estudiante [codigo=E009, nombre=Lucia, edad=20, nota=9.2, carrera=Electronica]
Estudiante [codigo=E010, nombre=Ana, edad=20, nota=8.5, carrera=Computacion]
Estudiante [codigo=E011, nombre=Pablo, edad=21, nota=9.5, carrera=Electronica]
Estudiante [codigo=E012, nombre=Diego, edad=22, nota=6.8, carrera=Electronica]
Estudiante [codigo=E013, nombre=Luis, edad=19, nota=7.8, carrera=Electronica]
Estudiante [codigo=E014, nombre=Ana, edad=20, nota=8.5, carrera=Computacion]
Estudiante [codigo=E015, nombre=Bruno, edad=22, nota=7.0, carrera=Computacion]
Estudiante [codigo=E016, nombre=Mateo, edad=18, nota=7.0, carrera=Computacion]
Estudiante [codigo=E017, nombre=Andres, edad=19, nota=9.5, carrera=Electronica]
Estudiante [codigo=E018, nombre=Maria, edad=21, nota=9.2, carrera=Computacion]
Estudiante [codigo=E019, nombre=Juan, edad=20, nota=8.0, carrera=Mecatronica]
Estudiante [codigo=E020, nombre=Carlos, edad=21, nota=7.8, carrera=Mecatronica]

--- c2 Nombre ascendente, codigo ascendete comparator lambda ---
Estudiante [codigo=E005, nombre=Ana, edad=19, nota=8.5, carrera=Computacion]
Estudiante [codigo=E010, nombre=Ana, edad=20, nota=8.5, carrera=Computacion]
Estudiante [codigo=E014, nombre=Ana, edad=20, nota=8.5, carrera=Computacion]
Estudiante [codigo=E017, nombre=Andres, edad=19, nota=9.5, carrera=Electronica]
Estudiante [codigo=E015, nombre=Bruno, edad=22, nota=7.0, carrera=Computacion]
Estudiante [codigo=E008, nombre=Carla, edad=21, nota=8.5, carrera=Mecatronica]
Estudiante [codigo=E020, nombre=Carlos, edad=21, nota=7.8, carrera=Mecatronica]
Estudiante [codigo=E004, nombre=Diana, edad=18, nota=9.2, carrera=Electronica]
Estudiante [codigo=E012, nombre=Diego, edad=22, nota=6.8, carrera=Electronica]
Estudiante [codigo=E002, nombre=Elena, edad=22, nota=8.0, carrera=Mecatronica]
Estudiante [codigo=E019, nombre=Juan, edad=20, nota=8.0, carrera=Mecatronica]
Estudiante [codigo=E009, nombre=Lucia, edad=20, nota=9.2, carrera=Electronica]
Estudiante [codigo=E003, nombre=Luis, edad=19, nota=7.8, carrera=Electronica]
Estudiante [codigo=E013, nombre=Luis, edad=19, nota=7.8, carrera=Electronica]
Estudiante [codigo=E018, nombre=Maria, edad=21, nota=9.2, carrera=Computacion]
Estudiante [codigo=E016, nombre=Mateo, edad=18, nota=7.0, carrera=Computacion]
Estudiante [codigo=E011, nombre=Pablo, edad=21, nota=9.5, carrera=Electronica]
Estudiante [codigo=E007, nombre=Pedro, edad=20, nota=8.5, carrera=Mecatronica]
Estudiante [codigo=E006, nombre=Sara, edad=19, nota=6.8, carrera=Computacion]
Estudiante [codigo=E001, nombre=Sofia, edad=18, nota=9.5, carrera=Computacion]

--- c3 Nota ascendente, sin desempate. ---
Estudiante [codigo=E012, nombre=Diego, edad=22, nota=6.8, carrera=Electronica]
Estudiante [codigo=E006, nombre=Sara, edad=19, nota=6.8, carrera=Computacion]
Estudiante [codigo=E016, nombre=Mateo, edad=18, nota=7.0, carrera=Computacion]
Estudiante [codigo=E015, nombre=Bruno, edad=22, nota=7.0, carrera=Computacion]
Estudiante [codigo=E003, nombre=Luis, edad=19, nota=7.8, carrera=Electronica]
Estudiante [codigo=E020, nombre=Carlos, edad=21, nota=7.8, carrera=Mecatronica]
Estudiante [codigo=E013, nombre=Luis, edad=19, nota=7.8, carrera=Electronica]
Estudiante [codigo=E002, nombre=Elena, edad=22, nota=8.0, carrera=Mecatronica]
Estudiante [codigo=E019, nombre=Juan, edad=20, nota=8.0, carrera=Mecatronica]
Estudiante [codigo=E014, nombre=Ana, edad=20, nota=8.5, carrera=Computacion]
Estudiante [codigo=E007, nombre=Pedro, edad=20, nota=8.5, carrera=Mecatronica]
Estudiante [codigo=E005, nombre=Ana, edad=19, nota=8.5, carrera=Computacion]
Estudiante [codigo=E008, nombre=Carla, edad=21, nota=8.5, carrera=Mecatronica]
Estudiante [codigo=E010, nombre=Ana, edad=20, nota=8.5, carrera=Computacion]
Estudiante [codigo=E018, nombre=Maria, edad=21, nota=9.2, carrera=Computacion]
Estudiante [codigo=E009, nombre=Lucia, edad=20, nota=9.2, carrera=Electronica]
Estudiante [codigo=E004, nombre=Diana, edad=18, nota=9.2, carrera=Electronica]
Estudiante [codigo=E001, nombre=Sofia, edad=18, nota=9.5, carrera=Computacion]
Estudiante [codigo=E011, nombre=Pablo, edad=21, nota=9.5, carrera=Electronica]
Estudiante [codigo=E017, nombre=Andres, edad=19, nota=9.5, carrera=Electronica]

----- C4  Nota descendente; nombre ascendente. -----
Estudiante [codigo=E017, nombre=Andres, edad=19, nota=9.5, carrera=Electronica]
Estudiante [codigo=E011, nombre=Pablo, edad=21, nota=9.5, carrera=Electronica]
Estudiante [codigo=E001, nombre=Sofia, edad=18, nota=9.5, carrera=Computacion]
Estudiante [codigo=E004, nombre=Diana, edad=18, nota=9.2, carrera=Electronica]
Estudiante [codigo=E009, nombre=Lucia, edad=20, nota=9.2, carrera=Electronica]
Estudiante [codigo=E018, nombre=Maria, edad=21, nota=9.2, carrera=Computacion]
Estudiante [codigo=E014, nombre=Ana, edad=20, nota=8.5, carrera=Computacion]
Estudiante [codigo=E005, nombre=Ana, edad=19, nota=8.5, carrera=Computacion]
Estudiante [codigo=E010, nombre=Ana, edad=20, nota=8.5, carrera=Computacion]
Estudiante [codigo=E008, nombre=Carla, edad=21, nota=8.5, carrera=Mecatronica]
Estudiante [codigo=E007, nombre=Pedro, edad=20, nota=8.5, carrera=Mecatronica]
Estudiante [codigo=E002, nombre=Elena, edad=22, nota=8.0, carrera=Mecatronica]
Estudiante [codigo=E019, nombre=Juan, edad=20, nota=8.0, carrera=Mecatronica]
Estudiante [codigo=E020, nombre=Carlos, edad=21, nota=7.8, carrera=Mecatronica]
Estudiante [codigo=E003, nombre=Luis, edad=19, nota=7.8, carrera=Electronica]
Estudiante [codigo=E013, nombre=Luis, edad=19, nota=7.8, carrera=Electronica]
Estudiante [codigo=E015, nombre=Bruno, edad=22, nota=7.0, carrera=Computacion]
Estudiante [codigo=E016, nombre=Mateo, edad=18, nota=7.0, carrera=Computacion]
Estudiante [codigo=E012, nombre=Diego, edad=22, nota=6.8, carrera=Electronica]
Estudiante [codigo=E006, nombre=Sara, edad=19, nota=6.8, carrera=Computacion]

----- C5 Edad ascendente; nombre descendente. -----
Estudiante [codigo=E001, nombre=Sofia, edad=18, nota=9.5, carrera=Computacion]
Estudiante [codigo=E016, nombre=Mateo, edad=18, nota=7.0, carrera=Computacion]
Estudiante [codigo=E004, nombre=Diana, edad=18, nota=9.2, carrera=Electronica]
Estudiante [codigo=E006, nombre=Sara, edad=19, nota=6.8, carrera=Computacion]
Estudiante [codigo=E003, nombre=Luis, edad=19, nota=7.8, carrera=Electronica]
Estudiante [codigo=E013, nombre=Luis, edad=19, nota=7.8, carrera=Electronica]
Estudiante [codigo=E017, nombre=Andres, edad=19, nota=9.5, carrera=Electronica]
Estudiante [codigo=E005, nombre=Ana, edad=19, nota=8.5, carrera=Computacion]
Estudiante [codigo=E007, nombre=Pedro, edad=20, nota=8.5, carrera=Mecatronica]
Estudiante [codigo=E009, nombre=Lucia, edad=20, nota=9.2, carrera=Electronica]
Estudiante [codigo=E019, nombre=Juan, edad=20, nota=8.0, carrera=Mecatronica]
Estudiante [codigo=E014, nombre=Ana, edad=20, nota=8.5, carrera=Computacion]
Estudiante [codigo=E010, nombre=Ana, edad=20, nota=8.5, carrera=Computacion]
Estudiante [codigo=E011, nombre=Pablo, edad=21, nota=9.5, carrera=Electronica]
Estudiante [codigo=E018, nombre=Maria, edad=21, nota=9.2, carrera=Computacion]
Estudiante [codigo=E020, nombre=Carlos, edad=21, nota=7.8, carrera=Mecatronica]
Estudiante [codigo=E008, nombre=Carla, edad=21, nota=8.5, carrera=Mecatronica]
Estudiante [codigo=E002, nombre=Elena, edad=22, nota=8.0, carrera=Mecatronica]
Estudiante [codigo=E012, nombre=Diego, edad=22, nota=6.8, carrera=Electronica]
Estudiante [codigo=E015, nombre=Bruno, edad=22, nota=7.0, carrera=Computacion]

----- C6 Carrera ascendente; nota descendente; nombre ascendente; código ascendente.  -----
Estudiante [codigo=E001, nombre=Sofia, edad=18, nota=9.5, carrera=Computacion]
Estudiante [codigo=E018, nombre=Maria, edad=21, nota=9.2, carrera=Computacion]
Estudiante [codigo=E005, nombre=Ana, edad=19, nota=8.5, carrera=Computacion]
Estudiante [codigo=E010, nombre=Ana, edad=20, nota=8.5, carrera=Computacion]
Estudiante [codigo=E014, nombre=Ana, edad=20, nota=8.5, carrera=Computacion]
Estudiante [codigo=E015, nombre=Bruno, edad=22, nota=7.0, carrera=Computacion]
Estudiante [codigo=E016, nombre=Mateo, edad=18, nota=7.0, carrera=Computacion]
Estudiante [codigo=E006, nombre=Sara, edad=19, nota=6.8, carrera=Computacion]
Estudiante [codigo=E017, nombre=Andres, edad=19, nota=9.5, carrera=Electronica]
Estudiante [codigo=E011, nombre=Pablo, edad=21, nota=9.5, carrera=Electronica]
Estudiante [codigo=E004, nombre=Diana, edad=18, nota=9.2, carrera=Electronica]
Estudiante [codigo=E009, nombre=Lucia, edad=20, nota=9.2, carrera=Electronica]
Estudiante [codigo=E003, nombre=Luis, edad=19, nota=7.8, carrera=Electronica]
Estudiante [codigo=E013, nombre=Luis, edad=19, nota=7.8, carrera=Electronica]
Estudiante [codigo=E012, nombre=Diego, edad=22, nota=6.8, carrera=Electronica]
Estudiante [codigo=E008, nombre=Carla, edad=21, nota=8.5, carrera=Mecatronica]
Estudiante [codigo=E007, nombre=Pedro, edad=20, nota=8.5, carrera=Mecatronica]
Estudiante [codigo=E002, nombre=Elena, edad=22, nota=8.0, carrera=Mecatronica]
Estudiante [codigo=E019, nombre=Juan, edad=20, nota=8.0, carrera=Mecatronica]
Estudiante [codigo=E020, nombre=Carlos, edad=21, nota=7.8, carrera=Mecatronica]

----- C7 Nota ajustada descendente; nombre ascendente; código ascendente.  -----
Estudiante [codigo=E001, nombre=Sofia, edad=18, nota=9.5, carrera=Computacion]
Estudiante [codigo=E018, nombre=Maria, edad=21, nota=9.2, carrera=Computacion]
Estudiante [codigo=E017, nombre=Andres, edad=19, nota=9.5, carrera=Electronica]
Estudiante [codigo=E011, nombre=Pablo, edad=21, nota=9.5, carrera=Electronica]
Estudiante [codigo=E004, nombre=Diana, edad=18, nota=9.2, carrera=Electronica]
Estudiante [codigo=E009, nombre=Lucia, edad=20, nota=9.2, carrera=Electronica]
Estudiante [codigo=E005, nombre=Ana, edad=19, nota=8.5, carrera=Computacion]
Estudiante [codigo=E010, nombre=Ana, edad=20, nota=8.5, carrera=Computacion]
Estudiante [codigo=E014, nombre=Ana, edad=20, nota=8.5, carrera=Computacion]
Estudiante [codigo=E008, nombre=Carla, edad=21, nota=8.5, carrera=Mecatronica]
Estudiante [codigo=E007, nombre=Pedro, edad=20, nota=8.5, carrera=Mecatronica]
Estudiante [codigo=E002, nombre=Elena, edad=22, nota=8.0, carrera=Mecatronica]
Estudiante [codigo=E019, nombre=Juan, edad=20, nota=8.0, carrera=Mecatronica]
Estudiante [codigo=E020, nombre=Carlos, edad=21, nota=7.8, carrera=Mecatronica]
Estudiante [codigo=E003, nombre=Luis, edad=19, nota=7.8, carrera=Electronica]
Estudiante [codigo=E013, nombre=Luis, edad=19, nota=7.8, carrera=Electronica]
Estudiante [codigo=E015, nombre=Bruno, edad=22, nota=7.0, carrera=Computacion]
Estudiante [codigo=E016, nombre=Mateo, edad=18, nota=7.0, carrera=Computacion]
Estudiante [codigo=E006, nombre=Sara, edad=19, nota=6.8, carrera=Computacion]
Estudiante [codigo=E012, nombre=Diego, edad=22, nota=6.8, carrera=Electronica]
