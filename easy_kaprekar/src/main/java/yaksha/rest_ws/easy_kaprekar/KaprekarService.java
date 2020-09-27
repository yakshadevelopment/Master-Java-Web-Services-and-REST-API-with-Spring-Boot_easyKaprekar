package yaksha.rest_ws.easy_kaprekar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class KaprekarService {
	private static List<Kaprekar> kaprekarList=new ArrayList<Kaprekar>();
	public boolean isKaprekar(int number)
	{
		int num=number;
		 int sqr=num*num;
		 int c=1;
		 int temp=num;
		  while(temp!=0)
		 {
			 c=c*10;
			 temp=temp/10;
			
		 }
		 int x=sqr%c;
		  int y=sqr/c;
		 
		 int sum=x+y;
		 if(sum==num)
			 return true;
		 else
			 return false;
	}
	public void generateKaprekarSeries(int start,int end)
	{ 
		int cnt=0;
		for(int i=start;i<=end;i++)
		{
			if(isKaprekar(i))
			{
				
				Kaprekar kaprekar=new Kaprekar(++cnt,i);
				kaprekarList.add(kaprekar);
			}
		}
	}
	public List<Kaprekar> getList()
	{
		return kaprekarList;
	}
}
