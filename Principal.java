//Main, solo para añadir los métodos

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        JOptionPane.showMessageDialog(null, "Bienvenido a la plataforma!");
        JOptionPane.showMessageDialog(null,
                "Seleccione una opción \n" + "Opción 1: Llenar lista estudiantes ingeniería\n" +
                        "Opción 2: Llenar lista estudiantes diseño\n" +
                        "Opción 3: Llenar lista de computadores\n" + "Opción 4: Llenar lista de tabletas\n"
                        + "Opción 5: Importar lista\n" + "Opción 6: Exportar lista");
        
        LinkedList<EstudianteIng> lista1 = new LinkedList<>();
        LinkedList<Computador> lista2 = new LinkedList<>();
        boolean bandera = true;
        while (bandera) {
            int seleccion_opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción del menú: "));
            switch (seleccion_opcion) {
                case 1: // Llenar lista estudiantes ingenieria
                    lista1 = m.IngresarRegistro1(lista1); // Se guarda en lista para la persistencia de datos
                    break;
                case 2: // Llenar lista estudiantes diseño
                    break;
                case 3: // Llenar lista computador
                    lista2 = m.IngresarRegistro2(lista2);
                    break;
                case 4: // Llenar lista Tableta
                    break;
                case 5: // Importar listas
                    int importar_lista = Integer
                            .parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción para importar: "));
                    switch (importar_lista) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 6: // Exportar listas
                    int exportar_lista = Integer
                            .parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción para importar: "));
                    switch (exportar_lista) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 7: // Mostrar lista ingeniería
                    m.MostrarRegistro1(lista1);
                    break;
                case 8: // Mostrar lista diseño
                    break;
                case 9: // Mostrar lista computadores
                    m.MostrarRegistro2(lista2);
                    break;
                case 10:
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null, "Finalizando el programa \n" + "Vuelva pronto!");
                    bandera = false;
                    
                    break;
            }
        }
    }
}