//Main, solo para añadir los métodos

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Principal{
    public static void main(String[] args) {
        Metodos m = new Metodos();
        int seleccion_opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción del menú: "));
        switch (seleccion_opcion){
            case 1: // Llenar lista estudiantes ingenieria
                LinkedList<EstudianteIng> lista = new LinkedList<>();
                lista = m.IngresarRegistro(lista); //Se guarda en lista para la persistencia de datos
                m.MostrarRegistro(lista);
            break;
            case 2: // Llenar lista estudiantes diseño
            break;
            case 3: // Llenar lista computador
            break;
            case 4: // Llenar lista Tableta
            break;
            case 5: // Importar listas
                int importar_lista = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción para importar: "));
                switch (importar_lista){
                    case 1:
                    break;
                    case 2:
                    break;
                    case 3:
                    break;
                }
            break;
            case 6: // Exportar listas
            int exportar_lista = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción para importar: "));
                switch (exportar_lista){
                    case 1:
                    break;
                    case 2:
                    break;
                    case 3:
                    break;
                }
            break;
            case 7:
            break;
            case 8:
            break;
            case 9:
            break;
        }
    }
}