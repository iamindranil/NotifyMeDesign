package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlartObserverImpl implements NotificationAlartObserver{
	String userName;
	StocksObservable observable;
	
	public MobileAlartObserverImpl(String userName,StocksObservable observable) {
		this.userName=userName;
		this.observable=observable;
	}

	@Override
	public void update() {
		sendMsg(userName,"produxt is in stock..hurry up!");
	}
	
	private void sendMsg(String userName,String msg) {
		System.out.println("msg sent to:"+userName);;
	}
}
