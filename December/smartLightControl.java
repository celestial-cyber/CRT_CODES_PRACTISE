class Solution {
    public int smartLightControl(int t) {
        int total = 0;
        int i = 1;

        while (i <= t) {
            int energy;

            if (i % 2 == 0) {
                energy = 3;
            } else {
                energy = 2;
            }

            if (i % 5 == 0) {
                energy *= 2;
            }

            total += energy;

            if (total % 7 == 0) {
                i += 2;  // skip next
            } else {
                i += 1;
            }
        }

        return total;
    }
}
