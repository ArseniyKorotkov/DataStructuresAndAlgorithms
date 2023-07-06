package track6Recursion.pack9Projects.p4;

public class BackPackApp {

    public static void main(String[] args) {
        long[] quest = {4, 2, 8, 7, 9};
        QuestionAboutBackpack question = new QuestionAboutBackpack(quest, 15);
        question.showAnswer();
    }
}
