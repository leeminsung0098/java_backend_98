package Day_4;

public class Ht_1 {
    public static void main(String[] args) {

        Calculator1 cal = new Calculator1();
        cal.add(10);
        System.out.println(cal.getValue());  // 10 출력


        UpgradeCalculator cal1 = new UpgradeCalculator();
        cal1.add(10);
        cal1.minus(3);
        System.out.println(cal1.getValue());  // 10에서 3을 뺀 7을 출력
        System.out.println("===============================================");

        MaxLimitCalculator1 cal2 = new MaxLimitCalculator1();
        cal2.add(50);  // 50 더하기
        cal2.add(60);  // 60 더하기
        System.out.println(cal2.getValue());  // 100 출력




    }
}

class Calculator1 {
    int value;

    Calculator1() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

class UpgradeCalculator{
     int value1;
    UpgradeCalculator() {
        this.value1 = 0;
    }

    void add(int val) {
        this.value1 += val;
    }

    void minus(int val){
        this.value1 -= val;
    }

    int getValue() {
        return this.value1;
    }


}
class MaxLimitCalculator1 {
    int value;

    MaxLimitCalculator1() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}