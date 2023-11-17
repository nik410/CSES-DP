
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP7BookShop {

	public static void main(String[] args) {
		FastReader sc=new FastReader();
		
		int n=sc.nextInt();
		int x=sc.nextInt();
		int cost[]=new int[n];

		int pages[]=new int[n];
		
		for(int i=0;i<n;i++) {
			cost[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			pages[i]=sc.nextInt();
		}
		
		int dp[][]=new int[n][x+1];
		
		for(int i=0;i<x+1;i++) {
			if(i>=cost[0])dp[0][i]=pages[0];
		}
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<x+1;j++) {
				int notBuy=0+dp[i-1][j];
				int buy=0;
				if(j>=cost[i])buy=pages[i]+dp[i-1][j-cost[i]];
				
				dp[i][j]=Math.max(buy,notBuy);
			}
		}
		
		System.out.println(dp[n-1][x]);
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
