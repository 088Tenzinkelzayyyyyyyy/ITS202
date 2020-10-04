public class arr{
    int max;
    static int size;
    int top;
    int [] array;
    
    public arr(){
        max = 4;
        size = 0;
        top = -1;
        array = new int[max];
    }
    
    public void add(int x){
        if (size==0){
                array[0]=x;
                top = 0;
        }
        else{
            array[top+1]=x;
            top = top + 1;
        }
        size = size+1;
        System.out.println(" "+x);
         System.out.println(" ");
    }
    
    public void pop(){
        if (size==0){
            System.out.println( "Array is empty.");
        }
        else{
            top = top-1;
            size = size-1;
        }
    }
    
    public int size(){
        return size;
    }
    public void resize(){
        if (size()==3 || size()==4) {
            int temp[] = new int[max*2];
            for(int i = 0; i < array.length; i ++){
                temp[i] = array[i];
            }
            max = max*2;
            size = max;
            array = temp;
            for(int j : array){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        else if (size()==1){
            int temp[] = new int[max/2];
            for(int i = 0; i < array.length/2; i ++){
                temp[i] = array[i];
            }
            size = max/2;
            array = temp;
            for(int j  : array){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        else{
            size = max;
            for(int j  : array){
                System.out.print(j + " ");
            }
            System.out.println();
        }
       
    }

    public static void main(String[] args) {
        arr ob = new arr();
        System.out.println("The size of array before adding is: "+ob.size());
        ob.add(8);
        ob.add(5);
        ob.add(15);
        
        //ob.pop();
        
        ob.resize();
        System.out.println("The array size is now: "+ob.size());   
    }
}
   