package Day3;

import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        //숫자 입력
//        int a1 = scan.nextInt();
//        System.out.println("당신이 입력한 숫자는 :"+a1);


        // 문자 입력

//        String a2 =scan.nextLine();
//        System.out.println("당신이 입력한 문장은 :"+a2);

        //단어 한개 입력
//        String a3= scan.next();
//        System.out.println(a3);
//
        //단어 중복 => next 사용

//        String s1= scan.next();
//        String s2= scan.next();
//
//        System.out.println(s1);
//        System.out.println(s2);



        // 숫자를 입력해서 해당 숫자의 구구단이 나오는 프로그램 작성.
//
//        int goo= scan.nextInt();
//
//        System.out.println(goo);
//        System.out.println("==={"+goo+"}===");
//            for(int aa1= 1; aa1<= 9; aa1++){
//
//                System.out.printf("%dx%d=%d\n",goo,aa1,goo*aa1);
//




//



    //Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
//입출력 예시
//첫번째 숫자를 입력해주세요: 12
//두번째 숫자를 입력해주세요: 33
//12 + 33 = 45
//        int f1 = scan.nextInt();
//        int f2 = scan.nextInt();
//
//        System.out.println(f1);
//        System.out.println(f2);
//
//        System.out.println(f1+f2);


        // 이름과 나이를 입력값으로 받아 자기소개를 해주세요.


        System.out.println("이름을 입력해주세요:");

        String name = scan.nextLine();

        System.out.println("나이를 입력해주세요:");

        int age = scan.nextInt();

        System.out.printf("안녕하세요. %d세 %s 입니다",age,name);

        // 이름을 입력해주세요 : 홍길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍길동입니다.




    }
}
