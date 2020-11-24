import java.util.Scanner;

public class HelloController {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HelloView view = new HelloView();

        view.printGreetings();

        if (input.nextLine().toLowerCase().equals("ok")) {
            view.printLetsTry();

            runChallenge(input);
        } else {
            view.printGoodLuck();
        }
    }

    private static void runChallenge(Scanner input) {
        HelloView view = new HelloView();
        HelloModel model = new HelloModel();

        boolean shouldBeFinished = false;

        do {
            view.printFirstQuestion();

            if (input.nextLine().toLowerCase().equals(HelloModel.FIRST_SECRET_WORD)) {
                view.printCorrect();

                view.printSecondQuestion();

                if (input.nextLine().toLowerCase().equals(HelloModel.SECOND_SECRET_WORD)) {
                    view.printCorrect();
                    shouldBeFinished = true;

                    String result = model.makeResult(HelloModel.FIRST_SECRET_WORD, HelloModel.SECOND_SECRET_WORD);

                    view.printResult(result);
                } else {
                    view.printWrong();
                }
            } else {
                view.printWrong();
            }
        } while (!shouldBeFinished);
    }
}
