package Problema3;
public class Ejecutor {
    public static void main(String[] args) {
        InstitucionesEducativas institucion_Educativas=new InstitucionesEducativas();
        InstitucionesEducativas institucion_Educativas1=new InstitucionesEducativas(
                "UNIDAD EDUCATIVA FISCOMISIONAL SAN FRANCISCO DE ASÍS","FISCOMISIONAL",
                1500,90,4,25.20,34.0);

        institucion_Educativas1.CalcularPresupuesto();
        System.out.println(institucion_Educativas1);

    }
}
