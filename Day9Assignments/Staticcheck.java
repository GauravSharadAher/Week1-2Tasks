package StringAssignments;

public class Staticcheck {
    public static void main(String[] args) {
        String s1="ABCDGH";
        String s2 ="AEDFHR";
        System.out.println(msg(s1,s2));
    }


    public static int msg(String s1,String s2){
        int count=1;
        char a1 [] = s1.toCharArray();
        char a2 [] = s2.toCharArray();
        int  a3=a2.length;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a2.length; j++) {
                if(a1[i]==a2[j]){
                    for (int k = j+1; k < a3; k++) {
                        if(a1[i+1]==a2[k]){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }




}
