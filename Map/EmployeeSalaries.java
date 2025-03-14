import java.util.*;

class EmployeeSalaries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeMap<String, Integer> employee = new TreeMap<>();
        
        String input = in.nextLine();

        String[] entries = input.split(", ");

        for(String entry: entries){
            String[] parts = entry.split(" - ");
            employee.put(parts[0], Integer.parseInt(parts[1]));
        }

        for(Map.Entry<String, Integer> entry: employee.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        in.close();
    }
}