package Day5.Inheritance1;

//상속.
public class Inheritance1 {
    public static void main(String[] args) {

        Cat c1= new Cat();
        Dog d1= new Dog();
        c1.meow();
        c1.move();
        d1.bark();
        d1.move();

        Dog d2= new Dog();
        d2.bark();
        d2.move();

        //클래스 안에서 중복된 코드가 발생하는 경우가 있다.
        //상속   ,   상속을 하는 기본적인 방법  extends  --> 모든 코드를 받아버린다.
        //

    }
}

class Animal{
    public void move(){
        System.out.println("움직입니다.!!");
    }
        }

class Cat extends Animal{

    public void  meow(){
        System.out.println("야옹.");
    }
}

class Dog extends Animal {

    public void  bark(){
        System.out.println("멍멍");
    }
}
