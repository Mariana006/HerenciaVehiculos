public class Vehiculo {
 int nPasajero;
 int presenPasajero;
 int auTrip;
 int nRuedas;
 int nPuertas;
 String fechaMatri;//fecha de fabricacion
 String razonDespla; //razonamiento de desplazamiento
 String medioDespla;//medio por la cual se desplaza
 String marca;
 

    public int getPasajero() {
        return nPasajero;
    }

    public void setnPasajero(int nPasajero) {
        this.nPasajero = nPasajero;
    }

    public int getPresenPasajero() {
        return presenPasajero;
    }

    public void setPresenPasajero(int presenPasajero) {
        this.presenPasajero = presenPasajero;
    }

    public int getAuTrip() {
        return auTrip;
    }

    public void setAuTrip(int auTrip) {
        this.auTrip = auTrip;
    }

    public int getnRuedas() {
        return nRuedas;
    }

    public void setnRuedas(int nRuedas) {
        this.nRuedas = nRuedas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }

    public String getFechaMatri() {
        return fechaMatri;
    }

    public void setFechaMatri(String fechaMatri) {
        this.fechaMatri = fechaMatri;
    }

    public String getRazonDespla() {
        return razonDespla;
    }

    public void setRazonDespla(String razonDespla) {
        this.razonDespla = razonDespla;
    }

    public String getMedioDespla() {
        return medioDespla;
    }

    public void setMedioDespla(String medioDespla) {
        this.medioDespla = medioDespla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Vehiculo(int nPasajero,int presenPasajero,int auTrip,int nRuedas,int nPuertas,String fechaMatri,String razonDespla,String medioDespla,String marca){
    this.nPasajero=nPasajero;
    this.presenPasajero=presenPasajero;
    this.auTrip=auTrip;
    this.nRuedas=nRuedas;
    this.nPuertas=nPuertas;
    this.fechaMatri=fechaMatri;
    this.razonDespla=razonDespla;
    this.medioDespla=medioDespla;
    this.marca=marca;
    
    
}
 public void MostararDatosVehi(){
System.out.println("Número de pasajeros:"+" "+nPasajero+"\nPresencia de Pasajeros:"+" "+presenPasajero+"\nAusencia de pasajeros:"+auTrip+"\nNumero de Ruedas:"+nRuedas+"\nNumero de puertas"+nPuertas+"\nFecha de Fabricacion"+fechaMatri+"\nRazon de desplazamiento"+razonDespla+"\nMedio de desplazamiento"+medioDespla+"\nMarca"+marca);

 }
}
