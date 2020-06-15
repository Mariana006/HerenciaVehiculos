public class Helicoptero extends Vehiculo {
     int nPalas;
    
public Helicoptero(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,int nPalas){
       
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca);
    this.nPalas=nPalas;
    }

    public int getTipoHelicop() {
        return nPalas;
    }

    public void setTipoHelicop(String tipoHelicop) {
        this.nPalas = nPalas;
    }
    public void mosDaHelicoptero(){
        System.out.println("El nuermo de Palas es:"+" "+nPalas);
    }
}
