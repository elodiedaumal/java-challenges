package oopChallenges.Printer;

public class Printer {
    private int tonerLevel;
    private int PagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.PagesPrinted=0;
        if(tonerLevel<=0) {
            this.tonerLevel=0;
        } else if (tonerLevel>=100) {
            this.tonerLevel=100;
        } else this.tonerLevel=tonerLevel;

        this.duplex = duplex;
    }

    public int addToner(int newToner) {
        int tempAmount=tonerLevel + newToner;
        if(tempAmount>=100){
            tonerLevel=100;
        } else if (tempAmount<=0) {
            tonerLevel=0;
        }
        tonerLevel+=newToner;
       return tonerLevel;
    };

    public int printPages(int pages) {
        int jobPages=(duplex)?(pages/2) + (pages%2):pages;
        PagesPrinted += jobPages;
        return jobPages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return PagesPrinted;
    }
}
