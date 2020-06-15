public class Bicicleta extends Vehiculo {
    int nVelocidades;
   
public Bicicleta(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,int nVelocidades){
   super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca);
   
   this.nVelocidades=nVelocidades;
   
    }

    public int getnVelocidades() {
        return nVelocidades;
    }

    public void setnVelocidades(int nVelocidades) {
        this.nVelocidades = nVelocidades;
    }
    public void mostrarDaBicicleta(){
        System.out.println("Velocidades:"+nVelocidades);
    }
    

}
