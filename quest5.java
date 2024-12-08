package ganit;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class quest5 {




    public static void main(String args[]) throws IOException, FileNotFoundException {
        String filename = "C:\\demo\\sut1\\VESIT_030402_156_Assign2_Laukik5.xlsx";     //Location where exVESIT_030402_155_Assign1_Laukik.xlsxcel file is getting generated
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
            int a = 0, b, c, d, e, f;


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
                } while (!areAllDifferent(a, b, c, d, e) || e == 0 || d == 0 || a == 0 || b == 0 || c == 0 || hasCommonFactors(a, b, c) || hasCommonFactors(d, e, f));
            } else {
                do {
                    a = generateRandomIntInRange(0, 10);
                    b = generateRandomIntInRange(-10, 10);
                    c = generateRandomIntInRange(-10, 10);
                    d = generateRandomIntInRange(-10, 10);
                    e = generateRandomIntInRange(-10, 10);
                    f = generateRandomIntInRange(-10, 10);
                } while (!areAllDifferent(a, b, c, d, e) || e == 0 || d == 0 || a == 0 || b == 0 || c == 0 || hasCommonFactors(a, b, c) || hasCommonFactors(d, e, f));


            }
            String A = "";
            String B = "";
            String C = "";
            String D = "";
            String E = "";
            String F = "";

            String AA = "";
            String BB = "";
            String CC = "";
            ///////////////////////////
            String DD = "";
            String EE = "";
            String FF = "";

            if (a *  Math.abs(d) > 0) {
                AA = "" + a *  Math.abs(d);
            } else {
                AA = "" + a *  Math.abs(d);
            }
            if (b *  Math.abs(d) > 0) {
                BB = "+" + b *  Math.abs(d);
            } else {
                BB = "" + b *  Math.abs(d);
            }
            if (c *  Math.abs(d) > 0) {
                CC = "" + c *  Math.abs(d);
            } else {
                CC = "" + c *  Math.abs(d);
            }


            if (Math.abs(a) *  d > 0) {
                DD = "" + Math.abs(a) *  d;
            } else {
                DD = "" + Math.abs(a) *  d;
            }
            if (Math.abs(a) *  e > 0) {
                EE = "+" + Math.abs(a) *  e;
            } else {
                EE = "" + Math.abs(a) *  e;
            }
            if (Math.abs(a) * f > 0) {
                FF = "" + Math.abs(a) * f;
            } else {
                FF = "" +Math.abs(a) *  f;
            }


            if (a == 1) {
                A = "";
            } else if (a == -1) {
                A = "-";
            } else if (a > 0) {
                A = "" + a;
            } else {
                A = "" + a;
            }

            if (b == 1) {
                B = "+";
            } else if (b == -1) {
                B = "-";
            } else if (b > 0) {
                B = "+" + b;
            } else {
                B = "" + b;
            }


            if (c > 0) {
                C = "" + c;
            } else {
                C = "" + c;
            }


            if (d == 1) {
                D = "";
            } else if (d == -1) {
                D = "-";
            } else if (d > 0) {
                D = "" + d;
            } else {
                D = "" + d;
            }


            if (e == 1 || e == -1) {
                E = "+";
            } else if (e == -1) {
                E = "-";
            } else if (e > 0) {
                E = "+" + e;
            } else {
                E = "" + e;
            }


            if (f > 0) {
                F = "" + f;
            } else {
                F = "" + f;
            }


            Random r = new Random();
            //String ch[] = {"a", "b", "c", "d", "f", "g", "h", "l", "m", "n", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            String chr1;
            String chr2;
            do {
                String[] str11 = {"f", "g", "l", "m", "p", "r", "s", "u", "v", "x", "y"};
                String[] str21 = {"d", "g", "h", "m", "n", "q", "s", "t", "v", "w", "y", "z"};
                int arr = r.nextInt(str11.length);
                chr1 = str11[arr];
                chr2 = str21[arr];
            }while (chr1 == chr2);



                String equation1 = new String();
            String equation2 = new String();


            String Correct_ansS = new String();

            equation1 = A + chr1 + "" + B + chr2 + "=" + C;
            equation2 = D + chr1 + "" + E + chr2 + "=" + F;




            // Constructing the correct answer string
            Correct_ansS = "$" + Math.abs(d) + "$ and $" + Math.abs(a) + "$ respectively<br>#अनुक्रमे  $" + Math.abs(d) + "$ आणि $ " + Math.abs(a) + "$<br>";
            /*
            $\begin{alignat*}1&
            & 20x &{}+{}& 16y =12 \\
            &+& \quad 7x &{}+{}& 6y= 28  \\
            \hline
                    && 27x &{}+{}& 22y =17& \ \
            \end{alignat*}$ <br>

            */
            /*var allign = "$\\begin{alignat*}{1}\n" +
                    "&& " + AA + chr1 + " &{}" + "{}& " + BB + chr2 + "=" + CC + " \\\\\n" +
                    "&" + "" + "& \\quad " + DD + chr1 + " &{}" + "{}& " + EE + chr2 + " =" + FF + "  \\\\\n" +
                    "\\hline &&  " + ((b * d) - (e * a)) + chr2 + "=" + ((c * d) - (f * a)) + "&\\quad \\\\\n" +
                    "\\end{alignat*}$ <br>";*/
            var allign ="";
            if((a>0&&d>0)||(a<0&&d<0)) {
                allign = "<br>$\\begin{alignat*}{1} && " + AA + chr1 + "&{}{}&" + BB + chr2 + "=" + CC + "\\\\" + "&-& " +
                        "\\quad" + DD + chr1 + "&{}{}&" + EE + chr2 + "=" + FF + "\\\\ \\hline && &{}{}&" + ((b * d) - (e * a)) + chr2 + "=" +
                        ((c * d) - (f * a)) + "& \\\\" + " \\end{alignat*}$ <br>";
            }else{
                if()
                allign = "<br>$\\begin{alignat*}{1} && " + AA + chr1 + "&{}{}&" + BB + chr2 + "=" + CC + "\\\\" + "&+& " +
                        "\\quad" + DD + chr1 + "&{}{}&" + EE + chr2 + "=" + FF + "\\\\ \\hline && &{}{}&" + ((b * d) - (e * a)) + chr2 + "=" +
                        ((c * d) - (f * a)) + "& \\\\" + " \\end{alignat*}$ <br>";
            }


            String wrong_ans = "$" + Math.abs(b) + "$ and $" + Math.abs(c) + "$ respectively<br>#अनुक्रमे  $" + Math.abs(b) + "$ आणि $ " + Math.abs(b) + "$<br>";
            String wrong_ans1 = "$" + Math.abs(a) + "$ and $" +  Math.abs(e) + "$ respectively<br>#अनुक्रमे  $" +  Math.abs(a) + "$ आणि $ " +  Math.abs(e) + "$<br>";
            String wrong_ans2 = "$" +  Math.abs(b) + "$ and $" +  Math.abs(c) + "$ respectively<br>#अनुक्रमे  $" +  Math.abs(b)+ "$ आणि $ " +  Math.abs(c) + "$<br>";
            String mequation1="";
            String mequation2="";
            mequation1 = AA + chr1 + "" + BB + chr2 + "=" + CC;
            mequation2 = DD + chr1 + "" + EE + chr2 + "=" + FF;
            /*if(b<0&&e<0){
                mequation1 = AA + chr1 + "" + BB + chr2 + "=" + CC;
                mequation2 = DD + chr1 + "" + EE + chr2 + "=" + FF;
            } else if (b>0&&e<0) {
                mequation1 = AA + chr1 + "" + BB + chr2 + "=" + CC;
                mequation2 = DD + chr1 + "" + EE + chr2 + "=" + FF;
            } else if (b<0&&e>0) {
                mequation1 = AA + chr1 + "" + BB + chr2 + "=" + CC;
                mequation2 = DD + chr1 + "" + EE + chr2 + "=" + FF;
            } else if (b>0&&e>0) {
                mequation1 = AA + chr1 + "" + BB + chr2 + "=" + CC;
                mequation2 = DD + chr1 + "" + EE + chr2 + "=" + FF;
            }*/
            equation1 = A + chr1 + "" + B + chr2 + "=" + C;
            equation2 = D + chr1 + "" + E + chr2 + "=" + F;


            //Generate question english
            String Que = "If we are to solve given simultaneous linear equations  $" + equation1 + "$; $" + equation2 + "$, by elimination of one variable method, by what suitable factors, first and second equations should be multiplied so that variable  $" +
                    chr1 + "$  can be eliminated ? <br>";
            //Generate question marathi
            String Que1 = "# जर आपल्याला  $" + equation1 + "$; $" + equation2 + "$, ही समीकरणे एकचल लोप पद्धतीने सोडवायची असतील आणि त्यातील  $" + chr1 + "$  या चलाचा लोप करायचा असेल तर पहिल्या आणि दुसऱ्या समीकरणाला अनुक्रमे कोणत्या संख्येने गुणावे लागेल? <br>";
            String Question = "" + Que + " " + Que1 + "";


            row.createCell(4).setCellValue(Question);
            row.createCell(5).setCellValue(Correct_ansS);
//            row.createCell(6).setCellValue(" ");
//            row.createCell(7).setCellValue(" ");
//            row.createCell(8).setCellValue(" ");
            row.createCell(9).setCellValue(wrong_ans);
            row.createCell(10).setCellValue(wrong_ans1);
            row.createCell(11).setCellValue(wrong_ans2);
            row.createCell(12).setCellValue(120);
            row.createCell(13).setCellValue(4);
//             row.createCell(14).setCellValue(" ");
            row.createCell(15).setCellValue("2022.laukik.padgaonkar@ves.ac.in");
            String Solu = "";
            String Sol1 = "";
            String Correct_ansSS = "\\dfrac {" + D + "(" + BB + chr2 + "+" + C + ")}{" + A + "}" + E + chr2 + "=" + F + "$";

            String subans = "" + ((b * d) - (e * a)) + chr2 + "=" + ((c * d) - (f * a));
            //Generate Solution
            if ((a>0&&d>0)||(a<0&&d<0)) {
                Solu = "Ans : $" + d + "$ and $" + a + "$ respectively<br>Given equations are <br>$" + equation1 + " . . . . . (i)$ and<br> $" + equation2 + ". . . .  (ii)$<br>" +
                        "Usually, when simultaneous linear equations are to be solved by elimination of one of the variables, following procedure is followed.<br> $1)$ Let us assume that variable $" + chr1 +
                        "$ is to be eliminated.<br> $2)$ In equation $(i)$ term having $" + chr1 + "$ is $" + Math.abs(a) + chr1 + "$, and in equation $(ii)$ term having $" + chr1 + "$ is $" + Math.abs(d) + chr1
                        + "$.<br> $3)$ We will multiply both sides of equation $(i)$ by number $" + Math.abs(d) + "$ , so that we get<br>\n" +
                        "$\\ \\ \\ \\ \\ " + Math.abs(d) + "\\times (" + equation1 + ")$ will be $" + mequation1 + ". . . (iii)$<br>" + "$4)$ We will multiply both sides of equation $(ii)$ by number $" +
                        Math.abs(a) + " $, so that we get,<br>\n" +
                        "$\\ \\ \\ \\ \\ " + Math.abs(a) + " \\times (" + equation2 + ")$ will be $" + mequation2 + ". . . . (iv)$ <br>\n" +
                        "(These multipliers are to be selected in such a way that, the coefficients of a variable to be eliminated, will become equal after multiplication.)<br>" +
                        "$5)$ If coefficients are equal but same in sign. Hence we will subtract equations  $(iv)$ from $(iii)$ and.<br>" + "If coefficients are equal and having same sign, then, we will subtract equations $(iv)$ from $(ii)$.<br>" +
                        "$6)$ We can see that, coefficients of $" + chr1 + "$ in both equations $(iii)$ from eqn. $(iv)$ are equal, but opposite in sign. Hence, we will add eqn. $(iii)$ from eqn. $(iv)$. <br>" +
                        allign+
                        "$7)$ By adding we get $" + subans + "$ in which variable $" + chr1 + "$ is eliminated.<br>\n" +
                        " Thus, we got an equation containing only variable $" + chr2 + "$.<br>$\\therefore$ equations $(i)$ and $(ii)$ should be multiplied by $" + d + "$ and $" + a + "$ respectively is the answer.<br>#";

                Sol1 = "उत्तर  : अनुक्र $" + d + "$ आणि $ " + a + "$ <br>\n" +
                        "दिलेली समीकरणे <br>$" + equation1 + " . . . . . (i)$आणि <br> $" + equation2 + ". . . .  (ii)$ अशी आहेत. <br> जेव्हा दोन चलातील एकसामायिक रेषीय समीकरणे त्यातील एक चल लोप पद्धतीने सोडवायची असतात, तेव्हा आपण खाली दिलेल्या पायऱ्यां नुसार कृती करतो.<br>\n" +
                        "$1)$ आपल्याला  $" + chr1 + "$  या चलाचा लोप करायचा आहे, असे मानू.<br>$2)$ $" + chr1 + "$ चल  असलेले समीकरण $(i)$ मधील पद $" + A + chr1 + "$ आहे आणि समीकरण $(ii)$ मधील पद $" + D + chr2 + " $ हे.<br>" +
                        "$3)$ आपण समीकरण $(i)$ ला  $" + d + "$ ने गुणून  आपल्याला \n" +
                        "$\\ \\ \\ \\ \\ " + d + "\\times (" + equation1 + ")$ हा गुणाकार $" + mequation1 + ". . . . (iii)$ असा मिळतो. <br>" + "$4)$ आपण समीकरण $(ii)$ ला  $" + a + "$  ने  गुणून  आपल्याला \n" +
                        "$\\ \\ \\ \\ \\ " + a + "\\times (" + equation2 + ")$ हा गुणाकार $" + mequation2 + " . . . . (iii)$ असा मिळतो. <br> (हे गुणक आपल्याला असे निवडायचे आहेत, की ज्या चलाचा लोप करायचा आहे, त्याचे सहगुणक गुणाकार केल्यानंतर समान असतील.)<br>" +
                        "$5)$जर सहगुणक समान परंतु विरुद्ध चिन्हांचे असतील, तर आपण समीकरण  $(iii)$ आणि $(iv)$ यांची बेरीज करतो.<br> तसेच, जर सहगुणक समान आणि चिन्ह सुद्धा समान असतील, तर आपण समीकरण  $(iii)$ आणि $(iv)$ यांची वजाबाकी करतो.<br>" +
                        "$6)$ आपल्याला हे दिसते आहे, की, समीकरण $(iii)$ आणि $(iv)$ मधील $" + chr1 + "$ या चलाचे सहगुणक  समान परंतु विरुद्ध चिन्हांचे आहेत. म्हणून आपण समीकरण $(iii)$ आणि $(iv)$ यांची बेरीज करू. <br>" +
                        allign +
                        "$7)$ बेरीज करून आपल्याला $" + subans + "$ हे समीकरण मिळाले आणि यात $" + chr1 + "$ या चलाचा लोप झाला आहे.<br>\n" +
                        "म्हणजेच आपल्याला फक्त $" + chr2 + "$ चल असलेले समीकरण मिळाले आहे. .<br>\n" +
                        " $\\therefore$ समीकरण $(i)$ आणि $(ii)$ यांना अनुक्रमे $" + d + "$ आणि $ " + a + "$ या संख्यांनी गुणायला हवे, हे उत्तर.<br >";
            } else {
                Solu="Ans : $" + d + "$ and $" + a + "$ respectively<br>Given equations are <br>$" + equation1 + " . . . . . (i)$ and<br> $" + equation2 + ". . . .  (ii)$<br>" +
                        "Usually, when simultaneous linear equations are to be solved by elimination of one of the variables, following procedure is followed.<br> $1)$ Let us assume that variable $" + chr1 +
                        "$ is to be eliminated.<br> $2)$ In equation $(i)$ term having $" + chr1 + "$ is $" + Math.abs(a) + chr1 + "$, and in equation $(ii)$ term having $" + chr1 + "$ is $" + Math.abs(d) + chr1
                        + "$.<br> $3)$ We will multiply both sides of equation $(i)$ by number $" + Math.abs(d) + "$ , so that we get<br>\n" +
                        "$\\ \\ \\ \\ \\ " + Math.abs(d) + "\\times (" + equation1 + ")$ will be $" + mequation1 + ". . . (iii)$<br>" + "$4)$ We will multiply both sides of equation $(ii)$ by number $" +
                        Math.abs(a) + " $, so that we get,<br>\n" +
                        "$\\ \\ \\ \\ \\ " + Math.abs(a) + " \\times (" + equation2 + ")$ will be $" + mequation2 + ". . . . (iv)$ <br>\n" +
                        "(These multipliers are to be selected in such a way that, the coefficients of a variable to be eliminated, will become equal after multiplication.)<br>" +
                        "$5)$ If coefficients are equal but opposite in sign, we will add equations $(iii)$ and $(iv)$.<br>" + "If coefficients are equal and having same sign, then, we will subtract equations $(iv)$ from $(ii)$.<br>" +
                        "$6)$ We can see that, coefficients of $" + chr1 + "$ in both equations $(iii)$ from eqn. $(iv)$ are equal, but opposite in sign. Hence, we will add eqn. $(iii)$ from eqn. $(iv)$. <br>" +
                        allign+
                        "$7)$ By adding we get $" + subans + "$ in which variable $" + chr1 + "$ is eliminated.<br>\n" +
                        " Thus, we got an equation containing only variable $" + chr2 + "$.<br>$\\therefore$ equations $(i)$ and $(ii)$ should be multiplied by $" + d + "$ and $" + a + "$ respectively is the answer.<br>#";

                Sol1 = "उत्तर  : अनुक्र $" + d + "$ आणि $ " + a + "$ <br>\n" +
                        "दिलेली समीकरणे <br>$" + equation1 + " . . . . . (i)$आणि <br> $" + equation2 + ". . . .  (ii)$ अशी आहेत. <br> जेव्हा दोन चलातील एकसामायिक रेषीय समीकरणे त्यातील एक चल लोप पद्धतीने सोडवायची असतात, तेव्हा आपण खाली दिलेल्या पायऱ्यां नुसार कृती करतो.<br>\n" +
                        "$1)$ आपल्याला  $" + chr1 + "$  या चलाचा लोप करायचा आहे, असे मानू.<br>$2)$ $" + chr1 + "$ चल  असलेले समीकरण $(i)$ मधील पद $" + A + chr1 + "$ आहे आणि समीकरण $(ii)$ मधील पद $" + D + chr2 + " $ हे.<br>" +
                        "$3)$ आपण समीकरण $(i)$ ला  $" + d + "$ ने गुणून  आपल्याला \n" +
                        "$\\ \\ \\ \\ \\ " + d + "\\times (" + equation1 + ")$ हा गुणाकार $" + mequation1 + ". . . . (iii)$ असा मिळतो. <br>" + "$4)$ आपण समीकरण $(ii)$ ला  $" + a + "$  ने  गुणून  आपल्याला \n" +
                        "$\\ \\ \\ \\ \\ " + a + "\\times (" + equation2 + ")$ हा गुणाकार $" + mequation2 + " . . . . (iii)$ असा मिळतो. <br> (हे गुणक आपल्याला असे निवडायचे आहेत, की ज्या चलाचा लोप करायचा आहे, त्याचे सहगुणक गुणाकार केल्यानंतर समान असतील.)<br>" +
                        "$5)$जर सहगुणक समान परंतु विरुद्ध चिन्हांचे असतील, तर आपण समीकरण  $(iii)$ आणि $(iv)$ यांची बेरीज करतो.<br> तसेच, जर सहगुणक समान आणि चिन्ह सुद्धा समान असतील, तर आपण समीकरण  $(iii)$ आणि $(iv)$ यांची वजाबाकी करतो.<br>" +
                        "$6)$ आपल्याला हे दिसते आहे, की, समीकरण $(iii)$ आणि $(iv)$ मधील $" + chr1 + "$ या चलाचे सहगुणक  समान परंतु विरुद्ध चिन्हांचे आहेत. म्हणून आपण समीकरण $(iii)$ आणि $(iv)$ यांची बेरीज करू. <br>" +
                        allign +
                        "$7)$ बेरीज करून आपल्याला $" + subans + "$ हे समीकरण मिळाले आणि यात $" + chr1 + "$ या चलाचा लोप झाला आहे.<br>\n" +
                        "म्हणजेच आपल्याला फक्त $" + chr2 + "$ चल असलेले समीकरण मिळाले आहे. .<br>\n" +
                        " $\\therefore$ समीकरण $(i)$ आणि $(ii)$ यांना अनुक्रमे $" + d + "$ आणि $ " + a + "$ या संख्यांनी गुणायला हवे, हे उत्तर.<br >";
            }


            String Solution = Solu + Sol1;
            row.createCell(16).setCellValue(Solution);


//             row.createCell(17).setCellValue(" ");
            row.createCell(18).setCellValue(114);


            mapsize = map.size();
            map.put(Question, i);
            mapsizeafter = map.size();


            //In Java, a map can consist of virtually any number of key-value pairs, but the keys must always be unique — non-repeating.
            if (mapsize == mapsizeafter) {
                System.out.println("duplicate Question" + i + ". " + Question);
                i--;
            }


            System.out.println("abcs");
            System.out.println(a + "," + b + "," + c + "," + d + "," + e);
            System.out.println("wrong ans");
            System.out.println(wrong_ans1 + "," + wrong_ans + "," + wrong_ans2);


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
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static boolean hasCommonFactors(int num1, int num2, int num3) {

        num1= Math.abs(num1);
        num2= Math.abs(num2);
        num3= Math.abs(num3);
        if(num3==0){
            if(gcd(num1, num2) > 1){
                return true;
            }
        }
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

