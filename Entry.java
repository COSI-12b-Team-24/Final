public class Entry{
  private String name;
  private String email;
  private String phone;

  public Entry(String name, String email, String phone){
    this.name = name;
    this.email = email;
    this.phone = phone;
  }

  private String getName(){
    return name;
  }

  private String getEmail(){
    return email;
  }

  private String getPhone(){
    return phone;
  }

  private void setEmail(String email){
    this.email = email;
  }

  private void setPhone(String phone){
    this.phone = phone;
  }

  private String toString(){
    return "name: " + name + ", E-mail: " + email + ", Phone Number: " + phone;
  }
}
