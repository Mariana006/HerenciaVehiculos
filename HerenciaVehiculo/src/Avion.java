public class Avion extends Vehiculo  {
  int capacidadTanque;
public Avion (int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,int capacidadTanque){
     
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca);
    this.capacidadTanque=capacidadTanque;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }
public void mostrarDaAvio(){
    System.out.println("Capacidad de Tanque:"+capacidadTanque);
}
}

