

class Bike2 extends Veicolo{  

  void  run(){System.out.println( "La bici sta correndo in sicurezza" );} //metodo della classe genitore 

  public static void  main(String args[]){    

     Bike2 obj =  new  Bike2(); //crea oggetto  

     obj.run();  

  }  
}  
