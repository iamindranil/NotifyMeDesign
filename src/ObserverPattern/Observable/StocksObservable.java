package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlartObserver;

public interface StocksObservable {
	public void add(NotificationAlartObserver observer);
	public void remove(NotificationAlartObserver observer);
	public void notifySubscribers();
	public void setStockCount(int newStockAdded);
	public int getStockCount();
}
