package Day5.composition.Test;

public class Composition_test {
        public static void main (String[]args){
            사람 a사람 = new 사람();
            a사람.나이 = 20;
            a사람.a왼팔 = new 팔();
//
            System.out.println(a사람.a왼팔.길이 + "cm");
            // 출력 : 100cm
//
        }
}

class 사람{
    int 나이;
    팔 a왼팔;

}
class 팔{
    int 길이 = 100;
}

