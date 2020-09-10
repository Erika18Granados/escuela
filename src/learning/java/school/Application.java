package learning.java.school;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Application {

    public static void main(String[] args) {
        Student[] estudiante = new Student[]{
                new Student("Sofia", "123"),
                new Student("Carmen","456"),
                new Student("Fernando","789"),
                new Student("Mario","012")
        };

        System.out.println("los alumnos son: ");

        Scanner scanf = new Scanner (System.in);

        for(int i = 0; i < estudiante.length; i++) {
            System.out.println(estudiante[i].getName() + " " + estudiante[i].getCode());

            System.out.println("Asistio a clase?");
            String respuesta = scanf.next("[YNyn]");

            System.out.println(estudiante[i].getName() + " " + (respuesta.equalsIgnoreCase("Y") ? "Si" : "No"));
        }
    }
}
