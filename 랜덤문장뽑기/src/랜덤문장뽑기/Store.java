package ����������;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.IOException;
public class Store {
	public static void main(String[] args) throws IOException {
		BufferedOutputStream bs = null;
		try {
			bs= new BufferedOutputStream(new FileOutputStream("C:\\Users\\daeeu\\Desktop\\Daeeun.txt"));
			String str ="���� ������ ���� �����ϴ�.";
			bs.write(str.getBytes());
		} catch (Exception e) {
				e.getStackTrace();
		}finally {
				bs.close();
		}
	}

}
