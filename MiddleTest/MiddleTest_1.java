package MiddleTest;

public class MiddleTest_1 {
    public static void main(String[] args) {
        //문제1

        int num1 = 15;
        int num2 = 4;

//      System.out.printf("num1을 num2로 나눈 몫은 %f 입니다.\n", num1 / num2);

        //문제2

        int a1 = 10;
        int a2 = 10;

        System.out.printf("a2는 a1과 같은 값 %d입니다.\n",10);



        //문제3

        for(int num = 1; num<= 5; num++){
            System.out.println(num);
        }

        //문제4

//        String str1 = "hello";
//        String str2 = "world";
//        System.out.printf("%d %d",str1,str2);

        //문제5

      float[] arr = {10 , 9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1};
        System.out.println("arr.length");

        //문제6
        Dog dog1 =new Dog();
        System.out.printf("%d살 강아지 %s\n",dog1.age, dog1.name);

        //문제7
        Dog.classInfo();

        //문제8

        dog1.bark();

        //문제9












    }
}
class Dog{
    public int age;
    public String name;

    public void Dog(int age,String name){

        this.age = age;
        this.name = name;

    }

    void bark(){
        System.out.printf("%s가 멍멍하고 짓습니다.", this.name);

    }

    static void classInfo(){
        System.out.println("이름과 나이를 이용해 Dog를 만드는 Dog class입니다.");}

}