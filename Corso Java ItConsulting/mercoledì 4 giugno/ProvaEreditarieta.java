public class ProvaEreditarieta {
    
}

class Vehicle { //superclasse genitore

  protected String brand = "Ford";       

  public void honk() {                    
    System.out.println("Tuut, tuut!"); 
    }
}


class Car extends Vehicle { //sottoclasse figlio che estende superclasse padre

  private String modelName = "Fiat";    

  public static void main(String[] args) {

    Car myCar = new Car();

    myCar.honk();

    System.out.println(myCar.brand + " " + myCar.modelName);
    }

}



