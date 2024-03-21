
public class Main {
  public static void main(String[] args) {

String a = "palavra";
String b = "";

for(int i = a.length(); i>0 ; i--){

b = b + a.charAt(i-1);
  
}

System.out.println(b);
    
  }
}