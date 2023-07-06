package track6Recursion.pack9Projects.p4;

public class QuestionAboutBackpack {

    private final long[] array;
    private final long[] answer;
    private int answerSize;
    private final long maxSize;

    public QuestionAboutBackpack(long[] array, long maxSize) {
        this.array = array;
        answer = new long[array.length];
        this.maxSize = maxSize;
        returnAnswer(0, maxSize);
    }

    private long returnAnswer(int index, long size) {

        for (int i = index; i < array.length; i++) {

            long newSize = size - array[i];
            long nextNumber = 0;

            if (newSize > 0) {
                if(i == array.length - 1) {
                    break;
                }
                nextNumber = returnAnswer(i + 1, newSize);
            }

            if (nextNumber == newSize) {
                answer[answerSize] = array[i];
                answerSize++;
                return array[i] + newSize;
            }
        }
        return -1;
    }

    public void showAnswer() {
        if(answerSize > 0) {
        for (int i = 0; i < answerSize; i++) {
            System.out.print(answer[i] + " ");
        } }
        else {
            System.out.println("no answer");
        }


    }
}
