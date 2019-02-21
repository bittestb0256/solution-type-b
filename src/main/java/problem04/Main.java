package problem04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		int turn = 0;
		int currentIndex = 0;
		
		List<String> list = createRiverRock();
		Scanner sc = new Scanner(System.in);
		
		for(String s : list ) {
			System.out.print(s);
		}
		
		
		
		while(currentIndex < list.size()) {
			sc.nextLine();
			currentIndex = currentIndex + dice();
			turn++;
			int diceNum = dice();
			
			System.out.print(turn + "." + "\t" + diceNum + "\n");
			
			for(int i = 0 ; i < list.size() ; i++) {
				System.out.print(list.get(i));
			}
			System.out.println(" ");
			for(int s = 0 ; s < list.size(); s++) {
				if (s == diceNum) {
					System.out.print("^");
				} else {
					System.out.print(" ");
				}
			}

		}
	
				
	}
	
	public static List<String> createRiverRock() {
		
		int riverCnt = 0;
		int rockCnt = 0;
		
		List<String> list = new ArrayList();
		
		while(riverCnt < 11 && rockCnt < 11) {
			int flag = (int)(Math.round(Math.random()));
			if (flag == 0) {
				riverCnt++;
				list.add("#");
			} else if (flag == 1) {
				rockCnt++;
				list.add("O");
			}
		}
		
		
		return list;
	}
	
	public static int dice() {
		return (int)(Math.random()*4)+1;
	}
}
