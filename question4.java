package ganit;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class question4 {




    public static void main(String args[]) throws IOException, FileNotFoundException {
        String filename = "C:\\demo\\sut1\\VESIT_030402_156_Assign2_Laukikhoe.xlsx";     //Location where exVESIT_030402_155_Assign1_Laukik.xlsxcel file is getting generated
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
            row.createCell(3).setCellValue("0304060401");


            // Generate random number to perform the operation
            int a =0 , b, c, d, e,f;


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
                    f = generateRandomIntInRange(0, 10);
                } while (!areAllDifferent(a, b, c, d, e) ||e==0||d==0||a==0||b==0||c==0||a==1||f==0||hasCommonFactors(a,b,c)||hasCommonFactors(d,e,f));
            } else {
                do {
                    a = generateRandomIntInRange(0, 10);
                    b = generateRandomIntInRange(-10, 10);
                    c = generateRandomIntInRange(-10, 10);
                    d = generateRandomIntInRange(-10, 10);
                    e = generateRandomIntInRange(-10, 10);
                    f = generateRandomIntInRange(-10, 10);
                } while (!areAllDifferent(a, b, c, d, e) ||e==0||d==0||a==0||b==0||c==0||a==1||f==0||hasCommonFactors(a,b,c)||hasCommonFactors(d,e,f));


            }
            String A = "";
            String B = "";
            String C = "";
            String D = "";
            String E = "";
            String F = "";
            if(a==1||a==-1){
                A="";
            } else if (a>0) {
                A=""+a;
            } else{
                A=""+a;
            }

            if(b==1||b==-1){
                B="+";
            }else if (b>0) {
                B="+"+b;
            } else{
                B=""+b;
            }


            if(c>0){
                C=""+c;
            }else{
                C=""+c;
            }


            if(d==1||d==-1){
                D="";
            }else if (d>0) {
                D=""+d;
            } else{
                D=""+d;
            }


            if(e==1||e==-1){
                E="+";
            }else if (e>0) {
                E="+"+e;
            } else{
                E=""+e;
            }



            if(f>0){
                F=""+f;
            }else{
                F=""+f;
            }

            Random r = new Random();
            String ch[] = {"a", "b", "c", "d", "f", "g", "h", "l", "m", "n", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

            String[] str11 = {"a","b","c","f","g","l","m","p","r","s","u","v","x","y"};
            String[] str21 = {"b","c","d","g","h","m","n","q","s","t","v","w","y","z"};
            int arr = r.nextInt(str11.length);
            String chr1 = str11[arr];
            String chr2 = str21[arr];


            //int vx = abc.nextInt(ch.length);
            //String chr = ch[vx];
            /*int vx1 = abc.nextInt(ch.length);
            String chr1 = ch[vx1];
            int vx2;
            do {
                vx2 = abc.nextInt(ch.length);
            } while (vx2 == vx1);
            String chr2 = ch[vx2];
            */
            String equation1 = new String();
            String equation2 = new String();




            String Correct_ansS = new String();

            equation1 = A + chr1 + "" + B + chr2 + "=" + C;
            equation2 = D + chr1 + "" + E + chr2 + "=" + F;
            //$\dfrac {3(7y+6)}{4}+5y=25$
            String BB="";
            String BD="";
            if(b==1||b==-1){
                BB="";
            } else if (b>0) {
                BB=""+b;
                BD=b*(-1) +"";
            } else{
                BB=""+b;
                BD=b*(-1) +"";
            }

            String CC="";
            if (c>0) {
                CC="+"+c;
            } else{
                CC=""+c;
                //BD=b*(-1) +"";
            }
            String FF="";
            if(f==1||f==-1){
                FF="";
            }


            if(b<0) {
                Correct_ansS = "$\\dfrac {" + D + "(" + BD + chr2 + "" + CC + ")}{" + A + "}" + E + chr2 + "=" + F + "$<br>";
            }else {
                Correct_ansS = "$\\dfrac {" + D + "(" + BD + chr2 + "" + CC + ")}{" + A + "}" + E + chr2 + "=" + F + "$<br>";
            }
            String wrong_ans  ="$\\dfrac {"+A+"("+BB+chr2+""+CC+")}{"+A+"}"+E+chr2+"="+F+"$<br>";;
            String wrong_ans1 ="$\\dfrac {"+FF+"("+BB+chr2+""+CC+")}{"+A+"}+"+A+chr2+"="+F+"$<br>";;
            String wrong_ans2 ="$\\dfrac {"+FF+"("+BB+chr2+""+CC+")}{"+A+"}"+E+chr2+"="+A+"$<br>";;


            //Generate question english
            String Que = "If we are to solve $"+equation1+"$; $"+equation2+"$, these given simultaneous linear equations in two variables  $"+chr1+"$ and $"+chr2+"$, by substitution method and if we are to substitute the value of $"
                    +chr1+"$ in terms of $"+chr2+"$, in second equation, the second equation will become  ________________ <br>#";
            //Generate question marathi
            String Que1 = "जर $"+equation1+"$; $"+equation2+"$, ही दोन चलातील एकसामायिक रेषीय समीकरणे सोडवायची असतील, आणि $"+chr1+"$ या एका चलाची किंमत $"+chr2+
                    "$  या दुसऱ्या चलाच्या रूपात काढून ती किंमत दुसऱ्या समीकरणात ठेवली असता ते समीकरण  ________________  असे असेल.<br>";
            String Question = "" + Que + " " + Que1 + "";


            row.createCell(4).setCellValue(Question);
            row.createCell(5).setCellValue(Correct_ansS);
//            row.createCell(6).setCellValue(" ");
//            row.createCell(7).setCellValue(" ");
//            row.createCell(8).setCellValue(" ");
            row.createCell(9).setCellValue(wrong_ans);
            row.createCell(10).setCellValue(wrong_ans1);
            row.createCell(11).setCellValue(wrong_ans2);
            row.createCell(12).setCellValue(90);
            row.createCell(13).setCellValue(4);
//             row.createCell(14).setCellValue(" ");
            row.createCell(15).setCellValue("2022.laukik.padgaonkar@ves.ac.in");
            String Solu = "";
            String Sol1 = "";
            String Correct_ansSS ="";
            //String Correct_ansSS = "\\dfrac {"+D+"("+BD+chr2+""+CC+")}{"+A+"}"+E+chr2+"="+F+"$";
            if(b<0) {
                Correct_ansSS = "\\dfrac {" + D + "(" + BD + chr2 + "" + CC + ")}{" + A + "}" + E + chr2 + "=" + F + "$";
            }else {
                Correct_ansSS = "\\dfrac {" + D + "(" + BD + chr2 + "" + CC + ")}{" + A + "}" + E + chr2 + "=" + F + "$";
            }

            String BBB =""+ b*(-1);
            /*if(b==1||b==-1){
                BD="";
            }*/
            String step1 = A+chr1+" = "+BD+chr2+CC;
            String step2 = chr1+" = "+"\\dfrac {"+BD+chr2+CC+"} {"+a+"}";


            //Generate Solution
            if (5>0) {
                Solu = "Ans : $" +Correct_ansSS+"<br>" + "Given equations are <br>$"+equation1+" \\ . . . . (i)$ and <br>$"+equation2+". . . .  (ii)$<br>"+
                "We are asked to substitute value of $"+chr1+"$ in terms of $"+chr2+"$.<br>" +
                        "From equation $(i)$ we will find $"+chr1+"$ in terms of $"+chr2+"$, as shown below.<br>" +
                        "$\\because "+equation1+"$<br>"+
                        "$\\therefore "+step1+"$ <br> $\\therefore "+step2+"$<br>" + "Substitute this value of $"+chr1+"$ in equation $(ii)$ we get<br>$"+
                        Correct_ansSS+" . . . . by substituting $"+step2+"$<br>" + "$\\therefore "+Correct_ansSS+" is the desired form of second equation<br>#";


                Sol1 ="उत्तर : $"+Correct_ansSS+"<br>दिलेली समीकरणे खालील प्रमाणे आहेत.  <br>$"+equation1+"\\ . . . . (i)$ आणि <br>" + "$"+equation2+" . . . .  (ii)$<br>आपल्याला $"+chr1+
                        "$ या चलाची किंमत $"+chr2+"$ या चलाच्या रूपात काढावयाची आहे. .<br>" +
                        "समीकरण $(i)$ चा वापर करून आपण $"+chr1+"$ ची किंमत $"+chr2+"$ या चलाच्या रूपात खाली दाखविल्या प्रमाणे काढू.<br>$\\because"+equation1+"$<br>" +
                        "$\\therefore "+step1+"$<br>" +
                        "$\\therefore "+step2+"$<br>" +
                        "$"+chr1+"$ ची ही किंमत आता समीकरण $(ii)$ मध्ये ठेवू <br> $"+Correct_ansSS+" . . . .  $"+step2+"$ ही किंमत ठेवून <br>" +
                        "$\\therefore  "+Correct_ansSS+" हे दुसऱ्या समीकरणाचे आपल्याला हवे असलेले स्वरूप आहे, हे उत्तर. <br>";
            }



            String Solution = Solu + Sol1;
            row.createCell(16).setCellValue(Solution);




//             row.createCell(17).setCellValue(" ");
            row.createCell(18).setCellValue(113);


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
    public static boolean hasCommonFactors(int num1, int num2, int num3) {
        int min = Math.min(num1, Math.min(num2, num3));

        for (int i = 2; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0 && num3 % i == 0) {
                return true;  // Return true immediately if a common factor is found
            }
        }

        return false;  // Return false if no common factors are found
    }
}




//generateRandomIntInRange

