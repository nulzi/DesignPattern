public class StandUpState extends State{

    public StandUpState(Player player){
        super(player);
    }

    @Override
    public void standUP() {
        // TODO Auto-generated method stub
        player.talk("언제 움직일꺼야?");
    }

    @Override
    public void sitDown() {
        // TODO Auto-generated method stub
        player.setState(new SitDownState(player));
        player.talk("앉으니깐 편하고 좋습니다.");
    }

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        player.setSpeed(8);
        player.setState(new WalkState(player));        
        player.talk("건기는 제 2의 생각하기다..");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        player.setSpeed(10);
        player.setState(new RunState(player));
        player.talk("갑자기 뛴다!");
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "제자리에 서 있음";
    }
    
}
