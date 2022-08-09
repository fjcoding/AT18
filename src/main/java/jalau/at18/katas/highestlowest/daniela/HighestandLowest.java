package jalau.at18.katas.highestlowest.daniela;

import java.util.Arrays;

public class HighestandLowest {
    public static void main(String[] args) {
        String numbers = "1 2 3 4 8 6";
        String[] split1 = numbers.split(" ");
        int[] enter = new int[split1.length];
        for (int find = 0; find < split1.length; find++) {
            enter[find] = Integer.parseInt(split1[find]);
        }
        Arrays.sort(enter);
        int[] list = enter;
        int max = list[0];
        int min = list[0];
        for (int find = 0; find < split1.length; find++) {
            if (max < list[find]) {
                max = list[find];
            }
            if (min > list[find]) {
                min = list[find];
            }
        }
        System.out.println("out:" + max + " " + min);
    }
}

