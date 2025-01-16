public class palindrome{
public static boolean palindromeno(int n){
int sum=0,k=n;
while(k!=0){
int d=k%10;
sum=(sum*10)+d;
k=k/10;
}
if(sum==n)
return true;
return false;
}
public static void main(String[] args){
int n=200;
for(int i=1;i<=n;i++){
boolean k=palindromeno(i);
if(k==true)
System.out.println("palindrome no=="+i);
}

} 

}
