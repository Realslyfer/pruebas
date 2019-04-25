
public class Tablones {

    public static void main(String[] args) {
        
        /*CLAVANDO TABLONES*/

        int[] arrayA=new int[4];
        int[] arrayB=new int[4];
        //clavos
        int[] arrayC=new int[5];
        int clavos=5;
        
        arrayA[0]=1;
        arrayA[1]=4;
        arrayA[2]=5;
        arrayA[3]=8;
        
        arrayB[0]=4;
        arrayB[1]=5;
        arrayB[2]=9;
        arrayB[3]=10;
            
        arrayC[0]=4;
        arrayC[1]=6;
        arrayC[2]=7;
        arrayC[3]=10;
        arrayC[4]=2;
        
        solution(arrayA,arrayB,arrayC,1);
        
    }
   static void solution(int arrayA[],int arrayB[],int arrayC[],int clavos){
        if(arrayA[0]>0&&arrayB[0]>0&&(arrayC[0]>clavos)){
            System.out.println("Es posible clavar: "+4+" tablones");
        }
        else{
            System.out.println("No es posible clavar todos los tablones: "+(-1));
        }
    }
}