import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyIntegerSort {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.print("Give me a valid path of input file : \n");
		Scanner temScan = new Scanner(System.in);
		String filePath = temScan.next();
		//System.out.print(filePath + "\n");
		BufferedReader bufRead = new BufferedReader(new FileReader(filePath));
		
		String tem;
		ArrayList<Integer> ar = new ArrayList<Integer>();
		try {
			while ((tem = bufRead.readLine()) != null)
			{
				
			    //System.out.print(tem + " ");
				int temInt = Integer.parseInt(tem);
				//System.out.print(temInt + " ");
				ar.add(temInt);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ar.sort(null);
		for (int i : ar)
		{
			System.out.print(i + " ");
		}
	}
}
