import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void taskOne(List<Integer> nums) {
        nums.removeIf(n -> (n % 2 == 0));
        System.out.println("Нечетные" + nums);
    }

    public static void taskTwo(List<Integer> nums) {
        nums.removeIf(n -> (n % 2 != 0));
        Set<Integer> nums1 = new HashSet<>(nums);
        nums.clear();
        nums.addAll(nums1);
        Collections.sort(nums);
        System.out.println("четные" + nums);
    }

    public static void taskThree(List<String> strings) {
        Set<String> string = new HashSet<>(strings);
        System.out.println(string);
    }

    public static void taskFour(List<String> strings) {
        Map<String, Integer> nameMap = new HashMap<>();
        for (String string : strings) {
            if (nameMap.containsKey(string)) {
                nameMap.put(string, nameMap.get(string) + 1);
            } else nameMap.put(string, 1);
        }
        System.out.println(nameMap);


    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1000,1, 1, 2, 3, 4, 4, 5, 5, 6, 7,11,21,103,100,200,500,33));
        List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "три", "три", "три","четыре","четыре","четыре","четыре","четыре","четыре","четыре","четыре","четыре"));


        //taskOne(nums);
        taskTwo(nums);
        taskThree(strings);
        taskFour(strings);

    }

}