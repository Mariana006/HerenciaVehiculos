public class ConPatin extends Patin {
    public ConPatin(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,String material){
    
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,material);
    
    }
public void CPatin(){
if (nRuedas >0 && nRuedas<=4){
  System.out.println("El vehiculo es un Patin fecha de matriculación"+" "+fechaMatri+" "+"tiene"+nRuedas);  
}        
    }
}
