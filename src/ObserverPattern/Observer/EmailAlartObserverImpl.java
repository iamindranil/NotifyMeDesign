package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class EmailAlartObserverImpl implements NotificationAlartObserver{
	
	String emailId;
	StocksObservable observable;
	
	public EmailAlartObserverImpl(String emailId,StocksObservable observable) {
		this.observable=observable;
		this.emailId=emailId;
	}
	
	@Override
	public void update() {
		sendMail(emailId,"Product is in the stock..hurry up!");
	}
	
	private void sendMail(String emailId,String msg) {
		System.out.println("Mail sent to: "+emailId);
		//codes
	}
	
}
