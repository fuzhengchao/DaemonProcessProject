package qilue.daemonprocess;

import android.content.Context;

/**
 * 守护进程管理类
 *
 * @author qilue
 * @since 2016-5-18
 */
public class DaemonProcessManager {

    // 守护类型
    public enum DaemonType {

        /**
         * Notification 前台守护
         */
        NOTIFICATION_DAEMON,

        /**
         * native 进程守护
         */
        NATIVE_DAEMON
    }

    /**
     * 默认方式开启守护服务
     * <p/>
     * 默认方式为开启所支持的所有类型的守护。
     *
     * @param context 上下文
     */
    public static void startDaemonProcess(Context context) {

    }

    /**
     * 开启守护服务端
     *
     * @param context    上下文
     * @param daemonType 守护类型 {@link DaemonType}
     */
    public static void startDaemonProcess(Context context, DaemonType daemonType) {

    }

    /**
     * 关闭守护服务
     * <p/>
     * 关闭所有守护服务。
     *
     * @param context 上下文
     */
    public static void stopDaemonProcess(Context context) {

    }

    /**
     * 关闭守护服务
     *
     * @param context    上下文
     * @param daemonType 关闭守护服务类型
     */
    public static void stopDaemonProcess(Context context, DaemonType daemonType) {

    }
}
