package auto.com;


import java.util.ArrayList;

public class main {

    public static void main(String[] args){

        Executor packages = new Executor(Commands.SHOW_CURRENT_ACTIVITY);
        packages.exe();


        ArrayList<String> infos = packages.getResponses();

        for (String info:infos) {
            if (info.contains("mFocusedActivity")){
                System.out.println("-----------");
                 System.out.println(info);
            }
        }



    }


    public void testStartApp(){

        Executor packages = new Executor(Commands.PACKAGE_LIST);
        packages.exe();
        ArrayList<String> packageList = packages.getResponses();

        Executor appStartor = new Executor();

        for (String str:packageList){
            appStartor.setCommand(String.format(Commands.START_APP,str));
            appStartor.exe();
            try{
                Thread.sleep(3000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }



}
