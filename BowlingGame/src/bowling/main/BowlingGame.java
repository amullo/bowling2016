package bowling.main;

import java.util.ArrayList;

import bowling.vo.Member;

public class BowlingGame {
	ArrayList<Member> memArr = new ArrayList<Member>();
	
	BowlingGame() {
		System.out.println("BowlingGame 생성자!!!!");
	}
	
	public void startGame() {
		System.out.println("Game Set! 3member");
		
		for(int i = 1 ; i <= 3 ; i++) {
			Member member = new Member(i, "아무개"+i);
			memArr.add(member);
		}
	}
	
	public void playGame() {
		System.out.println("Game Start!");
		
		for(int i = 1 ; i <= 3 ; i++) {
			Member member = new Member(i, "아무개"+i);
			memArr.add(member);
		}
	}
}
