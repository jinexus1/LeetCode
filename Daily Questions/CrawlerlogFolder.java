//Approach -1( Brute force) Path Counting
class Solution {
    public int minOperations(String[] logs) {
        int counter = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                if (counter > 0) {
                    counter--;
                }
            } else if (!log.equals("./")) {
                counter++;
            }
        }

        return counter;
    }
}