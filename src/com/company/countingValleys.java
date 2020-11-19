package com.company;

public class countingValleys {
    public static void main(String[] args) {
        int n = 8;
        String path = "UDDDUDUU";
        countValleys(n, path);
    }

    private static void countValleys(int n, String path) {
        //whenever upstream valley is touching sea level and its 0, increase the valley count.
        int count = 0, altitude = 0;
        for (int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'U') {
                altitude++;
                if (altitude == 0){
                    count++;
                }
            } else {
                altitude--;
            }
        }
        System.out.println(count);
    }
}
