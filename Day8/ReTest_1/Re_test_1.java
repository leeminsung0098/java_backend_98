package Day8.ReTest_1;

public class Re_test_1 {
    public static void main(String[] args) {
     Tri a1 = new Tri();
     a1.make2(7);



    }
}

class Tri{
         void make(int a){
            for(int i = 1; i <= a; i++){
            for(int j = 0; j != 2 * i -1 ; j++){
                System.out.print("*");
            }

             System.out.println(); }}



    void height(int a) {
        for (int f = 1; f <= a; f++) {
            for (int i = 0; i != 2 * f - 1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

 void make2(int a){
             for(int i = 1; i <= a ; i++){
                 for(int j = 0; j<= a - i ; j++){
                     System.out.print("*");
                 }
                 for(int k = 0; k<= a - i -1 ; k++){
                     System.out.print("*");
                 }
                 System.out.println();
             }
 }

//        void height2(int a){
//            for (int f = 1; f <= a ; f++) {
//
//                for (int j = 0; j <= a - f; j++) {
//                    System.out.printf("*");
//                }
//                for (int h = 0; h <= a - f - 1; h++) {
//                    System.out.printf("*");
//                }
//                System.out.println();
//            }
//        }
}

