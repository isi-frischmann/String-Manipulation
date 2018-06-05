public class StringManipulation {
    // Trim both input strings and then concatenate them
    public String trimAndConcat(String str1, String str2){
        str1 = str1.trim();
        str2 = str2.trim();
        // When you want to concatinate you have to create a new string!
        String newStr3 = str1 + str2;
        return newStr3;
    }

    // Get the index of the character and return either the index or null
    public Integer getIndexOrNull(String your_string, char single_charakter){
        if (your_string.indexOf(single_charakter) == -1){
            // Use -1 because when the character is not included java will return -1
            return null;
        }
        else{
            return your_string.indexOf(single_charakter);
        }
    }

    // Get index of the start of the substring and return index or null
    public Integer getIndexOrNull(String fname, String word){
        if (fname.indexOf(word) == -1){
            return null;
        }
        else{
            return fname.indexOf(word);
        }
    }

    // Get a substring using a starting ending index and concatenate with the second string
    public String concatSubstring(String firstStr, int firstInt, int secondInt, String secondStr){
        String secondCharakter = firstStr.substring(firstInt, secondInt);
        String combineString = secondCharakter + secondStr;
        return combineString;
    }
}

