package co.grandcircus;

public class Task {

	private String memberName;
	private String description;
	private String dueDate;
	private String completionStatus;

	public Task() {
		super();
	}

	public Task(String memberName, String description, String dueDate, String completionStatus) {
		super();
		this.memberName = memberName;
		this.description = description;
		this.dueDate = dueDate;
		this.completionStatus = completionStatus;

	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getCompletionStatus() {
		return completionStatus;
	}

	public void setCompletionStatus(String completionStatus) {
		this.completionStatus = completionStatus;
	}

	@Override
	public String toString() {
		return "Task [memberName=" + memberName + ", description=" + description + ", dueDate=" + dueDate
				+ ", completionStatus=" + completionStatus + "]";
	}

}
