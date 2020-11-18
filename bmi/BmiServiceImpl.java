package bmi;

public class BmiServiceImpl implements BmiService {

	@Override
	public double calc(BmiDTO bmi) {
		return bmi.getWeight() / bmi.getHeight() / bmi.getHeight()*10000;
	}
}
