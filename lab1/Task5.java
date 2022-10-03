public class Task5 {
    public static void main(String[] args) {

        String s1="Ми садили квіти у саду, і ми робили це на задньому подвір'ї та поливали дерева.";
//        String replaceString=s1.replaceAll(" і "," та ");
        String replaceString = s1.replace(" і ", " ТА ").replace(" та "," І ");
        System.out.println(replaceString);
    }
}
