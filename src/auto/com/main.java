package auto.com;


import java.util.ArrayList;

public class main {

    public static void main(String[] args){

        Executor packages = new Executor(Commands.CALL_100000);
        packages.exe();
        ArrayList<String> packageList = packages.getResponses();

//        Executor appStartor = new Executor();
//
//        for (String str:packageList){
//            appStartor.setCommand(Commands.getStartAppCmd(str));
//            appStartor.exe();
//            try{
//                Thread.sleep(3000);
//            }catch (Exception e){
//                System.out.println(e);
//            }
//        }

    }





}
