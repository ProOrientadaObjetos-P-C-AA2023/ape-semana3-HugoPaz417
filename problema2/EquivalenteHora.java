package Problema2;
public class EquivalenteHora {
        private int horas;
        private int dias;
        private int minutos;
        private int segundos;
        public EquivalenteHora(){
        }
        public EquivalenteHora (int horas){
            this.horas=horas;
        }
        public void setHoras(int horas){
            this.horas=horas;
        }
        public int getHoras(){
            return this.horas;
        }
        public void calcularEquivalenteMinutos (){
            this.minutos=this.horas*60;
        }
        public void calcularEquivalenteSegundos () {
            this.segundos = this.minutos*60;
        }
        public void calcularEquivalenteDias () {
            this.dias = this.horas/24;
        }
        public int getCalcularMinutos(){
            return this.minutos;
        }
        public int getCalcularSegundos(){
            return this.segundos;
        }
        public int getCalcularDias(){
            return this.dias;
        }
        @Override
        public String toString(){
            return String.format("EL EQUIVALENTE ES:"+
                    "\n DIAS: %s"+
                    "\n HORAS: %s"+
                    "\n MINUTOS: %s"+
                    "\n SEGUNDOS: %s",
                    this.getCalcularDias(),this.getHoras(),this.getCalcularMinutos(),this.getCalcularSegundos());
        }
}