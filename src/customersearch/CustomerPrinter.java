package customersearch;

public class CustomerPrinter {

	public static void printCustomer(Customer c) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuffer printbuffer = new StringBuffer();
		printbuffer.append("名前: "+c.getName()+", ");
		printbuffer.append("性別: "+ c.getGender()+", ");
		printbuffer.append("サイズ: "+c.getSize().toString()+", ");
		printbuffer.append("誕生日: "+c.getBirthday().toString());

		System.out.println(printbuffer.toString());
	}

	public static void printNameAndAge(Customer c) {
		System.out.println("名前: "+c.getName()+",年齢: "+c.getAge());
	}

}
