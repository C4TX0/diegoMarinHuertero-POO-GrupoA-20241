public class Person {
    String name;
    int age;

    String gender;

    Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void print(){
        System.out.print(name+" ");
        System.out.print(age+" ");
        System.out.print(gender+" ");
        System.out.println();
    }
}