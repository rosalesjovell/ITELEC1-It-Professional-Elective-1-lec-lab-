class ActivityLifecycle {

    public void onCreate() {
        System.out.println("onCreate: Activity is being created (UI and data are initialized).");
    }

    public void onStart() {
        System.out.println("onStart: Activity is now visible to the user.");
    }

    public void onResume() {
        System.out.println("onResume: Activity is now active and ready for user interaction.");
    }

    public void onPause() {
        System.out.println("onPause: Activity is partially hidden, resources should be saved.");
    }

    public void onStop() {
        System.out.println("onStop: Activity is no longer visible.");
    }

    public void onDestroy() {
        System.out.println("onDestroy: Activity is about to be destroyed, cleanup is done.");
    }

    public static void main(String[] args) {
        ActivityLifecycle activity = new ActivityLifecycle();
        activity.onCreate();
        activity.onStart();
        activity.onResume();
        activity.onPause();
        activity.onStop();
        activity.onDestroy();
    }
}
