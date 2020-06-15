public class Patin extends Vehiculo {
 String material;
    
    public Patin(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,String material){
    
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca);
    this.material=material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void mosDaPatin(){
        System.out.println("Material que esta elaborado el Vehiculo:"+" "+material);
    }
    
}
