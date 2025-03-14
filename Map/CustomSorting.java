import java.util.*;

class CustomSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<Integer, String> population = new TreeMap<>();
        String input = in.nextLine();
        String[] entries = input.split(", ");
        
        for(String entry: entries){
            String[] parts = entry.split(" - ");
            population.put(Integer.parseInt(parts[1]), parts[0]);
        }

        for(Map.Entry<Integer, String> entry: population.entrySet()){
            System.out.println(entry.getValue() + " = " + entry.getKey());
        }
        in.close();
    }
}