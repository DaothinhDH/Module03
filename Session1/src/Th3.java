import java.util.Scanner;

public class Th3 {
    //  Ứng dụng đọc số thành chữ
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("nhap so de dem: ");
            int weight = scanner.nextInt();

            // tach cac hang tram, hang chuc, hang don vi
            int hundred = weight / 100;
            int rawDec = (weight % 100);
            int dec = rawDec / 10;
            int i = weight % 10;

            String hundredStr = "";
            String decStr = "";
            String iStr = "";


            switch (hundred) {
                case 1:
                    hundredStr = " one hundred ";
                    break;
                case 2:
                    hundredStr = " two hundred ";
                    break;
                case 3:
                    hundredStr = " three hundred ";
                    break;
                case 4:
                    hundredStr = " four hundred ";
                    break;
                case 5:
                    hundredStr = " five hundred ";
                    break;
                case 6:
                    hundredStr = " six hundred ";
                    break;
                case 7:
                    hundredStr = " seven hundred ";
                    break;
                case 8:
                    hundredStr = " eight hundred ";
                    break;
                case 9:
                    hundredStr = " nine hundred ";
                    break;
                default:
                    break;
            }

            if (rawDec > 10 && rawDec < 20) {
                switch (rawDec) {
                    case 11:
                        decStr = "elevent ";
                        break;
                    case 12:
                        decStr = "twelve ";
                        break;
                    case 13:
                        decStr = "thirteen ";
                        break;
                    case 14:
                        decStr = "fouthteen ";
                        break;
                    case 15:
                        decStr = "fiveteen ";
                        break;
                    case 16:
                        decStr = "sixteen ";
                        break;
                    case 17:
                        decStr = "seventeen ";
                        break;
                    case 18:
                        decStr = "eightteen ";
                        break;
                    case 19:
                        decStr = "nineeen ";
                        break;
                    default:
                        break;
                }
                System.out.println(" so can nang cua ban la: " + hundredStr + " and " + decStr);
                System.exit(1);
            }

            switch (dec) {
                case 2:
                    decStr = " twenty ";
                    break;
                case 3:
                    decStr = " thirty ";
                    break;
                case 4:
                    decStr = " forty ";
                    break;
                case 5:
                    decStr = " fivety ";
                    break;
                case 6:
                    decStr = " sixty ";
                    break;
                case 7:
                    decStr = " seventy ";
                    break;
                case 8:
                    decStr = " eighty ";
                    break;
                case 9:
                    decStr = " ninety ";
                    break;
            }

            switch (i) {
                case 1:
                    iStr = "one ";
                    break;
                case 2:
                    iStr = "two ";
                    break;
                case 3:
                    iStr = "three ";
                    break;
                case 4:
                    iStr = "four ";
                    break;
                case 5:
                    iStr = "five ";
                    break;
                case 6:
                    iStr = "six ";
                    break;
                case 7:
                    iStr = "sevent ";
                    break;
                case 8:
                    iStr = "eight ";
                    break;
                case 9:
                    iStr = "nine ";
                    break;
                default:
                    break;
            }
            if (rawDec != 0){
                hundredStr += " and ";
            }
            System.out.println(" so can nang cua ban la: " + hundredStr + decStr + iStr);
        }
    }
}