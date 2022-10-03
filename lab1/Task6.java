public class Task6 {
    public static void main(String[] args) {
        String inputText = "Я дуже люблю свій дім, хоча це і квартира. Але, до речі, колись я хочу свій власний дім7Chik дімЧиК. Напевно, коли виросту, стану жити окремо від батьків. Але коли вони стануть зовсім немічними від старості, я їх, зрозуміло, заберу до себе в дім.";

        String processedText = inputText.replaceAll("дім(?![\\d\\s[A-Za-z]\\p{IsCyrillic}])", "будинок");
        System.out.println(processedText);
    }
}
