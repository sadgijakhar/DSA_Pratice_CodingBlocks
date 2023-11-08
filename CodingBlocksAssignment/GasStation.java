package CodingBlocksAssignment;

public class GasStation {

        public static void main(String[] args) {
            int cost[] = {3,4,3};
            int gas[] = {2,3,4};
    
            int n = gas.length;
            int startIndex = 0;
            int currentEnergy = 0;
            int totalEnergy = 0;
    
            for (int i = 0; i < n; i++) {
                currentEnergy += gas[i] - cost[i];
                totalEnergy += gas[i] - cost[i];
    
                if (currentEnergy < 0) {
                    currentEnergy = 0;
                    startIndex = i + 1;
                }
            }
    
            if (totalEnergy >= 0) {
                System.out.println(startIndex);
            } else {
                System.out.println(-1); // Unable to complete the circular tour.
            }
        }
    
    

   
}
