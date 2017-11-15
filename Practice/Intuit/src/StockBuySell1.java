/*
 * 
 */
public class StockBuySell1 {

	public static void main(String[] args) {
		
		int arr[]= {100, 180, 260, 310, 40, 535, 695};
		
		int maxP = calProfit(arr);
		System.out.println(maxP);
	}

	private static int calProfit(int[] arr) {
		
		int profit = 0;
		int minBuy = arr[0];
		
		for(int i =1;i<arr.length;i++){
			
			minBuy = Math.min(minBuy, arr[i]);
			profit = Math.max(profit, arr[i] - minBuy);
		}
		return profit;
	}
}
