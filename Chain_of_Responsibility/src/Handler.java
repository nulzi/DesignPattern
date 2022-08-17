
public abstract class Handler{
    protected Handler next = null;

    public Handler setNext(Handler next){
        this.next = next;
        return this.next; 
    }

    protected abstract void process(String url);

    public void run(String url){
        process(url);
        if(next != null) next.run(url);
    }
}