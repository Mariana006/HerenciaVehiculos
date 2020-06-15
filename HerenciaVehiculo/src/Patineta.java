public class Patineta extends Vehiculo {
  String material;
 
 public Patineta (int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca,String material){
       
    super(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca);
    this.material=material;
 }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
 public void mosDaPatineta(){
      System.out.println("Material de que esta echo el Vehiculo:"+" "+material);
 }

}
