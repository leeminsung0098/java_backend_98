package MiddleTest;

public class Middl2 {
    public static void main(String[] args) {
        TriAngl star=new TriAngl();

        star.height1(3);

        // 높이를 입력해주세요 : 3                // 출력

        /*

         *

         ***

         *****

         */
        star.height1(5);
        // 높이를 입력해주세요 : 5

        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         */
        star.height1(7);
        // 높이를 입력해주세요 : 7

        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         ***********

         *************

         */

    }
}

class TriAngl {
    void height1(int a) {
        for (int f = 1; f <= a; f++) {
            for (int i = 0; i != 2 * f - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}