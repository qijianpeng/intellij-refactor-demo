package me.dataminer.extract.parameter;

import java.io.Serializable;

/**
 * Created by qijianpeng on 2019/7/16.
 * mail: jianpengqi@126.com
 */
public class HelloWorldPrinter {
  public static void print() {
    System.out.println(generateText());
  }
  private static String generateText() {
    return "Hello, World!".toUpperCase();
  }
}
