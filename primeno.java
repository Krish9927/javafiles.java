public class primeno{
public static void main(String[] args){
int n=50,cnt=0;
for(int i=2;i<=n;i++){
for(int j=2;j<i;j++){
if(i%j==0)
cnt++;
}
if(cnt==0){
System.out.println("prime number"+i);
}
cnt=0;
}
}

}
