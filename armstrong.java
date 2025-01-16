public class armstrong{
public static int countdigit(int n){
int cnt=1;
while(n>9){
 n=n/10;
cnt++;
}
return cnt;
}
public static int armstrongno(int no,int cnt){
int sum=0,k=no;
while(k!=0){
int d=k%10;
sum+=Math.pow(d,cnt);
k=k/10;
}
return sum;
}
public static void main(String[] args){
int n=200;
for(int i=1;i<=n;i++){
int cnt=countdigit(i);
int ans=armstrongno(i,cnt);
if(ans==i)
System.out.println("armstrong no"+ans);
}


}

}
