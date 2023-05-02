package Problema1;
public class Terreno {
    private double costoTerreno;
    private double anchoTerreno ;
    private double largoTerreno;
    private double areaTerreno;
    private double valorMetroCuadrado;
    public Terreno(){}
    public Terreno(double anchoTerreno,double largoTerreno,double valorMetroCuadrado){
        this.anchoTerreno=anchoTerreno;
        this.largoTerreno=largoTerreno;
        this.valorMetroCuadrado=valorMetroCuadrado;
    }
    public void setAnchoTerreno(double anchoTerreno){
        this.anchoTerreno=anchoTerreno;
    }
    public double getAnchoTerreno() {
        return this.anchoTerreno;
    }
    public void setLargoTerreno(double largoTerreno){
        this.largoTerreno=largoTerreno;
    }
    public double getLargoTerreno(){
        return this.largoTerreno;
    }
    public void setValorMetroCuadrado(double valorMetroCuadrado){
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    public double getValorMetroCuadrado(){
        return this.valorMetroCuadrado;
    }
    public void CalcularAreaTerreno(){
        this.areaTerreno= largoTerreno*anchoTerreno;
    }
    public void CalcularCostoTerreno(){
        this.costoTerreno= areaTerreno * valorMetroCuadrado;
    }
    public double getCalcularAreaTerreno(){
        return this.areaTerreno;
    }
    public double getCalcularCostoTerreno(){
        return this.costoTerreno;
    }
    public String toString(){
        return String.format("SU TERRENO CON LOS SIGUIENTES PARAMETROS:"
                        +"\n ANCHO DEL TERRENO: %.2fm"
                        +"\n LARGO DEL TERRENO: %.2fm"
                        +"\n VALOR POR METRO CUADRADO: %.2f"
                        +"\n AREA DEL TERRENO: %.2f"
                        +"\n COSTO DEL TERRENO: %.2f"
                ,this.getAnchoTerreno()
                ,this.getLargoTerreno()
                ,this.getValorMetroCuadrado()
                ,this.getCalcularAreaTerreno()
                ,this.getCalcularCostoTerreno());
    }
}