package array;

import javax.xml.stream.events.Characters;

public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a = {"54", "546", "548", "60"};
		
		for(int i=1; i<a.length ; i++){
			String temp;
			int j = i;
			while(j>=1){
				if(Character.getNumericValue((a[j].charAt(0))) > Character.getNumericValue(a[j-1].charAt(0))){
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}else if(Character.getNumericValue((a[j].charAt(0))) == Character.getNumericValue(a[j-1].charAt(0))){
					if(Integer.parseInt((a[j] + a[j-1])) > Integer.parseInt((a[j-1] + a[j]))){
						temp = a[j-1];
						a[j-1] = a[j];
						a[j] = temp;
					}
				}
				j--;
			}
		}
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]);
		}
	}

}
