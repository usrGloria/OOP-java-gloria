import modelos.Capsula;
import modelos.Empleado;

public class Main {

    public static void main(String[] args) {
        System.out.println("Gestor Máquinas de café");

        Empleado[] listaEmpleados = generarEmpleados();

        Capsula capsula1 = new Capsula(1, "Bonka", "corto", listaEmpleados[1], 34.56, false);
//        System.out.println("capsula1: " + capsula1);

        boolean isOk = capsula1.asociarEmpleado(new Empleado("maria", 2, "m@m.com", "pm"));

//        if (isOk) System.out.println("Empleado actualizado");
//        else System.out.println("Empleado NO actualizado. revvisa el valor.");

        double precio = capsula1.calcularPrecio();
//        System.out.println("precio: " + precio);
        System.out.println("capsula1: "+capsula1);

//        capsula1.marca = "Nescafe";
        //capsula1.calcularPrecio();
        try {
            capsula1.asociarMarca("Nescafe");
        }catch (Exception e){
            System.out.println("!!!! Ooops hemos tenido un error, intentalo nuevamente o contacta con el administrador");
        }
        System.out.println("capsula1 tras cambio de marca:"+ capsula1);

        Capsula capsula2 = new Capsula();
        capsula2.setIdentificador(2);
        capsula2.asociarEmpleado(listaEmpleados[3]);
//        System.out.println(capsula2);

    }

    public static Empleado[] generarEmpleados(){
        Empleado juan = new Empleado("Juan", 1, "j@j.com", "dev");
//        System.out.println("juan: " + juan);

        Empleado[] listaEmpleadosLocal = {juan, new Empleado("maria", 2, "m@m.com", "pm"), new Empleado("luisa", 3, "l@l.com", "dev"), new Empleado("pedro", 4, "p@p.com", "dev")};

        /*for(Empleado unEmp:listaEmpleados){
            System.out.println(unEmp);
        }*/

//        System.out.println("\n");

        for(int i=0; i < listaEmpleadosLocal.length; i++){
//            System.out.println(listaEmpleadosLocal[i]);
            listaEmpleadosLocal[i].setID(i+21);
//            System.out.println(listaEmpleadosLocal[i]);
        }

        /*System.out.println("listaEmpleados: " + listaEmpleados);
//        listaEmpleados[0] = juan;
        System.out.println("listaEmpleados 0: " + listaEmpleados[0]);
        System.out.println("listaEmpleados 1: " + listaEmpleados[1]);

        listaEmpleados[0].setID(11);
        System.out.println("juan: " + juan);*/

//        System.out.println("tamaño lista empleados: " + listaEmpleadosLocal.length);

        return listaEmpleadosLocal;
    }
}