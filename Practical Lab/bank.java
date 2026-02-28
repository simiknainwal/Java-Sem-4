class BankAccount{
	private String accno;
	private String name;
	private double bal;
	BankAccount(){
		accno=" ";
		name=" ";
		bal=0;
	}
	
	BankAccount(String accno,String name,double bal){
		this.accno=accno;
		this.name=name;
		this.bal=bal;
	}
	
	String getAccno() {
		return accno;
	}
	String getName() {
		return name;
	}
	double getBal() {
		return bal;
	}
	
	void deposit(double amt) {
		bal+=amt;
	}
	
	boolean withdraw(double amt) {
		if(amt>bal) {
			return false;
		}
		else {
			bal-=amt;
			return true;
		}
	}
	
	void display() {
		System.out.println(name+" "+accno+" "+bal);
	}
	
}

class SavingsAccount extends BankAccount{
	private double interest;
	double bal=getBal();
	String name=getName();
	String accno=getAccno();
	
	SavingsAccount(String accno,String name,double bal,double interest){
		super(accno,name,bal);
		this.interest=interest;
	}
	
	void deposit(double amt) {
		bal+=amt*(1+interest);
	}
	
	boolean withdraw(double amt) {
		if(bal<2000) {
			return false;
		}else {
			bal-=amt;
			return true;
		}
	}
	
	void display() {
		System.out.println(name+" "+accno+" "+bal+" "+interest);
	}
	
}

class CheckingAccount extends BankAccount{
	private double limit=10000;
	String name=getName();
	String accno=getAccno();
	double bal=getBal();
	
	CheckingAccount(String accno,String name,double bal){
		super(accno,name,bal);
	}
	
	void deposit(double amt) {
		bal+=amt;
	}
	
	boolean withdraw(double amt) {
		if(amt>limit) {
			return false;
		}else {
			bal-=amt;
			return true;
		}
	}
	
	void display() {
		System.out.println(name+" "+accno+" "+bal+" "+limit);
	}
}

public class bank {
public static void main(String args[]) {
	SavingsAccount ob1 = new SavingsAccount("Simik","CNR001",50000,0.1);
	CheckingAccount ob2 = new CheckingAccount("Simik","CNR001",50000);
	ob1.deposit(20000);
	ob2.deposit(20000);
	System.out.println(ob1.withdraw(30000));
	System.out.println(ob2.withdraw(30000));
	ob1.display();
	ob2.display();
}
}
