package Day6;
import Day6.test.Test;
import Day6.test.TestBack;
public class AccessTest {
        public static void main(String[] args) {
            Person p1 = new Person();
            p1.id = 20;

            System.out.println("제 번호는 " + p1.id + " 입니다.");
            // 출력 : 제 번호는 20 입니다.


            // 문제 : 사람의 id를 출력해주세요.
            // 조건 : 사람의 id를 20으로 설정해주세요.
            // 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
            // 조건 : 사람 클래스에서 출력할 수 없습니다.

            Person2 p2 = new Person2();

            // 구현시작
//            p2.seed();
            p2.setId(20);


            // 구현끝
    }
}
class Person {
    // private => 외부로 공개되지 않는다., 리모콘에 노출되지 않는다.
    public int id;
}

class Person2 {

    private int id2;
    int id12;
//    public void seed(){
//        TestBack sol1=new TestBack();
//        sol1.id0();

    public void setId(int c){
        this.id12 = c;

    }

    public void setId3(){
        System.out.printf("제 아이디는 %d 입니다",this.id12);
    }

    //세터

    //게터
}
// 힌트 : 여기에 메소드 2개 추가해야 합니다.