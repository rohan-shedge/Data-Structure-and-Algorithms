package companies.ncs;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
*  magic points array containing the magic points
*  dist containg the distance that can be traversed with the power derived from the magic points.
*  Calculate whether it will be possible to complete the whole distance in circular fashion if we are starting from base point, return that base point
*  *

 */
public class OptimalPoint {

    //works
    public int findOptimalPoint(int[] magic, int[] dist) {
        int magicSum =  Arrays.stream(magic).sum();
        int distSum = Arrays.stream(dist).sum();
        int startingPoint =  0;
        int total = 0;
        if (magicSum < distSum)
            return -1;

        for (int i = 0; i < magic.length; i++) {
            total += magic[i] - dist[i];

            if (total < 0) {
                total = 0;
                startingPoint = i + 1;
            }
        }
        return startingPoint;
    }

    public int findOptimalPoint(List<Integer> magic, List<Integer> dist) {
        int magicSum = magic.stream().mapToInt(Integer::intValue).sum();
        int distSum = magic.stream().mapToInt(Integer::intValue).sum();
        int startingPoint =  -1;
        if (magicSum < distSum) return -1;

        for (int i = 0; i < magic.size(); i++) {
            int diff = magic.get(i) - dist.get(i);

            if (diff < 0)
                startingPoint = i + 1;

            return startingPoint;
        }
        return -1;
    }
    public int findOptimalPoint1(List<Integer> magic, List<Integer> dist) {
        int n = magic.size();
        int totalMagic = 0;
        int totalDistance = 0;
        int currentMagic = 0;
        int startingPoint = 0;

        for (int i = 0; i < n; i++) {
            int netMagic = magic.get(i) - dist.get(i);
            totalMagic += netMagic;
            totalDistance += dist.get(i);
            currentMagic += netMagic;

            if (currentMagic < 0) {
                startingPoint = i + 1;
                currentMagic = 0;
            }
        }

        if (totalMagic < totalDistance) {
            return -1;
        }

        return startingPoint;
    }

    public static void main(String[] args) {
        OptimalPoint solution = new OptimalPoint();
        List<Integer> magic = Arrays.asList(2, 3, 4);
        List<Integer> dist = Arrays.asList(3, 4, 3);
        int optimalPoint = solution.findOptimalPoint(new int[]{2, 3, 4}, new int[]{3, 4, 3});

        if (optimalPoint != -1) {
            System.out.println("The optimal point is at index " + optimalPoint);
        } else {
            System.out.println("No optimal point found.");
        }
    }
}
