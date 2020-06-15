import java.util.Scanner;
public class Principal {

    public static void main (String [] args){
     Scanner entrada=new Scanner (System.in);
    
  
                System.out.println("Ingrese el numero de pasajeros:");
                 int nPasajero=entrada.nextInt();
                System.out.println("Ingrese numero de pasajeros en abordo:"); 
                 int presenPasajero=entrada.nextInt();  
                System.out.println("Ingrese numero de pasajeros en ausencia:"); 
                 int auTrip=entrada.nextInt();
                System.out.println("Ingrese numero de ruedas:");
                int nRuedas=entrada.nextInt();
                System.out.println("Ingrese numero de puertas:");
                int nPuertas=entrada.nextInt();
                System.out.println("Ingrese la fecha de fabricacion:");
                String fechaMatri=entrada.nextLine();
                entrada.nextLine();
                System.out.println("Razon de desplazamiento:");
                String razonDespla=entrada.nextLine();
                System.out.println("Medio por la cual se deplaza:");
                String medioDespla =entrada.nextLine();
                System.out.println("Ingrese la marca:");
                String marca=entrada.nextLine();
System.out.println("--------------------------------------------------------------------");
                //Carro    
                System.out.println("Ingresa el Kilometraje:");
                double kilome=entrada.nextDouble();
                
                // Avion
                System.out.println("Ingresa la capacidad de Tanque:");
                int capacidadTanque=entrada.nextInt();
                
                //Bicicleta 
                System.out.println("Ingresa el numero de velocidades:");
                int nVelocidades=entrada.nextInt();
                
                //Camion 
                System.out.println("Ingresa la altura que tiene el vehiculo:");
                double altura=entrada.nextDouble();
                
                //Helicoptero
                System.out.println("Ingrese numero de palas:");
               int  nPalas=entrada.nextInt();
               
               //Moto  
               System.out.println("Ingrese el sistema de arranque del vehiculo:");
               String sistemaArranque=entrada.nextLine();
            entrada.nextLine();
               //Patin , patineta 
               System.out.println("Ingrese el materia de que esta echo el vehiculo:");
               String material=entrada.nextLine();
               
               //Tren
               System.out.println("Ingrese el tipo de combustible que utiliza el vehiculo:");
               String FuEnergia=entrada.nextLine();
               
               //Triciclo               
               System.out.println("Ingrese el sistema de mecanismo:");
              String  mecanismo=entrada.nextLine();
   
System.out.println("------------------------------------------------------------------------------------------");
             
         
Vehiculo infV= new  Vehiculo (nPasajero,presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca);
    infV.MostararDatosVehi();
           
Carro infC=new Carro(nPasajero,presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,kilome);
    infC.mosDaCarro();
  
Avion infA =new Avion(nPasajero,presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,capacidadTanque);
    infA.mostrarDaAvio();
    
Bicicleta infB=new Bicicleta(nPasajero,presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,nVelocidades);
    infB.mostrarDaBicicleta();
    
Camion infCa =new Camion(nPasajero,presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,altura);
    infCa.mostrarDatoCamion();
    
Carro infaCarro =new Carro(nPasajero,presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,kilome);
   infaCarro.mosDaCarro();

Helicoptero infH=new Helicoptero(nPasajero,presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,nPalas);
   infH.mosDaHelicoptero();
   
Moto infMoto =new Moto(nPasajero,presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,sistemaArranque);
    infMoto.mosDaMoto();
   
Patin infPatin =new Patin(nPasajero,presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,material);
   infPatin.mosDaPatin();
   
Patineta infPatienta=new Patineta(nPasajero,presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,material);
   infPatienta.mosDaPatineta();
 
   //Mostrar condiciones
   //Avion
ComAv MosA=new ComAv(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,capacidadTanque);
   MosA.CoA();
   //Bicicleta
ComBi MosB=new ComBi(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,nVelocidades);
   MosB.CoB();
   //Camion
ComCa MosCa=new ComCa(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,altura);
   MosCa.CombiCa();
   //Carro
ConCar MosCarr=new ConCar(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,kilome);
  MosCarr.CCarr();
   // Helicoptero
ConDHeli CoHe=new ConDHeli(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,nPalas);
  CoHe.CoHeli();
  //Moto
ConDMoto CMoto=new ConDMoto(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,sistemaArranque);
  CMoto.CMo();
  //Patin
ConPatin Cpatin=new ConPatin(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,material);
  Cpatin.CPatin();
  //Patineta
ConDPatineta Cpatineta=new ConDPatineta(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,material);
   Cpatineta.CPatine();       
 //Tren
ConTren cTren =new ConTren(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,FuEnergia);
cTren.CTren();
// Triciclo
CoDiTri cT=new CoDiTri(nPasajero, presenPasajero,auTrip,nRuedas,nPuertas,fechaMatri,razonDespla,medioDespla,marca,mecanismo);
cT.ConTri();
    }
}