package Projects.QUIZ;

import java.util.Scanner;

public class QuestionService {

    Questions[] questions = new Questions[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Questions(1, "What is the capital of India?", "Delhi", "Mumbai", "Kolkata", "Bangalore", "1");
        questions[1] = new Questions(2, "Which planet is known as the Red Planet?", "Earth", "Venus", "Mars", "Jupiter", "3");
        questions[2] = new Questions(3, "What is the largest mammal?", "Elephant", "Blue Whale", "Giraffe", "Hippopotamus", "2");
        questions[3] = new Questions(4, "Who wrote the play 'Romeo and Juliet'?", "Charles Dickens", "William Shakespeare", "Leo Tolstoy", "Mark Twain", "2");
        questions[4] = new Questions(5, "Which gas do plants absorb from the atmosphere?", "Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen", "3");
    }

    public void playQuiz() {

        int i = 0;
        for (Questions q : questions) {
            System.out.println("Question no. : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("1. " + q.getOpt1());
            System.out.println("2. " + q.getOpt2());
            System.out.println("3. " + q.getOpt3());
            System.out.println("4. " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

        }

        for (String s: selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;
        for(int i=0; i<selection.length; i++) {
            if (selection[i].equals(questions[i].getAnswer())) {
                score += 1;
            }
        }
        System.out.println("Your score is : " + score);
    }

}
