package Problema2;
public class Ejecutor {
    public static void main(String[] args) {
        EquivalenteHora horas_0 = new EquivalenteHora();
        EquivalenteHora horas_1 = new EquivalenteHora(84);
        horas_1.calcularEquivalenteDias();
        horas_1.calcularEquivalenteMinutos();
        horas_1.calcularEquivalenteSegundos();
        System.out.println(horas_1);
    }
}
