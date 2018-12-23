package auto.com.TestCases;

import auto.com.Commands;
import auto.com.Executor;

import java.util.ArrayList;

public class StartApp {


    public void testStartApp(){

        Executor packages = new Executor(Commands.PACKAGE_LIST);
        packages.exe();
        ArrayList<String> packageList = packages.getResponses();

        Executor appStartor = new Executor();

        for (String str:packageList){
            appStartor.setCommand(Commands.getStartAppCmd(str));
            appStartor.exe();
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
