package agenda.control.jpa;


import agenda.model.Person;

public class ConexionJPA {

    public static void main(String[] args) {
        jpaPerson jpa = new jpaPerson();

        // Insertar un contacto
        //Falta corregir
        Person nuevaPerson = new Person();
        nuevaPerson.setFirstName("Odaliz");
        nuevaPerson.setLastName("Castro");
        nuevaPerson.setStreet("xd");
        nuevaPerson.setPostalCode("10");
        nuevaPerson.setCity("");
        nuevaPerson.setBirthday("octubre");

        jpa.InsertarPerson(nuevaPerson);

        // Cargar y mostrar todos los contactos en la base de datos
        jpa.InsertarPerson().foreach(person -> {
            System.out.println(person.getFirstName() + " " + person.getLastName() + " " + person.getStreet()+ " " + person.getPostalCode()+ " " + person.getBirthday() )
                  ;
        });
    }
}// TODO code application logic here

