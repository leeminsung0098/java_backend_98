package WarriorTest;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class WarriorTest1 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();



        a전사.a무기 = new 활();
       // a전사.공격();
        // 출력 : 카니가 활로 공격합니다.

        a전사.a무기 = new 칼();

      //  a전사.공격();
        // 출력 : 카니가 칼로 공격합니다.
        전사 b전사 = new 전사();
        b전사.나이 = 20;
        b전사.이름 ="전살";
       // a전사.a무기 = new 활();
        b전사.a무기= new 칼();
        b전사.공격();

        a전사.공격();


      //  a전사.공격();
        // 출력 : 카니가 활로 10의 데미지를 입힙니다.
      //  a전사.스킬사용();
        // 출력 : 불화살 스킬을 사용합니다. 1.5배의 피해를 입힙니다.

        a전사.a무기 = new 칼();
        //  a전사.공격();
        //  a전사.스킬사용();
        // 출력 : 카니가 칼로 15의 데미지를 입힙니다.
        // 출력 : 연속 베기 스킬을 사용합니다. 2배의 피해를 입힙니다.



    }
}

class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기;



    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }

    void 공격(){
        a무기.사용(이름);
        a무기.대미지(이름);
    }
    void 스킬사용(){
        a무기.스킬();
    }



}

class 무기 {
     void 사용(String 사용자명){

    }
    void 대미지(String 사용자명){

    }
    void 스킬(){
       }
}

class 칼 extends 무기 {

    void 사용(String 사용자명){
        System.out.printf("%s이 칼로 공격합니다.\n",사용자명);
    }
    void 대미지(String 사용자명){
        System.out.printf("%s이 칼로 15의 대미지를 입히니다.\n",사용자명);
    }
    void 스킬(){
        System.out.printf("연속베기 스킬을 사용합니다.2배의 대미지를 입힌니다.\n");
    }
}

class 활 extends 무기 {

    void 사용(String 사용자명){

        System.out.printf("%s이 활로 공격합니다.\n",사용자명);
    }
    void 대미지(String 사용자명){
        System.out.printf("%s이 활로 10의 대미지를 입히니다.\n",사용자명);
    }
    void 스킬(){
        System.out.printf("불화살 스킬을 사용합니다.1.5배의 대미지를 입힌니다.\n");
    }

}


