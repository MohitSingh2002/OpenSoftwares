import java.lang.Runtime;

public class OpenSoftware {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        String[] openFirebase = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "https://firebase.google.com/"};
        try {
            runtime.exec(openFirebase);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        String[] openAndroidStudio = new String[] {"C:\\Program Files\\Android\\Android Studio2\\bin\\studio64"};
        try {
            runtime.exec(openAndroidStudio);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
