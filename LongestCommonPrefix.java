public class LongestCommonPrefix {
    
    public static void main(String[] args){
        String[] array = {"flower","flow","flight"};
        System.out.println(getLongestCommonPrefix(array));
    }

    // public static String getLongestCommonPrefix(String[] strs) {
    //     StringBuilder stringBuilder = new StringBuilder();
    //     stringBuilder.append(strs[0]);
    //     for (int iterator = 1; iterator < strs.length; iterator++) {
    //         String currentString = strs[iterator];
    //         int currentStringIterator = 0;
    //         for (int currentStringLength = currentString.length(),
    //                 stringBuilderLength = stringBuilder.length(); currentStringIterator < currentStringLength
    //                         && currentStringIterator < stringBuilderLength; currentStringIterator++) {
    //             if (currentString.charAt(currentStringIterator) != stringBuilder.charAt(currentStringIterator))
    //                 break;
    //         }
    //         stringBuilder.replace(0, stringBuilder.length(), stringBuilder.substring(0, currentStringIterator));
    //     }
    //     return stringBuilder.toString();
    // }

    // public static String getLongestCommonPrefix(String[] strs) {
    //     if (strs.length == 0) return "";
    //     String prefix = strs[0];
    //     for (int i = 1; i < strs.length; i++)
    //         while (strs[i].indexOf(prefix) != 0) {
    //             prefix = prefix.substring(0, prefix.length() - 1);
    //             if (prefix.isEmpty()) return "";
    //         }        
    //     return prefix;
    // }

    public static String getLongestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);             
            }
        }
        return strs[0];
    }

}
