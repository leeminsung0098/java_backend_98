package Day5;

public class StaticTest {
    static int num = 10;
    public static void printValue(String 안녕){
        System.out.println(안녕);
    };

    public static void main(String[] args) {
        // 문제 : 아래 코드가 실행되도록 자동차 클래스를 만들어주세요.

        자동차.달리다();

        System.out.println(num); // 출력 : 10

        printValue("안녕");
        // 출력 : 안녕



    }
}
class 자동차{
    public static void 달리다(){

    }
}
