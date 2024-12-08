package ganit;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class que3 {
    public static void main(String args[]) throws IOException,FileNotFoundException{
        String filename = "C:\\demo\\sut1\\vesit_laukik_assignment1(2).xlsx";     //Location where excel file is getting generated
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Instruction");      //Generating first sheet as Instruction

        XSSFSheet sheet1 = workbook.createSheet("Questions");       //Generating second sheet as Questions

        //Adding first row in second sheet(Questions)
        String[] header = {"Sr. No","Question Type","Answer Type","Topic Number","Question (Text Only)","Correct Answer 1","Correct Answer 2",
                "Correct Answer 3","Correct Answer 4","Wrong Answer 1","Wrong Answer 2","Wrong Answer 3","Time in seconds","Difficulty Level",
                "Question (Image/ Audio/ Video)","Contributor's Registered mailId","Solution (Text Only)","Solution (Image/ Audio/ Video)","Variation Number"};
        XSSFRow rowhead = sheet1.createRow((short)0);

        //Set height and width to the column and row
        sheet1.setColumnWidth(4, 35*250);
        sheet1.setColumnWidth(16, 45*250);

        //Adding header to the second sheet
        for(int head=0; head<header.length; head++) {
            rowhead.createCell(head).setCellValue(header[head]);

        }

        //Taking input for number of question you want to generate
        System.out.println("How many question you want to enter:-");
        Scanner sc=new Scanner(System.in);
        int mapsize,mapsizeafter;
        HashMap<String, Integer> map = new HashMap<String, Integer> ();
        int q = sc.nextInt();
        for(int i =1;i<q+1;i++) {
            // Create row
            XSSFRow row = sheet1.createRow(i);
            row.createCell(0).setCellValue(i);
            row.createCell(1).setCellValue("Text");
            row.createCell(2).setCellValue(1);
            row.createCell(3).setCellValue("110205");

            // Generate random number to perform the operation
            Random random = new Random();
            int a = (int)(Math.random()*(100))+1;
            int c = (int)(Math.random()*(100))+1;
            int e = (int)(Math.random()*(100))+1;
            int f = (int)(Math.random()*(100))+1;
            int g = (int)(Math.random()*(100))+1;

            //powers
            int b = (int)(Math.random()*(6))+1;
            int d = (int)(Math.random()*(6))+1;
            int h = (int)(Math.random()*(6))+1;

            int Correct_ans=0;
            String questionInt = "0";
            String questionInt1 = "0";

            int num = (int)(Math.random()*(10));
            switch (num){
                case 1: questionInt = "$"+a+"x^"+b;
                        questionInt1="$-"+c+"x^"+d;
                        Correct_ans = a+c;
                        break;
                case 2: questionInt = "$"+a+"x^"+b;
                        questionInt1="$"+e+"x";
                    Correct_ans = e+a;
                    break;
                case 3: questionInt = "$"+a+"x^"+b;
                    questionInt1= "$"+g+"x^"+h;
                    Correct_ans = g+a;
                    break;
                case 4: questionInt = "$"+e+"x";
                    questionInt1= "$"+g+"x^"+h;
                    Correct_ans = g+e;
                    break;
                case 5:questionInt = "$-"+c+"x^"+d;
                    questionInt1=  "$"+g+"x^"+h;
                    Correct_ans =-1*c+g;
                case 6:questionInt = "$"+g+"x^"+h;
                    questionInt1="$-"+c+"x^"+d;
                    Correct_ans =-1*c+g;

            }
            int w1=0,w2=0,w3=0;
            switch (num){
                case 1: w1 = -1*c;
                    w2 = e;
                    w3 = g;
                    break;
                case 2: w1 =a;
                    w3 = e;
                    w2 = g;
                    break;
                case 3: w2 =a;
                    w1 = -1*c;
                    w3 = g;
                    break;
                case 4:w3 = a;
                    w1 =-1*c;
                    w2 = e;
                    break;
            }

//            //Generate Correct answer
//            int sn = (n1)*(((2*a)+((n1-1)*d)))/2;
//            String Correct_ans = String.valueOf(sn);

            //Generate wrong options
//            int sn1 =(n1/2)*((a)+((n1-1)*d));
//            String wrong_ans = String.valueOf(sn1);
//            int sn2 = (n1/2)*((2*a)+((n1)*d));
//            String wrong_ans1 = String.valueOf(sn2);
//            int sn3 = (n1/2)*((2*a)+((n1+1)*d));
//            String wrong_ans2 = String.valueOf(sn3);

            //Generate question english
            String  Que = "For the polynomial, $a="+a+"x^"+b+"-"+c+"x^"+d+"+"+e+"x-"+f+"+"+g+"x^"+h+"$, identify the sum of coefficients corresponding to "+questionInt+"$and "+questionInt1+"$";
            //Generate question marathi
            String Que1 = "<br>$a="+a+"x^"+b+"-"+c+"x^"+d+"+"+e+"x-"+f+"+"+g+"x^"+h+"$ या बहुपदȣमधील "+questionInt+"$आणि"+questionInt1+" $यांच्या सहगुणकांची बेरीज किती ?<br>";
            String Question = ""+Que+" "+Que1+"";

            row.createCell(4).setCellValue(Question);
            row.createCell(5).setCellValue(Correct_ans);
//				 row.createCell(6).setCellValue(" ");
//				 row.createCell(7).setCellValue(" ");
//				 row.createCell(8).setCellValue(" ");
            row.createCell(9).setCellValue(w1);
            row.createCell(10).setCellValue(w2);
            row.createCell(11).setCellValue(w3);
            row.createCell(12).setCellValue(150);
            row.createCell(13).setCellValue(1);
//				  row.createCell(14).setCellValue(" ");
            row.createCell(15).setCellValue("2022.laukik.padgaonkar@ves.ac.in");

            //Generate Solution
            String Solu = "$"+Correct_ans+"$<br>Constant term associated with variable in the \n" +
                    "polynomial is called coefficient. There are various coefficients in this \n" +
                    "polynomial.<br>The term associated with coefficient $"+questionInt+"$ is $"+Correct_ans+"$ \n" +
                    "<br>$\\therefore $"+Correct_ans+"$ is the answer.<br> #";
            String Sol1 = ": $"+Correct_ans+"$<br> चलाबरोबर असणारा िèथरांक हा चलाचा सहगुणक असतो.<br> \n" +
                    "Ǒदलेãया बहुपदȣमÚयेĤ×येक पदाचेवेगवेगळेसहगुणक आहेत.<br> ×यातील सहगुणक\n"
                    +questionInt+"$ असलेलेपद $"+Correct_ans+"$ आहे.<br>$therefore $"+Correct_ans+"$ हेउƣर.<br>";
            String Solution = " "+Solu+" "+Sol1+" ";
            row.createCell(16).setCellValue(Solution);
//				  row.createCell(17).setCellValue(" ");
            row.createCell(18).setCellValue(158);

            mapsize = map.size();
            map.put(Question, i);
            mapsizeafter = map.size();

            //In Java, a map can consist of virtually any number of key-value pairs, but the keys must always be unique — non-repeating.
            if(mapsize == mapsizeafter) {
                System.out.println("duplicate Question"+i+". " + Question);
                i--;
            }

            if(w1==w2||w1==w2||w1==w3||w1==w2||w1==w3||w2==w3) {
                System.out.println("duplicate"+ i);
                i--;
            }


        }


        int rowTotal = sheet1.getLastRowNum();
//			  System.out.println(rowTotal);
        XSSFRow row = sheet1.createRow((short)rowTotal+1);
        row.createCell(0).setCellValue("****");

        //Writing data to the file
        FileOutputStream fileout = new FileOutputStream(filename);
        workbook.write(fileout);
        fileout.close();

        System.out.println("file created");

    }

}