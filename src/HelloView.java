public class HelloView {
    public void printGreetings() {
        System.out.printf("%nEnter \"ok\", if you are ready for this challenge.%n%n");
    }

    public void printLetsTry() {
        System.out.printf("%nGood, let's try.%n");
    }

    public void printGoodLuck() {
        System.out.printf("%n%nGood luck then!");
    }

    public void printFirstQuestion() {
        System.out.printf("%nWhat is the first secret word of every programmer?%n%n");
    }

    public void printSecondQuestion() {
        System.out.printf("%nWhat is the second secret word of every programmer?%n%n");
    }

    public void printCorrect() {
        System.out.printf("%nCorrect!%n");
    }

    public void printWrong() {
        System.out.printf("%nWrong! Try again.%n");
    }

    public void printResult(String result) {
        System.out.printf("%n" + result + "%n");
    }
}
