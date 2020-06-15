
public class Camion extends Vehiculo  {
   double altura;
public Camion(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,double altura){
       
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca);
    this.altura=altura;
}

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
  
    public void mostrarDatoCamion(){
        System.out.println("La altura es:"+altura);
    }
}