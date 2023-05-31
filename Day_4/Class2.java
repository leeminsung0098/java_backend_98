package Day_4;

public class Class2 {



    public static void main(String[] args) {
        car13 car1= new car13();
        //v1. 1개의 자동차가 3번 달리게 해주세요.
        car1.c1();
        car1.c1();
        car1.c1();




        car13 car2= new car13();
        car13 car3= new car13();
        car13 car4= new car13();
   //v2. 3개의 자동차가 1번씩 달리게 해주세요.
        car2.c1();
        car2.c1();
        car3.c1();



        car1.speed=150;

        car2.speed=190;
        car3.speed=150;
        car4.speed=210;










        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.



        // 문제 : 자동차 객체를 담을 변수를 만들어주세요.
// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
// 각 자동차가 자신의 최고속력으로 달리게 해주세요.
        car2.c2();
        car1.c2();
        car3.c2();
        car4.c2();

        // 출력 : 자동차가 최대속력 220km로 달립니다.
        // 출력 : 자동차가 최대속력 250km로 달립니다.

    }
}

class car13{
    public void c1(){
        System.out.printf("자동차가 달립니다..\n",speed);
    }
String name;
int speed;


    public void  c2(){
        System.out.printf("자동차가 최대속력 %d km로 달립니다.\n",speed);

    }

}
