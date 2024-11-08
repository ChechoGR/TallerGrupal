import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Exportar1 {
    public void Exportararchivo1(LinkedList<EstudianteIng> lista1) {
        if (lista1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede exportar el archivo. Lista vacía");
            return;
        } else {
            try (FileWriter E1 = new FileWriter("EstudianteIngEXP.txt")) {
                for (EstudianteIng EI : lista1) {
                    E1.write("Cedula: " + EI.getCedula() + "\n");
                    E1.write("Nombre: " + EI.getNombre() + "\n");
                    E1.write("Apellido: " + EI.getApellido() + "\n");
                    E1.write("Telefono: " + EI.getTelefono() + "\n");
                    E1.write("Semestre: " + EI.getNumero() + "\n");
                    E1.write("Promedio académico: " + EI.getPromedio_acum1() + "\n");
                    E1.write("Serial: " + EI.getSerial() + "\n");
                    E1.write("------------------------------------------------------ \n");

                }
                JOptionPane.showMessageDialog(null, "Archivo exportado correctamente!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void ExportarArchivo3(LinkedList<Computador> lista2) {
        if (lista2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede exportar el archivo. Lista vacía");
            return;

        } else {
            try (FileWriter E2 = new FileWriter("ComputadorEXP.txt")) {
                for (Computador CP : lista2){
                    E2.write("El serial es " + CP.getSerial() + "\n");
                    E2.write("Marca: " + CP.getMarca() + "\n");
                    E2.write("Memoria de: " + CP.getTamaño() + "\n");
                    E2.write("Precio: " + CP.getPrecio() + "\n");
                    E2.write("Sistema operativo: " + CP.getSistemaop() + "\n");
                    E2.write("Procesador del equipo: " + CP.getProcesador() + "\n");
                    E2.write("¿Equipo prestado? " + CP.isPrestamo() + "\n");
                    E2.write("------------------------------------------------------ \n");
                }
                JOptionPane.showMessageDialog(null, "Archivo exportado correctamente!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
