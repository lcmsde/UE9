public interface Puffer<T> {

    public void insert(T e);

    public T remove();

    public int size();

    public boolean isEmpty();

}
