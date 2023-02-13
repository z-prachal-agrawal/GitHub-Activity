class Main {
    public static void main(String[] args) {
        String s = "PRA12Ga782d45601$3";
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                sum = sum + Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        System.out.print("Sum of integers in a string: " + sum);
    }
}
//Output : Total Sum : 39
