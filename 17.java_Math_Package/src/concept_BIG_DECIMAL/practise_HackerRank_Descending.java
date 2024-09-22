package concept_BIG_DECIMAL;
import java.math.BigDecimal;
import java.util.*;
class practise_HackerRank_Descending
{
    public static void main(String []args) throws Exception
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        sc.close();
        
        BigDecimal []_arr = new BigDecimal[n];
        for(int j=0 ; j<n ; j++)
        {
        	BigDecimal no = new BigDecimal(s[j]);
        	_arr[j] = no;
        }

        BigDecimal _temp;
        for(int k=0;k<n;k++)
        {
        	for(int l = 0 ; l<n ; l++)
        	{
        		if(_arr[k].compareTo(_arr[l]) == 1)
				{
//					_arr[k] = _arr[k].add(_arr[l]);
//					_arr[l] = _arr[k].subtract(_arr[l]);
//					_arr[k] = _arr[k].subtract(_arr[l]);
        			_temp = _arr[k];
        			_arr[k] = _arr[l];
        			_arr[l] = _temp;
				}
        	}
        }
        for(int u = 0 ; u<n ; u++)
        {
        	s[u] = _arr[u].toString();
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
