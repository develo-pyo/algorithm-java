package Java.future;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer>{
   
   private Integer number;

   public Task(Integer number) {
      this.number = number;
   }
   
   @Override
   public Integer call() throws Exception {
      // TODO Auto-generated method stub
      
      int rs = 1;
      if(number < 2) {
         return rs;
      }
      for(int i=2; i<=number; i++) {
         rs*=i;
         Thread.sleep(500L);
      }
      return rs;
   }
   
   
}
