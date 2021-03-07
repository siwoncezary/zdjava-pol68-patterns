package strategy;

public interface Strategy<T> {
    T doOperation(T input);
}
