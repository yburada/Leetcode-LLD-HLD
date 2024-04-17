package LeetCode.Day_1;

public class BestTimeTOBuyTheStock {
        public static void main(String[] args) {
            int[] prices ={7,1,5,3,6,4};

            //Initializing the maxProfit =0 and num with first element of array
            int maxProfit =0, num = prices[0], n= prices.length;

            //Checking if array length equals to 0 or null
            if(n==0 || prices==null) {
                System.out.println("You Dumb there is no Elements");
            }

            /*
            Stating from the second element from the array
            1. checking if the current element is greater than num and current element - num is greater than maxProfit
               If true replacing the maxProfit
            2. In else if condition checking the current element is less than num and replacing num
             */
            for(int i=1;i<n;i++){
                if(prices[i]>num && prices[i]-num>maxProfit){
                    maxProfit = prices[i]-num;
                }
                else if(prices[i]<num){
                    num = prices[i];
                }
            }
            System.out.println("The max Profit is : "+maxProfit);
        }
}
