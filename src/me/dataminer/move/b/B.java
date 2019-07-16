package me.dataminer.move.b;

import me.dataminer.move.a.A;

import java.io.Serializable;

/**
 * Created by qijianpeng on 2019/7/16.
 * mail: jianpengqi@126.com
 */
public class B implements Serializable {
  private static final long serialVersionUID = 1L;

  public static void main(String[] args) {
    A a = new A();
    a.methodA();
  }
}
