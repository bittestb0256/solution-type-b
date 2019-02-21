package problem04;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {

		int riverCnt = 0;
		int rockCnt = 0;

		List<String> list = new ArrayList();
		
		while(riverCnt < 10 && rockCnt < 10) {
			int flag = (int)(Math.round(Math.random()));
			if (flag == 0) {
				riverCnt++;
				list.add("#");
			} else if (flag == 1) {
				rockCnt++;
				list.add("O");
			}
		}
		
		for(String s : list ) {
			System.out.println(s);
		}
	
				
	}

}
