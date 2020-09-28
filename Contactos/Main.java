import java.util.Scanner;

import Entidades.Persona;
import data.Personadata;

public class Main {

    public static void main(String[] args) {

        Personadata data= new Personadata();
        data.create(new Persona());

        Scanner input = new Scanner(System.in);
        //System.out.println("Ingrese nombre:");
        //String name = input.nextLine();
        //System.out.println("Escribiste: "+name);

        int opt = 0;
        do{
        System.out.println("******Menu de Alexander****");
            System.out.println("1 Lista ");
            System.out.println("2 New ");
            System.out.println("3 Delete ");
            System.out.println("0 Exit ");
            System.out.println("Choice option: ");
            opt = input.nextInt();
            System.out.println("You Chosed: "+ opt);
            input.nextLine();

            switch (opt){
                case 1: System.out.println("Opcion 1 elegida");
                    Persona p= new Persona();
                    System.out.println("Ingrese nombre: ");
                    p.setName(input.nextLine());
                    System.out.println("Ingrese sexo: ");
                    p.setSex(input.nextLine()); 
                    System.out.println("Name= "+ p.getName() + " \t Sex= "+ p.getSex());
                    p.laugh();
        
                break;
                case 2: System.out.println("Opcion 2 Elegida");
                
                break;

                default: System.out.println("Opcion no valida");
            }
        }while (opt != 0); 
                
            
    }
        

}