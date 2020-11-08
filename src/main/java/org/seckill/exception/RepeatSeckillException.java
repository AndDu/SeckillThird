package org.seckill.exception;

public class RepeatSeckillException extends RuntimeException  {

  public RepeatSeckillException(String message) {
    super(message);
  }

  public RepeatSeckillException(String message, Throwable cause) {
    super(message, cause);
  }
}
