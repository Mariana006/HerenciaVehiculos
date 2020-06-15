public class ComBi extends Bicicleta {
    
    public ComBi(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,int nVelocidades){
   super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,nVelocidades);
        }
public void CoB(){
if (nVelocidades >1 && nVelocidades<=10){

System.out.println("El tipo de vehiculo es una Bicicleta ,la fecha de fabricaciones"+" "+fechaMatri+" "+"Marca"+" "+marca+" "+"Cuenta con"+" "+nVelocidades+" "+"velocidades");
    
        }
else if(presenPasajero >1 && presenPasajero<=2 && nVelocidades >1 && nVelocidades<=10 ){
System.out.println("El tipo de vehiculo es una Bicicleta  ,la fecha de fabricaciones"+" "+fechaMatri+" "+"Marca"+" "+marca+" "+"Cuenta con"+" "+nVelocidades+" "+"velocidades"+" "+"van"+" "+presenPasajero+" "+"abordo");
}
if(nRuedas>2 && nRuedas<=2){
System.out.println("El tipo de vehiculo es una Bicicleta  ,la fecha de fabricaciones"+" "+fechaMatri+"Marca"+" "+marca+" "+" "+"tiene"+nRuedas+" "+"ruedas");
}
else if (nVelocidades >1 && nVelocidades<=10 && presenPasajero >1 && presenPasajero<=2 && nRuedas>2 && nRuedas<=2){
System.out.println("El tipo de vehiculo es una Bicicleta  ,la fecha de fabricaciones"+" "+fechaMatri+" "+"Marca"+" "+marca+" "+"Cuenta con"+" "+nVelocidades+" "+"velocidades"+" "+"van"+" "+presenPasajero+" "+"abordo"+" "+"tiene"+" "+nRuedas+" "+"ruedas");
}
    }
}
