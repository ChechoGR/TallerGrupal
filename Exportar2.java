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
                    E1.write("La cedula es: " + ED.getCedula() + "\n");
                    E1.write("Nombre: " + ED.getNombre() + "\n");
                    E1.write("Apellido: " + ED.getApellido() + "\n");
                    E1.write("Telefono: " + ED.getTelefono() + "\n");
                    E1.write("Modalidad: " + ED.getModalidad() + "\n");
                    E1.write("Cantidad : " + "\n" + ED.getAsignaturas() + "\n");
                    E1.write("Serial: " + ED.getSerial() + "\n");
                    E1.write("------------------------------------------------------ \n");

                }
                JOptionPane.showMessageDialog(null, "Archivo exportado correctamente!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
