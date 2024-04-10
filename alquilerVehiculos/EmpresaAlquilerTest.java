package alquilerVehiculos;

public class EmpresaAlquilerTest {

    public static void main(String[] args) {
        
        Vehiculo vh = new Vehiculo();
        Coche c = new Coche(230,400,"Toyota","Corolla",2008,"A");     //(int caballaje, int torque, String marca, String modelo, int anio, String tipoVehiculo) {
        Camion ci = new Camion(450,700,"MAC","DB",2008,"C");
        Motocicleta m = new Motocicleta(120,300,"Suzuki","DB",2008,"M");
        
        System.out.println("=========================================================\n");
        System.out.println("BIENVENID@ A ' D ALQUILER ANDERSON '\n");
        
        // Clases para Test de Vehiculo incluidas en las subclases
        System.out.println("\nNota: Previo a realizar el alquiler de un vehiculo. Realice las pruebas pertinentes para el vehiculo a Rentar");

        /*
        c.desplegarInformacion();
        ci.desplegarInformacion();
        m.desplegarInformacion();
        */
        /*
        c.encenderVehiculo();
        ci.encenderVehiculo();
        m.encenderVehiculo();
        
        c.acelerar();
        ci.acelerar();
        m.acelerar();
        */
 
        vh.calculadoraGasolina();
        
    }
}
