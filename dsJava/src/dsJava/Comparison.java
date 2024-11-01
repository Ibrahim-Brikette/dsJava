package dsJava;

public class Comparison {
	//public static void main(String[] args) {
		int a=1;int b=11;int c=5;
		int min,max;
		if(a>b) {
			if(b>c) {
				max=a;
				min=c;
				
				
				}
			else {
				max=(a>c)?a:c;
				min=b;
			}
		}
		else {
			if(b<c) {
				max=c;
				min=a;
			}
			else {
				max=b;
				min=(a<c)?a:c;
				
			}
		}
		System.out.println(max+",,,,,,,,,,"+min);
	}
	
//}
