package testcases.C0026_RESLEAK__CWE404_Improper_Resource_Shutdown;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CWE772_RESLEAK__try {
    private void good(String fName) throws IOException {
        BufferedReader fil = null;
        try{
            fil = new BufferedReader(new FileReader(fName));
            String line;
            while ((line = fil.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException iex){
            iex.printStackTrace();
        }finally {
            if(fil != null){
                try{
                    fil.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    private void bad_1() throws IOException{
        BufferedReader fil = null;
        String fName = "";
        ArrayList<String> args = new ArrayList<>();
        fil = new BufferedReader(new FileReader(fName));
        try {
            if(args.size() == 0) {
                throw new Exception();
            }
            else if(args.size() == 1) {
                return;
            }
            fil.close();
        }
        catch(Exception e) {

        }
    }

    private void good_1() throws IOException{
        BufferedReader fil = null;
        String fName = "";
        fil = new BufferedReader(new FileReader(fName));
        try {
            // TODO: close 함수 호출 전에 예외를 던지는 로직이 없음

            if(fil != null) {
                fil.close();
            }
        }
        catch(IOException e) {

        }
    }
    private void good_2() throws IOException{
        BufferedReader fil = null;
        String fName = "";
        fil = new BufferedReader(new FileReader(fName));
        try {
            // TODO: close 함수 호출 전에 예외를 던지는 로직이 없음


        } finally {
            try {
                if (fil != null) {
                    fil.close();
                }
            }catch(IOException e) {}
        }
    }

    private void good_3() throws IOException{
        BufferedReader fil = null;
        String fName = "";
        ArrayList<String> args = new ArrayList<>();
        fil = new BufferedReader(new FileReader(fName));
        try {

            if(args.size() == 0) {
                throw new Exception();
            }
            else if(args.size() == 1) {
                return;
            }

            fil.close();
        }
        catch(IOException e) {

        }
        catch(Exception e) {

        }
        finally {
            if(fil != null) {
                fil.close();
            }
        }
    }

    private void good_4() throws IOException{
        String fName = "";
        ArrayList<String> args = new ArrayList<>();
        try(FileInputStream fis = new FileInputStream(String.valueOf(new FileReader(fName)))) {

            if(args.size() == 0) {
                throw new Exception();
            }
            else if(args.size() == 1) {
                return;
            }
        }
        catch(IOException e) {

        }
        catch(Exception e) {

        }
    }
}
