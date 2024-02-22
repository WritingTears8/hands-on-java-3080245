package bank;

public class Account {
 
    private int id;
    private String type;
    private Double balance;
    

    public Account(int int1, String string, double double1) {
			//TODO Auto-generated constructor stub
		}

		public void Account( int id, String type, Double balance){
      setId(id);
      setType(type);
      setBalance(balance);
      
    }

    public int getId() {
      return this.id;
    }

    public void setId(int id) {
      this.id = id;
    }

   

    public void setType(String type) {
      this.type = type;
    }

    public String getType() {
      return this.type;
    }

      public Double getBalance() {
      return this.balance;
    }

    public void setBalance(Double balance) {
      this.balance = balance;
    }

    public void deposit (double amount){

    }
    
    public void withdraw (double amount){
      
    }


   
  }


