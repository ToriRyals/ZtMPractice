package DataStructures.HashTables;

import java.util.Arrays;
import java.util.HashSet;

public class FirstRecurringCharacter {

    public static Object getFirstRecurringObject(Object[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                System.out.println(inputArray[i] + " " + inputArray[j]);
                if(inputArray[i].equals(inputArray[j])) {
                    return inputArray[i];
                }
            }
        }
        return null;
    }

    public static Object getFirstRecurringObjectBetter(Object[] inputArray) {
        HashSet<Object> map = new HashSet<>();
        for (Object obj : inputArray) {
            if(map.contains(obj)) {
                return obj;
            } else {
                map.add(obj);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Object[] arr = {1,5,8,5,1,8,8,7,4,4,10};
        System.out.println(getFirstRecurringObjectBetter(arr));
        System.out.println(getFirstRecurringObject(arr));
    }
}