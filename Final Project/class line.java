public class line
{
    paient[] arr;
    int cur=0;
    int ad=0;
    
    public line()
    {
        arr = new paient[20];
    }
    
    public line(int size)
    {
        arr = new paient[size];
    }
    
    public void add(paient a)
    {
        if(ad == arr.length-1)
        {
            arr[ad] = a;
            ad = 0;
        }
        else
        {
            arr[ad] = a;
            ad++;
        }
    }
    
    public void next(DocLine doc)
    {
        if(arr[cur] != null)
        {
            System.out.println("Line");
            System.out.println(arr[cur].name+"\n"+arr[cur].id+"\n"+arr[cur].ins+"\n"+arr[cur].problem+"\n");
            doc.add(arr[cur]);
            cur++;
        }
        else if(cur == arr.length-1)
        {
            System.out.println("Line");
            System.out.println(arr[cur].name+"\n"+arr[cur].id+"\n"+arr[cur].ins+"\n"+arr[cur].problem+"\n");
            doc.add(arr[cur]);
            cur = 0;
        }
        else
        {
            System.out.println("Line");
            System.out.println("There is no one next");
        }
    }
    
    public void display()
    {
        System.out.println("Full Queue of the Line");
        for(int z = 0; z < arr.length; z++)
        {
            if(arr[z] != null)
            {
                System.out.println(arr[z].name+"\n"+arr[z].id+"\n"+arr[z].ins+"\n"+arr[z].problem+"\n");
            }
        }
    }
}