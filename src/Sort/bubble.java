package Sort;

public class bubble {

   public static void main(String[] args) {
      int [] _data= {20,50,10,30,40};
      int _sz=_data.length;
      int i, j, temp;
       for (i = 0; i < _sz; i++) {
           for (j = 0; j < _sz - 1 - i; j++) {
               if (_data[j] > _data[j + 1]) {
                   temp = _data[j + 1];
                   _data[j + 1] = _data[j];
                   _data[j] = temp;
               }
           }
       }
       for(int k=0;k<_sz;k++) {
          System.out.println(_data[k]);
       }

   }

}