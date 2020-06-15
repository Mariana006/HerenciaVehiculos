public class Comparacion extends Vehiculo{
    
public Comparacion(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca){
       
super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca);
    
    
    
    }
     public void VehiculoEs(){
        
//Carro
if(nRuedas==4){
    System.out.println("El tipo de vehiculo es un Carro"+" "+"tiene"+" "+nRuedas+" "+"ruedas");
}
else if (nPuertas >1 && nPuertas <=4){
    System.out.println("El tipo de vehiculo es un Carro"+" "+"tiene"+" "+nPuertas+" "+"puertas");
}    
if(nRuedas==4 && nPuertas >1 && nPuertas <=4 ){
    System.out.println("El tipo de vehiculo es un Carro"+" "+"tiene"+" "+nRuedas+" "+"ruedas"+" "+"tiene"+" "+nPuertas+" "+"puertas");
}         
    }
    
    
}
