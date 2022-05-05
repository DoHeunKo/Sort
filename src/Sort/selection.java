package Sort;

public class selection {

   public static void main(String[] args) {
	  long startTime = System.nanoTime();
	  
      int [] data= {20,50,10,30,40};
      int sz=data.length;
      int temp = 0;
       
       for (int k = 0; k < sz - 1; k++) {
           int least = k;

           for (int i = k + 1; i < sz; i++) {
               if (data[least] > data[i]) {
                   
                   least = i;
               }
               
           }
           temp = data[least];
           data[least] = data[k];
           data[k] = temp;
       }
       for(int j=0;j<sz;j++) {
          System.out.println(data[j]);
       }
       long endtime = System.nanoTime();

       long elapsedTime = endtime-startTime;

       System.out.println(elapsedTime + " ns");
   }

}