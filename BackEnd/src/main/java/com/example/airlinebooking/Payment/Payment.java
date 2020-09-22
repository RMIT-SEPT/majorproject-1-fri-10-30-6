package Payment;
import java.io.Serializable;


public class Payment extends Flight implements Serializable {
    private String cardtype;
    private int cardNo;
    private String cardName;
    private int expireMonth;
    private int expisreDate;
    private int cvc;


    public Payment(String cardtype, int cardNo, int cvc, int expiryMonth, int expireDate, String cardName) {
        this.cardtype = cardtype;
        this.cardNo = cardNo;
        this.cardName = cardName;
        this.expiryMonth = expiryMonth;
        this.expireDate = expireDate;
        this.cvc = cvc;

    }

    public String getCardtype() {
        return cardtype;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getExpireMonth() {
        return expireMonth;
    }

    public int setExpiryMonth() {
        this.expireMonth = expireMonth;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }


}


