package ����������;


import java.io.FileOutputStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


import javax.swing.JOptionPane;


public class createSentence {
public static void main(String[] args) throws IOException {
	

	OutputStreamWriter bs = null;
	String choice="1.���常���\n2.�������庸��\n3.����\n4.�ҷ�����\n5.�����ϰ� ������";
	String ask = "����Ϸ��� 1�� ���ֽʽÿ�.";
	List<Integer> mix = new ArrayList<Integer>();
	List<String> Sentence = new ArrayList<String>();
	//�����ϱ�
	while(true) {
		switch(Integer.parseInt(JOptionPane.showInputDialog(choice))) {
			//���常���
			case 1: 
			while(true) {
			Sentence.add(JOptionPane.showInputDialog("������ ��������."));
			//�����ؼ� ���鲫��
				switch(Integer.parseInt(JOptionPane.showInputDialog(ask))) {
				case 1:
					continue;	
				default: break;
				}
				break;
			}
			
			
				continue;
				//���弯� �����ֱ�
				case 2:
					
					for (int i=0; i<Sentence.size(); i++)
					{
						mix.add(i);
					}
					Collections.shuffle(mix);
					
					for(int i = 0; i < Sentence.size(); i++) {
					JOptionPane.showMessageDialog(null, Sentence.get(mix.get(i)));
				}
					continue;
					
					
				case 3: 
					JOptionPane.showMessageDialog(null, Sentence);
				continue;
				
				case 4:
					ArrayList<String> data = new ArrayList<String>();
					ArrayList<String> tmp = new ArrayList<String>();
					BufferedReader reader;
					
					try {
						reader = new BufferedReader(new FileReader("C:\\Users\\dbslz\\OneDrive\\���� ȭ��\\Daeeun.txt"));
						String line = reader.readLine();
						while (line != null) {
							data.add(line);
							line = reader.readLine();
						}
						tmp = data;
						for(int i = 0; i< Sentence.size();i++) {
							tmp.add(Sentence.get(i));
						}
						Sentence=tmp;
						// read next line
						reader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
									
					//������ִ� �����͸� �� ó������. �׸��� ���� ����ִ� �ӽõ����͸� �ǵڷ�
					continue;
				case 5:
							if(Integer.parseInt(JOptionPane.showInputDialog("�����Ϸ��� 1�� �Է��ϼ���"))==1) {
							try {
								bs= new OutputStreamWriter(new FileOutputStream("C:\\Users\\dbslz\\OneDrive\\���� ȭ��\\Daeeun.txt"));
								for(int i=0; i < Sentence.size(); i++) {
									bs.write(Sentence.get(i)+"\n");
									
								}
							} catch (Exception e) {
								e.getStackTrace();
							}finally {
								bs.close();
							}
							break;
							}else break;
		}
		break;
		}
}
}



