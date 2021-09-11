import static java.lang.System.*;
class Reversearray
{
public static void main(String  args[]){ 
int []arr = new int []{1,2,3,4,5};
out.println("Orignal Array:");

for(int i=0;i<arr.length;i++)
{
out.println( arr[i] +" ");
}
out.println();

out.println("Array in reverse order");

for(int i=arr.length-1;i>=0;i--)
{
out.println( arr[i]+" ");

}




}


}