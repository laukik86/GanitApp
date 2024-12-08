package ganit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class quest2 {




    public static void main(String args[]) throws IOException, FileNotFoundException {
        String filename = "C:\\demo\\sut1\\VESIT_030402_156_Assign2_Laukik.xlsx";     //Location where exVESIT_030402_155_Assign1_Laukik.xlsxcel file is getting generated
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
                } while (!areAllDifferent(a, b, c, d, e) ||e==0||d==0||a==0);
            } else {
                do {
                    a = generateRandomIntInRange(0, 10);
                    b = generateRandomIntInRange(-10, 10);
                    c = generateRandomIntInRange(-10, 10);
                    d = generateRandomIntInRange(-10, 10);
                    e = generateRandomIntInRange(-10, 10);
                } while (!areAllDifferent(a, b, c, d, e) ||e==0||d==0||a==0);


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

            String term1 ="";
            String term2 ="";
            String term3 ="";
            String term4 ="";
            String term5="";


            String c1 = ""+a;
            String c2 = ""+b;
            String c3 = ""+c;
            String c4 = ""+d;
            String c5 = ""+e;



            ////////////////////////////////////////
            String p1 = "";
            String m1 = "";
            String r1 = "";
            String s1 = "";
            String t1 = "";

            if (a ==1) {
                p1 = "" ;
            } else if (a==-1) {
                p1="-";
            } else if (a>0) {
                p1 = "" + a;
            } else {
                p1 = "" + a;
            }

            if (b == 1) {
                m1 = "+";
            } else if (b==-1) {
                m1="-";
            } else if (b>=0) {
                m1="+"+b;
            } else {
                m1 = "" + b;
            }




            if (c == 1) {
                r1 = "+" ;
            } else if (c==-1) {
                r1="-";
            } else if (c>=0) {
                r1="+"+c;
            } else {
                r1 = "" + c;
            }




            if (d ==1) {
                s1 = "" ;
            } else if (d==-1) {
                s1="-";
            } else if (d>0) {
                s1=""+d;
            } else {
                s1 = "" + d;
            }



            if (e ==1) {
                t1 = "+"+e ;
            }else if (e>=0) {
                t1="+"+e;
            } else {
                t1 = "" + e;
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
            }// b=-?00

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

            Random random1 = new Random();


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

///////////////////////////////////////////////////////////
            if (a == 1) {
                term1="" +chr+aa;
                //p1=aa;
            }
            else if (a==0) {
                term1="";                                                           // abcde=pmrst
            }else if (a>1) {
                term1="" +a+chr+aa;
                //p1=aa;
            }
            else {
                term1 = "" + a+chr+aa;
            }




            if (b == 1) {
                term2 = "+" +chr+ab;
               // m1=ab;
            } else if (b==-1) {
                term2="-"+chr+ab;
            } else if (b==0) {
                term2="";
            }
            else if (b>1) {
                term2 = "+"+ b+chr+ab;
                //m1=ab;
            }
            else {
                term2 = "" + b+chr+ab;
            }




            if (c == 1) {
                term3 = "+" +chr+ac;
               // r1=ac;
            } else if (c==-1) {
                term3 = "-" +chr+ac;
            } else if (c==0) {
                term3="";                   // abcde=pmrst
            }else if (c>1) {
                term3 = "+"+c +chr+ac;
                //r1=ac;
            }
            else {
                term3 = "" + c+chr+ac;
            }





            if (d ==1) {
                term4 = "+" +chr+ad;
               // s1=ad;
            } else if (d==-1) {
                term4 = "-" +chr+ad;
            } else if (d==0) {
                term4="";
            }
            else if (d>1) {
                term4 = "+" +d+chr+ad;
               // s1=ad;
            }
            else {
                term4 = "" + d+chr+ad;
            }





            if (e >= 1) {
                term5 = "+" + e;
            } else if (e==0) {
                term5="";
            } else {
                term5 = "" + e;
            }
//////////////////////////////////////////////////////////

            //String Correct_ans = "$"+z+"$"+"<br>";*/
            String Correct_ansS = "0";
            int questionInt = 0;
            int switchcase = 0;

            int[] Correct_ans = processInts(a, b, c, d);
            System.out.println("answers");
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
            int ans=0;
            if (Correct_ans[0] == a ) {
                Q1=chr + "" +aa ;
                //Q2=chr+ab;
                ans=a;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{r,s,t};
                sn11=b;
                sn21=d;
                sn31=c;
            } else if (Correct_ans[0] ==b) {
                Q1=chr+ab;
                //Q2=chr+ac;
                ans=b;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{p,s,t};
                sn11=a;
                sn21=d;
                sn31=c;
            } else if (Correct_ans[0] == c ) {
                Q1=chr+ac;
                //Q2=chr+ad;
                ans=c;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{p,m,t};//abe
                sn11=a;
                sn21=b;
                sn31=d;
            } else if (Correct_ans[0] == d) {
                Q1=chr+ad;
                //Q2=chr+ad;
                ans=d;
                Correct_ansS ="$ "+ans+"$";
                term = new String[]{m,r,t};//bce
                sn11=b;
                sn21=c;
                sn31=a;
            }

            //Correct_ansS = "$"+Correct_ans+chr+"$"+"<br>";
            String Correct_ansSS = "" + Correct_ansS +  "<br>";


            String x = Correct_ansS;
            String y = Correct_ansS;
            //System.out.println(c2+","+c3+","+c4+","+c5+","+c1);
            String sn1 = sn11+"";
            String sn2 = sn21+"";
            String sn3 = sn31+"";










            String wrong_ans = "$"+sn1+"$<br>";
            //int sn2 = (int) (random.nextInt(5) + 1) + (int) random.nextInt(2);
            String wrong_ans1 = "$"+sn2+"$<br>";
            //int sn3 = ((int) (random.nextInt(5) + 1) + (int) random.nextInt(2)) * 2;
            String wrong_ans2 = "$"+sn3+"$<br>";






            //Generate question english
            String Que = "For the polynomial, $" +term1+term2+term3+term4+term5+ "$, identify the coefficient corresponding to term containing  $"+Q1+"$<br> #";
            //Generate question marathi
            String Que1 = "$" +term1+term2+term3+term4+term5 +"$ या बहुपदीमधील $"+Q1+"$ असलेल्या पदाचा सहगुणक शोधा.<br>";
            String Question = "" + Que + " " + Que1 + "";


            row.createCell(4).setCellValue(Question);
            row.createCell(5).setCellValue(Correct_ansSS);
//            row.createCell(6).setCellValue(" ");
//            row.createCell(7).setCellValue(" ");
//            row.createCell(8).setCellValue(" ");
            row.createCell(9).setCellValue(wrong_ans);
            row.createCell(10).setCellValue(wrong_ans1);
            row.createCell(11).setCellValue(wrong_ans2);
            row.createCell(12).setCellValue(60);
            row.createCell(13).setCellValue(2);
//             row.createCell(14).setCellValue(" ");
            row.createCell(15).setCellValue("2022.laukik.padgaonkar@ves.ac.in");
            String Solu = "";
            String Sol1 = "";


            //Generate Solution
            if (ans==0) {
                Solu = "Ans : " + Correct_ansS + "<br>Constant associated with variable of the term is called as coefficient. We will use the index form of this polynomial which will be,<br> $" + s1 + "" + chr + "" + ad +  r1 + "" + chr + "" + ac +  m1 + "" + chr + ""  + ab +  "+"+p1 + chr + "" + aa +   "" + t1 +"$ From this we can see that coefficient corresponding to $"+Q1+"$ is  "+ Correct_ansS+
                        "  is the answer.<br> (Remember, in index form, we show the absent terms with coefficient as $0$) #<br>" ;


                Sol1 = "उत्तर: " + Correct_ansS + "<br> चलाबरोबर असणारा स्थिरांक हा त्या पदातील चलाचा सहगुणक असतो.<br> दिलेली बहुपदी घातांक रुपात मांडली असता $ "+s1 + "" + chr + "" + ad +  r1 + "" + chr + "" + ac +  m1 + "" + chr + "" + ab +"+"+ p1 + "" + chr + "" + aa +   "" + t1+ "$ असे मिळते.<br> या  मांडणीमधून आपल्याला $"+Q1+"$ चा सहगुणक "+Correct_ansS+" आहे असे मिळते, हे उत्तर. <br> (लक्षात घेऊ - घातांक रूप लिहिताना जर एखादे पद नसेल, तर ते पद $0$ सहगुणक घेऊन लिहितात.)<br>";
            }
            else{
                Solu = "Ans : " + Correct_ansS + "<br>Constant associated with variable of the term is called as coefficient. We will use the index form of this polynomial which will be,<br> $" + s1 + "" + chr + "" + ad +  r1 + "" + chr + "" + ac +  m1 + "" + chr + ""  + ab +  "+"+p1 + chr + "" + aa +   "" + t1 +"$ From this we can see that coefficient corresponding to $"+Q1+"$ is  "+ Correct_ansS+
                        "  is the answer.<br>#<br>" ;


                Sol1 = "उत्तर: " + Correct_ansS + "<br> चलाबरोबर असणारा स्थिरांक हा त्या पदातील चलाचा सहगुणक असतो.<br> दिलेली बहुपदी घातांक रुपात मांडली असता $ "+s1 + "" + chr + "" + ad +  r1 + "" + chr + "" + ac +  m1 + "" + chr + "" + ab +"+"+ p1 + "" + chr + "" + aa +   "" + t1+ "$ असे मिळते.<br> या  मांडणीमधून आपल्याला $"+Q1+"$ चा सहगुणक "+Correct_ansS+" आहे असे मिळते, हे उत्तर.<br>";


            }


            String Solution = Solu + Sol1;
            row.createCell(16).setCellValue(Solution);




//             row.createCell(17).setCellValue(" ");
            row.createCell(18).setCellValue(156);


            mapsize = map.size();
            map.put(Question, i);
            mapsizeafter = map.size();


            //In Java, a map can consist of virtually any number of key-value pairs, but the keys must always be unique — non-repeating.
            if (mapsize == mapsizeafter) {
                System.out.println("duplicate Question" + i + ". " + Question);
                i--;
            }


              
            System.out.println("abcs");
            System.out.println(a+","+b+","+c+","+d+","+e);
            System.out.println("wrong ans");
            System.out.println(wrong_ans1+","+wrong_ans+","+wrong_ans2);




        }




        int rowTotal = sheet1.getLastRowNum();
//          System.out.println(rowTotal);
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


    private static boolean areAllDifferent(int... values) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (int value : values) {
            if (!uniqueValues.add(value)) {
                return false; // Duplicate found
            }
        }
        return true; // All values are different
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
        /*int index2;
        do {
            index2 = random.nextInt(4);
        } while (index2 == index1); // Make sure index2 is different from index1*/

        int[] result = {numbers[index1]};
        return result;
    }
}




//generateRandomIntInRange
