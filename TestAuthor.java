package practice2;

public class TestAuthor {
	public static void main(String [] args) {
		Author a1 = new Author("��� ������","ionkolf@gmail.com", 'M');
		Author a2 = new Author ("��� ������", "nilman@gmail.com", 'M');
		Author a3 = new Author ("������ �����", "jojomoyes@gmail.com", 'F');
		Author a4 = new Author ("���� ����","maxfry@gmail.com", 'U');
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
	}

}
