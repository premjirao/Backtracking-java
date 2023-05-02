public class findSubset {
    public static void main(String[] args) {
        String str = "abc";
        generateSubsets(str);
    }
    
    public static void generateSubsets(String str) {
        generateSubsetsHelper(str, "", 0);
    }
    
    public static void generateSubsetsHelper(String str, String currentSubset, int index) {
        // Base case: we have generated a subset, so print it
        System.out.println(currentSubset);
        
        // Recursive case: generate all subsets that include the character at the current index
        if (index < str.length()) {
            generateSubsetsHelper(str, currentSubset + str.charAt(index), index + 1);
            generateSubsetsHelper(str, currentSubset, index + 1);
        }
    }
}


// using stringbuilder backtraking recursion by chatGPT
public class SubsetsBacktracking {
    public static void main(String[] args) {
        String str = "abc";
        generateSubsets(str, 0, new StringBuilder());
    }
    
    public static void generateSubsets(String str, int index, StringBuilder sb) {
        // Base case: we have generated a subset, so print it
        System.out.println(sb);
        
        // Generate all subsets that include the character at the current index
        for (int i = index; i < str.length(); i++) {
            sb.append(str.charAt(i));
            generateSubsets(str, i + 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
