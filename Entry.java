public class Entry{
  private String name;
  private String email;
  private String phone;

  public Entry(String name, String email, String phone){
    this.name = name;
    this.email = email;
    this.phone = phone;
  }

  public String getName(){
    return name;
  }

  public String getEmail(){
    return email;
  }

  public String getPhone(){
    return phone;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public void setPhone(String phone){
    this.phone = phone;
  }

  public String toString(){
    return "name: " + name + ", E-mail: " + email + ", Phone Number: " + phone;
  }
}
