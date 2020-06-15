public class ComAv extends Avion {
public ComAv(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,int capacidadTanque){
        
super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,capacidadTanque);
    }
    
public void CoA(){
       
if(capacidadTanque>=200){
System.out.println("El tipo de vehiculo es un Avion cuenta con"+" "+presenPasajero+" "+"abordo su fecha de fabricación"+" "+fechaMatri+" "+"el medio donde se desplaza es en el"+" "+medioDespla+" "+"marca:"+marca+" "+"cuenta con"+" "+capacidadTanque+" "+"litros");
} 
}
}

