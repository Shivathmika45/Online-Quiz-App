import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. What are Java loops?",
            "2. What is enhanced for-loop?",
            "3. How do you handle multiple user inputs?",
            "4. How is a switch-case different from if-else?",
            "5. What are collections in Java?",
            "6. What is ArrayList?",
            "7. How to iterate using iterators?",
            "8. What is a Map?",
            "9. How to sort a list?",
            "10. How to shuffle elements?"
        };

        String[][] options = {
            {"1) For, while, do-while", "2) if-else", "3) switch", "4) None"},
            {"1) Loop with conditions", "2) Loop for arrays/collections", "3) Infinite loop", "4) None"},
            {"1) Using Scanner multiple times", "2) Using arrays/collections", "3) Only one", "4) Not possible"},
            {"1) Checks equality only", "2) Checks conditions", "3) No difference", "4) None"},
            {"1) Group of objects", "2) Only arrays", "3) Primitive data", "4) None"},
            {"1) Fixed array", "2) Resizable array", "3) Primitive type", "4) None"},
            {"1) iterator.hasNext() & iterator.next()", "2) for loop only", "3) while loop only", "4) None"},
            {"1) Key-Value pair", "2) List", "3) Set", "4) None"},
            {"1) Collections.sort()", "2) Arrays.sort()", "3) Sort method in List", "4) None"},
            {"1) Collections.shuffle()", "2) Random", "3) Sort then reverse", "4) None"}
        };

        int[] answers = {1, 2, 2, 1, 1, 2, 1, 1, 1, 1};
        int score = 0;

        System.out.println("=== Online Quiz ===\n");
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String opt : options[i]) {
                System.out.println(opt);
            }

            int userAnswer = 0;
            boolean valid = false;
            while (!valid) {
                System.out.print("Your answer (1-4): ");
                if (sc.hasNextInt()) {
                    userAnswer = sc.nextInt();
                    if (userAnswer >= 1 && userAnswer <= 4) {
                        valid = true;
                    } else {
                        System.out.println("Please enter a number between 1 and 4.");
                    }
                } else {
                    System.out.println("Invalid input! Enter a number between 1 and 4.");
                    sc.next(); // clear invalid input
                }
            }

            if (userAnswer == answers[i]) {
                score++;
            }
            System.out.println();
        }

        System.out.println("Your Score: " + score + "/" + questions.length);
        System.out.println(score >= 8 ? "Excellent!" : score >= 5 ? "Good!" : "Keep practicing!");
        sc.close();
    }
}
