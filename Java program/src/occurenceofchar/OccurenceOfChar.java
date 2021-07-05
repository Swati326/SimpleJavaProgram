package occurenceofchar;

import java.util.Scanner;

public class OccurenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int count=0,i;
			Scanner sc=new Scanner(System.in);
			System.out.printf("enter any String to check occurence of character");
			sc.nextLine();
			String str=sc.nextLine();
			char ch[]=str.toCharArray();
			for(i=0;i<ch.length;i++)
			{
				count=1;
				if(ch[i]!='z')	
				{
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
				{
					count++;
					ch[j]='z';
				}
				}
				System.out.printf("%c=%d\n",ch[i],count);
			
				}
			}
	
		
	}

}
