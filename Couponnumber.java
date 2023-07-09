package assignment;

import java.security.SecureRandom;
import java.util.Random;

public class Couponnumber {
    public static void main(String[] args) {
        char [] chars = "abcdefghijklmnopqrstuvwxyz123456789".toCharArray();
        int max = 1000;
        int random = (int) (Math.random()*max);
        StringBuilder sb = new StringBuilder();
      while (random>0)
      {
          sb.append(chars[random % chars.length]);
          random /= chars.length;
      }
        String output = sb.toString();
        System.out.println(output);
    }
}
