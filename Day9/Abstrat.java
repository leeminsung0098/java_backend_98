package Day9;

public class Abstrat {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격();

        사람2 a사람2 = new 사람2();

        요리사 a요리사 = a사람2;
        a요리사.조리();

        아버지 a아버지 = a사람2;
        a아버지.애들케어();





    }
}

abstract class 무기{
    abstract void 사용();
    //추상메서드 >> 내용 없는 메서드 반드시 오버라이딩해야된다.
}
class 전사{
  무기 a무기 = new 칼();
    void 공격(){
      a무기.사용();
    }
}
class 칼 extends  무기{
    void 사용(){
        System.out.println("칼로 공격");
    }
}
class 활 extends 무기{
    void 사용(){
        System.out.println("활로 공격");
    }
}



class 사람2 implements 요리사, 아버지{
    public void 조리(){
        System.out.println("5성급 호테 요리 실력으로 조리합니다.");
    }
    public void 애들케어(){
        System.out.println("아이들을 돌봅니다.,");
    }
}

interface 요리사 {
    void 조리();
}
interface 아버지{
     void 애들케어();
}