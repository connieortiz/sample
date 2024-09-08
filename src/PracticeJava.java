
import java.lang.reflect.Array;
import java.util.*;

public class PracticeJava {
    int i, j, r;


    // public String name = "mark";

    public PracticeJava() {
    }

    public void reverseString(String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }

    public int[] twoSum(int[] nums, int target) {
        //int[] index;
        int firstNum = 0;
        //store the index
        int firstInt = 0;
        int secondInt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            firstNum = i;
            int index[] = {firstNum};

        }
        int index[] = {firstNum};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + nums[i + 1] == target) {
                firstInt = i;
                secondInt = i + 1;
            }
        }

        int sum[] = {firstInt, secondInt};

        return sum;
    }


//    public int maxProfit(int[] prices) {
//        int maxProfit2 = 0;
//
//        if(prices.length == 1) {
//            return 0;
//        }
//        if(prices.length < 3) {
//            if ((prices[j] - prices[i]) > maxProfit2) {
//                maxProfit2 = prices[j] - prices[i];
//            }
//        }
//
//
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i; j < prices.length; j++) {
//                if ((prices[j] - prices[i]) > maxProfit2) {
//                    maxProfit2 = prices[j] - prices[i];
//                }
//            }
//        }
//        return maxProfit2;
//    }


    public int maxProfit2(int[] prices) {
        int maxProfit2 = 0;

        if (prices.length == 1) {
            return 0;
        }
        if (prices.length < 3) {
            if ((prices[j] - prices[i]) > maxProfit2) {
                maxProfit2 = prices[j] - prices[i];
            }
        }

        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                if ((prices[j] - prices[i]) > maxProfit2) {
                    maxProfit2 = prices[j] - prices[i];
                }
            }
        }
        return maxProfit2;
    }


    //"ok" "okay"
    public List<List<String>> isAnagram(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String orderedWord = String.valueOf(charArray);
            if(!map.containsKey(orderedWord)) {
                map.put(orderedWord, new ArrayList<>());
            }
                map.get(orderedWord).add(word);
        }

        return new ArrayList<>(map.values());

//        list.add()

    }


}
