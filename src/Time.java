public class Time
{
    public static void main(String[] args)
    {

        long timeInMilliSeconds = 2343235541l;
        long seconds = timeInMilliSeconds / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;

        System.out.println(days + " days " + hours + " hours " + minutes + " minutes " + seconds+ " seconds " + timeInMilliSeconds+ " miliseconds");

    }
}


