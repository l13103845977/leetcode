package com.leetcode;



import java.util.concurrent.CountDownLatch;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.Watcher.Event.EventType;
import org.apache.zookeeper.Watcher.Event.KeeperState;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
/**
 * zookeeper demo
 */

public class ZookeeperDemo implements Watcher {

    /** zookeeper地址 */
    static final String CONNECT_ADDR = "192.168.1.113:2181";
     /** session超时时间 */
     static  final int SESSION_OUTTIME = 5000;// ms

    /** 信号量，阻塞程序执行，用于等待zookeeper连接成功，发送成功信号 */
    static  final CountDownLatch connectedSemaphore = new CountDownLatch(1);

   public static void main(String[] args) throws Exception {
        ZooKeeper zooKeeper=new ZooKeeper(CONNECT_ADDR, SESSION_OUTTIME, new ZookeeperDemo());

        connectedSemaphore.await();

       System.out.println("---------");
    }



    public void process(WatchedEvent watchedEvent) {

        if(watchedEvent.getState() == Event.KeeperState.SyncConnected) {
            System.out.println("连接成功");

        }
    }
}
