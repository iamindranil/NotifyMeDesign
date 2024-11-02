import ObserverPattern.Observable.IphoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlartObserverImpl;
import ObserverPattern.Observer.MobileAlartObserverImpl;
import ObserverPattern.Observer.NotificationAlartObserver;

public class Store {
	public static void main(String[]args) {
		StocksObservable iphoneStocksObservable=new IphoneObservableImpl();
		
		NotificationAlartObserver observer1=new EmailAlartObserverImpl("abc@gmail.com", iphoneStocksObservable);
		NotificationAlartObserver observer2=new EmailAlartObserverImpl("abc1@gmail.com", iphoneStocksObservable);
		NotificationAlartObserver observer3=new MobileAlartObserverImpl("abc2@gmail.com", iphoneStocksObservable);
		
		
		iphoneStocksObservable.add(observer1);
		iphoneStocksObservable.add(observer2);
		iphoneStocksObservable.add(observer3);
		
		iphoneStocksObservable.setStockCount(10);
	}
}
