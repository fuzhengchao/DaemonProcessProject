package qilue.daemonprocess.foreground;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


/**
 *
 * 前台保活服务：利用Notification实现。<br>
 * 原理：利用系统漏洞来启动一个带有隐形NotifyCation前台的Service服务。
 * 与普通的启动方式区别在于，它不会在系统通知栏处出现一个Notification，看起来就如同运行着一个后台Service进程一样。
 * 这样做带来的好处就是，用户无法察觉到你运行着一个前台进程（因为看不到Notification）,但你的进程优先级又是高于普通后台进程的。
 * <p/>
 * 思路一：API < 18，启动前台Service时直接传入new Notification()；
 * 思路二：API >= 18，同时启动两个id相同的前台Service，然后再将后启动的Service做stop处理；
 *
 * @author qilue
 * @since 2016-5-18
 */
public class NotificationDaemonService extends Service {

    public NotificationDaemonService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {


        return super.onStartCommand(intent, flags, startId);
    }
}
