package alquilerVehiculos;

//import java.util.List;
import java.util.ArrayList;
import java.util.Arrays; // Importada para usar el metedo asList();
import java.util.Scanner;

public class Vehiculo {

    //Creando constantes para la Identificacion de los vehiculos
    private final String IDMoto = "M"; // Motocicleta
    private final String IDAuto = "A"; // Auto
    private final String IDCamion = "C"; // Camion
    private String tipoVehiculo;

    // Atributos caracteristicos de un vehiculo
    private String marca;
    private String modelo;
    private int anio;
    private String color;

    //Constructor Vacio
    public Vehiculo() {
    }

    // Constructor con parametros
    public Vehiculo(String marca, String modelo, int anio, String tipoVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getIdMoto() {
        return IDMoto;
    }

    public String getIdAuto() {
        return IDAuto;
    }

    public String getIdCamion() {
        return IDCamion;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {

        // equalsIgnoreCase -> Para comparar mayusculas y minusculas
        if (tipoVehiculo.equalsIgnoreCase("M")) {
            this.tipoVehiculo = IDMoto; // Motocicleta
        } else if (tipoVehiculo.equalsIgnoreCase("A")) {
            this.tipoVehiculo = IDAuto; // Auto
        } else if (tipoVehiculo.equalsIgnoreCase("C")) {
            this.tipoVehiculo = IDCamion; // Camion
        } else {
            System.out.println("Error: Tipo ingresado Incorrecto");
            this.tipoVehiculo = "Null";
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {

        // TIPO DE VEHICULOS: MOTOS
        if (tipoVehiculo.equals("M")) {

            String[] listaMarcasMotos = {"Kawasaki", "YAMAHA", "SYM", "KIM", "SUZUKI", "DERBI", "Nissan", "RIEJU", "HYOUSUNG"};

            for (String elementosI : listaMarcasMotos) {
                if (elementosI.equalsIgnoreCase(marca)) {
                    this.marca = marca;
                    break;
                } else {
                    System.out.println("Error: Marca incorrecta Ingresada");
                    this.marca = "Null";
                }
            }
        }

        // TIPO DE VEHICULOS: AUTOS
        if (tipoVehiculo.equals("A")) {

            String[] listaMarcasAutos = {"Toyota", "Hyundai", "Kia", "Honda", "Nissan", "Ford", "Tesla", "Mazda", "Volvo", "Mercedes Benz", "BMW", "RAM"};

            for (String elementosIt : listaMarcasAutos) {
                if (elementosIt.equalsIgnoreCase(marca)) {
                    this.marca = marca;
                    break;
                } else {
                    System.out.println("Error: Marca incorrecta Ingresada");
                    this.marca = "Null";
                }
            }
        }

        // TIPO DE VEHICULOS: CAMIONES
        if (tipoVehiculo.equals("C")) {

            String[] listaMarcasCamiones = {"Volvo", "Mercedes Benz", "Isuzu", "Petertilt", "Mack", "SCANIA", "GMC", "FORD", "WESTERN", "MAN", "DAF", "RENAULT", "CAT"};

            for (String elementos : listaMarcasCamiones) {
                if (elementos.equalsIgnoreCase(marca)) {
                    this.marca = marca;
                    break;
                } else {
                    System.out.println("Error: Marca incorrecta Ingresada");
                    this.marca = "Null";
                }
            }
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) { // El Dealer solo rentara vehiculos con un año mayor al 2010
        if (anio >= 2010 && anio <= 2024) {
            this.anio = anio;
        } else {
            System.out.println("Error: Anio del vehiculo colocado incorrecto");
            this.anio = 0000;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String Color) {

        ArrayList<String> listaDeColores = new ArrayList<>();

        // Metodo para agregar multiples elementos en el ArrayList
        listaDeColores.addAll(Arrays.asList("Rojo", "Azul", "Blanco", "Negro", "Amarillo", "Verde", "Plata", "Gris", "Violeta"));

        for (String elementos : listaDeColores) {
            if (elementos.equalsIgnoreCase(color)) {
                this.color = Color;
                break;
            } else {
                System.out.println("Error: Color Incorrecto");
                this.color = "Null";
            }
        }
    }

    public void calculadoraGasolina() {

        Scanner in = new Scanner(System.in);

        System.out.println("\nBienvenid@ a la Calculadora. Escribe la cantidad de Galones: \n");

        int entradaGalon = in.nextInt();

        /*       
    Gasolina Premium: RD$290.10 por galón
    Gasolina Regular: RD$272.50 por galón
    Gasoil Regular: RD$221.60 por galón
    Gasoil Óptimo: RD$239.10 por galón
        
         */
        System.out.println("\nSelecciona el tipo de Gasolina a Calcular:\n");

        System.out.println("1. Gasolina Premium");
        System.out.println("2. Gasolina Regular");
        System.out.println("3. Gasoil Regular");
        System.out.println("4. Gasoil Optimo\n");

        int entradaGasolina = in.nextInt();

        double Gasolina = 0;
        double resultado = 0;

        switch (entradaGasolina) {

            case 1:
                Gasolina = 290.10;

                System.out.println("\nEl costo de la Gasolina seleccionada es: " + Gasolina);
                
                System.out.println("\nCalculando...");

                // PROCESO
                resultado = entradaGalon * Gasolina;

                System.out.println("\nEl resultado es: " + resultado);

                break;
            case 2:

                Gasolina = 272.50;

                System.out.println("\nEl costo de la Gasolina seleccionada es: " + Gasolina);
                System.out.println("\nCalculando..");

                // PROCESO
                resultado = entradaGalon * Gasolina;

                System.out.println("\nEl resultado es: " + resultado);
                break;

            case 3:
                Gasolina = 221.60;

                System.out.println("\nEl costo de la Gasolina seleccionada es: " + Gasolina);
                System.out.println("\nCalculando...");

                // PROCESO
                resultado = entradaGalon * Gasolina;

                System.out.println("\nEl resultado es: " + resultado);
                break;

            case 4:
                Gasolina = 239.10;

                System.out.println("\nEl costo de la Gasolina seleccionada es: " + Gasolina);
                System.out.println("\nCalculando..");

                // PROCESO
                resultado = entradaGalon * Gasolina;

                System.out.println("\nEl resultado es: " + resultado);
                break;
        }

    }
}
