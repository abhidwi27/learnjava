package array;

public class ShareSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[] = {10, 22, 5, 75, 65, 80};
		
		int buyPrice = Integer.MAX_VALUE;
		int sellPrice = Integer.MIN_VALUE;
		int profit1 = 0, profit2 = 0;
		boolean isBuying = true;
		
		for(int i=0; i< price.length ; i++){
			
			if(isBuying){
				if(price[i] < buyPrice){
					buyPrice = price[i];
				}else{
					isBuying = false;
					sellPrice = price[i];
				}
			}else{
				
				if(price[i] > sellPrice){
					sellPrice = price[i];
				}else{
					int profit = sellPrice - buyPrice;
					if(profit2 >= profit1 && profit > profit1){
						profit1 = profit;
					}else if(profit1>=profit2 && profit > profit2){
					
						profit2 = profit;
					}
					isBuying = true;
					buyPrice = price[i];
				}
			}
		}
		int MaxProfit = profit1 + profit2;
		System.out.println("Max Profit = " + MaxProfit);
		
	}

}
