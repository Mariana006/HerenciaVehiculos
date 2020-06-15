public class ConDHeli extends Helicoptero {
    public ConDHeli(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,int nPalas){
       
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,nPalas);
    }
public void CoHeli(){
  if(nPalas >0 && nPalas<=3){
System.out.println("El vehiculo es un Helicóptero fecha de Fabricación "+" "+fechaMatri+" "+"Marca"+" "+marca+" "+"tiene"+" "+nPalas+" "+"palas");      
  }  
    }
}
