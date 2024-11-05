public class EstudianteIng {
    String Cedula; // cadena de texto, no se permiten caracteres especiales.
    String Nombre; // cadena de texto, no se permiten números ni caracteres especiales.
    String Apellido; // cadena de texto, no se permiten números ni caracteres especiales
    String Telefono; // cadena de texto, no se permiten caracteres especiales.
    int Numero; // Semestre actualmente cursado: número entero.
    float Promedio_acum1; // Numero flotante.
    String Serial; // cadena de texto, no se permiten caracteres especiales.

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public float getPromedio_acum1() {
        return Promedio_acum1;
    }

    public void setPromedio_acum1(float promedio_acum1) {
        Promedio_acum1 = promedio_acum1;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

}
