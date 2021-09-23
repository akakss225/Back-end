
public class Class4 {

	public static void main(String[] args) {
		
		String fileName = "report.hwp";
		
		System.out.println(fileName.indexOf(".")); // 존재하지 않으면 -1 return
		int positionOfDot = fileName.indexOf(".");
		System.out.println(fileName.substring(positionOfDot + 1));
		
		String jumin = "213465-1234567";
		int positionOfDash = jumin.indexOf("-");
		System.out.println(jumin.substring(positionOfDash+1));
		
		String hp = "010-1234-1234";
		String[] result = hp.split("-");
		for(int i =0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		// CSV(Comma Seperated Value) 
		String data = "홍길동,010-1234-1234,hong@hong.com";
		String result2[] = data.split(",");
		for(String d: result2) {
			System.out.println(d);
		}
	}

}
