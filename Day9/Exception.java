package Day9;

public class Exception {
    public static void main(String[] args) {
        //예외
        int [] arr = new int[2];
        arr[0]=1;
        arr[1]=2;

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        //예외 상황을 염두에 두고 처리


        try {
            arr[0]=1;
            arr[1]=2;
            arr[2]=3;
            //예외가 발생할 만한 코드
        }
        catch (ArrayIndexOutOfBoundsException e1){
            //해당 예외가 발생했을 때 처리 방법
            System.out.println("배열 값을 정확하게 생성하세요");
        }
    }
}
