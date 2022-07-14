public class WalkState extends State{
    public WalkState(Player player){
        super(player);
    }

    @Override
    public void standUP() {
        // TODO Auto-generated method stub
        player.setSpeed(0);
        player.talk("멈춰..");
        player.setState(new StandUpState(player));
    }

    @Override
    public void sitDown() {
        // TODO Auto-generated method stub
        player.setSpeed(0);
        player.talk("걷다가 앉으면 넘어질 수 있어..");
        player.setState(new SitDownState(player));
    }

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        player.setSpeed(8);
        player.talk("난 걷는걸 좋아해");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        player.setSpeed(20);
        player.talk("걷다가 뛰면 빨리 뛸 수 있지!");
        player.setState(new RunState(player));
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "걷는 중";
    }

}
