package Exercise.Chapter_8.interfaces2;

public class DynCircularQueue implements ICharQ{

    private char q[]; // массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов
  
    // Создание пустой очереди заданного размера
    public DynCircularQueue(int size) {
      q = new char[size]; // выделение памяти для очереди
      putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc+1 == getloc |
        ((putloc == q.length - 1) & (getloc == 0))) {

        }
    }

    @Override
    public char get() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public char reset() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reset'");
    }

}
