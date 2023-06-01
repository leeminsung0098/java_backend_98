package Day5;

public class VariavleScope1 {
    public static void main(String[] args) {
        Test t1= new Test();
        Test t2= new Test();
        t1.a=20;
        t1.print();
        t2.print();

    }
}
class Test{

    int a = 10;
    public void print(){

        int a = 100;

        System.out.println("지역변수"+a);  //동인한 변수가 2개 있으면 자신의 변수를 우선적으로 사용.      자신의 변수는 { } 블럭안 변수.
        System.out.println("객체변수"+this.a); // this <- print 함수를 사용하고 있는 객체 자신.
    }
}