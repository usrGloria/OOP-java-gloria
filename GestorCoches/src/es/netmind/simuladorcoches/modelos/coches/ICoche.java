package es.netmind.simuladorcoches.modelos.coches;


import es.netmind.simuladorcoches.modelos.motores.Motor;

public interface ICoche {
    public double avanzar(int distancia);
    public boolean acelarar(int kph);
    public boolean arrancar();
    public boolean parar();
    public boolean validar();
    public void setMotor(Motor motor);

}
