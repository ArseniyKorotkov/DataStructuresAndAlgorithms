package track6Recursion.pack9Projects.p2;

public class ThreeMaker {

    private String[] array;

    private int step;
    private int size;

    public ThreeMaker(int quest) {
        makeSize(quest);
        array = new String[size];
        makeBranches(0, quest);
    }

    private String makeBranches(int left, int right) {

        if(step == size) {
            return null;
        }
        int x = (right + left) / 2;
        StringBuilder builder = new StringBuilder();
        for (int i = left; i < right; i++) {
            if(i == x) {
                builder.append("X");
            } else {
                builder.append("-");
            }
        }

        for (int i = 0; i < step; i++) {
            builder.append(builder);
        }

            array[step] = builder.toString();
            step++;
            makeBranches(left, x);
            makeBranches(x, right);
        return builder.toString();
    }

    private int makeSize(int quest) {
        if(quest != 1) {
            quest = quest / 2;
            makeSize(quest);
        }
        size++;
        return quest;
    }

    public void  display(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
