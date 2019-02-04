/* Copyright (C) 2019 Ilakkuvaselvi Manoharan - All Rights Reserved
 * 
 */


import java.util.ArrayList;
import java.util.List;

public class Solution3 {
	
public static void main(String[] args) {
		
		
		int totalIceCreamShops = 3;
		
		
		List<Integer> locationA = new ArrayList<Integer>();
		locationA.add(1);
		locationA.add(-3);
		List<Integer> locationB = new ArrayList<Integer>();
		locationB.add(1);
		locationB.add(2);
		List<Integer> locationC = new ArrayList<Integer>();
		locationC.add(3);
		locationC.add(4);
		
		
		List<IceCreamShop> allIceCreamShops = new ArrayList<IceCreamShop>();
		
		IceCreamShop CreamyO = new IceCreamShop(1, "CreamyO", locationA);
		IceCreamShop AllCream = new IceCreamShop(2, "AllCream", locationB);
		IceCreamShop DuckIce = new IceCreamShop(3, "DuckIce", locationC);
		
		allIceCreamShops.add(CreamyO);
		allIceCreamShops.add(AllCream);
		allIceCreamShops.add(DuckIce);
		
		
		int returnIcecreamShops = 1;
		
		
		
		for(IceCreamShop cream: allIceCreamShops) {
			System.out.println(" first print: " + cream.getName() + " dist: " + cream.getDistFromSource());
		
	     }
		
		
		List<IceCreamShop> recommendedShops = returnRecommendedXShops(allIceCreamShops, returnIcecreamShops);
		
		
		
		for(IceCreamShop cream: recommendedShops) {
			System.out.println(" second print: " + cream.getName() + " dist: " + cream.getDistFromSource());
		
	     }
	
		
		
	}



public static List<IceCreamShop> returnRecommendedXShops(List<IceCreamShop> allIceCreamShops, int recShops) {
	
	
	
	
	return ReccoIceCreamShopsImpl.returnRecommendedXShops(allIceCreamShops, recShops);
	
}




}
