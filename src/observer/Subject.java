package observer;

/**
 * Класс наблюдателя. Класс хранит список объектов-подписчиков, которых необходимо уведомлять о
 * каких-либо событиях
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
