package org.yaster;

import org.yaster.classloader.YasterClassLoader;

import java.net.URI;
import java.net.URL;

public class Yaster
{

    public static void main(String[] args) throws Exception
    {
        URL[] urls = new URL[]{URI.create("file:/home/fauvetg/.m2/repository/asm/asm/3.3.1/asm-3.3.1.jar").toURL(),
                URI.create(
                        "file:/home/fauvetg/.m2/repository/org/apache/commons/commons-lang3/3.3.2/commons-lang3-3.3.2.jar")
                        .toURL()};

        YasterClassLoader loader = new YasterClassLoader(urls);

        Thread.currentThread().setContextClassLoader(loader);

        Class<?> jasterRunnerClazz = loader.loadClass("org.objectweb.asm.Item");
        Object jasterRunner = jasterRunnerClazz.newInstance();
        try
        {
            jasterRunnerClazz.getMethod("run").invoke(jasterRunner);
        } finally
        {
            jasterRunnerClazz.getMethod("shutdown").invoke(jasterRunner);
        }
    }

}