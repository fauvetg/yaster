package org.yaster.classloader;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by fauvetg on 25/01/16.
 */
public class YasterClassLoader extends URLClassLoader
{
    public YasterClassLoader(URL[] urls)
    {
        super(urls);
    }
}
