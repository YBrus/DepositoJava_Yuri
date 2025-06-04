public class EsempioIncapsulamento {

    public static void main(String[] args) {
        Persona persona = new Persona("Mario",15);//istanza dell'oggetto della classe Persona
        System.out.println(persona.getNome());//uso metodo getNome per stampare la variabile nome della classe Persona
        persona.stampaStatus(); //utilizzo metodo pubblico della classe Persona
        
        persona.setNome("Gino"); //uso metodo setNome per modificare la variabile nome della classe Persona
        System.out.println(persona.getNome());
        persona.setEta(22);//uso metodo setEta per modificare la variabile eta della classe Persona
        persona.stampaStatus();
    }
}