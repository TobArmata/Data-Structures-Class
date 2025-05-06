public class paient
{
    String name;
    String id;
    String ins;
    String problem;
    
    public paient(String n, String i, String in, String prob)
    {
        name = n;
        id = i;
        ins = in;
        problem = prob;
    }
    public paient(String n, String i, String prob)
    {
        name = n;
        id = i;
        problem = prob;
    }
    public paient(String n, String prob)
    {
        name = n;
        problem = prob;
    }
}