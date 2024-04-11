package Day_1;

public class BestTimeTOBuyTheStock {
        public static void main(String[] args) {
            int[] prices ={7,1,5,3,6,4};
            int maxProfit =0, num = prices[0], n= prices.length;

            if(n==0 || prices==null) {
                System.out.println("You Dumb there is no Elements");
            }

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
