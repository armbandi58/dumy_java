public class cenzor {
    //variables
    private String text_change, text_tothis;

    public cenzor(String bla0, String bla1){
        this.text_change = bla0;
        this.text_tothis = bla1;
        System.out.println("[+] Cenzor constructor called.");
    }

    public String cenzura(String text_input){
        text_input = text_input.replaceAll(this.text_change, this.text_tothis);
        return text_input;
    }
}
