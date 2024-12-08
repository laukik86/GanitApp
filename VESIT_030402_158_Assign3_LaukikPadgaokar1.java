package ganit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class VESIT_030402_158_Assign3_LaukikPadgaokar1 {

    public static void main(String args[]) throws IOException, FileNotFoundException {
        String filename = "F:\\Sut1\\VESIT_Btach_6\\VLab_030402_158_Assign03_LaukikPadgaokar.xlsx";     //Location where excel file is getting generated
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Instruction");      //Generating first sheet as Instruction
        XSSFSheet sheet1 = workbook.createSheet("Questions");       //Generating second sheet as Questions

        //Adding first row in second sheet(Questions)
        String[] header = {"Sr. No", "Question Type", "Answer Type", "Topic Number", "Question (Text Only)", "Correct Answer 1", "Correct Answer 2",
                "Correct Answer 3", "Correct Answer 4", "Wrong Answer 1", "Wrong Answer 2", "Wrong Answer 3", "Time in seconds", "Difficulty Level",
                "Question (Image/ Audio/ Video)", "Contributor's Registered mailId", "Solution (Text Only)", "Solution (Image/ Audio/ Video)", "Variation Number"};
        XSSFRow rowhead = sheet1.createRow((short) 0);

        //Set height and width to the column and row
        sheet1.setColumnWidth(4, 35 * 250);
        sheet1.setColumnWidth(16, 45 * 250);


        //Adding header to the second sheet
        for (int head = 0; head < header.length; head++) {
            rowhead.createCell(head).setCellValue(header[head]);

        }

        //Taking input for number of question you want to generate
        System.out.println("How many question you want to enter:-");
        Scanner sc = new Scanner(System.in);
        int mapsize, mapsizeafter;
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int q = sc.nextInt();
        for (int i = 1; i < q + 1; i++) {
            // Create row
            XSSFRow row = sheet1.createRow(i);
            row.createCell(0).setCellValue(i);
            row.createCell(1).setCellValue("Text");
            row.createCell(2).setCellValue(1);
            row.createCell(3).setCellValue("030402");


            // Generate random number to perform the operation
            int a =0 , b, c, d, e;

            Random random = new Random();

            int pos;
            pos = generateRandomIntInRange(0, 1);
            //int a,b,c,d,e;

            if (pos == 1) {
                do {
                    a = generateRandomIntInRange(0, 10);
                    b = generateRandomIntInRange(0, 10);
                    c = generateRandomIntInRange(0, 10);
                    d = generateRandomIntInRange(0, 10);
                    e = generateRandomIntInRange(0, 10);
                } while (!areAllDifferent(a, b, c, d, e) || e == 0 || d == 0 || c == 0 || b == 0 || a == 0);
            } else {
                do {
                    a = generateRandomIntInRange(0, 10);
                    b = generateRandomIntInRange(-10, 10);
                    c = generateRandomIntInRange(-10, 10);
                    d = generateRandomIntInRange(-10, 10);
                    e = generateRandomIntInRange(-10, 10);
                } while (!areAllDifferent(a, b, c, d, e) || e == 0 || d == 0 || c == 0 || b == 0 || a == 0);


            }
            Random abc = new Random();
            String ch[] = {"a", "b", "c", "d", "f", "g", "h", "l", "m", "n", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            int vx = abc.nextInt(ch.length);
            String chr = ch[vx];



            Set<Integer> uniqueIntegers = new HashSet<>();
            String p = "";
            String m = "";
            String r = "";
            String s = "";
            String t = "";

            String c1 = ""+a;
            String c2 = ""+b;
            String c3 = ""+c;
            String c4 = ""+d;
            String c5 = ""+e;




            if (a > 0) {
                p = "" + a;
            }
            else {
                p = "" + a;
            }
            if (b > 0) {




                m = "+" + b;
            }
            else {
                m = "" + b;
            }
            if (c > 0) {




                r = "+" + c;
            }
            else {
                r = "" + c;
            }
            if (d > 0) {




                s = "+" + d;
            }
            else {
                s = "" + d;
            }
            if (e > 0) {




                t = "+" + e;
            } else {
                t = "" + e;
            }
            //////////////////////////////////////
            if (a == 1 ) {
                c1 = "";
            }
            if (b == 1 ) {
                c2 = "";
            }
            if (c == 1 ) {
                c3 = "";
            }
            if (d == 1 ) {
                c4 = "";
            }
            /////////////////////////////////////////
            if (a == -1 ) {
                c1 = "-";
            }
            if (b == -1 ) {
                c2 = "-";
            }
            if (c == -1 ) {
                c3 = "-";
            }
            if (d == -1 ) {
                c4 = "-";
            }
            //System.out.println(c1);
            if (a == 1 ) {
                p = "";
            }
            if (b == 1 ) {
                m = "+";
            }
            if (c == 1 ) {
                r = "+";
            }
            if (d == 1 ) {
                s = "+";
            }
            if (a == -1 ) {
                p = "-";
            }
            if (b == -1 ) {
                m = "-";
            }
            if (c == -1 ) {
                r = "-";
            }
            if (d == -1 ) {
                s = "-";
            }
            // Create an instance of the Random class
            Random random1 = new Random();




            // Generate 4 unique random integers in the range 0 to 6
            while (uniqueIntegers.size() < 4) {
                int randomNumber = random.nextInt(4) + 1; // Generates random number in the range [1, 4]


                //int randomNumber = random.nextInt(6) + 1; // Generates random number in the range [1, 7)
                uniqueIntegers.add(randomNumber);
            }




            // Convert the set to an array or list if needed
            Integer[] randomIntegersArray = uniqueIntegers.toArray(new Integer[0]);




            // Store each random integer in a separate variable
            int f = randomIntegersArray[0];
            int g = randomIntegersArray[1];
            int h = randomIntegersArray[2];
            int j = randomIntegersArray[3];
            String aa = "";
            String ab = "";
            String ac = "";
            String ad = "";








            if (f == 1) {
                aa = "";
            } else {
                aa = "^" + f;
            }
            if (g == 1) {
                ab = "";
            } else {
                ab = "^" + g;
            }
            if (h == 1) {
                ac = "";
            } else {
                ac = "^" + h;
            }
            if (j == 1) {
                ad = "";
            } else {
                ad = "^" + j;
            }








            //String Correct_ans = "$"+z+"$"+"<br>";*/
            String Correct_ansS = "0";
            String myans ="0";
            int questionInt = 0;
            int switchcase = 0;


            int[] Correct_ans = processInts(a, b, c, d);
            //System.out.println("answers");
            //System.out.println(Correct_ans[0]);
            //System.out.println(Correct_ans[1]);


            // f  g  h  j
            //aa ab ac ad
            String Q1="blllllll";
            String Q2="";
            int sn11=0;
            int sn21 = 0;
            int sn31 =0;
            int[] intArray = new int[0];
            String[] term = {};
            if (Correct_ans[0] == a && Correct_ans[1] == b ) {
                Q1=chr + "" + aa;
                Q2=chr+ab;
                int ans=a+b;
                myans=""+ans;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{r,s,t};
                sn11=c+d;
                sn21=d+e;
                sn31=c+e;
            }
            else if (Correct_ans[1] == a && Correct_ans[0] == b) {
                Q1=chr + "" + ab;
                Q2=chr+aa;
                int ans=a+b;
                myans=""+ans;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{r,s,t};
                sn11=c+d;
                sn21=d+e;
                sn31=c+e;
            }
            else if (Correct_ans[0] == b && Correct_ans[1] == c ) {
                Q1=chr+ab;
                Q2=chr+ac;
                int ans=c+b;
                myans=""+ans;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{p,s,t};
                sn11=a+d;
                sn21=d+e;
                sn31=a+e;
            }
            else if (  Correct_ans[1] == b && Correct_ans[0] == c) {
                Q1=chr+ac;
                Q2=chr+ab;
                int ans=c+b;
                myans=""+ans;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{p,s,t};
                sn11=a+d;
                sn21=d+e;
                sn31=a+e;
            }
            else if (Correct_ans[0] == c && Correct_ans[1] == d  ) {
                Q1=chr+ac;
                Q2=chr+ad;
                int ans=c+d;
                myans=""+ans;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{p,m,t};//abe
                sn11=a+b;
                sn21=b+e;
                sn31=a+e;
            }else if (  Correct_ans[1] == c && Correct_ans[0] == d) {
                Q1=chr+ad;
                Q2=chr+ac;
                int ans=c+d;
                myans=""+ans;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{p,m,t};//abe
                sn11=a+b;
                sn21=b+e;
                sn31=a+e;
            }
            else if (Correct_ans[0] == a && Correct_ans[1] == d ) {
                Q1=chr+aa;
                Q2=chr+ad;
                int ans=a+d;
                myans=""+ans;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{m,r,t};//bce
                sn11=c+b;
                sn21=c+e;
                sn31=b+e;
            }
            else if (  Correct_ans[1] == a && Correct_ans[0] == d) {
                Q1=chr+ad;
                Q2=chr+aa;
                int ans=a+d;
                myans=""+ans;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{m,r,t};//bce
                sn11=c+b;
                sn21=c+e;
                sn31=b+e;
            }
            else if (Correct_ans[0] == a && Correct_ans[1] == c ) {
                Q1=chr+aa;
                Q2=chr+ac;
                int ans=a+c;
                myans=""+ans;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{m,s,t};//bde
                sn11=b+d;
                sn21=d+e;
                sn31=b+e;
            }
            else if ( Correct_ans[1] == a && Correct_ans[0] == c) {
                Q1=chr+ac;
                Q2=chr+aa;
                int ans=a+c;
                myans=""+ans;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{m,s,t};//bde
                sn11=b+d;
                sn21=d+e;
                sn31=b+e;
            } else if (Correct_ans[0] == b && Correct_ans[1] == d  ) {
                Q1=chr+ab;
                Q2=chr+ad;
                int ans=b+d;
                myans=""+ans;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{p,r,t};//ade
                sn11=a+d;
                sn21=d+e;
                sn31=a+e;
            }
            else if (  Correct_ans[1] == b && Correct_ans[0] == d) {
                Q1=chr+ad;
                Q2=chr+ab;
                int ans=b+d;
                myans=""+ans;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{p,r,t};//ade
                sn11=a+d;
                sn21=d+e;
                sn31=a+e;
            }


            //Correct_ansS = "$"+Correct_ans+chr+"$"+"<br>";
            String Correct_ansSS = "" + Correct_ansS +  "<br>";




            String x = Correct_ansS;
            String y = Correct_ansS;
            //System.out.println(c2+","+c3+","+c4+","+c5+","+c1);
            //a = generateRandomIntInRange(0, 10);
			           /*String sn1 = generateRandomIntInRange(-15, 15)+"";
			           String sn2 = generateRandomIntInRange(-15, 15)+"";
			           String sn3 = generateRandomIntInRange(-15, 15)+"";*/


            Set<String> wrongAnswers = new HashSet<>();


            String sn1, sn2, sn3;


            // Generate sn1
            sn1 = generateWrongAnswer(wrongAnswers, myans);
            // Generate sn2 ensuring it's distinct from sn1
            sn2 = generateWrongAnswer(wrongAnswers, myans);
            // Generate sn3 ensuring it's distinct from sn1 and sn2
            sn3 = generateWrongAnswer(wrongAnswers, myans);






















            String wrong_ans = "$"+sn1+"$<br>";
            //int sn2 = (int) (random.nextInt(5) + 1) + (int) random.nextInt(2);
            String wrong_ans1 = "$"+sn2+"$<br>";
            //int sn3 = ((int) (random.nextInt(5) + 1) + (int) random.nextInt(2)) * 2;
            String wrong_ans2 = "$"+sn3+"$<br>";












            //Generate question english
            String Que = "For the polynomial $" + p + "" + chr + "" + aa + "" + m + "" + chr + "" + ab + "" + r + "" + chr + "" + ac + "" + s + "" + chr + "" + ad + "" + t + "$, find sum of the coefficients of the terms corresponding to $"+Q1+"$ and $"+Q2+"$<br> #";
            //Generate question marathi
            String Que1 = "$" + p + "" + chr + "" + aa + "" + m + "" + chr + "" + ab + "" + r + "" + chr + "" + ac + "" + s + "" + chr + "" + ad + "" + t + "$ या बहुपदीमधील $"+Q1+"$ आणि $"+Q2+" $ असलेल्या पदांच्या  सहगुणकांची बेरीज किती ? <br>";
            String Question = "" + Que + " " + Que1 + "";




            row.createCell(4).setCellValue(Question);
            row.createCell(5).setCellValue(Correct_ansSS);
//			            row.createCell(6).setCellValue(" ");
//			            row.createCell(7).setCellValue(" ");
//			            row.createCell(8).setCellValue(" ");
            row.createCell(9).setCellValue(wrong_ans);
            row.createCell(10).setCellValue(wrong_ans1);
            row.createCell(11).setCellValue(wrong_ans2);
            row.createCell(12).setCellValue(60);
            row.createCell(13).setCellValue(2);
//			             row.createCell(14).setCellValue(" ");
            row.createCell(15).setCellValue("2022.laukik.padgaonkar@ves.ac.in");
            String Solu = "";
            String Sol1 = "";




            //Generate Solution
            if (pos == 1) {

                Solu = "Ans : " + Correct_ansS + "<br>"
                        + "Constant associated with variable in the term is called coefficient.<br>"
                        + "It shows that coefficient of the term corresponding to $" +Q1+"$ is $"+Correct_ans[0]+"$ and coefficient of the term corresponding to  $"+Q2+"$ is $"+Correct_ans[1]+"$ .<br>"
                        + "$\\therefore$ required sum of these coefficients <br>  $ ="+ Correct_ans[0]+"+"+Correct_ans[1]+"$<br> $="+myans+" $ is the answer.<br>#" ;

                Sol1 = "उत्तर  : " + Correct_ansS + "<br>"
                        + "चलाबरोबर असणारा स्थिरांक हा चलाचा सहगुणक असतो.<br>"
                        + "दिलेल्या बहुपदीमध्ये $" +Q1+"$ असलेल्या पदाचा सहगुणक $"+ Correct_ans[0]+"$  तर $"+Q2+"$ असलेल्या पदाचा सहगुणक $"+Correct_ans[1]+"$ आणि या दोन्ही सहगुणकांची बेरीज<br>"
                        + "$= "+ Correct_ans[0]+"+"+Correct_ans[1]+"$<br> $="+myans+"$ हे उत्तर.<br>";
                ;
            } else if (Correct_ans[1]<0){

                Solu = "Ans : " + Correct_ansS + "<br>"
                        + "Constant associated with variable in the term is called coefficient.<br>"
                        + "It shows that coefficient of the term corresponding to $" +Q1+"$ is $"+Correct_ans[0]+"$ and coefficient of the term corresponding to  $"+Q2+"$ is $"+Correct_ans[1]+"$.<br>"
                        + "$\\therefore$ required sum of these coefficients <br>  $ ="+ Correct_ans[0]+""+Correct_ans[1]+"$<br> $="+myans+"$ is the answer.<br>#" ;

                Sol1 = "उत्तर  : " + Correct_ansS + "<br>"
                        + "चलाबरोबर असणारा स्थिरांक हा चलाचा सहगुणक असतो.<br>"
                        + "दिलेल्या बहुपदीमध्ये $" +Q1+"$ असलेल्या पदाचा सहगुणक $"+ Correct_ans[0]+"$  तर $"+Q2+"$ असलेल्या पदाचा सहगुणक $"+Correct_ans[1]+"$ आणि या दोन्ही सहगुणकांची बेरीज<br>"
                        + "$= "+ Correct_ans[0]+""+Correct_ans[1]+"$<br> $="+myans+"$ हे उत्तर.<br>";


            }else {

                Solu = "Ans : " + Correct_ansS + "<br>"
                        + "Constant associated with variable in the term is called coefficient.<br>"
                        + "It shows that coefficient of the term corresponding to $" +Q1+"$ is $"+Correct_ans[0]+"$ and coefficient of the term corresponding to  $"+Q2+"$ is $"+Correct_ans[1]+"$.<br>"
                        + "$\\therefore$ required sum of these coefficients <br>  $ ="+ Correct_ans[0]+"+"+Correct_ans[1]+"$<br> $="+myans+"$ is the answer.<br>#" ;


                Sol1 = "उत्तर  : " + Correct_ansS + "<br>"
                        + "चलाबरोबर असणारा स्थिरांक हा चलाचा सहगुणक असतो.<br>"
                        + "दिलेल्या बहुपदीमध्ये $" +Q1+"$ असलेल्या पदाचा सहगुणक $"+ Correct_ans[0]+"$  तर  $"+Q2+"$ असलेल्या पदाचा सहगुणक $"+Correct_ans[1]+"$ आणि या दोन्ही सहगुणकांची बेरीज<br>"
                        + "$= "+ Correct_ans[0]+"+"+Correct_ans[1]+"$<br> $="+myans+"$ हे उत्तर.<br>";

            }




            String Solution = Solu + Sol1;
            row.createCell(16).setCellValue(Solution);








//			             row.createCell(17).setCellValue(" ");
            row.createCell(18).setCellValue(158);




            mapsize = map.size();
            map.put(Question, i);
            mapsizeafter = map.size();




            //In Java, a map can consist of virtually any number of key-value pairs, but the keys must always be unique — non-repeating.
            if (mapsize == mapsizeafter) {
                System.out.println("duplicate Question" + i + ". " + Question);
                i--;
            }




            if (x.equals(sn1) ||x.equals(sn2) ||x.equals(sn3) || sn1==myans || sn2==myans || sn3==myans) {
                System.out.println("duplicate" + i);
                i--;
            }
            System.out.println(sn1+","+sn2+","+sn3);
			           /*if (x.equals(wrong_ans) || x.equals(wrong_ans1) || x.equals(wrong_ans2)  /*|| sn11 == sn21 || sn11 == sn31 || sn21 == sn31) {
			               System.out.println("duplicateoooooooooo" + i);
			               i--;
			           }*/
            //System.out.println("abcs");
            //System.out.println(a+","+b+","+c+","+d+","+e);
            //System.out.println("wrong ans");
            //System.out.println(wrong_ans1+","+wrong_ans+","+wrong_ans2);








        }








        int rowTotal = sheet1.getLastRowNum();
//			          System.out.println(rowTotal);
        XSSFRow row = sheet1.createRow((short) rowTotal + 1);
        row.createCell(0).setCellValue("****");




        //Writing data to the file
        FileOutputStream fileout = new FileOutputStream(filename);
        workbook.write(fileout);
        fileout.close();




        System.out.println("file created");




    }








    private static int generateRandomIntInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }




    private static String generateWrongAnswer(Set<String> wrongAnswers, String correctAnswer) {
        Random random = new Random();
        String wrongAnswer;
        do {
            // Generate wrong answer
            wrongAnswer = "" + (random.nextInt(31) - 15)  + "";
        } while (wrongAnswers.contains(wrongAnswer) || wrongAnswer.equals(correctAnswer)); // Check if wrong answer already exists or is equal to correct answer
        wrongAnswers.add(wrongAnswer); // Add wrong answer to set
        return wrongAnswer;
    }
    private static boolean areAllDifferent(int... values) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (int value : values) {
            if (!uniqueValues.add(value)) {
                return false; // Duplicate found
            }
        }
        return true; // All values are different
    }










    public static String getRandomString(String[] strings) {
        Random random = new Random();
        int index = random.nextInt(strings.length);
        return strings[index];
    }




    public static int[] processInts(int num1, int num2, int num3, int num4) {
        int[] numbers = {num1, num2, num3, num4};
        Random random = new Random();


        // Pick two random indices
        int index1 = random.nextInt(4);
        int index2;
        do {
            index2 = random.nextInt(4);
        } while (index2 == index1); // Make sure index2 is different from index1


        int[] result = {numbers[index1], numbers[index2]};
        return result;
    }
}