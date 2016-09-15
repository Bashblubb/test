package Diamonds;

import java.util.ArrayList;
import java.util.List;

public class DiamondsIterative {

    private final char middleLetter;

    public DiamondsIterative(char middleLetter) {
        this.middleLetter = middleLetter;
    }

    public List<List<Character>> getRows() {
        return new ArrayList<List<Character>>();
    }

    public static String print(char middleLetter) {
    	DiamondsIterative diamond = new DiamondsIterative(middleLetter);
        StringBuffer result = new StringBuffer();
        for (List<Character> chars : diamond.getRows()) {
            for (Character c: chars) {
                result.append(c);
            }
            result.append("\n");
        }
        return result.toString();
    }



    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println(DiamondsIterative.print(args[0].charAt(0)));
        } else {
            System.out.println("please supply one argument: the char of the diamond middle");
        }

    }

}
