package Diamonds;

import java.util.ArrayList;
import java.util.List;

public class DiamondsIncremental {

    private final char middleLetter;

    public DiamondsIncremental(char middleLetter) {
        this.middleLetter = middleLetter;
    }

    public List<List<Character>> getRows() {
        return new ArrayList<List<Character>>();
    }

    public static String print(char middleLetter) {
    	DiamondsIncremental diamond = new DiamondsIncremental(middleLetter);
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
            System.out.println(DiamondsIncremental.print(args[0].charAt(0)));
        } else {
            System.out.println("please supply one argument: the char of the diamond middle");
        }

    }

}
