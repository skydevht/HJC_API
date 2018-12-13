package maFirstSrpringApp.com.apptryAgain.model;


public class Question {
	private Long id;
	private String text;
	private String answer_a;
	private String answer_b;
	private String answer_c;
	private String answer_d;
	private String correct_answer;
	private int limit;
	private int point;
	private int active;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAnswer_a() {
		return answer_a;
	}

	public void setAnswer_a(String answer_a) {
		this.answer_a = answer_a;
	}

	public String getAnswer_b() {
		return answer_b;
	}

	public void setAnswer_b(String answer_b) {
		this.answer_b = answer_b;
	}

	public String getAnswer_c() {
		return answer_c;
	}

	public void setAnswer_c(String answer_c) {
		this.answer_c = answer_c;
	}

	public String getAnswer_d() {
		return answer_d;
	}

	public void setAnswer_d(String answer_d) {
		this.answer_d = answer_d;
	}

	public String getCorrect_answer() {
		return correct_answer;
	}

	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Question{" +
				"id=" + id +
				", text='" + text + '\'' +
				", answer_a='" + answer_a + '\'' +
				", answer_b='" + answer_b + '\'' +
				", answer_c='" + answer_c + '\'' +
				", answer_d='" + answer_d + '\'' +
				", correct_answer='" + correct_answer + '\'' +
				", limit=" + limit +
				", point=" + point +
				", active=" + active +
				'}';
	}
}
