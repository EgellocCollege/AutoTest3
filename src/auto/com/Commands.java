package auto.com;

public class Commands {
    public static final String  SHELL = "adb shell";
    public static final String  DEVICES = "adb devices";
    public static final String  PACKAGE_LIST = "adb shell pm list package";

    public static final String  SHOW_CURRENT_ACTIVITY = "adb shell dumpsys activity activities";

    public static final String  START_CAMERA= "adb shell am start -n com.android.camera/.Camera";

    public static final String  START_APP = "adb shell monkey -p %s -c android.intent.category.LAUNCHER 1";

    public static final String  START_WEB = "adb shell am start -a android.intent.action.VIEW -d https://www.huawei.com";

    public static final String  CALL_100000 = "adb shell am start -a android.intent.action.CALL -d tel:100000";

    public static final String  INPUT_KEYEVENT_HOME = "adb shell input keyevent 3";

    public static final String  ScreenCap = "adb shell screencap -p /sdcard/screen.png";

    public static String getStartAppCmd(String targetApp){
       return  String.format(Commands.START_APP,targetApp);
    }

}
