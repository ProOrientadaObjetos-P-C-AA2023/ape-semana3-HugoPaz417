package Problema3;
public class InstitucionesEducativas {
    private int numAlumnos;
    private String nomInstitucion;
    private String tipoInstitucion;
    private int numdDocentes;
    private int numSedes;
    private double gastoEstudiante;
    private double presupuesto;
    private double calcularPresupuesto;
    public InstitucionesEducativas(){

    }

    public InstitucionesEducativas(String nomInstitucion,String tipoInstitucion,int numAlumnos,int numdDocentes,int numSedes,
                                   double gastoEstudiante,double presupuesto){
        this.nomInstitucion=nomInstitucion;
        this.tipoInstitucion=tipoInstitucion;
        this.numAlumnos=numAlumnos;
        this.numdDocentes=numdDocentes;
        this.numSedes=numSedes;
        this.gastoEstudiante=gastoEstudiante;
        this.presupuesto=presupuesto;
    }
    //Set
    public void settipoInstitucion(String tipoInstitucion){
        this.tipoInstitucion=tipoInstitucion;
    }
    public void setNumAlumnos(int numAlumnos) {

        this.numAlumnos = numAlumnos;
    }
    public void setNumdDocentes(int numdDocentes) {

        this.numdDocentes = numdDocentes;
    }
    public void setNumSedes(int numSedes) {
        this.numSedes = numSedes;
    }
    public void setGastoEstudiante(double gastoEstudiante) {

        this.gastoEstudiante = gastoEstudiante;
    }

    public void setTipoInstitucion(String tipoInstitucion) {

        this.tipoInstitucion = tipoInstitucion;
    }

    public void CalcularPresupuesto() {

        this.calcularPresupuesto = this.gastoEstudiante*this.numAlumnos;
    }

    //Get

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public int getNumDocentes() {
        return numdDocentes;
    }

    public String getNomInstitucion() {
        return nomInstitucion;
    }

    public double getGastoEstudiante() {
        return gastoEstudiante;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public int getNumSedes() {
        return numSedes;
    }
    public double getCalcularPresupuesto(){return calcularPresupuesto;

    }
    public String toString() {
        return String.format("SU PRESUPUESTO DE INSTITUCION: \n "
                        +"\n NOMBRE: %s"
                        +"\n TIPO: %s"
                        +"\n NUMERO DE ESTUDIANTES: %s"
                        +"\n NUMEERO DE DOCENTES: %s"
                        +"\n NUMERO DE SEDES: %s"
                        +"\n GASTO INSTITUCION ESTUDIANTES: %f"
                        +"\n PRESUPUESTO INSTITUCION: %f"
                ,this.getNomInstitucion(),this.getTipoInstitucion(),this.getNumAlumnos(),this.getNumDocentes(),this.getNumSedes()
                ,this.getGastoEstudiante(),this.getCalcularPresupuesto());

    }

}
