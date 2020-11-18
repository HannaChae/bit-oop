package gradeBook;

public class GbServiceImpl implements GbService {


	@Override
	public int total(GbDTO gb) {
		return gb.getKorean() + gb.getEnglish() + gb.getMath();
	}

	@Override
	public double average(GbDTO gb) {
		return (gb.getKorean() + gb.getEnglish() + gb.getMath()) / 3;
	}
	

}
