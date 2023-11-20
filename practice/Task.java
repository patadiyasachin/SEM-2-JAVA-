import java.util.Scanner;

public class Task{
	public static void main(String[] args) {
		Scanner scString=new Scanner(System.in);
		Scanner scNumber=new Scanner(System.in);

		System.out.println("Enter No of books ");
		int n=scNumber.nextInt();

		BookDetail books[]=new BookDetail[n];

		for(int i=0; i<n; i++){
			System.out.println("Enter Title of book"+(i+1));
			String title=scString.nextLine();

			System.out.println("Enter author of book"+(i+1));
			String author=scString.nextLine();

			System.out.println("Enter price of book"+(i+1));
			int price=scNumber.nextInt();

			System.out.println("Enter noOfBooks of book"+(i+1));
			int noOfBookAvailable=scNumber.nextInt();

			books[i]=new BookDetail(title,author,price,noOfBookAvailable);
		}

		while(true){

			System.out.println("Enter 1 for search 2 for update 3 for display");
			int choice=scNumber.nextInt();

			if(choice==1){		
				System.out.println("Enter search word ");
				String searchWord=scString.nextLine();
					for(int i=0;i<n;i++){
						if(books[i].search(searchWord)){
							System.out.print("book title "+books[i].title);
						}
					}	
			}

			else if(choice==2){
				System.out.println("Enter Title of the book");
				String searchWord = scString.nextLine();	
				System.out.println("Enter positive number to purchase or negative number for sell");
				int noOfBooks = scNumber.nextInt();
				for(int i=0;i<n;i++){
					if(books[i].search(searchWord)){
						books[i].updateStoke(noOfBooks);
					}
				}
			}
			else if(choice==3){
				for(int i=0;i<n;i++){
					System.out.println("Title of book["+(i+1)+"]= "+books[i].title);
					System.out.println("Author of book["+(i+1)+"]= "+books[i].author);
					System.out.println("Price of book["+(i+1)+"]= "+books[i].price);
					System.out.println("Stock of book["+(i+1)+"]= "+books[i].noOfBookAvailable);
				}
			}
			else{
				break;
			}
		}
	}
}

class Book{
	String title;
	String author;

	Book(String title,String author){
		this.title=title;
		this.author=author;
	}
}

class BookDetail extends Book{
	double price;
	int noOfBookAvailable;

	BookDetail(String title,String author,double price,int noOfBookAvailable){
		super(title,author);
		this.price=price;
		this.noOfBookAvailable=noOfBookAvailable;
	}

	boolean search(String searchWord){
		if(title.indexOf(searchWord)>-1 || author.indexOf(searchWord)>-1){
			return true;
		}

		else{
			return false;
		}
	}

	void updateStoke(int noOfBooks){
		noOfBookAvailable+=noOfBooks;
	}
}    