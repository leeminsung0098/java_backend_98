package day2.Loof;

public class Loop1 {
    public static void main(String[] args) {
        //반복문-
//
//        System.out.println("코드1");
//        System.out.println("코드2");
//        System.out.println("코드3");
        int a = 1;
        while (a<=10){
            System.out.println("코드");
            a++;}
        int b= 1;
        while(b<=3){
            System.out.println("구구단 "+b);
            int c=5;
            while (c<=9){
                System.out.println(b+"*"+c);
                c++;
            }
            b++;}

        //for 문
        //for () {}

        for (int a1 = 1; a1<=4; a1++){
            System.out.println("반복문 for");

            for (int c1= 1; c1<=3; c1++){
                System.out.println("구구단"+c1+"단");
                for (int c2=2; c2<=9; c2++){
                    System.out.println(c2+"*"+c1+"="+c2*c1);
                }
            }
        }


        // 문제 : 1부터 100까지 출력해주세요.
        for (int a5=1; a5<=100; a5++){
            System.out.println(a5);
        }


        // 문제1. 1 ~ 100까지 수중 짝수만 출력

        for(int a6 = 1; a6<= 100; a6++){
            if (a6 %2 ==0){ System.out.println(a6);}
        }


        // 문제1. 1 ~ 100까지 수를 출력하는데 숫자 뒤에 짝수는 even, 홀수는 odd를 붙여서 출력

        for(int a7 = 1; a7<=100; a7++){
            if (a7%2==0){ System.out.println(a7+"even");}
            if (a7%2==1){ System.out.println(a7+"odd");}
        }


//        축구 경기가 진행중입니다. 축구경기 타임은 총 90분이고,
//
//                현재 A팀이 0점, B팀이 2점인 상황에서, A팀은 최고의 스트라이커인 손흥민을 투입하기로 결정했다.
//
//                손흥민은 투입과 동시에 그리고 5분마다 골을 넣을 수 있는 능력을 가지고 있다.
//
//        만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.
//
//        (90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 해당 경기의 심판은 추가시간을 주지 않는 것으로 유명하다.)
//
//        현재 경기타임 time과 A팀의 득점 score가 주어질 때, 손흥민을 투입하면 A팀의 최종 득점은 몇 점인지 출력하시오.



        int time = 74;
        int score = 0;

        while(time <= 90){
            score += 1;
            time +=5;
        }
        System.out.println(score);

        // 출력 : 4

        // a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
        // 오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다.
        // ex )
        // 오름차순 :  1, 2, 3, 4, 5
        // 내림차순 :  5, 4, 3, 2, 1
        int a10 = 12;
        int b10 = 5;

        while (b10<= a10){
            System.out.println(b10);
            b10++;
        }

        a10=12;
        b10=5;
        System.out.println("================================");
        while (a10>=b10){
            System.out.println(a10);
            a10--;
        }
        String c21 = "Hello World!";
        String c22 = c21.toUpperCase();
        System.out.println(c22);
    }
}
