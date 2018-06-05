public class StringManipulationTest {
    public static void main(String[] args){
        StringManipulation i = new StringManipulation();
    

        // Trim both input strings and then concatenate them
        String newStr3 = i.trimAndConcat("    Hello     ","     World    ");
        System.out.println(newStr3); 

        // The the index of the character and return either the index or null
        char single_charakter = 'o';
        Integer a = i.getIndexOrNull("Coding", single_charakter);
        Integer b = i.getIndexOrNull("Hello World", single_charakter);
        Integer c = i.getIndexOrNull("Hi", single_charakter);
        System.out.println(a); 
        System.out.println(b); 
        System.out.println(c);
        
        // Get index of the start of the substring and return index or null
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer m = i.getIndexOrNull(word, subString);
        Integer l = i.getIndexOrNull(word, notSubString);
        System.out.println(m); 
        System.out.println(l); 

        // Get a substring using a starting ending index and concatenate with the second string
        // The parameter 1 and 2 means that it will grab the first index from the first String
        // in this example e and it will stop at the second index. If you would do 1, 3 the output will be elworld
        String x = i.concatSubstring("Hello", 1, 2, "world");
        System.out.println(x); // eworld
    }
}