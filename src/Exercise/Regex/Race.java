package src.Exercise.Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> participants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        Map<String, Integer> allParticipants = new LinkedHashMap<>();

        while (!input.equals("end of race")) {

            Pattern patternNames = Pattern.compile("(?<names>[A-Z]|[a-z])");
            Matcher matcherNames = patternNames.matcher(input);

            Pattern patternDigits = Pattern.compile("(?<numbers>[0-9])");
            Matcher matcherDigits = patternDigits.matcher(input);

            StringBuilder name = new StringBuilder();
            int result = 0;
            while (matcherNames.find()) {
                String letter = matcherNames.group("names");
                name.append(letter);
            }

            if (!participants.contains(name.toString())) {
                input = scanner.nextLine();
                continue;

            }
            while (matcherDigits.find()) {
                int digits = Integer.parseInt(matcherDigits.group("numbers"));
                result += digits;
            }

            if (!allParticipants.containsKey(name.toString())) {
                allParticipants.put(name.toString(), result);
            } else {
                int currentResult = allParticipants.get(name.toString());
                allParticipants.put(name.toString(), currentResult + result);
            }

            input = scanner.nextLine();
        }
        List<String> topThree = allParticipants.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());

        System.out.println("1st place: " + topThree.get(0));
        System.out.println("2nd place: " + topThree.get(1));
        System.out.println("3rd place: " + topThree.get(2));
    }
}