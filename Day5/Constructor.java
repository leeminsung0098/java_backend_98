package Day5;

public class Constructor {
    public static void main(String[] args) {

//        int a; //선언
//
//        a= 10; //초기화.
//        int a;
//        int b;
//
        //객체를 만들면 반드시 데이터를 넣어줘야한다.(초기화)
        PersonOne H1=new PersonOne(1,20,"홍길동");
        PersonOne H2=new PersonOne(2,26,"이순신");

//        H1.introduce();
//        H1.no=1;
//        H1.age=23;
//        H1.name="사람";
//
//        H2.introduce();
//        H2.no=2;
//        H2.age=19;
//        H2.name="홍길동";


    }
}
class PersonOne{

    //생성자  >> 메서드의 일종.
    //1. 리턴 x
    //2. 메서드 이름을 꼭! 클래스명과 동일하게 지어야함.
    //3. 이 메서드는 반드시 실행됨.
    int no;

    int age;

    String name;

    //처리
    public void introduce(){
        System.out.printf("안녕하세요 %d번 ,%d살 %s입니다\n",no,age,name);
    }

    public PersonOne(int no, int age, String name){
        System.out.println("사람이 생성됨.");
        System.out.println("번호:"+no);
        System.out.println("나이:"+age);
        System.out.println("이름:"+name);
        no = no;
        age = age;
        name = name;
    }

        }