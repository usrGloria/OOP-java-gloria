import modelos.Capsula;
import modelos.Empleado;

public class Main {

    public static void main(String[] args) {
        System.out.println("Gestor Máquinas de café");

        Empleado juan = new Empleado("Juan", 1, "j@j.com", "dev");
        System.out.println("juan: " + juan);

        Empleado[] listaEmpleados = {juan, new Empleado("maria", 2, "m@m.com", "pm")};

        System.out.println("listaEmpleados: " + listaEmpleados);
//        listaEmpleados[0] = juan;
        System.out.println("listaEmpleados 0: " + listaEmpleados[0]);
        System.out.println("listaEmpleados 1: " + listaEmpleados[1]);

        listaEmpleados[0].setID(11);
        System.out.println("juan: " + juan);


        Capsula capsula1 = new Capsula(1, "Bonka", "corto", juan, 34.56, false);
        System.out.println("capsula1: " + capsula1);

        boolean isOk = capsula1.asociarEmpleado(new Empleado("maria", 2, "m@m.com", "pm"));

        if (isOk) System.out.println("Empleado actualizado");
        else System.out.println("Empleado NO actualizado. revvisa el valor.");


        double precio = capsula1.calcularPrecio();
        System.out.println("precio: " + precio);
        System.out.println(capsula1);

//        capsula1.marca = "Nescafe";
        //capsula1.calcularPrecio();
        capsula1.asociarMarca("Nescafe");
        System.out.println(capsula1);

        Capsula capsula2 = new Capsula();
        capsula2.setIdentificador(2);
        System.out.println(capsula2);


    }

}