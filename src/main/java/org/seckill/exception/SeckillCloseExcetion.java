package org.seckill.exception;

public class SeckillCloseExcetion extends RuntimeException {

  public SeckillCloseExcetion(String message) {
    super(message);
  }

  public SeckillCloseExcetion(String message, Throwable cause) {
    super(message, cause);

  }
}
