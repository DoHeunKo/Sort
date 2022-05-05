package Sort;

public class shell {

   public static void main(String[] args) {
      int [] _data= {20,50,10,30,40};
      int _sz=_data.length;
      int i, j;
       int gap = 0;
       for (gap = _sz / 2; gap > 0; gap = gap / 2) {
           for (i = 0; i < gap; i++) {
               for (j = i + gap; j < _sz; j = j + gap) {
                   int d = 0;
                   int me = _data[j];
                   for (d = j - gap; d >= 0 && _data[d] > me; d = d - gap) {
                       _data[d + gap] = _data[d];
                   }
                   _data[d + gap] = me;
               }
           }
       }
       for(int k=0;k<_sz;k++) {
          System.out.println(_data[k]);
       }


   }

}