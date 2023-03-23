package javaoop.exercises._3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student {

    //PRIMO ESERCIZIO !!
    //tutte 'ste variabili saranno accessibili SOLO dentro QUESTA CLASSE

    private int i= 1;
    private String names;
    private Integer ages;

    private String courseName;
    private int maxStudents;

    private int studentsPresentNow;

    private static int contatore= 0; //per l'esercizio 2!! -- x contare dentro un getter quante volte la funzione viene chiamata!!
    //deve partire da zero!! -- serve dichiararlo e poi lo si va ad usare!!



    void setNames(String names){

        if(names.matches(".*\\d.*")){
            System.out.println("\n Nome NON valido! Riscrivilo SENZA numeri per favore!");
        } else {
            this.names = names; //constrains x l'esercizio 2!!
        }

    }


    String getNames(){ //<<-- getter x names
        System.out.println("\n Studente " + i++  + " - nome : " ); //così stampa
        return this.names;
    }

    void setAge(Integer ages){ //<<--setter x età

        if(ages < 0){
            System.out.println("\n L'età non può essere un numero negativo!");
        } else {
            this.ages = ages;
        }

    }

    Integer getAges(){ //<<--getter x età
        System.out.println("\n - età :" );
        return this.ages;
    }



    void setCourseName(String courseName){

        if(courseName.matches(".*\\d.*")){
            System.out.println("\n Corso NON valido! Sicuro di averlo scritto bene?? ");
        }else{
            this.courseName= courseName;
        }
    }

    String getCourseName(){

        contatore++; //Così conta quante volte viene richiamata questa funzione!!

        System.out.println("\n nome corso :"); //così stampa 'sta frase e poi fa il return del valore assegnato in 'Exercises'

        return this.courseName;

    }

    public static void getContatore() { //<<-- contatore per l'esercizio 2!!

        System.out.println("\n volte: " + contatore); //così stampa 'sta frase ("volte") e poi fa con quel più richiama il contatore
        // il cui valore nel frattempo sarà cresciuto nel getter di 'coruseName' -- stamperà così il num. di volte in cui quel getter è stato stampato!!

    }

    void setMaxStudents(Integer maxStudents){

        this.maxStudents = maxStudents;
    }

    Integer getMaxStudents(){
        System.out.println("\n Massimo studenti: "); //così stampa 'sta frase e -
        // |
        // | qua fa il return  del valore assegnato in 'Exercises'
        return this.maxStudents;
    }

    void setStudentsPresentNow(Integer studentsPresentNow){
        this.studentsPresentNow = studentsPresentNow;
    }

    Integer getStudentPresentNow(){
        System.out.println("\n Studenti presenti ora: "); //così stampa 'sta frase

        // e poi fa il return del valore assegnato in 'Exercises'
        return this.studentsPresentNow;
    }





}
