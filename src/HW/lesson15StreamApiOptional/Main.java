package HW.lesson15StreamApiOptional;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import static java.util.stream.Collectors.toList;

public class Main {

    private static String getRandomString(int length) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        StringBuilder buffer = new StringBuilder(length + 1);

        for (int i = 0; i < length + 1; i++) {
            int randomLimitedInt = leftLimit + (int) (Math.random() * (rightLimit - leftLimit));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();
    }

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> loginUser = new LinkedHashMap<>();

        for (int i = 0; i < 20; i++) {
            loginUser.put(new Random().nextInt(50), getRandomString(new Random().nextInt(10)));
        }

       List<String> newName = loginUser.entrySet().stream()
                .filter(x -> (x.getKey() == 1) || (x.getKey() == 2) || (x.getKey() == 5) || (x.getKey() == 8) || (x.getKey() == 9) || (x.getKey() == 13))
                .filter(x -> (x.getValue().length() % 2 == 1))
                .map(x -> (new StringBuilder(x.getValue()).reverse()).toString()).collect(toList());

        for(String e : newName) {
            System.out.println(e);
        }
    }
}
