package Sort;

public class insertion {
   public static void main(String[] args) {
   int [] _data= {20,50,10,30,40};
   int sz=_data.length;
    int i;
    int j;
    
    
    for ( i = 1; i < sz; i++) {
        int me = _data[i];
        for ( j = i - 1; j >= 0; j--) {
            if (me < _data[j]) {
                
                _data[j+1] = _data[j];
            }
            
            if (me > _data[j]) {
                break;
            }
        }
        _data[j + 1] = me;
    }
    for(int k=0;k<sz;k++) {
       System.out.println(_data[k]);
    }
}   
}
