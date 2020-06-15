public class Moto extends Vehiculo{
    
  String sistemaArranque;
 
 public Moto(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,String sistemaArranque){
     super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca);
          this.sistemaArranque=sistemaArranque;    
 }

    public String getSistemaArranque() {
        return sistemaArranque;
    }

    public void setSistemaArranque(String sistemaArranque) {
        this.sistemaArranque = sistemaArranque;
    }
 public void mosDaMoto(){
       System.out.println("Sistema de Arranque:"+" "+sistemaArranque);
 }
 
}
