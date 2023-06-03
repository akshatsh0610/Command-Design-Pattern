// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
         //client is the invoker

        //invoker knows which command to invoke
        //executor knows how to execute the command
        //controller will take the command from the invoker to the executor

        TV tv = new TV();      //executor
        Remote remote = new Remote();    //controller

        Command tvOnCommand = new TvOnCommand(tv);     //tv on cmd
        Command tvOffCommand = new TvOffCommand(tv); // tv off cmd

        remote.setCommand(tvOnCommand);
        remote.pressButton();      //invoking the tv on command

        remote.setCommand(tvOffCommand);
        remote.pressButton();     //invoking the tv off command

    }
}