package art;
public class Painting extends Art {
	private String paintType;

	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}
	
	public void viewArt() {
		System.out.println("Title: " + getTitle());
		System.out.println("Author: " + getAuthor());
		System.out.println("Description: " + getDescription());
		System.out.println("Paint Type: " + getPaintType() + "\n");
	}
	
	public String getPaintType() {
		return this.paintType;
	}
	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
}
