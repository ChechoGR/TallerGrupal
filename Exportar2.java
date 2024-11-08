import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Exportar2 {
    public void Exportararchivo2(LinkedList<EstudianteDis> lista3) {
        if (lista3.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede exportar el archivo. Lista vacía");
            return;
        } else {
            try (FileWriter E1 = new FileWriter("EstudianteIngDisEXP.txt")) {
                for (EstudianteDis ED : lista3) {
                    E1.write("Cedula: " + ED.getCedula() + "\n");
                    E1.write("Nombre: " + ED.getNombre() + "\n");
                    E1.write("Apellido: " + ED.getApellido() + "\n");
                    E1.write("Telefono: " + ED.getTelefono() + "\n");
                    E1.write("Modalidad: " + ED.getModalidad() + "\n");
                    E1.write("Cantidad : " + ED.getAsignaturas() + "\n");
                    E1.write("Serial: " + ED.getSerial() + "\n");
                    E1.write("------------------------------------------------------ \n");

                }
                JOptionPane.showMessageDialog(null, "Archivo exportado correctamente!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void ExportarArchivo4(LinkedList<Tableta> lista4) {
        if (lista4.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se puede exportar el archivo. Lista vacía");
            return;

        } else {
            try (FileWriter E2 = new FileWriter("TABLETA.txt")) {
                for (Tableta TB : lista4){
                    E2.write("El serial es " + TB.getSerial() + "\n");
                    E2.write("Marca: " + TB.getMarca() + "\n");
                    E2.write("Tamaño pantalla: " + TB.getTamaño() + "\n");
                    E2.write("Precio: " + TB.getPrecio() + "\n");
                    E2.write("Almacenamiento: " + TB.getAlmacenamiento() + "\n");
                    E2.write("Peso: " + TB.getPeso() + "\n");
                    E2.write("¿Equipo prestado? " + TB.isPrestamo() + "\n");
                    E2.write("------------------------------------------------------ \n");
                }
                JOptionPane.showMessageDialog(null, "Archivo exportado correctamente!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
