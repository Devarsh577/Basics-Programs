import java.util.Random;

class Randomdemo{
public static void main(String args[]){

Random r =new Random();
int a[]=new int[20];

for(int i=0;i<a.length;i++){

a[i]= r.nextInt(1000);
}

for(int i : a){
System.out.println(i);
}

}



}