public class ConTren extends Tren {
public ConTren (int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,String FuEnergia){
       
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,FuEnergia);
    }
public void CTren(){
    if(presenPasajero>=50){
     System.out.println("El vehiculo es un Tren fecha de matriculación "+" "+fechaMatri);   
    }        
}
    
}
