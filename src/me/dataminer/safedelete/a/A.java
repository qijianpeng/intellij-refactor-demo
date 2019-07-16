package me.dataminer.safedelete.a;

import me.dataminer.safedelete.b.B;

import java.io.Serializable;

/**
 * Created by qijianpeng on 2019/7/16.
 * mail: jianpengqi@126.com
 */
public class A implements Serializable {
  private static final long serialVersionUID = 1L;

  public static void methodB() {
    B.methodB();
  }
}
