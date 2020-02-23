package String_Methods;

public class WarmUpRemoveDoubles {
    public static void main(String[] args) {

        // this method will remove any duplicates from any String with any length
        String str = RevDup("aabbccDDDEEEEEEE");
        System.out.println(str);// abcDE

        String str2 = UniqueValue("AABBCDEEE");
        System.out.println(str2);


    }

    public static String RevDup(String str) {
        //"aabbcc"; ==> "abc";
        String result = ""; // to store the non duplicated values
        for (int i = 0; i < str.length(); i++) {//loop helps to find out how many times
            // each character appeared in the String one by one
            if (!result.contains(str.substring(i, i + 1))) {
                result += str.substring(i, i + 1);
            }
        }
        return result;
        //Method that returns unique values from the String
    }

    public static String UniqueValue(String str) {
        //"AABBCDEEE"==>"CD"
        String result = "";// create an empty String to store unique characters
        for (int j = 0; j < str.length(); j++) {
            int count = 0; //to count a number of appearances
            for (int i = 0; i < str.length(); i++) {//loop helps to find out how many times
                // each character appeared in the String one by one
                if (str.charAt(i) == str.charAt(j)) {//find out how many times "A" was appeared in the String
                    count++;//add one every loop
                }
            }
            if (count == 1) result += "" + str.charAt(j); //to get a string result,
            // I have to concatenate this char with an empty String
        }
        return result;
    }}


