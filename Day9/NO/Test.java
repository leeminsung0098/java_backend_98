package Day9.NO;

public class Test {
    public static void main(String[] args) {

        도구 a도구 = new 망치();
        a도구.사용();
        // 출력: 망치를 도구로 사용합니다.

        무기 a무기 = new 망치();
        a무기.공격();
        // 출력: 망치로 공격합니다.

        공구 a공구 = new 망치();
        a공구.이용();
    }
}
class 망치 implements 공구,도구,무기{

    public void 사용(){
        System.out.println("망치를 도구로 사용합니다.");
    }
    public void 공격(){
        System.out.println("망치로 공격합니다.");
    }
    public void 이용(){}
}
interface 공구 {

   void 이용();

}
interface 도구 {
    void 사용();
}
interface 무기 {

    void 공격();
}