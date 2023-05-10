package modelos;

public class Empleado {
    private String nombre;
    private int ID;
    private String email;
    private String puesto;

    public Empleado() {
    }

    public Empleado(String nombre, int ID, String email, String puesto) {
        this.nombre = nombre;
        setID(ID);
        setEmail(email);
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if (ID > 0) this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) this.email = email;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", ID=" + ID +
                ", email='" + email + '\'' +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}
