package alquilerVehiculos;

import java.util.Random;

public class Camion extends Vehiculo {

    private boolean llave = false;
    private boolean status = false;
    private int caballaje;
    private int torque;


    public Camion(int caballaje, int torque, String marca, String modelo, int anio, String tipoVehiculo) {
        super(marca, modelo, anio, tipoVehiculo);
        this.caballaje = caballaje;
        this.torque = torque;
    }

    public int getCaballaje() {
        return caballaje;
    }

    public void setCaballaje(int caballaje) {
        this.caballaje = caballaje;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    // metodos especificos del camion
    public void remolque() {
        System.out.println("El Remolque ha sido probado satisfactoriamente");
        this.status = true;
        this.llave = true;

    }

    public void trailer() {
        System.out.println("El Trailer ha sido probado satisfactoriamente");
        this.status = true;
        this.llave = true;

    }


    // Testing de un vehiculo -> Aplicando Polimorfismo
    public void encenderVehiculo() {
        System.out.println("El Camion ha sido encedido Satisfactoriamente");
        this.status = true;
        this.llave = true;
    }

    public void apagarVehiculo() {
        System.out.println("El Camion ha sido apagado Satisfactoriamente");
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
        System.out.println("El Camion ha pasado la prueba de aceleracion satisfactoriamente");
        this.status = true;
        this.llave = true;
    }

    public void frenar() {
        System.out.println("El Camion ha pasado la prueba de frenado satisfactoriamente");
        this.status = true;
        this.llave = true;
    }

    public void resultadoTest() {

        // Utilizando Valores Aleatorios Para establecer la puntuacion del vehiculo a Rentar
        if (status == false && llave == false) {
            Random random = new Random();

            int min = 60;
            int max = 99;

            int numeroA = random.nextInt(max - min + 1) + min;

            System.out.println("La Puntuacion del camion a rentar es: " + numeroA);
        } else {
            System.out.println("Debe de apagar el Coche.");
        }

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
