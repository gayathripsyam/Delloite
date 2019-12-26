package Demo3;

class InnerClass {

	String password="password1234";
	class EncryptPassword{
		int passwordLevel=5;
		public void doEncrypt() {
			System.out.println("The password is: "+password);
		}
	}
}
 
public class ChangePassword{
	public static void main(String[] args) {
		InnerClass i = new InnerClass();
		InnerClass.EncryptPassword e= i.new EncryptPassword();
		e.doEncrypt();
	}
}