public abstract class State {
    protected Player player;

    public State(Player player){
        this.player = player;
    }

    //player 동작
    public abstract void standUP();
    public abstract void sitDown();
    public abstract void walk();
    public abstract void run();
    //현재 상태 반환
    public abstract String getDescription();
}
