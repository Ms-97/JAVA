package chapter08.classroomExample.Book;

public class Novel extends Book{
	public Novel(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) {
		return lateDays*300;
	}
}
