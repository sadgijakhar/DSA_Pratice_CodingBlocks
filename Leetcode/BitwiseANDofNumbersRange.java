package Leetcode;

public class BitwiseANDofNumbersRange {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println(rangeBitwiseAnd(a, b));
        // rangeBitwiseAnd(a, b);
    } 
    static int rangeBitwiseAnd(int left, int right) {
        String binaryString = Integer.toBinaryString(left);
        System.out.println(binaryString);
        // String binary = "";
        int number= 0;
        for(int i = left+1 ; i <= right ; i++){
            String newBinary = Integer.toBinaryString(i);
            // if(binary.equals("0")){
            //     return 0;
            // }
            for(int j = binaryString.length()-1 ; j >-1  ; j--){
                char c = binaryString.charAt(j);

                char c1 = newBinary.charAt(j);
                if(c == '0' || c1 == '0'){
                    // System.out.println(binaryString.substring(0,j)+"0"+binary.substring(j));
                    binaryString = binaryString.substring(0,j)+"0";
                }
                else if(c == '1' && c1 == '1'){
                    binaryString = binaryString.substring(0,j)+"1";
                }

            }
            // binaryString = binary;
            System.out.println(binaryString);
            // binary = "";
            System.out.println(number);
            number = Integer.parseInt(binaryString);
        }
        return number;
    }
}
