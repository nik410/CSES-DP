

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP5RemovingDigits {

	public static void main(String[] args) {
		FastReader sc=new FastReader();
		int n=sc.nextInt();
		int dp[]=new int[n+1];
		
		for(int i=0;i<10;i++) {
			if(i==0&&i<n)dp[i]=0;
			else if(i>0&&i<=n) dp[i]=1;
		}
		for(int i=10;i<n+1;i++) {
			dp[i]=(int)1e9;
			int num=i,minSteps=(int)1e9;
			while(num>0) {
				int mod=num%10;
				 minSteps=Math.min(dp[i-mod],minSteps);
				
				num/=10;
				}
			dp[i]=minSteps+1;
			
		}
		
		System.out.println(dp[n]);
		
		
				

	}
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } }


}
