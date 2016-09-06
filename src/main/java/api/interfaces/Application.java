package api.interfaces;

/**
 * Created by Rameez on 7/20/2016.
 */
public interface Application {

    void forceStop();
    void clearData();
    Object open();
    String packageID();
    String activityID();
}
