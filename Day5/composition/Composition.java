package Day5.composition;

public class Composition {
    public static void main(String[] args) {
        홍길동 길동 = new 홍길동();
        길동.자바();
        길동.C언어();
        길동.파이썬();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-");

        홍길순 길순 = new 홍길순();

        길순.자바();
        길순.파이썬();

        System.out.println("=-=-=-=-=-=-=-=-=-");
        길동회사 회사 = new  길동회사();

        회사.파이썬();
        회사.C언어();



    }
}
//
class 길동회사 {
    홍길동 길동 = new 홍길동();
    홍길순 길순 = new 홍길순();
    public void 파이썬(){
        길순.파이썬();
    }
    public void 자바(){
        길동.파이썬();
    }
    public void C언어(){
        길동.C언어();
    }

}

class 홍길동 {
    홍길순 길순= new 홍길순();
    public void 자바(){
        System.out.println("자바17 프로그래밍");
    }
    public void C언어(){
        System.out.println("C언어 프로그래밍");
    }
    public void 파이썬(){
        길순.파이썬();
    }

}
class 홍길순 {
    public void 자바(){
        System.out.println("자바17 프로그래밍");
    }
    public void 파이썬() {
        System.out.println("파이썬 프로그래밍");
    }
}