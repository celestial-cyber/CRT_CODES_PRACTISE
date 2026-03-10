class Solution {
    public static void main(String[] args) {
        float threshold_value = 0.5f;
        int DripStatus;
        float i = 0;
        
        // Drip ON while i < threshold_value (0.5)
        while (i < threshold_value) {
            DripStatus = 1;
            System.out.println("Drip Status ON: " + i);
            i += 0.1f;  // Increment by 0.1
        }
        
        // Drip OFF when i >= threshold_value
        if (i >= threshold_value) {
            DripStatus = 0;
            System.out.println("Drip Status OFF: " + i);
        }
    }
}