package Day8;

public class Week1_test {
    public static void main(String[] args) {
        Triangle a1=new Triangle();
        Reflact a2=new Reflact();
        a1.height(5);
        a1.height2(7);
        a2.height2(6);
        System.out.print("=========================================");


        System.out.print("=========================================");


        Full f1 = new Full();
        f1.Tri(5);


        rec f2 = new rec();
        f2.height2(8);

    }
}

class Triangle{
    void height(int a) {
        for (int f = 1; f <= a; f++) {
            for (int i = 0; i != 2 * f -1 ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void height2(int a){
        for(int i = 0; i < a; i++){
            for(int j= 0; j < a - i -1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i + 1 ; k++){
                System.out.print("*");}
            System.out.println();}
        }


        }
class Reflact{
    void height2(int a){
        for (int f = 1; f <= a ; f++) {

            for (int j = 0; j <= a - f; j++) {
                System.out.printf("*");
            }
            for (int h = 0; h <= a - f - 1; h++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}

class Full{
    void Tri(int a){
        for (int f = 1; f <= a; f++) {
            for (int i = 0; i != 2 * f -1 ; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

class rec{
    void height2(int a){
        for(int i = 0; i < a; i++){
            for(int j= 0; j < a - i -1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i + 1 ; k++){
                System.out.print("*");}
            System.out.println();}
    }
}