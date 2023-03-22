package javaoop.exercises._2;

public class Student {

    String name = null;
    Integer age = null;


    Student(String name, Integer age) {
        System.out.println("Constructing!");
        this.name = name;
        this.age = age;
        System.out.println("Constructed! " + "\n NomE = " + name
                + " \n Età = " + age); //<<-- così lo stampa meglio!


    }

    Student(String name){ //<<-- questo per stampare SOLO il nome
        this.name=name;
        System.out.println("Constructing only name: " + name);

    }

    Student(Integer age){ //<<-- questo per stampare SOLO l'età
        this.age=age;
        System.out.println("Constructing only Age: " + age);
    }

    Student(){ //<<-- csotruttore con 0 parametri
        System.out.println("Constructing with any parameters");
    }
    @Override
    public String toString() {
        return "Student" +
                " name='" + name + '\'' +
                ", age=" + age;
    }
}
