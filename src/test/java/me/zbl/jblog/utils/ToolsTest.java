package me.zbl.jblog.utils;

import org.junit.Test;

import java.util.Date;

/**
 * Created by Administrator on 2016/9/3.
 */
public class ToolsTest {
    @Test
    public void testGetTagList(){
        System.out.println(System.getProperty("user.dir"));
    }

    @Test
    public void testTool(){
        int year = TimeTools.getYear(new Date());
    }
}
