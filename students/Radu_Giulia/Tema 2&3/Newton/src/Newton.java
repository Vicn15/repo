import java.util.Scanner;

public class Newton {

	public static double x[],y[];
	public static int n;
	
	static Scanner sc=new Scanner(System.in);
	
	public static double NewtonSol(int p,int u, double x[],double y[]) {
        if(u - p == 1)
            return (y[u] - y[p]) / (x[u] - x[p]);
        else    
            return (NewtonSol(p, u-1,x,y) - NewtonSol(p+1, u,x,y)) / (x[u] - x[p]);
       
    }
	
	public static void main(String[] args) {
		System.out.println("N:");
		n=sc.nextInt();
		x=new double[n];
		y=new double[n];
		for(int i=0;i<n;i++){
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
	      System.out.println( NewtonSol(0,n-i,x,y));
		
		
		

	}

}
