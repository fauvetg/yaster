package org.yaster;

public class YasterRunner {


    public void run() throws ClassNotFoundException {
        System.out.println(getClass().getClassLoader());
        System.out.println("run");
        Class.forName("org.objectweb.asm.Item");
    }

    public void shutdown() {
        System.out.println("shutdown");
    }
}