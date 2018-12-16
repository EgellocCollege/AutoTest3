package auto.com;

public class Commands {
    public static final String  SHELL = "adb shell";
    public static final String  DEVICES = "adb devices";
    public static final String  PACKAGE_LIST = "adb shell pm list package";
    public static final String  SHOW_CURRENT_ACTIVITY = "adb shell dumpsys activity activities";

    public static final String  START_APP = "adb shell monkey -p %s -c android.intent.category.LAUNCHER 1";

}
