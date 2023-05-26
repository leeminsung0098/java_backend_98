package day2.Loof;

public class Loof3 {
    public static void main(String[] args) {

        String hell = "Hello World";
        char[] chars = hell.toChrArray();

        for (int i = 0 ; i < chars.length; i++){
            char ch = hell[i];
            if (ch >= 'A' && ch <= 'Z'){
                chars[i] = (char) ( ch- 'a'+'A');
            } else if (ch >= 'A'&& ch<= 'Z'){
                chars
            }
        }





    }
}
