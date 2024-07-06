import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<String> makePermutations(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return result;
        }
        char[] chars = str.toCharArray();
        backtrack(result, chars, 0);
        return result;
    }

    private static void backtrack(List<String> result, char[] chars, int index) {
        if (index == chars.length - 1) {
            result.add(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            backtrack(result, chars, index + 1);
            swap(chars, index, i);
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        //Test Case 1
        String input1 = "AB";
        System.out.println("Permutations of " + input1 + ": " + makePermutations(input1));
        //Test Case 2
        String input2 = "A";
        System.out.println("Permutations of " + input2 + ": " + makePermutations(input2));
        //Test Case 3
        String input3 = "WEQW";
        System.out.println("Permutations of " + input3 + ": " + makePermutations(input3));
    }
}

/*Time Complexity is O(n.n!) 
This is so because the backtrack function would be called n! times, while the remaining code has a time complexity of O(n)*/