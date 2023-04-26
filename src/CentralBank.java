public class CentralBank {
    void leasingRate() {
        System.out.println("30% below");
    }
}
class CommercialBank extends CentralBank {
    void housingLoanRate() {
        System.out.println("25%");
    }
}
class CommercialLeasing extends CentralBank {
    void leasingRate () {
        System.out.println("23%");
    }
}
class CommercialCredit extends CentralBank {
    void housingLoanRate() {
        System.out.println("20%");
    }
    void leasingRate () {
        System.out.println("22%");
    }
}
class RateResult {
    public static void main(String[] args) {
        CentralBank c = new CentralBank(); CentralBank cb = new CommercialBank();
        CentralBank cl = new CommercialLeasing(); CentralBank cc = new CommercialCredit();
        c.leasingRate(); cb.leasingRate(); cl.leasingRate(); cc.leasingRate();
        CommercialBank cbl = new CommercialBank();
        cbl.housingLoanRate();
    }
}
