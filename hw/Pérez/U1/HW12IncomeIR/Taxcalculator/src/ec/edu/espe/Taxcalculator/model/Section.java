
package ec.edu.espe.Taxcalculator.model;

/**
 *
 * @author Carlos Perez,The Javas, DCCO-ESPE
 */
public class Section {
    private double lowerlimit;
    private double upperlimit;
    private double basetax;
    private double excesspercentage;

    /**
     * @param lowerlimit
     * @return the lowerlimit
     */
    
    public Section(double lowerlimit, double upperlimit, double basetax, double excesspercentage) {
        this.lowerlimit = lowerlimit;
        this.upperlimit = upperlimit;
        this.basetax = basetax;
        this.excesspercentage = excesspercentage;
    }

    public double getLowerlimit() {
        return lowerlimit;
    }

    /**
     * @param lowerlimit the lowerlimit to set
     */
    public void setLowerlimit(double lowerlimit) {
        this.lowerlimit = lowerlimit;
    }

    /**
     * @return the upperlimit
     */
    public double getUpperlimit() {
        return upperlimit;
    }

    /**
     * @param upperlimit the upperlimit to set
     */
    public void setUpperlimit(double upperlimit) {
        this.upperlimit = upperlimit;
    }

    /**
     * @return the basetax
     */
    public double getBasetax() {
        return basetax;
    }

    /**
     * @param basetax the basetax to set
     */
    public void setBasetax(double basetax) {
        this.basetax = basetax;
    }

    /**
     * @return the excesspercentage
     */
    public double getExcesspercentage() {
        return excesspercentage;
    }

    /**
     * @param excesspercentage the excesspercentage to set
     */
    public void setExcesspercentage(double excesspercentage) {
        this.excesspercentage = excesspercentage;
    }
    }
