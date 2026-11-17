import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;

import models.Estudiante;

public class Comparadores {
    private List<Estudiante> estudiantes;

    public Comparadores(){
        this.estudiantes = new ArrayList<>(List.of(
            new Estudiante("E014", "Ana",    20, 8.5, "Computacion"),
            new Estudiante("E003", "Luis",   19, 7.8, "Electronica"),
            new Estudiante("E018", "Maria",  21, 9.2, "Computacion"),
            new Estudiante("E007", "Pedro",  20, 8.5, "Mecatronica"),
            new Estudiante("E001", "Sofia",  18, 9.5, "Computacion"),
            new Estudiante("E012", "Diego",  22, 6.8, "Electronica"),
            new Estudiante("E005", "Ana",    19, 8.5, "Computacion"),
            new Estudiante("E020", "Carlos", 21, 7.8, "Mecatronica"),
            new Estudiante("E009", "Lucia",  20, 9.2, "Electronica"),
            new Estudiante("E016", "Mateo",  18, 7.0, "Computacion"),
            new Estudiante("E002", "Elena",  22, 8.0, "Mecatronica"),
            new Estudiante("E011", "Pablo",  21, 9.5, "Electronica"),
            new Estudiante("E006", "Sara",   19, 6.8, "Computacion"),
            new Estudiante("E019", "Juan",   20, 8.0, "Mecatronica"),
            new Estudiante("E004", "Diana",  18, 9.2, "Electronica"),
            new Estudiante("E015", "Bruno",  22, 7.0, "Computacion"),
            new Estudiante("E008", "Carla",  21, 8.5, "Mecatronica"),
            new Estudiante("E017", "Andres", 19, 9.5, "Electronica"),
            new Estudiante("E010", "Ana",    20, 8.5, "Computacion"),
            new Estudiante("E013", "Luis",   19, 7.8, "Electronica")
        ));
    }


    public void c1(){
        List<Estudiante> lista = new ArrayList<>(estudiantes);
        Comparator<Estudiante> porOrdenNatural = (e1, e2) -> e1.compareTo(e2);
        lista.sort(porOrdenNatural);
        System.out.println("\n--- c1 Orden natural con intefaces Comparable ---");
        imprimir(lista);
    }

    public void c2(){
        List<Estudiante> lista = new ArrayList<>(estudiantes);
        Comparator<Estudiante> porNombreYCodigo = (e1, e2) -> {
            int compNombre = e1.getNombre().compareTo(e2.getNombre());
            if(compNombre != 0){
                return compNombre;
            }
            return e1.getCodigo().compareTo(e2.getCodigo());
        };

        System.out.println("\n--- c2 Nombre ascendente, codigo ascendete comparator lambda ---");
        lista.sort(porNombreYCodigo);
        imprimir(lista);

    }

    public void c3(){
        List<Estudiante> lista = new ArrayList<>(estudiantes);
        Comparator<Estudiante> notaAscendete = Comparator.comparingDouble(Estudiante :: getNota);
        lista.sort(notaAscendete);
        System.out.println("\n--- c3 Nota ascendente, sin desempate. ---");
        imprimir(lista);
    }

    // C4: nota descendente; nombre ascendente 
    public void c4(){
        List<Estudiante> lista = new ArrayList<>(estudiantes);

        Comparator<Estudiante> comp = Comparator.comparingDouble(Estudiante::getNota)
                .reversed()
                .thenComparing(Estudiante::getNombre);
        lista.sort(comp);

        System.out.println("\n----- C4  Nota descendente; nombre ascendente. -----");
        imprimir(lista);
    }

    // C5: edad ascendente; nombre descendente
    public void c5(){
        List<Estudiante> lista = new ArrayList<>(estudiantes);

        Comparator<Estudiante> comp = Comparator.comparingInt(Estudiante::getEdad)
                .thenComparing(Estudiante::getNombre, Comparator.reverseOrder());
        lista.sort(comp);

        System.out.println("\n----- C5 Edad ascendente; nombre descendente. -----");
        imprimir(lista);
    }

    // C6: carrera asc; nota desc; nombre asc; codigo asc
    public void c6(){
        List<Estudiante> lista = new ArrayList<>(estudiantes);

        Comparator<Estudiante> comp = Comparator.comparing(Estudiante::getCarrera)
                .thenComparing(Comparator.comparingDouble(Estudiante::getNota).reversed())
                .thenComparing(Estudiante::getNombre)
                .thenComparing(Estudiante::getCodigo);
        lista.sort(comp);

        System.out.println("\n----- C6 Carrera ascendente; nota descendente; nombre ascendente; código ascendente.  -----");
        imprimir(lista);
    }

    public void c7(){
        List<Estudiante> lista = new ArrayList<>(estudiantes);

        
        ToDoubleFunction<Estudiante> ajustada = e -> {
            if (e.getCarrera().equals("Computacion")) {
                return Math.min(10.0, e.getNota() + 0.5);
            }
            return e.getNota();
        };

        Comparator<Estudiante> comp = Comparator.comparingDouble(ajustada)
                .reversed()
                .thenComparing(Estudiante::getNombre)
                .thenComparing(Estudiante::getCodigo);
        lista.sort(comp);

        System.out.println("\n----- C7 Nota ajustada descendente; nombre ascendente; código ascendente.  -----");
        imprimir(lista);
    }


    public void imprimir(List<Estudiante> lista){
        for (Estudiante estudiante : lista) {
            System.out.println(estudiante);
        }
    }
    
}


