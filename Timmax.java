package Lession2;
import java.util.Scanner;

public class Timmax {
    public static void main(String[] args)
    {
        //Khai báo các biến,nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if(size >20)
                System.out.println("Size should not eeceed 20");
        }while (size >20);
        //Nhập giá trị cho phần tử mảng
            array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.println("Enter element"+(i+1)+" : ");
            array[i] = scanner.nextInt();
            i++;
        }
        //In danh sách đã nhập
        System.out.println("Property list: ");
        for(int j = 0;j< array.length;j++){
            System.out.println(array[j]+ "\t");
        }
        //Duyệt các phần tử của mảng để tìm GTLN vầ vị trí của nó
        int max = array[0];
        int index = 1;
        for(int j = 0;j<array.length;j++){
            if(array[j] > max){
                max = array[j];
                index = j+1;
            }
        }
        System.out.println("The largest property value in the list is "+ max+" ,at position "+ index);

    }
}
