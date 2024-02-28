public class Strings {
    public static void main(String[] args) {
        String str1 = "value"; 
        String str2 = new String("value");
        String str3 = String.valueOf(123);

        String str = "abcd";

        str.charAt(2);       // c
        str.indexOf("a")     // 0
        str.indexOf("z")     // -1
        str.length();        // 4
        str.toString();      // abcd
        str.substring(2);    // cd
        str.substring(2,3);  // c
        str.contains("c");   // true
        str.endsWith("d");   // true
        str.startsWith("a"); // true
        str.isEmpty();       // false

        String s1 = new String("Quick"); 
        String s2 = new String("Quick"); 

        s1 == s2          // false
        s1.equals(s2)     // true

        "AB".equalsIgnoreCase("ab")  // true

        String s = 3 + "str" + 3;     // 3str3
        String s = 3 + 3 + "str";     // 6str
        String s = "3" + 3 + "str";   // 33str
        String s = "3" + "3" + "23";  // 3323
        String s = "" + 3 + 3 + "23"; // 3323
        String s = 3 + 3 + 23;        // Incompatible types
        
        String str = "Abcd";

        str.toUpperCase();     // ABCD
        str.toLowerCase();     // abcd
        str.concat("#");       // Abcd#
        str.replace("b", "-"); // A-cd
        
        "  abc ".trim();       // abc
        "ab".toCharArray();    // {'a', 'b'}
        
    }
}
