package src.Exercise.AssociativeArrays;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> teams = new LinkedHashMap<>();


        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {
                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];

                if (!teams.containsKey(team)) {
                    teams.put(team, new ArrayList<>());
                    teams.get(team).add(player);
                } else {
                    List<String> currentPlayers = teams.get(team);
                    if (!currentPlayers.contains(player)) {
                        currentPlayers.add(player);
                        teams.put(team, currentPlayers);
                    }
                }

            } else if (input.contains("->")) {
                String player = input.split(" -> ")[0];
                String team = input.split(" -> ")[1];

                teams.entrySet().forEach(entry -> entry.getValue().remove(player));

                if (teams.containsKey(team)) {
                    List<String> currentPlayers = teams.get(team);
                    currentPlayers.add(player);
                    teams.put(team, currentPlayers);
                } else {
                    teams.put(team, new ArrayList<>());
                    teams.get(team).add(player);
                }
                System.out.printf("%s joins the %s side!%n", player, team);
            }
            input = scanner.nextLine();
        }
        teams.entrySet().stream().filter(entry -> entry.getValue().size() > 0).forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.println("! " + player));
                }
        );
    }
}