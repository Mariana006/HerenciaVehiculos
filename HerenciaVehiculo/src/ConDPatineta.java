public class ConDPatineta extends Patineta {
    public ConDPatineta (int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,String material){
       
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,material);
    }
    
public void CPatine(){
  if(nRuedas>1 && nRuedas<=4 ){
   System.out.println("El vehiculo es una Patineta"+" "+"ruedas:"+" "+nRuedas);
  }  
}    
}
