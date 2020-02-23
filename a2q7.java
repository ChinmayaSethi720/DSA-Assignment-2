import java.util.Scanner;
interface aa
{
void display();
void count();
} 
class bb implements aa
{
static int maxcount;
String name;
bb()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter name of the person");
name=sc.next();
}
public void count()
{
for(int i=0;i<name.length();i++)
{
maxcount++;
}
}
public void display()
{
System.out.println("name: "+name);
System.out.println("no of character= "+maxcount);
}
}
public class a2q7 {
public static void main(String[] args) {
// TODO Auto-generated method stub
bb obj=new bb();
obj.count();
obj.display();
}
}