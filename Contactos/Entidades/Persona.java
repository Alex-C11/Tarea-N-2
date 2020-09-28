package Entidades;

public class Persona {
    String name;
    String sex;

    public Persona(){

    }
    public Persona(String name){
        this.name=name;
    }
    public Persona(String name, String sex){
        this.name=name;
        this.sex=sex;
        }
    public void laugh() {

        System.out.println(name+" jejejee");
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
}
