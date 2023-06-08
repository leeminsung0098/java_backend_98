package Day9;

public class Generic1 {
    public static void main(String[] args) {
//
//        Int저장소 a저장소1 = new Int저장소();
//
//        a저장소1.setData(30);
//        int a = a저장소1.getData();
//
//        System.out.println(a);
//
//        Double저장소 a저장소2 = new Double저장소();
//
//        a저장소2.setData(5.5);
//        double b = a저장소2.getData();
//
//        System.out.println(b);
//
//
//        사과저장소 a저장소3 = new 사과저장소();
//
//        a저장소3.setData(new 사과());
//        사과 c = a저장소3.getData();
//
//        System.out.println(c);
//
//        // 타입을 정해놓고 사용하는게 좋다.
//        My저장소 a저장소4 = new My저장소();

//        a저장소4.setData(10);
//        a저장소4.setData(5.5);
//        a저장소4.setData(new 사과());

//        사과 d = a저장소4.getData(); // Object가 사과보다 상위 타입이라 불러올수없다.


            }
        }
//class My저장소{
//    Object data;
//    void setData(Object o){
//        this.data=o;
//    }
//    Object getData(){
//        return getData();
//    }
//}


// 제너릭은 타입고정이다.
//class My저장소<T>{
//    T data;
//    T setdata(){
//        return (T)data();
//
////        T getData(Object inputedData){
////            this.data = inputedData;
//        }
//    }
//}
//class Int저장소 {
//    Object data;
//
//    int getData() {
//        return (int)data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}
//
//class Double저장소 {
//    Object data;
//
//    double getData() {
//        return (double)data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}
//
//class 사과 {
//}
//
//class 사과저장소 {
//    Object data;
//
//    사과 getData() {
//        return (사과)data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}