package track4StackAndQueue.pack4Projects.p3;

import track4StackAndQueue.pack4Projects.p2.DequeX;

public class StackXQ extends DequeX {

    public StackXQ(int size) {
        super(size);
    }

    @Override
    public long removeLeft() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void insertLeft(long element) {
        throw new UnsupportedOperationException();
    }
}
