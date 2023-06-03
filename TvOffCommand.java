public class TvOffCommand implements Command
{
    private TV tv;
    public TvOffCommand(TV tv)
    {
        this.tv = tv;
    }

    public void execute()
    {
        this.tv.TurnOff();
    }
}
