package qilue.daemonprocess;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * 守护进程服务Service。
 *
 * @author qilue
 * @since 2016-5-18
 */
public class DaemonService extends Service {
    private static final int SERVICE_ID = 10000;

    public DaemonService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        startForeground(SERVICE_ID, new Notification());

        return START_STICKY;
    }
}
