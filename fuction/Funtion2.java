package fuction;


public class Funtion2 {


    public static void greeting1(int i){
        if (i==2){System.out.println("하이~");}
        if (i==3){System.out.println("봉쥬");}
        if (i==1){System.out.println("안녕하세요.");}
    }

    public static void greeting2(int i2, int i22) {
        if (i2 == 1) {
            for (int ii1 = 1; ii1 <= i22; ii1++) {
                System.out.println("안녕하세요.");
            }
        }
        if (i2 == 2) {
            for (int ii2 = 1; ii2 <= i22; ii2++) {
                System.out.println("하이~");
            }
        }
        if (i2 == 3) {
            for (int ii3 = 1; ii3 <= i22; ii3++) {
                System.out.println("봉쥬!");
            }
        }
    }
        public static void main (String[]args){

            // 매개변수는 인사말 언어를 의미
            // 1은 한국어, 2는 영어, 3은 프랑스어
//
            greeting1(2);
            // 하이~

            greeting1(3);
            // 봉쥬

            greeting1(1);
            // 안녕하세요


            System.out.println("==================");
            // 첫번째는 언어, 두번째는 횟수를 의미

            greeting2(1, 3);
            // 안녕하세요
            // 안녕하세요
            // 안녕하세요

            greeting2(2, 5);
            // 하이~
            // 하이~
            // 하이~
            // 하이~
            // 하이~

            greeting2(3, 7);
            // 봉쥬
            // 봉쥬
            // 봉쥬
            // 봉쥬
            // 봉쥬
            // 봉쥬
            // 봉쥬


        }

}
