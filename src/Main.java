import java.util.*;

public class Main {

    /*

     Cracking the Coding Interview - Arrays and Strings

     2.1 - String Compression:
     Write code to remove duplicates from an unsorted linked list.
     FOLLOW UP
     How would you solve this problem if a temporary buffer is not allowed?

    */

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(5);
        withTemporaryBuffer(list);
        List<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(2);
        list2.add(4);
        list2.add(4);
        list2.add(3);
        list2.add(5);
        list2.add(5);
        withOutTemporaryBuffer(list2);
    }

    public static void withTemporaryBuffer(List<Integer> list) {
        Set<Integer> buffer = new HashSet<>();
        for (Integer integer : list) {
            if (!buffer.contains(integer)) {
                buffer.add(integer);
            }
        }
        List<Integer> newList = new LinkedList<>(buffer);
        newList.forEach(System.out::println);
    }

    public static void withOutTemporaryBuffer(List<Integer> list) {
        List<Integer> newList = new LinkedList<>();
        for (Integer number : list) {
            for (Integer number2 : list) {
                if (number == number2) {
                    if (!newList.contains(number)) {
                        newList.add(number);
                        break;
                    }
                    break;
                }
            }
        }
        newList.forEach(System.out::println);
    }
}
