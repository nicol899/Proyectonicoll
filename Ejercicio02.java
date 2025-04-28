import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
un postulante a un empleo, realixa un test de capacitacion, se obtuvo la siguiente informacion: cantidad total de preguntas
que se le realizaron y la 
cantidad de preguntas que contesto correctamente. se pide confeccionar un programa que 
ingrese los dos datos por teclado e informe ek nivel del mismo 
segun el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
    Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
       */
      Scanner input = new Scanner (System.in);
      System.out.println("ingrese la cantidad de preguntas:");
      int preguntas = input.nextInt();
      System.out.println("ingrese las preguntas contestadas correctamente: ");
      int correctas = input.nextInt();

      input.close();

      float divicion = correctas/preguntas;
      float porcentaje = divicion*100;
      System.out.println("porcentaje:" + porcentaje + "%");


      if (porcentaje>90){
        System.out.println("nivel maximo");
      }else{

        if (porcentaje>=75 && porcentsje<90){
            System.out.println("nivel medio");
        }else{
            if (porcentaje>=50 && porcentaje<75){
                System.out.println("nivel regular");

            }else{
                if (porcentaje<50){

                 }
             }
        }
    }

   }
}
