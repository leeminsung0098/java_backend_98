package Day6;

public class Casting {
    public static void main(String[] args) {

        int a = 10; // int , short , byte , long

        double b = 19.2;// double , float

        //변수의 타입과 변수에 저장되는 값의 타입이 일치해야한다.

        double c = 10; // 자동형변환

        int e =(int)10.6; // 수도형변환
        // 전혀 관계없는 타입은 형변환 하지않음.  ex) int a = "hello";


    }
}
