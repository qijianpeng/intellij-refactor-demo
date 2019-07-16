package me.dataminer.pushdown;

/**
 * Created by qijianpeng on 2019/7/16.
 * mail: jianpengqi@126.com
 */
abstract class SuperClass {
  public abstract void publicMethod();

  public void hiddenMethod() {
    //push me
  }
}

public class Class extends SuperClass {
  public void publicMethod() {

  }
}


