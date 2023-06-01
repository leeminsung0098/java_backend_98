package Day5;

public class Day5 {
    public static void main(String[] args) {
        // static은 자원의 공유를 위해 사용. 모든 객체가 하나의 자원을 공유.
        // static은 객체지향을 위반한다.(캡슐화 위반.)
        Person Hum1 =new Person();
        Hum1.no=1;
        Hum1.age=20;
        Hum1.name="홍길동";

        Person Hum2 = new Person();
        Hum2.no=2;
        Hum2.age=25;
        Hum2.name="이순신";

        Hum1.introduce();
        Hum2.introduce();

        //static은 static 자원만 사용가능.
        //non-static은 static 사용가능하다..

        //변수든 메서드든 굳이 static을 붙여서 사용하지 않아도 거의 모든 작업이 가능.
        //유틸 클래스같은 경우는 static을 붙여서 사용하면 편하다.

    }
}
class Person{
    static int no;

    int age;

    String name;

    public void introduce(){
        System.out.printf("%d번 %s입니다.\n",no,name);
    }
}
