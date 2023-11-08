package STRING;

public class BlueIsTheSkyIsThe {
   public static void main(String[] args) {
    String str = "the sky is blue";
    // System.out.println();
    // str = str.substring(0,str.lastIndexOf(" "));
    // System.out.println(str);
    wordExtraction(str);
    
   } 
   public static void wordExtraction(String str){
    while( true ){
        int a = str.length();
        
        int j = str.lastIndexOf(" ");
        System.out.println(str.substring(j+1, a));
        if(j != -1){
            str = str.substring(0,j);
        }
        else{
            break;
        }
    }
   }
}
