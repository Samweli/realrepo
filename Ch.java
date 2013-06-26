import java.io.*;
import java.util.*;
public class Ch{

public static void main(String [] args){
System.out.println("Enter the name of the progam");
Scanner s=new Scanner(System.in);
String n=s.nextLine();

try{
  Process p=Runtime.getRuntime().exec(n);
  BufferedReader b=new BufferedReader(new InputStreamReader(p.getInputStream()));
  String line;
  int i=0;
  while((line=b.readLine())!=null)
{ System.out.print(line+" ");
  i++;

}
}

catch(IOException r){
  r.printStackTrace();
}


}


}


