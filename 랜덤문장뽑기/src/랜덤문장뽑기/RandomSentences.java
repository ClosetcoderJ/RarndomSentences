package 영어문장생성기;


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
	String choice="1.문장만들기\n2.랜덤문장보기\n3.보기\n4.불러오기\n5.저장하고 끝내기";
	String ask = "계속하려면 1을 쳐주십시오.";
	List<Integer> mix = new ArrayList<Integer>();
	List<String> Sentence = new ArrayList<String>();
	//선택하기
	while(true) {
		switch(Integer.parseInt(JOptionPane.showInputDialog(choice))) {
			//문장만들기
			case 1: 
			while(true) {
			Sentence.add(JOptionPane.showInputDialog("문장을 넣으세요."));
			//연속해서 만들껀지
				switch(Integer.parseInt(JOptionPane.showInputDialog(ask))) {
				case 1:
					continue;	
				default: break;
				}
				break;
			}
			
			
				continue;
				//문장섞어서 보여주기
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
						reader = new BufferedReader(new FileReader("C:\\Users\\dbslz\\OneDrive\\바탕 화면\\Daeeun.txt"));
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
									
					//저장되있던 데이터를 맨 처음으로. 그리고 내가 들고있는 임시데이터를 맨뒤로
					continue;
				case 5:
							if(Integer.parseInt(JOptionPane.showInputDialog("저장하려면 1을 입력하세요"))==1) {
							try {
								bs= new OutputStreamWriter(new FileOutputStream("C:\\Users\\dbslz\\OneDrive\\바탕 화면\\Daeeun.txt"));
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



