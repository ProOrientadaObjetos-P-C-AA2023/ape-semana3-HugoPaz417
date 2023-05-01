package Problema4;

public class Sistema {
    private String sistemaOp;
    private double tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoFinal;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String informacionIMEI;
    //CONSTRUCTORES
    public Sistema(){}
    public Sistema(String sistemaOp, double tamanioPantalla,double costoInicial,double ivaPorcentaje,String direccionMac,
                   String informacionIMEI){
        this.sistemaOp=sistemaOp;
        this.tamanioPantalla=tamanioPantalla;
        this.costoInicial=costoInicial;
        this.ivaPorcentaje=ivaPorcentaje;
        this.direccionMac=direccionMac;
        this.informacionIMEI=informacionIMEI;
    }
    //SET
    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }

    public void setTamanioPantalla(double tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public void setInformacionIMEI(String informacionIMEI) {
        this.informacionIMEI = informacionIMEI;
    }
    //GET

    public String getSistemaOp() {
        return this.sistemaOp;
    }

    public double getTamanioPantalla() {
        return this.tamanioPantalla;
    }

    public double getIvaPorcentaje() {
        return this.ivaPorcentaje;
    }

    public String getDireccionMac() {
        return this.direccionMac;
    }

    public String getInformacionIMEI() {
        return this.informacionIMEI;
    }

    public double getcalcularIvaCostoInicial() {
        return this.ivaCostoInicial;
    }
    public double getcalcularCostoFinal() {
        return this.ivaCostoInicial;
    }
    private double getivaCostoInicial() {
        return this.ivaCostoInicial;
    }
    private double getCostoFinal(){
        return this.costoFinal;
    }
    //CALCULAR IVA
    public void calcularIvaCostoInicial(){
        this.ivaCostoInicial=costoInicial*(ivaPorcentaje/100);
    }
    public double calcularCostoFinal(){
        return this.costoFinal;
    }
    //TO STRING
    public String toString(){
        return String.format("SISTEMA EQUIPO CELULARES \n"
                        +"\n SISTEMA OPERATIVO: %s"
                        +"\n TAMAÑO DISPOSITIVO: %f pulgadas"
                        +"\n COSTO INICIAL: %.10s"
                        +"\n IVA: %s"
                        +"\n COSTO FINAL: %f$"
                        +"\n DIRECCION MAC: %s"
                        +"\n INFORMACION MEI: %s"
                ,this.getSistemaOp(),this.getTamanioPantalla(),this.getCostoFinal(),this.getIvaPorcentaje(),
                this.getcalcularCostoFinal(),this.getDireccionMac(),this.getInformacionIMEI());
    }

}
