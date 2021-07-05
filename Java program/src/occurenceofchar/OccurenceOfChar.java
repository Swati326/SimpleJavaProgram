package occurenceofchar;

import java.util.Scanner;

public class OccurenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int start,counter=0;
			Scanner sc=new Scanner(System.in);
			System.out.printf("enter any String to check occurence of character");
			sc.nextLine();
			String string=sc.nextLine();
			char ch[]=string.toCharArray();
			for(start=0;start<ch.length;start++)
			{
				counter=1;
				if(ch[start]!='1')	
				{
				for(int j=start+1;j<ch.length;j++)
				{
					if(ch[start]==ch[j])
				{
					counter++;
					ch[j]='1';
				}
				}
				System.out.printf("%c=%d\n",ch[start],counter);
			
				}
			}
	
		
	}

}
