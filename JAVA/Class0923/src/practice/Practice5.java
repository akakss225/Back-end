package practice;

import java.util.StringTokenizer;

public class Practice5 {

	public static void main(String[] args) {
//		5. 주소록 csv데이터에서 데이터를 분리하시오.
//		홍길동,010-1111-2222,hkd@hkd.com
		
		String csv = "홍길동,010-1111-2222,hkd@hkd.com";
		
		StringTokenizer st = new StringTokenizer(csv, ",");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
