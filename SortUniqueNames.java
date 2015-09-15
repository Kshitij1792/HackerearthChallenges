import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class SortUniqueNames {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Set<String> set=new HashSet<String>();
		
		try{
			//String line=;
			int n=Integer.parseInt(br.readLine());
			
			for(int i=0; i<n ;i++){
				set.add(br.readLine());
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		set=new TreeSet<String>(set);
		Iterator<String> it=set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}

}
