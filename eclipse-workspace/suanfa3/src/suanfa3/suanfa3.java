package suanfa3;

import java.util.Arrays;

public class suanfa3 {
	static int r=5;
	static int sum_k(int a[],int low,int high){
		int r_group=(int) Math.ceil((high-low)*1.0/r);
		
		for(int i=1;i<=r_group;i++){
			Arrays.sort(a, low+(i-1)*r,(low+i*r-1)>high?high:(low+i*r-1));
			int c=a[low+i-1];
			a[low + i - 1]=a[(low + (i-1)*r+(int)r/2)>high?high:(low +(i-1)*r+r/2)];
			a[(low + (i-1)*r+(int)r/2)>high?high:(low +(i-1)*r+r/2)]=c;
			
			
		}
		Arrays.sort(a,low,low+r_group);
		
		return a[r_group/2+low];
		
	}
	
	public static void main(String args[]){
		int big[]=new int[100];
		int small[]=new int[100];
		int y=0,z=0,k=9;
		int a[]={1,99,5,7,9,6,11,10,23,18,21,33};
		int x=sum_k(a,0,a.length-1);
		System.out.print(+x+"  ");
		for(int i=0;i<a.length;i++){
			if(a[i]>=x){
				big[y]=a[i];
				y++;
			}
			if(a[i]<x){
				small[z]=a[i];
				z++;
				}
			
			}
		y--;z--;
		Arrays.sort(small,0,z+1);
		if(k<=z){	
			for(int s=0;s<k;s++){
				System.out.print(+small[s]+"  ");
			}
		}else{
			Arrays.sort(big,0,y+1);
			for(int s=0;s<z;s++){
				System.out.print(+small[s]+"   ");
			}
			for(int I=0;I<k-z-1;I++){
				System.out.print(+big[I]+"   ");
			}
			
		}

		}

}
