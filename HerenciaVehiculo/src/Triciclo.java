public class Triciclo extends Vehiculo {
  String mecanismo;
  
  public Triciclo (int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,String mecanismo){
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca);
    this.mecanismo=mecanismo;
    
  }

    public String getMecanismo() {
        return mecanismo;
    }

    public void setMecanismo(String mecanismo) {
        this.mecanismo = mecanismo;
    }
  
  public void mosDaTiciclo(){
        System.out.println("Sistema de Mecanismo:"+" "+mecanismo);
  }
}
