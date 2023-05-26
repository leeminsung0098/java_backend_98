package day2.Loof.Format;

public class Format1 {
    public static void main(String[] args) {
        //문자열의 결합
        // 문자열 1 + 문자열 2

        //문자 + 숫자 ---> 숫자를 문자로 바꿔서 문자열 결합.

        System.out.printf(10 + "10\n");

        String A= String.format("%d살 %s입니다.",20,"홍길동");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(A);


        System.out.printf("%d살 %s입니다.\n" , 22, "홍길순");

        String a = "LeeMinSung";

        System.out.println(a.toUpperCase());

        System.out.println(a.toLowerCase());

        char H = 'H';
        int H1 = (int)H;

        System.out.println(H1);

        H1+=32;

        System.out.println(H1);

    }
}
