public class RunState extends State{

    public RunState(Player player) {
        super(player);
    }

    @Override
    public void standUP() {
        // TODO Auto-generated method stub
        player.setSpeed(0);
        player.talk("뛰다가 갑자기 서면 무릎이..");
        player.setState(new StandUpState(player));
    }

    @Override
    public void sitDown() {
        // TODO Auto-generated method stub
        player.setSpeed(0);
        player.talk("먼저 서야지..");
        player.setState(new StandUpState(player));
    }

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        player.setSpeed(8);
        player.talk("속도를 줄일게~");
        player.setState(new WalkState(player));
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        player.setSpeed(player.getSpeed() + 2);
        player.talk("더 빨리~");
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "뛰는 중";
    }
    
}
