package Office_Hours.Practice_11_11_2020;

public class ArraysPractice2MultiDimentionalArrays {
    public static void main(String[] args) {
        String [] word={"Anna", "Level", "Lol", "Donald", "Biden", "Aamir", "Agalar", "Engin"};
        int count=0;

        for(String each: word){
            char firstChar= each.toLowerCase().charAt(0);//A would be a
            char lastChar=each.toLowerCase().charAt(each.length()-1);//a so now they are equal
            if(firstChar==lastChar){
                count++;

            }
        }

        System.out.println(count);


    }
}
/*
how many words have first and last characters matching:
output: 4
 */