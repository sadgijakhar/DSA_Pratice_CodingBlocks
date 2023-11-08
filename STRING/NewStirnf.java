package STRING;

public class NewStirnf {
   public static void main(String[] args) {
    String str = "hello paaji balle balle aaja paaji";
    System.out.println(str.length());
    System.out.println(str.startsWith("ad"));
    System.out.println(str.endsWith("cd"));
    System.out.println(str.indexOf("paaji"));
    System.out.println(str.lastIndexOf("paaji"));
    System.out.println(str.equals("Sadgi"));
    System.out.println(str.substring(9, str.length()));
    System.out.println();
    printAllSubstring("abcd");
   } 
   public static void printAllSubstring(String str){
    int a = str.length();
    for(int i = 0 ; i < a; i++){
        int j = i+1;
        while(j < a+1){
            System.out.print(str.substring(i, j)+" ");
            j++;
        }
        System.out.println();
    }
   }
}
