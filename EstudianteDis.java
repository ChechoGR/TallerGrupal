public class EstudianteDis {
    String Cedula; //cadena de texto, no se permiten caracteres especiales.
    String Nombre; //cadena de texto, no se permiten números ni caracteres especiales.
    String Apellido; //cadena de texto, no se permiten números ni caracteres especiales
    String Telefono; //cadena de texto, no se permiten caracteres especiales.
    String Modalidad; //Modalidad: a distancia o presencial
    int Asignaturas; //Numero entero.
    String Serial;
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
    public String getModalidad() {
        return Modalidad;
    }
    public void setModalidad(String modalidad) {
        Modalidad = modalidad;
    }
    public int getAsignaturas() {
        return Asignaturas;
    }
    public void setAsignaturas(int asignaturas) {
        Asignaturas = asignaturas;
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }
    
    
}
