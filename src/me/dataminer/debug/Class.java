package me.dataminer.debug;

import org.junit.Test;

import java.io.Serializable;

/**
 * Created by qijianpeng on 2019/7/17.
 * mail: jianpengqi@126.com
 */
public class Class implements Serializable {
  private static final long serialVersionUID = 1L;

  @Test
  public void testA(){
    for (int i = 1; i < 10; i++) {
      System.out.println(i);
    }
  }

}
