package data;


import java.util.ArrayList;
import java.util.List;

import Entidades.Persona;

public class Personadata {
    List<Persona> lis= new ArrayList<Persona>();
    
    public void create(Persona p ) {

        System.out.println("create");
        lis.add(p);
        
    }
    public List<Persona> list(String filter){
        System.out.println(lis);
        
        System.out.println("list jejejejej");
        return lis;
        
    }

    public Persona get(int id){
        Persona d=new Persona();

        System.out.println("get ");
        return d;
    }

    
    public void update( int id) {
        
    }

    public void delete( int id) {
                
    }
}
