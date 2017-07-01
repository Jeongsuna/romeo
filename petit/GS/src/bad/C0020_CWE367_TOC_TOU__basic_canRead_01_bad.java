package moi32.safe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class C0020_CWE367_TOC_TOU__basic_canRead_01_bad {
	
	public class FileDeleteThread extends Thread {
		
		public void run(){
			File f = new File("Shared.txt");
			
			if(f.exists()){//만약 파일이 존재하면 파일을 삭제함
				f.delete();
			}
		}
	}
	
	public class FileAccessThread extends Thread {
		
		public void run(){
			try{
				File f = new File("Shared.txt");
				if(f.exists()){
					BufferedReader br = new BufferedReader(new FileReader(f));
					br.close();
				}
			}
			catch(IOException e){
				System.err.println("IOException occured");
			}
		}
	}

	public static void main(String[] args){
		//파일의 읽기와 파일을 삭제하는 것을 동시에 수행한다.
		FileAccessThread fileAccessThread = new FileAccessThread();
		FileDeleteThread fileDeleteThread = new FileDeleteThread();
		fileAccessThread.run();
		fileDeleteThread.run();
	}
}
