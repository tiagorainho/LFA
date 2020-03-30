import java.util.LinkedList;
import java.util.List;

class Question {
    private String header;
    private String question;
    private List<String> wrongAnswears;
    private List<String> writeAnswears;

    public Question(String header, String question) {
        this.header = header;
        this.question = question;
        this.wrongAnswears = new LinkedList<String>();
        this.writeAnswears = new LinkedList<String>();
    }

    public String getQuestion(int quantity) {
        char[] alinea = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
        String response = "- " + this.question + "\n";
        List<String> resp = this.getAnswears(quantity);
        for (int i = 0; i < resp.size(); i++) {
            response += String.format("\t%c) %s;\n", alinea[i], resp.get(i));
        }
        return response;
    }

    public void addWriteAnswear(String answear) {
        this.writeAnswears.add(answear);
    }

    public void addWrongAnswear(String answear) {
        this.wrongAnswears.add(answear);
    }

    public List<String> getAnswears(int quantity) {
        List<String> answears = null;
        if (quantity >= 2) {
            answears = getWrongAnswear(quantity - 1);
            answears = addWriteAnswear(answears);
        }
        return answears;
    }

    private List<String> addWriteAnswear(List<String> answears) {
        answears.add(getRandomIndex(answears), getOneWriteAnswear());
        return answears;
    }

    public List<String> getWrongAnswear(int quantity) {
        List<String> aux = new LinkedList<String>();
        List<String> resp = new LinkedList<String>();
        int index;
        for (String values : this.wrongAnswears) {
            aux.add(values);
        }
        for (int i = 0; i < quantity; i++) {
            index = getRandomIndex(aux);
            resp.add(aux.get(index));
            aux.remove(index);
        }
        return resp;
    }

    public String getOneWriteAnswear() {
        return this.writeAnswears.get(getRandomIndex(this.writeAnswears));
    }

    private int getRandomIndex(List<String> list) {
        return (int) (Math.random() * list.size());
    }

    public String getHeader() {
        return this.header;
    }
}