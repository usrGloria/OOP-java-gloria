package com.dxc;
import com.dxc.modelos.Coche;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Coche unCoche = new Coche(1, "Renault", 130.5, 50);

        System.out.println(unCoche.toString() );

    }
}
