import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToIntegerConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Roman Number: ");
        String romanNumber = sc.nextLine().toUpperCase();
        sc.close();

        int result = romanToInteger(romanNumber);
        System.out.println("Integer representation: " + result);
    }

    private static int romanToInteger(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentVal = romanMap.get(s.charAt(i));

            if (i < s.length() - 1) {
                int nextVal = romanMap.get(s.charAt(i + 1));

                if (currentVal < nextVal) {
                    result += (nextVal - currentVal);
                    i++; // Skip the next character since it has been considered
                } else {
                    result += currentVal;
                }
            } else {
                result += currentVal;
            }
        }

        return result;
    }
}
