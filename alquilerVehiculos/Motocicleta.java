package alquilerVehiculos;

import java.util.Random;

public class Motocicleta extends Vehiculo {

    private boolean llave = false;
    private boolean status = false;
    private int caballaje;
    private int torque;
    private String tipoMoto;


    public Motocicleta(int caballaje, int torque, String marca, String modelo, int anio, String tipoVehiculo) {
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

    // Metodos unicos de la motocicleta
    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {

        String[] listaTipoMoto = {"Ciclomotores", "Scooters", "Triciclos", "Deportivas", "Trail", "clasicas", "electricas"};

        for (String elementos : listaTipoMoto) {
            if (elementos.equalsIgnoreCase(tipoMoto)) {
                this.tipoMoto = tipoMoto;
                break;
            } else {
                System.out.println("\nTipo Ingresado Incorrecto");
                this.tipoMoto = "Null";
            }
        }

    }

    // Testing de un vehiculo -> Aplicando Polimorfismo
    public void encenderVehiculo() {
        System.out.println("La Motocicleta ha sido encedido Satisfactoriamente");
        this.status = true;
        this.llave = true;
    }

    public void apagarVehiculo() {
        System.out.println("La Motocicleta ha sido apagado Satisfactoriamente");
        this.status = false;
        this.llave = false;
    }

    public void frenoEmergencia() {
        
        if (status == false && llave == false) {
            System.out.println("Debe de Encender el vehiculo primero");
        } else {
            System.out.println("El Freno de mano del coche ha funcionado Satisfactoriamente");
        }
        this.status = true;
        this.llave = true;
    }

    public void colocarDireccionales() {
        System.out.println("Las direccionales han funcionado correctamente");
    }

    public void acelerar() {
        System.out.println("La Motocicleta ha pasado la prueba de aceleracion satisfactoriamente");
        this.status = true;
        this.llave = true;
    }

    public void frenar() {
        System.out.println("La Motocicleta ha pasado la prueba de frenado satisfactoriamente");
        this.status = true;
        this.llave = true;
    }

    public void resultadoTest() {

        // Utilizando Valores Aleatorios Para establecer la puntuacion del vehiculo a Rentar
        Random random = new Random();

        int min = 60;
        int max = 99;

        int numeroA = random.nextInt(max - min + 1) + min;

        System.out.println("La Puntuacion de la motocicleta a rentar es: " + numeroA);
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

    //     public Motocicleta(String marca, String modelo, int anio, String tipoVehiculo,int caballaje, int torque) {
}
