package Day7;

public class VariableOverring {
    public static void main(String[] args) {

//        동물10 동물1 = new 강아지2("아리");
//        동물10 동물2 = new 고양이("맥스");
//
//        동물1.이동하다();
//        동물2.이동하다();
    }
}
   // 부모클레스에 만들어진 함수는 우선적으로 부모에있는 변수를 쓴다.
  // 자식클레스에서 만들어진 함수는 우선적으로 자식에 있는 변수를 쓴다.
//변수의 경우 오버라딩이 적용되지 않는다.
class  동물10{
    String 이름;
    고양이이동방식 a이동방식 = new 고양이이동방식();
    강아지이동방식 b이동방식 = new 강아지이동방식();

     void 이동하다(){

     }
}
class 고양이 extends 동물10{


    void 이동하다(){
        a이동방식.이동하다(이름);
    }
}

class 강아지2 extends 동물10{




    void 이동하다(){
        b이동방식.이동하다(이름);
    }
}


class 고양이이동방식 {
    void 이동하다(String 이름) {
        System.out.printf("%s 사뿐", 이름);
    }
}
class 강아지이동방식 {
    void 이동하다(String 이름) {
        System.out.printf("%s 힘찬", 이름);
    }
}
