//Main, solo para añadir los métodos

import java.util.LinkedList;

public class Principal{
    public static void main(String[] args) {
        Metodos m = new Metodos();
        LinkedList<EstudianteIng> lista = new LinkedList<>();
        lista = m.IngresarRegistro(lista); //Se guarda en lista para la persistencia de datos
        m.MostrarRegistro(lista);
    }
}