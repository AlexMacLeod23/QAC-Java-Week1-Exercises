package library;

public abstract class Items {
	protected String name;					//define attributes
	protected int iD;
	protected String author;
	protected int year;
	protected boolean onLoan;
	protected int loanExpiry;
		public Items(String name, int iD, String author, int year, boolean onLoan, int loanExpiry) {
			this.name = name;
			this.iD = iD;
			this.author = author;
			this.year = year;
			this.onLoan = onLoan;
			this.loanExpiry = loanExpiry;
		}
		public String getName() {		//define get and set methods
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getID() {
			return iD;
		}
		public void setID(int iD) {
			this.iD = iD;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public boolean isOnLoan() {
			return onLoan;
		}
		public void setOnLoan(boolean onLoan) {
			this.onLoan = onLoan;
		}
		public int getLoanExpiry() {
			return loanExpiry;
		}
		public void setLoanExpiry(int loanExpiry) {
			this.loanExpiry = loanExpiry;
		}
		public String writeDetails() { 	//for write/read feature, overloaded in Books, Magazines, maps, Records
				return name + ", " + iD +", " + author +", " + year +", " + onLoan +", " + loanExpiry +"\n";
		}
}
