package Projects.QUIZ;

public class QuestionService {

    Questions[] questions = new Questions[5];

    public QuestionService() {
        questions[0] = new Questions(1, "What is the capital of India?", "Delhi", "Mumbai", "Kolkata", "Bangalore", "Delhi");
        questions[1] = new Questions(2, "Which planet is known as the Red Planet?", "Earth", "Venus", "Mars", "Jupiter", "Mars");
        questions[2] = new Questions(3, "What is the largest mammal?", "Elephant", "Blue Whale", "Giraffe", "Hippopotamus", "Blue Whale");
        questions[3] = new Questions(4, "Who wrote the play 'Romeo and Juliet'?", "Charles Dickens", "William Shakespeare", "Leo Tolstoy", "Mark Twain", "William Shakespeare");
        questions[4] = new Questions(5, "Which gas do plants absorb from the atmosphere?", "Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen", "Carbon Dioxide");
    }

    public void displayQuestion() {
        for (Questions q : questions) {
            System.out.println(q);
        }
        // System.out.println(questions[0].getAnswer());
    }

}
