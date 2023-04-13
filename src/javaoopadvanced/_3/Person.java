package javaoopadvanced._3;

public class Person {

    private String name;
    private int age;

    private String address;

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getAddress() {
        return address;
    }


    @Override //<-- 'sovrascrivi'
    public int hashCode() {
        //così mi ritorna l'hash code di questi dati!
        return getName().hashCode() + getAge() + getAddress().hashCode();
    }


    //così non stamperà l'indirizzo di memoria ma ciò che c'è scritto qua!
    @Override //<-- 'sovrascrivi
    public String toString() {
        return "\n nome: " + name + " || età: " + age
                + " || indirizzo: " + address;
    }
}
