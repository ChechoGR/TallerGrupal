import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public LinkedList<EstudianteIng> IngresarRegistro(LinkedList<EstudianteIng> lista1) {
        boolean continuar = true;
        while (continuar == true) {
            EstudianteIng EI = new EstudianteIng();
            EI.setCedula(JOptionPane.showInputDialog("Ingrese la cédula"));
            EI.setNombre(JOptionPane.showInputDialog("Ingrese el nombre"));
            EI.setApellido(JOptionPane.showInputDialog("Ingrese el apellido"));
            EI.setTelefono(JOptionPane.showInputDialog("Ingrese el telefono"));
            boolean ValidezSemestre = false;
            while (!ValidezSemestre) { // Bucle hasta que se tenga un semestre válido
                String Verif_semestre = JOptionPane.showInputDialog("Ingrese el semestre actual");
                if (Verif_semestre == null || Verif_semestre.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar un número entero.",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                try {
                    EI.setNumero(Integer.parseInt(Verif_semestre));
                    ValidezSemestre = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número entero válido.",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
            boolean ValidezPromedio = false;
            while (!ValidezPromedio) {
                String Verif_promedio = JOptionPane.showInputDialog(("Ingrese su promedio académico"));
                if (Verif_promedio == null || Verif_promedio.trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Entrada no válida. Debe ingresar un número entre 0 y 5", "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    continue;
                }
                Verif_promedio = Verif_promedio.replace(",", ".");
                try {
                    EI.setPromedio_acum1(Float.parseFloat(Verif_promedio));
                    ValidezPromedio = true;
                }   catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.",
                            "Error de entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
            //EI.setPromedio_acum1(
                    //Float.parseFloat(JOptionPane.showInputDialog("Ingrese su promedio").replace(",", ".")));
            EI.setSerial(JOptionPane.showInputDialog("Ingrese el serial"));
            lista1.add(EI);
            int opt = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro registro?", "Continuar",
                    JOptionPane.YES_NO_OPTION);
            continuar = (opt == JOptionPane.YES_OPTION);

        }
        return lista1;
    }

    public void MostrarRegistro(LinkedList<EstudianteIng> lista1) {
        for (EstudianteIng EI : lista1) {
            JOptionPane.showMessageDialog(null, "La cédula es: " + EI.getCedula() + "\n"
                    + "Nombre: " + EI.getNombre() + "\n"
                    + "Apellido: " + EI.getApellido() + "\n"
                    + "Teléfono: " + EI.getTelefono() + "\n"
                    + "Semestre actual: " + EI.getNumero() + "\n"
                    + "Promedio acumulado: " + EI.getPromedio_acum1() + "\n"
                    + "Serial actual: " + EI.getSerial());

        }

    }

}
