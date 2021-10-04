package by.Shauliuk.tasks.String;

public class StringTasks {
    public static void main(String[] args) {
        System.out.println("*****First task******");
        String first = "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                " when an unknown printer took a galley of type and scrambled it to make a type specimen book." +
                " It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged.";
        int firstIndex = first.indexOf("a");
        int secondIndex = first.lastIndexOf("b");
        String substring = first.substring(firstIndex, secondIndex);
        System.out.println(substring);


        System.out.println("*****Second task******");

        String second = "Hello October!";
        String replace = second.replace("l", "h");
        System.out.println(replace);


        System.out.println("*****Third task******");
        StringBuffer strBuffer = new StringBuffer("home\ncat\nlevel\ndog\ndeified\nsun\nnoon\nwinter");
        strBuffer.reverse();
        for (strBuffer.reverse() equals) ;
        int n = strBuffer.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (strBuffer.charAt(i) != strBuffer.charAt(n - i - 1))
                System.out.println(strBuffer.toString());
            return strBuffer.replaceAll("\\W", "")
                    .equalsIgnoreCase(new StringBuilder(strBuffer.replaceAll("\\W", ""))
                            .reverse().toString());
        }


    }
}
}


       /* System.out.println("*****Fourth task******");
        String fourth = "";
*/




