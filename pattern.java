public class pattern{
public static void main(String[] args){
int run1=1,run2=2,run4=3,n=9;
for(int i=0;i<n;i++){
System.out.print(run1);
System.out.print(run2);
int run3=run1+run2;
System.out.print(run3);
run1=run3;
run2=run4+1;
System.out.println();
run4++;
}


}
}
