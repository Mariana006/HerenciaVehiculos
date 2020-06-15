
public class Carro extends Vehiculo {
     double kilome;
    
public Carro(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,double kilome){
       
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca);
     this.kilome=kilome;   
    }

    public double getKilome() {
        return kilome;
    }

    public void setKilome(int kilome) {
        this.kilome = kilome;
    }
    public void mosDaCarro(){
        System.out.println("Kilometraje:"+kilome);
    }
    public void EsCarro(){
        System.out.println("Tu vehiculo es un Carro, su fecha de fabricacion es"+" "+fechaMatri+" "+"Marca"+" "+marca+" "+"Kilometraje"+" "+kilome);
    }
}
