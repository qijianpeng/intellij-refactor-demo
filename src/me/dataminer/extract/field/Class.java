package me.dataminer.extract.field;

import java.io.Serializable;

/**
 * Created by qijianpeng on 2019/7/16.
 * mail: jianpengqi@126.com
 */
public class Class implements Serializable {
  private static final long serialVersionUID = 1L;
  AnotherClass anotherClass = new AnotherClass();
  public void method() {
    int a = 1;
    int b = a + anotherClass.intValue();
    int c = b + anotherClass.intValue();
  }

  class AnotherClass {
    public int intValue(){
      return 0;
    }
  }
}
