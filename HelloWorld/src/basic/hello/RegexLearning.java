package basic.hello;

public class RegexLearning {

	public static void main(String[] args) {
		String email1="aaa@";
		String email2="123@456.com";
		IsEmailAddress(email1);
		IsEmailAddress(email2);
	}
	
	private static void IsEmailAddress(String email)
	{
		String regex="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		if(email.matches(regex))
		{
			System.out.println("一个合法地址 "+email);
		}
		else
		{
			System.out.println("一个非法地址 "+email);
		}
	}

}
