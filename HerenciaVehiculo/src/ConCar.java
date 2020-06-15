public class ConCar extends Carro{
public ConCar(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,double kilome){
       
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,kilome);
}
public void CCarr(){
if(kilome>=10 && kilome<=35){
     System.out.println("El vehiculo es un Carro , fecha de fabricacion es:"+" "+fechaMatri+" "+"marca"+marca+" "+"Kilometraje"+" "+kilome);
 }   
else if (kilome>=10 && kilome<=35 && nRuedas==4){
System.out.println("El vehiculo es un Carro , fecha de fabricacion es:"+" "+fechaMatri+" "+"marca"+marca+" "+"Kilometraje"+" "+kilome+" "+"ruedas"+nRuedas);  
 }
if(nRuedas==4){
System.out.println("El vehiculo es un Carro , fecha de fabricacion es:"+" "+fechaMatri+" "+"marca"+marca+" "+"Kilometraje"+" "+kilome+" "+"ruedas"+nRuedas);
}
}
}
