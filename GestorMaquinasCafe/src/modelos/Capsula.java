package modelos;

public class Capsula {

    private int identificador;
    private String marca;
    private String tipoCafe;
    private Empleado empleado;
    private double precio;
    private boolean estado;

    public Capsula() {
    }

    public Capsula(int identificador, String marca, String tipoCafe, Empleado empleado, double precio, boolean estado) {
        this.identificador = identificador;

        this.asociarMarca(marca);

        this.tipoCafe = tipoCafe;

        this.asociarEmpleado(empleado);

        this.estado = estado;
    }

    public boolean asociarEmpleado(Empleado emp) {
        if (emp.getID() >= 0) {
            this.empleado = emp;
            return true;
        } else {
            return false;
        }
    }

    public void asociarMarca(String nuevaMarca) {
        this.marca = nuevaMarca;
        calcularPrecio();
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipoCafe() {
        return tipoCafe;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setIdentificador(int identificador) {
        if (identificador > 0) this.identificador = identificador;
    }

    public void setTipoCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    private double auxCalculoPrecio(Double valor, String origen) throws NullPointerException, NumberFormatException, Exception {
        // imaginamos que hacemos calculo complejo
        double penalizacion = 1;

        try {
            if (origen.contains("asia")) penalizacion = 2;
            else penalizacion = 1;
        } catch (NumberFormatException ex) {
            System.out.println("Avisar a devs sobre Format error");
        } catch (NullPointerException ex) {
            System.out.println("Avisar a devs sobre Null error");
        } catch (Exception ex) {
//            ex.printStackTrace();
            System.out.println("Avisar a devs sobre error:" + ex.getMessage());
        } finally {
            System.out.println("Entrando en finally...");
        }

        return valor * penalizacion;

    }

    public double calcularPrecio() {
        if (this.marca == "Bonka") this.precio = 5;
        else if (this.marca == "Nescafe") {
            try {
                this.precio = this.auxCalculoPrecio(new Double("hola"), null);
            } catch (NumberFormatException ex) {
                System.out.println("Avisar a devs sobre Format error");
                throw new RuntimeException(ex);
            } catch (Exception e) {
                System.out.println("dev: Excepción en precio!!!");
                throw new RuntimeException(e);
            }
        } else this.precio = 2;

        return this.precio;
    }

    @Override
    public String toString() {
        return "Capsula{" +
                "identificador=" + identificador +
                ", marca='" + marca + '\'' +
                ", tipoCafe='" + tipoCafe + '\'' +
                ", empleado=" + empleado +
                ", precio=" + precio +
                ", estado=" + estado +
                '}';
    }

}
