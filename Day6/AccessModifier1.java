package Day6;
import Day6.test.Test;
public class AccessModifier1 { //접근제어자
    public static void main(String[] args) {
        // 객체지향 3요소 -캡슐화 , 상속 , 다형성.
        Test2 t1 = new Test2();

//        System.out.println(t1.num);

        Test t2 = new Test();

        System.out.println(t2.num);
        t1.printNum();


    }
}

class Test2{
   private int num = 10; // = defaiult

    public void printNum(){
        System.out.println("20");
    }


}