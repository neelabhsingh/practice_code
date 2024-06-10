package interview.test12;

public class ParseString {
    public static void main(String[] args) {
        String input = "2+3-2.5";
        StringBuilder sb = new StringBuilder(input);

        for(int i =0; i<input.length(); i++){
            if(sb.charAt(i) == '-' || sb.charAt(i) == '+'){
                sb.setCharAt(i, '#');
            }
        }
        System.out.println(sb.toString());
        String [] strNums = sb.toString().split("#");
        int index = 0;

        double sum = 0.0;
        String num ="";
        for(int i = 0; i < strNums.length ; i++){

            num = strNums[i];

            int len = num.length();
            index+=len;

            char operator = input.charAt(index);
            if(operator == '+'){
                sum = sum + Double.parseDouble(num);
            }else{
                sum = sum - Double.parseDouble(num);
            }
            index++;
        }
        System.out.println(sum);
    }
}
