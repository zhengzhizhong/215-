package grayCode;

public class greycode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String[] greycode=code(4);
           for(int i=0;i<greycode.length;i++) {
        	   System.out.println(greycode[i]);
           }
           
	}
    public static String [] code(int n) {
    	if (n==1) {
    		String[] a= {"0","1"};
            return a;
    	}
    	else {
    		int t=(int) Math.pow(2,n);
    		String[] b=new String[t];
    		for(int i=0;i<code(n-1).length;i++) {
    			b[i]=code(n-1)[i]+"0";
    			b[t-i-1]=code(n-1)[i]+"1";
    		}
    		return b;
    	}
    }
}
    