package src.Exercise.FinalExamPrep1;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List> allPieces = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String initialPieces = scanner.nextLine();

            String piece = initialPieces.split("\\|")[0];
            String composer = initialPieces.split("\\|")[1];
            String key = initialPieces.split("\\|")[2];

            List<String> pieceInfo = new ArrayList<>();
            pieceInfo.add(composer);
            pieceInfo.add(key);

            allPieces.put(piece, pieceInfo);
        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {

            String action = command.split("\\|")[0];

            switch (action) {
                case "Add":
                    String piece = command.split("\\|")[1];
                    String composer = command.split("\\|")[2];
                    String key = command.split("\\|")[3];

                    if (allPieces.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!%n", piece);
                    } else {
                        List<String> pieceInfoNew = new ArrayList<>();
                        pieceInfoNew.add(composer);
                        pieceInfoNew.add(key);
                        allPieces.put(piece, pieceInfoNew);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                case "Remove":
                    String pieceRemove = command.split("\\|")[1];
                    if (allPieces.containsKey(pieceRemove)) {
                        allPieces.remove(pieceRemove);
                        System.out.printf("Successfully removed %s!%n", pieceRemove);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceRemove);
                    }
                    break;
                case "ChangeKey":
                    String pieceChange = command.split("\\|")[1];
                    String newKey = command.split("\\|")[2];

                    if (!allPieces.containsKey(pieceChange)) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceChange);
                    } else {
                        List<String> changeList = allPieces.get(pieceChange);
                        changeList.remove(1);
                        changeList.add(newKey);
                        allPieces.put(pieceChange, changeList);
                        System.out.printf("Changed the key of %s to %s!%n", pieceChange, newKey);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        allPieces.entrySet().forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}