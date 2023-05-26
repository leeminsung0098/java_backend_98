package day2.Loof;

public class Loof2 {
    public static void main(String[] args) {
        //2중 반복문

        for (int a=1; a<=10; a++){
            for(int b = 1; b<= 5 ; b++){
                System.out.println(b);
            }
            System.out.println("===");}

        //구구단

        for (int c22 = 2; c22<= 9 ; c22++){
            System.out.println(c22+"단");
            for (int c23 = 1; c23<= 9; c23++){
                System.out.printf("%d x %d = %d\n",c22,c23,c22*c23);
            }

        }

        // 문제 : 구구단 작성
        // 조건 : 짝수번째만 곱하기
        /* 출력예시 :

         2 * 2 = 4
         2 * 4 = 8
         2 * 6 = 12
         2 * 8 = 16

         ...

         9단까지 이런식으로 나오면 됩니다.
//*/
//        for(int cc= 2; cc<=9 ; cc++){System.out.println(cc+"단====");
//            for (int cc1= 1; cc1<= 9; cc1++){
//                if (cc1%2==0){
//                    System.out.printf("%d x %d = %d\n",cc,cc1,cc*cc1);
//                }
//            }
//        }
        // 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.

        int n = 4; // 시작
        int m = 20; // 끝
        int limit = 10; // 곱의 개수

        while (n<= m) {
            if (n % 2 == 1) {
                System.out.println("====" + n + "단=====");
                for (int c22 = 1; c22 <= limit; c22++) {
                    if (c22 % 2 == 0) {
                        System.out.printf("%d x %d = %d\n", n, c22, n * c22);
                    }
                }

            }
            n++;

        }



    }
}
