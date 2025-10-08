class Main
{
	public static void main(String[] args)
	{
        int a = 20;
        int b = 9;

        try{
            System.out.println(a / b);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("finally");
        }
        System.out.println("Hola!");
    }
}