import java.io.*;
import java.util.*;
public class CustomOrderSort {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n=br.readLine();//"20 50 11 121";//array to sort
		String o=br.readLine();//"9231476058";//given order 9>2>3>1....
		//"6745890321"
		String s[] = n.split("\\s+");
		for(int i=0;i<s.length-1;i++){
			for(int j=i+1;j<s.length;j++){
				int si = s[i].length();
				int sj = s[j].length();
				if(si>sj){
					String temp = s[i];
					s[i]=s[j];
					s[j]=temp;
				}
				else if(si==sj){
					for(int p=0;p<si;p++){
						
						int ii = o.indexOf(s[i].charAt(p));
						int ij = o.indexOf(s[j].charAt(p));
						if(ii==ij){continue;}
						if(ii<ij){
							String temp = s[i];
							s[i]=s[j];
							s[j]=temp;
							break;
						}
						else break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(s));
	}
}
