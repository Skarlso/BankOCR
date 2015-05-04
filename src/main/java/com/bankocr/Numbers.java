package com.bankocr;

import java.util.HashMap;

public class Numbers {

    public static HashMap<String[][][], Integer> getNumbers() {
        HashMap<String[][][], Integer> numbers = new HashMap<String[][][], Integer>();
        String[][][] one = {{{""},{""},{""}}, {{""},{""},{"|"}}, {{""},{""},{"|"}}};
        String[][][] two = {{{""},{"_"},{""}}, {{""},{"_"},{"|"}}, {{"|"},{"_"},{""}}};
        String[][][] three = {{{""},{"_"},{""}}, {{""},{"_"},{"|"}}, {{""},{"_"},{"|"}}};
        String[][][] four = {{{""},{""},{""}}, {{"|"},{"_"},{"|"}}, {{""},{""},{"|"}}};
        String[][][] five = {{{""},{"_"},{""}}, {{"|"},{"_"},{""}}, {{""},{"_"},{"|"}}};
        String[][][] six = {{{""},{"_"},{""}}, {{"|"},{"_"},{""}}, {{"|"},{"_"},{"|"}}};
        String[][][] seven = {{{""},{"_"},{""}}, {{""},{""},{"|"}}, {{""},{""},{"|"}}};
        String[][][] eight = {{{""},{"_"},{""}}, {{"|"},{"_"},{"|"}}, {{"|"},{"_"},{"|"}}};
        String[][][] nine = {{{""},{"_"},{""}}, {{"|"},{"_"},{"|"}}, {{""},{"_"},{"|"}}};
        String[][][] zero = {{{""},{"_"},{""}}, {{"|"},{"_"},{"|"}}, {{""},{""},{"|"}}};
        numbers.put(four, 4);
        numbers.put(one, 1);
        numbers.put(two, 2);
        numbers.put(three, 3);
        numbers.put(five, 5);
        numbers.put(six, 6);
        numbers.put(seven, 7);
        numbers.put(eight, 8);
        numbers.put(nine, 9);
        numbers.put(zero, 0);

        return numbers;
    }
}
