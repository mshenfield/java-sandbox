package nested;

class Cli extends Base {
    public static void main(String args[]) {
        for(int i=0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}
