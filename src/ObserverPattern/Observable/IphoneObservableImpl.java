package ObserverPattern.Observable;


import java.util.ArrayList;
import java.util.List;
import ObserverPattern.Observer.NotificationAlartObserver;



public class IphoneObservableImpl implements StocksObservable{
	
	public List<NotificationAlartObserver> observerList=new ArrayList<>();
	public int stockCount=0;
	
	@Override
	public void add(NotificationAlartObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void remove(NotificationAlartObserver observer) {
		observerList.remove(observer);
	}
	
	@Override
	public void notifySubscribers() {
		for(NotificationAlartObserver observer:observerList) {
			observer.update();
		}
	}

	@Override
	public void setStockCount(int newStockAdded) {
		if(stockCount==0) {
			notifySubscribers();
		}
		stockCount+=newStockAdded;
	}

	@Override
	public int getStockCount() {
		return stockCount;
	}
	
}
