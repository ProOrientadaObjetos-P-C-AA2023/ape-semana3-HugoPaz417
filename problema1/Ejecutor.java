package Problema1;
public class Ejecutor {
public static void main(String[] args) {

        Terreno terreno= new Terreno();
        Terreno terreno1= new Terreno(80.5,90.6,14.3);

        terreno1.CalcularAreaTerreno();
        terreno1.CalcularCostoTerreno();
        System.out.println(terreno1);
    }
}