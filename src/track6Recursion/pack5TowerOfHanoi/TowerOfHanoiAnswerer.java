package track6Recursion.pack5TowerOfHanoi;

public class TowerOfHanoiAnswerer {


    private final TowerOfHanoi tower;
    private final Stock[] stocks;

    public TowerOfHanoiAnswerer(TowerOfHanoi tower) {
        this.tower = tower;
        stocks = tower.getStocks();

        doAnswer(1, 3, stocks[0].size());
    }

    private void doAnswer(int from, int to, int size) {


        if(size == 1) {
            nextStep(from, to);
            return;
        }

//        turnUp
        to = change(to, from);
        doAnswer(from, to, size - 1);

//      turnDown
        to = change(to, from);
        nextStep(from, to);

//      turnUpToDown
        from = change(from, to);
        doAnswer(from, to, size - 1);

    }


    private int change(int turn, int fix) {
        do {
            turn = ((turn + 1) % stocks.length) + 1;
        } while (turn == fix);

        return turn;
    }

    private void sleep() {
        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void nextStep(int from, int to) {
        System.out.println("from " + from + ", to " + to + ". Is step no: " + tower.getStepCounter());
        tower.changeOfTowers(from, to);
        sleep();
    }
}
