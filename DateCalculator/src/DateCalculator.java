import javax.swing.*;

public class DateCalculator {

	public static void main(String[] args) {
		JFrame f = new JFrame("DateCalculator");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(450,450);
		f.add(new DateCalculatorPanel());
		f.setVisible(true);
	}

}
