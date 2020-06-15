public class CoDiTri extends Triciclo {
public CoDiTri (int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,String mecanismo){
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,mecanismo);  
  }
public void ConTri(){
    if(nRuedas ==3 ){
System.out.println("El vehiculo es un Triciclo tiene"+" "+nRuedas+" "+"ruedas");
    }
} 
}
