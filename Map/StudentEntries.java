import java.util.*;

class StudentEntries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();

        String names = in.nextLine();
        String[] nameList = names.split(", ");

        for(String name: nameList){
            students.put(name, students.getOrDefault(name, 0)+1);
        }
        String lastKey = "";
        for(String key: students.keySet()){
            lastKey = key;
        }
        for(String key: students.keySet()){
            if(key.equals(lastKey)){
                System.out.print(key);
            }else{
                System.out.print(key + ", ");
            }
        }
        in.close();
    }
}