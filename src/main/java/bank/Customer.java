package bank;

public class Customer {
  private int ld;
  private String name;
  private String username;
  private String password;
  private int accountId;

  public Customer(int id, String name, String username, String password, int accountID){
    setId(id);
    setName(name);
    setUsername(username);
    setPassword(password);
    setAccountId(accountID);
    
  }

  public int getLd() {
    return this.ld;
  }

  public void setLd(int ld) {
    this.ld = ld;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getAccountId() {
    return this.accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }



}
