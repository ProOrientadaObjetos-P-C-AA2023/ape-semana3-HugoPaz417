package Problema4;

public class Ejecutor {
    public static void main(String[] args) {
        Sistema sistema=new Sistema();
        Sistema sistema1=new Sistema("ANDROID",6.42,420,12.9,"01:3a:1d:54:6b:32","4865 590625 635");
        sistema1.calcularIvaCostoInicial();
        sistema1.calcularCostoFinal();
        System.out.println(sistema1);
    }
}