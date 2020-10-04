import java.util.*;

public class Array_LinkedList {

    public static void main(String[] args) {

        Integer[] array = {1, 7, 9};

        resolve(array);
    }

    public static void resolve(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Set<Integer> resultSet = new HashSet<>();
        listAll(resultSet, list, 0);
        resultSet.remove(1); // set doesn't need contain check
        int counter = 0;
        for (Integer integer : resultSet) {
            if (isPrime(integer)) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void listAll(Set<Integer> result, List<Integer> candidate, Integer prefix) {
        if(prefix != 0 && prefix % 2 != 0) {
            result.add(prefix);
        }

        for(int i=0; i<candidate.size(); i++) {
            List<Integer> temp = new LinkedList<>(candidate);
            int item = temp.remove(i);
            listAll(result, temp, prefix*10+item);
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i*i < n; i++)
            if (n % i == 0) {
                return false;
            }
        return true;
    }
}
