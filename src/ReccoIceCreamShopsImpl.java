import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ReccoIceCreamShopsImpl {
	
	public static List<IceCreamShop> returnRecommendedXShops(List<IceCreamShop> allIceCreamShops, int recShops) {
		
		List<IceCreamShop> recommendedShops = new ArrayList<IceCreamShop>();
		
		Comparator<IceCreamShop> byDist = Comparator.comparing(IceCreamShop::getDistFromSource);
		
		recommendedShops = allIceCreamShops.stream().sorted(byDist).limit(recShops).collect(Collectors.toList());
		
		return recommendedShops;
		
	}

}
