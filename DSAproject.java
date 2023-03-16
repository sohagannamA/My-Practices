import java.util.Scanner;
class Student{
     String name,address;
     int roll;
     Student(String name,int roll,String address){
          this.name=name;
          this.roll=roll;
          this.address=address;
     }
     public void displayData(){
          System.out.println("Name: "+name);
          System.out.println("Roll: "+roll);
          System.out.println("Address: "+address);
     }
}
class DSAproject{
     public static void SortFunction(Student stu[]){
          for(int i=0;i<stu.length;i++){
               for(int j=0;j<stu.length-1-i;j++){
                    if(stu[j].roll>stu[j+1].roll){
                         Student temp=stu[j];
                         stu[j]=stu[j+1];
                         stu[j+1]=temp;
                    }
               }
          }
          SortData(stu);
     }
     public static void BinarySearch(Student stu[],int target){
          int left=0;
          int right=stu.length-1;
          while(left<=right){
               int mid=(left+right)/2;
               if(stu[mid].roll==target){
                    System.out.println("Name: "+stu[mid].name);
                    System.out.println("Address: "+stu[mid].address);
                    return;
               }
               else if(stu[mid].roll<target){
                    left++;
               }
               else{
                    right--;
               }
          }
          if(left>right){
               System.out.println(target+" Student not found!");
               return;
          }
     }
     public static void SortData(Student stu[]){
          for(int i=0;i<stu.length;i++){
               System.out.println("\n");
               System.out.println("Name: "+stu[i].name);
               System.out.println("Roll: "+stu[i].roll);
               System.out.println("Address: "+stu[i].address);
          }
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the Student roll: ");
          int value=sc.nextInt();
          BinarySearch(stu,value);
     }
     public static void main(String[]args){
          Student student[]={new Student("Sohag Annam", 2, "Phulbari"),
          new Student("Millat", 3, "Dhaka"),
          new Student("Shawon", 4, "Rangamathi"),
          new Student("Esha", 1, "Dinajpur")};
          SortFunction(student);     
     }
}