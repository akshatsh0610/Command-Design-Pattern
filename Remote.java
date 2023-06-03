
//controller that will be taking the command form the invoker to the executor
public class Remote
{
    Command command;
    public Remote()
    {

    }
    public void setCommand(Command command)
    {
        this.command = command;
    }
    public void pressButton()
    {
        this.command.execute();
    }

}
