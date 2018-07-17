package sg.edu.rp.c346.basicmathformula;

/**
 * Created by 16020271 on 17/7/2018.
 */

public class FormulaItem {

    private String formula;
    private String explanation;

    public FormulaItem(String name, String date) {
        this.formula = formula;
        this.explanation = explanation;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "name='" + formula + '\'' +
                ", date='" + explanation + '\'' +
                '}';
    }
}
