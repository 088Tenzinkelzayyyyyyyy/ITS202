public class linearsearch{    
public static int linearSearch(int[] arra, int key){    
        for(int i=0;i<arra.length;i++){    
            if(arra[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        int[] x1= {8,11,24,3,23};    
        int key = 24;    
        System.out.println(key+" is found at index: "+linearSearch(x1, key));    
    }    
}    