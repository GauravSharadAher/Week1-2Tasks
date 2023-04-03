

public class AlternatePrime {


    int arr[]= new int[100];
    public void prime(){
        int k=0;
        int j;
        for(int i=0;i<=100;i++){
            for(  j=2; j<i; j++){
                if(i%j==0){
                    break;
                }
            }
            if(j==i){
                int temp;
                temp=i;
                arr[k]=i;
                if(k%2==0){
                    System.out.print(temp+" ");
                }
                k++;
            }

        }
        System.out.println();

        for(int i=0; i<arr.length; i++){
            if(i%2==0){
             if(arr[i]==0){
                 continue;
             }
            System.out.print(arr[i]+" ");
        } }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AlternatePrime a=new AlternatePrime();
        a.prime();
    }

}
