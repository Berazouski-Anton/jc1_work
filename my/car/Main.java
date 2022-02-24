package my.car;

public class Main {
    public static void main(String[] args) {
Man myMan2;
Man myMan = new Man();
System.out.println(myMan.getAge());

myMan2 = myMan;
System.out.println(myMan2.getAge());
myMan2.age = 25;
System.out.println(myMan2.getAge());
System.out.println(myMan.getAge());
    }
}
