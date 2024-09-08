public class Main {

    public String name = "mark";

    public static void main (String[]args) {
        System.out.println();
        PracticeJava practiceJava = new PracticeJava();
//        practiceJava.reverseString("god");
        String letter = "okay";
        char c = letter.charAt(0);
        char t = letter.charAt(1);
        //int[] myArray = {1,2,3};
        //practiceJava.twoSum(myArray,3);
        int[] array2 = {7,6,4,3,1};

        System.out.println(practiceJava.maxProfit2(array2));


        String[] strs = new String[3];
        strs[0] = "dog";
        strs[1] = "god";
        strs[2] = "okay";


        System.out.println(practiceJava.isAnagram(strs));



    }




}
