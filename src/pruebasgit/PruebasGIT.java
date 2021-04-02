
package pruebasgit;

import java.util.Scanner;
public class PruebasGIT {

 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
                
        String[] alumnos = {"Jose","Juan","Fulanito","Concha","Chirajita"};
        int[] notas = {5,8,3,7,10};
       
        String buscar = "";
        System.out.println("Ingrese nombre del alumno: ");
        buscar = teclado.nextLine();
        
        //for(int i = 0; i < alumnos.length; i++)
        //for(int j = 0; j < notas.length; j++)
            
        //if(buscar.equals(alumnos[i])){
            if (buscar.equals(alumnos[0])){
               System.out.println("Su nota es: " + notas[0]); 
            }else if (buscar.equals(alumnos[1])){
               System.out.println("Su nota es: " + notas[1]);  
            }else if (buscar.equals(alumnos[2])){
               System.out.println("Su nota es: " + notas[2]);
            }else if (buscar.equals(alumnos[1])){
               System.out.println("Su nota es: " + notas[1]);
            }else if (buscar.equals(alumnos[3])){
               System.out.println("Su nota es: " + notas[3]);
            }else System.out.println("Su nota es: " + notas[4]);
         //}else{
           // System.out.println("Este alumno no se encuentra en nuestra base de datos");
        //}
    }
}
    

