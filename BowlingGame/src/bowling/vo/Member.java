package bowling.vo;

public class Member {
	int memSeq = 0;
	String memNm;
	int memScore = 0;
	
	public Member() {}
	
	public Member(int seq, String name) {
		this.memSeq = seq;
		this.memNm = name;
	}
	
	public int getMemSeq() {
		return memSeq;
	}
	public void setMemSeq(int memSeq) {
		this.memSeq = memSeq;
	}
	public String getMemNm() {
		return memNm;
	}
	public void setMemNm(String memNm) {
		this.memNm = memNm;
	}
	public int getMemScore() {
		return memScore;
	}
	public void setMemScore(int memScore) {
		this.memScore = memScore;
	}
	
}
