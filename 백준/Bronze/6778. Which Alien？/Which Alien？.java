import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int antenna = sc.nextInt();
		int eye = sc.nextInt();
		String result = "";
        
		if(antenna >= 3 && eye <=4) result += "TroyMartian" + "\n";
		if(antenna <= 6 && eye >= 2) result += "VladSaturnian" + "\n";
		if(antenna <= 2 && eye <= 3) result += "GraemeMercurian " + "\n";
		
		System.out.print(result);
		sc.close();
	}
}