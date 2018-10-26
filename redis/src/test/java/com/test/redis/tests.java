package com.test.redis;

public class tests {

  public static void main(String[] args) {
    Long count = 1L;
    for (int i = 1; i <= 50; i++) {
      count = count * (i + 50) / i;
    }
    System.out.println(count / 2);
  }

  public static void test() {
    for (int i = 1; i <= 100; i++) {

    }
  }
}
