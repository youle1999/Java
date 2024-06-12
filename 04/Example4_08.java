class Example4_08 {
    public static boolean isPositiveNumber(int i) {
        if (i > 0) {
            return true;
        } else {
            return false;
        }


    }


    public static void main(String[] args) {
        int i = -10;
    	i=2;
        if (isPositiveNumber(i) == true) {
            System.out.println("i‚Ì’l‚Í³‚Å‚·");
        } else {
            System.out.println("i‚Ì’l‚Í•‰‚Ü‚½‚Íƒ[ƒ‚Å‚·");
        }
    }
}

