package ch16.scheduler;

public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}
