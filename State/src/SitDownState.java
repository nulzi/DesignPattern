public class SitDownState extends State{
    public SitDownState(Player player){
        super(player);
    }

    @Override
    public void standUP() {
        // TODO Auto-generated method stub
        player.setState(new StandUpState(player));
        player.talk("인나자..");
    }

    @Override
    public void sitDown() {
        // TODO Auto-generated method stub
        player.talk("앉아 있자나..");
    }

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        player.talk("앉아서 어떻게 걸어? 일단 서자..");
        player.setState(new StandUpState(player));
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        player.talk("앉아서 어떻게 뛰어.. 일단 서자..");
        player.setState(new StandUpState(player));
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return "앉아있음";
    }
    
}
