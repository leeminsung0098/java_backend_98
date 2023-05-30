package Day3;

public class Array1 {
    public static void main(String[] args) {



//        int c = 3;
//        int b=2;
//        int a =1;
//
//        //변수 선언
//        int aa;
//        // 변수 초기화
//        aa=0;
//
//        int a2 = 10; // < 초기화와 배열을 동시에 함
//
//        // 배열 선언
//
//         int[] aaa = new int[5];  // 배열은 같은 자료형만 저장 가능하다.
//
//
//
//        // 배열 초기화
//        aaa[0] = 1;
//        aaa[1] = 2;
//        aaa[2] = 3;
//        aaa[3] = 4;
//        aaa[4] = 5;   // 배열 선언후에 초기화 할 경우 길이 지정이 있어야하고 아래 처럼 동시에 선언과 초기화를 못함
//
//        // 배열 선언 초기화
//        int[] aa2 = {1,2,3,4,5}; //길이 지정 x
//
//
//        System.out.println(aa2[2]);


        // arr 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100을 저장하고 출력해주세요.

        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        System.out.println(arr[0]);
        System.out.println(arr[4]);
        System.out.println(arr[6]);
        System.out.println(arr[9]);

        int[] arr1 = {1,2,3,4,5};

        // 배열을 두번 출력해주세요.
        System.out.println(arr1[2]*2);
        System.out.println(arr1[4]*4);

        // 배열을 이용해 5개의 숫자를 입력받고 출력해주세요.

        int arr2[] = {10,15,20,25,30};

        int arr3[] = new int[3];
        arr3[0]=1;
        arr3[1]=2;
        arr3[2]=3;


        System.out.println(arr[2]);

        // 배열을 이용해 5개의 문장을 입력받고 출력해주세요.
        String str1[]= new String[3];
        str1[0]="hello";
        str1[1]="good ";
        str1[2]="bye";

        System.out.println(str1[2]);

        // 배열에 5개의 값을 입력하고 거꾸로 출력해주세요.
        System.out.println(arr[2]);
        System.out.println(arr[1]);
        System.out.println(arr[0]);

        for(int a22 =2 ; a22>=0; a22--){
            System.out.println(arr[a22]);
        }




    }
}
