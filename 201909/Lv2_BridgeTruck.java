import java.util.LinkedList;
import java.util.Queue;
 
public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> trucks = new LinkedList<>(); // 아직 다리에 진입하지 않은 트럭들
        Queue<Truck> ingTrucks = new LinkedList<>(); // 다리를 건너는 중인 트럭들
 
        for (int w : truck_weights) {
            Truck truck = new Truck();
            truck.weight = w;
            truck.position = 0;
            trucks.add(truck);
        }
 
        int sec = 0;
 
        while (!trucks.isEmpty() || !ingTrucks.isEmpty()) { // Until both are empty
            sec++;
 
            Truck doneTruck = null;
            int sum = 0;
 
            for (Truck truck : ingTrucks) {
                sum += truck.weight;
                truck.position++;
 
                if (truck.position > bridge_length) {
                    doneTruck = truck;
                }
            }
 
            if (doneTruck != null) {
                ingTrucks.remove(doneTruck);
                sum -= doneTruck.weight;
            }
 
            if (!trucks.isEmpty() && (ingTrucks.size() < bridge_length)) {
                Truck truck = trucks.peek();
 
                if (truck.weight + sum <= weight) {
                    trucks.remove(truck);
                    ingTrucks.add(truck);
                    truck.position++;
                }
            }
        }
 
        return sec;
    }
 
    private class Truck {
        int weight;
        int position;
    }
}
