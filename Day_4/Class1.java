package Day_4;

public class Class1 {
    // 함수 이름짓는 규칙 >> 카멜표기법 , 파스칼 표기법

    // 클래스 이름은 파스칼
    // 메서드 , 변수는 카멜 표기법
    public static void printPersonIofo(int age, int height, int weight){
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
    }

    public static void printPersonIofo2(int age, int height, int weight) {
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
    }




    public static void main(String[] args) {
        //정보 3개 나이 키 몸무게

        //1

        System.out.println(20);
        System.out.println(170);
        System.out.println(60);

        //2
        int age = 20;
        int height = 170;
        int weight = 60;

//        System.out.println(age);
//        System.out.println(height);
//        System.out.println(weight);

        //3
        printPersonIofo(age , height , weight);

        //4 2명의 사람 내용

        int age2 = 52;
        int height2 = 151;
        int weight2 = 80;

        int age3 = 30;
        int height3 = 192;
        int weight3 = 70;

        printPersonIofo(age2 , height2 , weight2);
        printPersonIofo(age3 , height3 , weight3);
            System.out.println("======================================");
        //5 배열 이용
//        int[] person1 = {20 , 170 , 60};
//        int[] person2 = {40 , 177 , 40};
//
//            printPersonIofo2(person1);
//            printPersonIofo2(person2);

        System.out.println("=====================6=================");
        //6 클래스 사용. -> 내가 표현하고자 하는 대상을 정의해서 자바한테 알려주기.'
        // 사용자 전용 배열 만들기.
        int[] arr2 = new int[3];
        arr2[0]=1;
        arr2[1]=2;
        arr2[2]=3;

        // 개발자 1
        String name3 = "홍길동";
        int age10 =30;
        double height10 = 176.3;
        // 클래스를 이용해 객체만들기.
        Person3 hong1 = new Person3();
        hong1.name = "홍길동";
        hong1.age10= 30;
        hong1.height10 = 166.3;

        Person3 hong5 = new Person3();
        hong5.name = "홍길동50";
        hong5.age10= 500;
        hong5.height10 = 1777.3;

        System.out.println(hong1.name);
        System.out.println(hong1.age10);
        System.out.println(hong1.height10);

        System.out.println(hong5.name);
        System.out.println(hong5.age10);
        System.out.println(hong5.height10);

        // 개발자 1
        String name4 = "홍길순";
        String address ="서울";
        double height20 = 166.3;

        Person2 hong2=new Person2();
        hong2.name4="홍길순";
        hong2.address = "서울";
        hong2.height20= 166.3;

        System.out.println(hong2.name4);
        System.out.println(hong2.address);
        System.out.println(hong2.height20);



        System.out.println(hong2.name4);
        System.out.println(hong2.address);
        System.out.println(hong2.height20);




//
//
//





    }
}

class Person3 {
    String name;
    int age10;
    double height10;
        }

class Person2{
    String name4;
    String address;
    double height20;

        }
