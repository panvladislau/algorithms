package by.bsu.mmf.algotithms.euler;

public class Main {
    public static void main(String[] arr){
        String[] string = {"Караганда", "Воронеж", "Киев", "Жданов", "Витебск", "Архангельск", "Ангола", "Алжир", "Рига"};
        Euler euler = new Euler(string);
        System.out.println(euler.eulerMethod());
    }
}
