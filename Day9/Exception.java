package Day9;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exception {
    public static void main(String[] args) {
        //예외
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //예외 상황을 염두에 두고 처리
        Scanner scan = new Scanner(System.in);


        while (true) {
            try {
                int val = scan.nextInt();
                System.out.println("당신이 입력한 값은 : " + val + "  (탈출값은 0입니다.)");
                if(val == 0){
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("정확한 값을 입력하세요.");
                scan.next();
            }
        }


//
//        try {
//            arr[0]=1;
//            arr[1]=2;
//            arr[2]=3;
//            //예외가 발생할 만한 코드
//        }
//        catch (ArrayIndexOutOfBoundsException e1){
//            //해당 예외가 발생했을 때 처리 방법
//            System.out.println("배열 값을 정확하게 생성하세요");
//        }
    }
}
