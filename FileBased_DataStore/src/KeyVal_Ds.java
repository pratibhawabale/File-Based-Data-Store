import java.io.*;
import java.lang.String;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;
public class KeyVal_Ds {
	static BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	public void Get() throws IOException, JSONException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.next();
		
		System.out.println("Enter Country:");
		String Cnt=sc.next();
		
		System.out.println("State:");
		String state=sc.next();
		
		System.out.println("Enter City:");
		String city=sc.next();
		
		JSONObject obj=new JSONObject();
		obj.put("Name",name);
		obj.put("Country", Cnt);
		obj.put("State", state);
		obj.put("City", city);
		PrintWriter p=new PrintWriter(new BufferedWriter(new FileWriter("file1.txt",true)));
		p.print(obj);
		System.out.println("your details are added successfully.\n");
		p.close();
	}
	public static void main(String[] args) throws IOException, JSONException {
		KeyVal_Ds object=new KeyVal_Ds();
		object.Get();
		
	}

}
