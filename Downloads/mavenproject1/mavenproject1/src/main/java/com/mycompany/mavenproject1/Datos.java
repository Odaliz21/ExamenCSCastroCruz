
package com.mycompany.mavenproject1;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
        
public class Datos {
    
    public static Collection<Persona> generaDatosPersona(){
        List<Persona> result = new LinkedList<>();
        result.add(new Persona("Naruto","Uzumaki"));
        result.add(new Persona("Sasuke","Uchiha"));
        result.add(new Persona("Sakura","Haruno"));
        result.add(new Persona("Kakashi","Hatake"));
        result.add(new Persona("Shino","Aburame"));
        result.add(new Persona("Kiba","Inuzuka"));
        result.add(new Persona("Kurenai","Eyuga"));
        result.add(new Persona("Shikamaru","Yuhi"));
        result.add(new Persona("Ino","Nara"));
        result.add(new Persona("Choji","Yamanaka"));
        result.add(new Persona("Asuma","Akimichi"));
        result.add(new Persona("Rock","Sarutobi"));
        result.add(new Persona("Neji","Lee"));
        result.add(new Persona("Maito","Gai"));
        return result;
        
    }
    
}
