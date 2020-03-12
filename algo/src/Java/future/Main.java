package Java.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
      
      List<Future<Integer>> futureList = new ArrayList<>();
      
      for(int i=0; i<10; i++) {
         Integer num = (int)(Math.random()*4);
         Future<Integer> rs = executor.submit(new Task(num));
         futureList.add(rs);
      }
      
      try {
         for(Future<Integer> future : futureList) {
            System.out.println(future.get());
         }
      } catch(Exception e) {
         
      }
      
      executor.shutdown();
   }

}
