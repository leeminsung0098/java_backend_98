package Day7;
//import java.util.
public class ConstuctoAdvance {
    public static void main(String[] args) {

        사람 a1 = new 사람(21,"MINSUNG",1);

        a1.자기소개();
        a1.자기소개(1);




    }
}


class 사람 {
    int old;
    String name;

    int num;

    //같은 이름으로 메서드나 생성자를 여러개 만드는 것.>> 오버로딩
    public 사람(int old, String name, int num) {
        this.old = old;
        this.name = name;
        this.num = num;
    }

    public 사람(int old) {
        this.old = old;

    }


    void 자기소개() {
        System.out.printf("%d 살 %s입니다", old, name);
    }

    void 자기소개(int a) {
        System.out.printf("하이");
    }


}

