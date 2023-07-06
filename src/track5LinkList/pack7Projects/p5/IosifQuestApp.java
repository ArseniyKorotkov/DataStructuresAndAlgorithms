package track5LinkList.pack7Projects.p5;

public class IosifQuestApp {

    public static void main(String[] args) {
        IosifQuest quest = new IosifQuest(2, 2);

        while (!quest.isWinner()) {
            quest.nextStep();
        }
    }
}
