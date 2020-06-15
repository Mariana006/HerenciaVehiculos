public class Tren extends Vehiculo {
     String FuEnergia;
public Tren (int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,String FuEnergia){
       
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca);
    this.FuEnergia=FuEnergia;
    }

    public String getFuEnergia() {
        return FuEnergia;
    }

    public void setFuEnergia(String FuEnergia) {
        this.FuEnergia = FuEnergia;
    }
public void mosDaTren(){
    System.out.println("Fuente de energia es:"+" "+FuEnergia);
}    

}
