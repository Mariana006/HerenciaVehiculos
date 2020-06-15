public class ComCa extends Camion{
public ComCa(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,double altura){
       
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,altura);
    }
public void  CombiCa(){
if(nRuedas >6 && nRuedas<=6){
   System.out.println("El tipo de vehiculo es un Camion hay"+" "+nPasajero+" "+"abordo"+" "+"tiene"+" "+nRuedas+" "+"ruedas"+" "+"fecha de fabricacion"+" "+fechaMatri);        
} 
else if(presenPasajero >=30){
System.out.println("El tipo de vehiculo es un Camion hay"+" "+nPasajero+" "+"abordo"+" "+"tiene"+" "+nRuedas+" "+"ruedas"+" "+"fecha de fabricacion"+" "+fechaMatri);        
}
if(nRuedas >6 && nRuedas<=6 && presenPasajero >=30 ){
System.out.println("El tipo de vehiculo es un Camion hay"+" "+nPasajero+" "+"abordo"+" "+"tiene"+" "+nRuedas+" "+"ruedas"+" "+"fecha de fabricacion"+" "+fechaMatri);        
        
}
else if(altura>=1.800 && altura<=1.380){
System.out.println("El tipo de vehiculo es un Camion hay"+" "+nPasajero+" "+"abordo"+" "+"tiene"+" "+nRuedas+" "+"ruedas"+" "+"fecha de fabricacion"+" "+fechaMatri+" "+"altura"+" "+altura);    
}
}
    
}
