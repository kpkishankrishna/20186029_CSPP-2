import java.util.Scanner;
// class Quiz {
//  private String questions;
//  private String[] choices;
//  private int questionscount;
//  private int choicescount;
//  public Quiz(String qu, String[] ch, int qc, int cc) {
//      questions = qu;
//      choices = ch;
//      questionscount = qc;
//      choicescount = cc;
//  }
//  public String getquestions() {
//      return questions;

//  }
//  public String[] getchoices() {
//      return choices;
//  }
//  public int getquestionscount() {
//      return questionscount;
//  }
//  public int getchoicescount() {
//      return choicescount;
//  }

// }
/**
* Class Quiz
*/
class Quiz {
    /**
     * Quiz contructor.
     */
    Quiz() {

    }
}

/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
    * Constructs the object.
    */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this Quiz
        Quiz q = new Quiz();
        // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
            case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
            case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
            default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz,
     final int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class

        // for (int i = 0; i < questionscount; i++) {
        //  String[] question = s.nextLine();
        //  String[][] choice = s.nextLine();
        // System.out.println(questionscount + " are added to the quiz");
        // }
        if (questionCount == 0) {
            System.out.println("Quiz does not have questions");
            return;
        }
        String a = s.nextLine();
        String[] errors = a.split(":");
        String[] errorsQuestion = errors[1].split(",");
        int number = Integer.parseInt(errors[2]);
        if (errors[0] == null || errors.length < 5 || errors[0].length() == 0) {
            System.out.println("Error! Malformed question");
            return;
        }
        int penalityyerrors = Integer.parseInt(errors[4]);
        if (penalityyerrors > 0) {
            System.out.println("Invalid penalty for " + errors[0]);
            return;
        }
        int scoreerrors = Integer.parseInt(errors[3]);
        if (scoreerrors < 0) {
            System.out.println("Invalid max marks for " + errors[0]);
            return;
        }
        if (errorsQuestion.length < 4) {
            System.out.println(errors[0] + " does not have enough answer choices");
            return;
        }
        if (number > 4) {
            System.out.
            println("Error! Correct answer choice number is out of range for question text 1");
            return;
        }

        System.out.println(questionCount + " are added to the quiz");
    }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s, final Quiz quiz,
     final int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object

    }

    /**
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
    }
}
