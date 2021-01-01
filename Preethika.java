/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.*;
import java.lang.String;
import java.util.*;
import org.json.JSONObject; 
public class Preethika
{
 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 public void Insert( ) throws IOException
 {
   Scanner sc = new Scanner (System.in);
  System.out.println("Enter the Country_Name: ");
	String country_Name=sc.next();
	System.out.println("Enter the Country_Capital: ");
	String country_Capital=sc.next();
	System.out.println("Enter the region: ");
	char  region=sc.nextInt();
	System.out.println("Enter the language: ");
	char language=sc.nextInt();     
  JSONObject car=new JSONObject(); 
  car.put("country_name",country_Name);    
  car.put("country_capital",country_Capital);    
  car.put("region",region);
  car.put("language",language);
  PrintWriter pwd = new PrintWriter(new BufferedWriter(new FileWriter("Preethika.txt",true)));
  pwd.print(car);
  System.out.println("Details added successfully.");
  pwd.close();
 }
public static void main(String args[]) throws IOException
{
  Preethika sc = new Preethika();
  sc.Insert();
}
}
