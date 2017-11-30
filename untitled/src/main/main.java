package main;

import java.io.File;

public class main {

    public static void main(String[] args){

/*       String path="/home/daehyun/git/romeo/php/0009_CWE98_PHP_Remote_File_Inclusion";
        File dirFile=new File(path);
        File []fileList=dirFile.listFiles();

        String bad = "no_sanitizing__require_file_name-sprintf_%s_simple_quote";
        String good ="whitelist_using_array__require_file_name-sprintf_%s_simple_quote";

        for(File tempFile : fileList) {
            if(tempFile.isFile()) {

                String tempFileName=tempFile.getName();
                if(tempFileName.contains(bad)){
                    String replaced = tempFileName.replace(bad,"bad");
                    File fileNew = new File( path+"/"+replaced );
                    tempFile.renameTo(fileNew);
                    System.out.println(tempFile.getName());
                }else if(tempFileName.contains(good)){
                    String replaced  =tempFileName.replace(good,"good");
                    File fileNew = new File( path+"/"+replaced );
                    tempFile.renameTo(fileNew);
                    System.out.println(tempFile.getName());

                }

            }
        }*/




  /*      String path2="0022_CWE209_Information_Exposure_Through_an_Error Message";
        String path="/home/daehyun/git/romeo/php/"+path2;
        File dirFile=new File(path);
        File []fileList=dirFile.listFiles();
        int bad =0;
        int good = 0;
        int nonono =0;


        for(File tempFile : fileList) {
            if(tempFile.isFile()) {

                if(tempFile.getName().contains("bad")){
                    bad++;

                }else if(tempFile.getName().contains("good")){
                    good++;
                }else{
                    nonono++;
                }

            }
        }

        System.out.println("bad: "+bad);
        System.out.println("good: "+good);
        System.out.println("no: "+nonono);
*/


        String path="/home/daehyun/git/romeo/php/0048_CWE484_Omitted_Break_Statement_in_Switch";
        File dirFile=new File(path);
        File []fileList=dirFile.listFiles();




        for(File tempFile : fileList) {
            if(tempFile.isFile()) {

                String tempFileName=tempFile.getName();
                String replaced = "C"+tempFileName.replace(".php","_01.php");

                    File fileNew = new File( path+"/"+replaced );
                    tempFile.renameTo(fileNew);
                    System.out.println(tempFile.getName());


                }

            }












    }
}
