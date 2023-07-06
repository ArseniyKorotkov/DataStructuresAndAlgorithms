package track6Recursion.pack5TowerOfHanoi;

public class TowerOfHanoi {

    private Stock[] stocks = new Stock[3];
    private int gameSize;
    private boolean isGameOver;
    private int step;

    public TowerOfHanoi(int gameSize) {
        this.gameSize = gameSize;
        createStocks();
        addingFirstTower();
    }

    private void createStocks() {
        stocks[0] = new Stock();
        stocks[1] = new Stock();
        stocks[2] = new Stock();
    }

    public Stock[] getStocks() {
        return stocks;
    }

    private void addingFirstTower() {
        for (int i = gameSize; i > 0; i--) {
            stocks[0].add(i);
        }
    }

    public void changeOfTowers(int from, int to) {

        if (from == to || from < 1 || to < 1 ||
            from > 3 || to > 3 || stocks[from - 1].isEmpty()
            || stocks[from - 1].peek() > stocks[to - 1].peek()) {
            System.out.println("Is not good change. Try again...");
        } else {
            step++;
            stocks[to - 1].add(stocks[from - 1].pop());
        }

        showStocks();
        if(checkGameOver()) {
            System.out.println("!!! You is winner !!! ");
        }

    }

    public boolean checkGameOver() {
        if(stocks[stocks.length - 1].peek() == stocks[stocks.length - 1].getAllStockElement(gameSize - 1)) {
            isGameOver = true;
        }
        return isGameOver;
    }


    public void showStocks() {
        for (int i = Stock.maxSize() - 1; i >= 0; i--) {
            for (int j = 0; j < stocks.length; j++) {
                System.out.print(stocks[j].getAllStockElement(i) + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int getStepCounter(){
        return step;
    }


}
