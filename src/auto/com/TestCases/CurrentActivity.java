package auto.com.TestCases;

import auto.com.Commands;
import auto.com.Executor;

import java.util.ArrayList;

public class CurrentActivity {

    public static void main(String[] args) {

        Executor packages = new Executor(Commands.SHOW_CURRENT_ACTIVITY);
        packages.exe();


        ArrayList<String> infos = packages.getResponses();

        for (String info : infos) {
            if (info.contains("mFocusedActivity")) {
                System.out.println("-----------");
                System.out.println(info);
            }
        }
    }
}
