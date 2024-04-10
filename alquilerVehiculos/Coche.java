package alquilerVehiculos;

import java.util.Random;

public class Coche extends Vehiculo {

    private boolean llave = false;
    private boolean status = false;
    private int caballaje;
    private int torque;
    private String Motor;


    public Coche(int caballaje, int torque, String marca, String modelo, int anio, String tipoVehiculo) {
        super(marca, modelo, anio, tipoVehiculo);
        this.caballaje = caballaje;
        this.torque = torque;
    }

    public int getCaballaje() {
        return caballaje;
    }

    public void setCaballaje(int caballos) {
        this.caballaje = caballos;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    /*
    Traccion Trasera = RWD
    Traccion Delantera = FWD
    Traccion Total = AWD
    Traccion en dos ruedas = 2WD
    Traccion en cuatro ruedas = 4WD
    */
    private String traccion;

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {

        String[] listaTraccion = {"RWD", "FWD", "AWD", "2WD", "4WD", "4x4"};

        // CICLO FOREACH PARA VALIDAR LA TRACCIONES
        for (String elementosIterados : listaTraccion) {
            if (elementosIterados.equalsIgnoreCase(traccion)) {
                this.traccion = traccion;
                break;

            } else {
                System.out.println("La traccion ingresada es incorrecta ");
                this.traccion = "Null";
            }
        }
    }

    // Testing de un vehiculo -> Aplicando Polimorfismo
    public void encenderVehiculo() {
        System.out.println("El Coche ha sido encedido Satisfactoriamente");
        this.status = true;
        this.llave = true;
    }

    public void apagarVehiculo() {
        System.out.println("El Coche ha sido apagado Satisfactoriamente");
        this.status = false;
        this.llave = false;
    }

    public void frenoEmergencia() {
        System.out.println("El Freno de mano del coche ha funcionado Satisfactoriamente");
        this.status = true;
        this.llave = true;
    }

    public void colocarDireccionales() {
        System.out.println("Las direccionales han funcionado correctamente");
        this.status = true;
        this.llave = true;
    }

    public void acelerar() {
        System.out.println("El coche ha pasado la prueba de aceleracion satisfactoriamente");
        this.status = true;
        this.llave = true;
    }

    public void frenar() {
        System.out.println("El coche ha pasado la prueba de frenado satisfactoriamente");
        this.status = true;
        this.llave = true;
    }

    public void resultadoTest() {

        // Utilizando Valores Aleatorios Para establecer la puntuacion del vehiculo a Rentar
        Random random = new Random();

        int min = 60;
        int max = 99;

        int numeroA = random.nextInt(max - min + 1) + min;

        System.out.println("La Puntuacion del coche a rentar es: " + numeroA);
    }
    
    public void desplegarInformacion() {
        System.out.println("\n================================================");

        System.out.println("Datos del vehiculo:");

        System.out.println("\n\tMarca: " + getMarca());
        System.out.println("\n\tModelo: " + getModelo());
        System.out.println("\n\tanio: " + getAnio());
        System.out.println("\n\tTipo Vehiculo: " + getTipoVehiculo());
        System.out.println("\n\tCaballaje: " + getCaballaje());
        System.out.println("\n\tTorque: " + getTorque());

        System.out.println("\n================================================");

    }
}
