public class ConDMoto extends Moto{
    public ConDMoto(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,String sistemaArranque){
     super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,sistemaArranque);
    }   
 public void CMo(){
   if(nRuedas ==2){
   System.out.println("El vehiculo es una Moto fecha de Matriculación"+" "+fechaMatri+" "+"Marca"+" "+marca);
   }      
    }
}
