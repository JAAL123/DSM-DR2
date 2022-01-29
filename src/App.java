import java.util.Scanner;
public class App {
    private static int[] notas;
    private Scanner teclado;


    public App(){
        teclado = new Scanner(System.in);
        notas = new int[10];
        int n = 1;
        for(int i = 0; i < notas.length; i++){
            System.out.print("Ingrese la nota del estudiante " + n + ": ");
            notas[i] = teclado.nextInt();
            n= n + 1 ;
        }
    }

    public void contar(){
        int cont1 = 0;
        int cont2 = 0;

        for(int i = 0; i< notas.length; i++){
            if(notas[i] >= 7){
                cont1 = cont1 + 1; 
            }else{
                cont2 = cont2 + 1;
            }
        }

        System.out.println("La cantidad de alumnos que tienen nota mayor a 7 es de: " +cont1);
        System.out.println("La cantidad de alumnos que tienen nota menores a 7 es de: " +cont2);
    }
    public static void main(String[] args){
        App Notas = new App();
        Notas.contar();
    }
}
