import java.util.Date;

public class Weather {
	
	public Date dateToday;
	public static double tempToday;
	public Date dateTomorrow;
	public static double tempTomorrow; 
	public Date dateOvermorrow;
	public static double tempOvermorrow;
	public static double maxToday;
	public static double minToday;
	public static double maxTomorrow;
	public static double minTomorrow;
	public static double maxOvermorrow;
	public static double minOvermorrow;
	public static String GEO;
	
	public static double getTempToday (){
		return tempToday;
	}
public static  double getTempTomorrow() {
		
		return tempTomorrow;
	}
public static  double getTempOvermorrow() {
	
	return tempOvermorrow;
}

	public static double getMinToday (){
		return minToday;
	}
	
	public static double getMaxToday (){
		return maxToday;
	}

	public static double getMinTomorrow() {
		
		return  minTomorrow;
	
	}

	public static double getMaxTomorrow() {
		
		return  maxTomorrow;
	}
public static double getMinOvermorrow() {
		
		return  minOvermorrow;
	
	}

	public static double getMaxOvermorrow() {
		
		return  maxOvermorrow;
	}

	public static String getGEO(){
		return GEO;
	}

	
}
