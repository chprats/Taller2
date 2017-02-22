package Monitor;

public class Condition {
private int number;
public Condition(){
	number = 0;
}
public synchronized boolean NoVacio() {
    if (number == 0)
        return false;
    else
        return true;
}

public synchronized void LiberarTodo() {
    number = 0;
    notifyAll();
}

public synchronized void LiberarUno() {
    number -= 1;
    notify();
}

public synchronized void wait_() throws InterruptedException {
    number++;
    wait(10);
}
}