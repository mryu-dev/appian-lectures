
public final class StringBufferDemo {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Manpreet");
		
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		String surname = " Bindra";
		String last = " Singh ";
		
		sb.append(last);
		sb.append(surname);
		System.out.println(sb);
		System.out.println(sb.length());

		String mid = " J. ";
		sb.insert(8, mid);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		System.out.println("Reverse:"+sb.reverse());

	}
}
