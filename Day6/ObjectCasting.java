package Day6;

public class ObjectCasting {
    public static void main(String[] args) {


      Cat c1 = new Cat();
      Dog d1 = new Dog();

      //Dog a1 = new Cat();
        //객체형변환
        Animal a1 = new Cat(); //Dog가 Animal변수에 저장 x, Dog가 Animal형으로 변환.

//        Dog d2 = new Animal();

        Dog d2 = (Dog)a1; //Animal 이 Dog로 수동변환.


    }
}

class Animal{

}
class Cat extends Animal{

}
class Dog extends Animal{

}