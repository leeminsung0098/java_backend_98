package Day7;

public class ConstructorChain {
    public static void main(String[] args) {
        // 모든 객체는 생성자를 호출해서 만든다.
        // 생성자 연쇄 호출>> 자식 객체를 만들 때 부모 생성자를 먼저 호출

        new Animal(); //Animal 생성자 호출.
        new Dog(); // Animal , Dog 생성자 호출


    }
}

class Animal{
    Animal(){
        System.out.println("애니말");
    }
}

class Mammalia extends Animal{
    Mammalia(){
        System.out.println( "포유류");
    }
}
class Dog extends Mammalia{
    Dog(){
//        Mammalia(); // 부모를 언급할 때는 클래스이름으로 언급 x . 부모를 언급하는 키워드 super
        super();
        System.out.println("도그");
    }
}
