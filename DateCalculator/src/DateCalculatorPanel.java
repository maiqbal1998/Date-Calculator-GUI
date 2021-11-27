import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class DateCalculatorPanel extends JPanel implements ActionListener {
	
	JLabel labelDay;
	JLabel labelMonth;
	JLabel labelYear;
	JLabel labelAnswer;
	JTextField inputDay;
	JTextField inputMonth;
	JTextField inputYear;
	JButton dateButton;
	
	DateCalculatorPanel() {
		labelDay = new JLabel("Day ");
		labelMonth = new JLabel("Month ");
		labelYear = new JLabel("Year ");
		labelAnswer = new JLabel("");
		inputDay = new JTextField(5);
		inputMonth = new JTextField(5);
		inputYear = new JTextField(5);
		dateButton = new JButton("Get Day");
		dateButton.addActionListener(this);
		
		add(labelDay);
		add(inputDay);
		add(labelMonth);
		add(inputMonth);
		add(labelYear);
		add(inputYear);
		add(dateButton);
		add(labelAnswer);
	}
	
	public void actionPerformed(ActionEvent event) {
		 if (event.getSource() == dateButton) {
			 try {
				 int day = Integer.parseInt(inputDay.getText());
				 int month = Integer.parseInt(inputMonth.getText());
				 int year = Integer.parseInt(inputYear.getText());
				 String dayOfWeek;
				 int dayOfWeekNumber = Doomsday.GetDayOfWeek(day,month,year);
				 
				 if (dayOfWeekNumber == -1) {
					 labelAnswer.setText(inputDay.getText() + "/" + inputMonth.getText() + "/" + inputYear.getText() + " is not a valid date.");
				 }
				 else if (dayOfWeekNumber == 0) {
					 dayOfWeek = "Sunday";
					 labelAnswer.setText(day + "/" + month + "/" + year + " is a " + dayOfWeek);
				 }
				 else if (dayOfWeekNumber == 1) {
					 dayOfWeek = "Monday";
					 labelAnswer.setText(day + "/" + month + "/" + year + " is a " + dayOfWeek);
				 }
				 else if (dayOfWeekNumber == 2) {
					 dayOfWeek = "Tuesday";
					 labelAnswer.setText(day + "/" + month + "/" + year + " is a " + dayOfWeek);
				 }
				 else if (dayOfWeekNumber == 3) {
					 dayOfWeek = "Wednesday";
					 labelAnswer.setText(day + "/" + month + "/" + year + " is a " + dayOfWeek);
				 }
				 else if (dayOfWeekNumber == 4) {
					 dayOfWeek = "Thursday";
					 labelAnswer.setText(day + "/" + month + "/" + year + " is a " + dayOfWeek);
				 }
				 else if (dayOfWeekNumber == 5) {
					 dayOfWeek = "Friday";
					 labelAnswer.setText(day + "/" + month + "/" + year + " is a " + dayOfWeek);
				 }
				 else if (dayOfWeekNumber == 6) {
					 dayOfWeek = "Saturday";
					 labelAnswer.setText(day + "/" + month + "/" + year + " is a " + dayOfWeek);
				 }
			 }
			 catch(Exception e) {
				 labelAnswer.setText("Invalid Input");
			 }

		 }
		
	}
}
