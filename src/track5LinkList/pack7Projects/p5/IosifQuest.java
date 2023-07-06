package track5LinkList.pack7Projects.p5;

public class IosifQuest {

    private SimpleCycleList cycleList = new SimpleCycleList();
    private int countGamers;
    private int countSteps;
    private boolean isWinner = true;

    public IosifQuest(int countGamers, int countSteps) {
        this.countGamers = countGamers;
        this.countSteps = countSteps;
        readyList();
    }

    private void readyList() {
        if (countGamers > 1) {
            for (int i = 0; i < countGamers; i++) {
                cycleList.add(countGamers - i);
            }
            cycleList.next();
            isWinner = false;
        } else {
            System.out.println("Need more gamers");
        }
    }

    public void nextStep() {
        if(cycleList.getSize() == 1) {
            cycleList.peek();
            isWinner = true;
//            System.out.print("\t");
            System.out.println("is winner");
        } else {
            for (int i = 0; i < countSteps - 1; i++) {
                cycleList.next();
            }

            cycleList.removeNext();
        }
    }

    public boolean isWinner() {
        return isWinner;
    }
}
