package me.dataminer.pullup;

import java.io.Serializable;

/**
 * Created by qijianpeng on 2019/7/16.
 * mail: jianpengqi@126.com
 */
abstract class SuperClass {
  public abstract void publicMethod();
}

public class Class extends SuperClass {
  public void publicMethod() {

  }
  public void hiddenMethod() {
    //pull me
  }
}


