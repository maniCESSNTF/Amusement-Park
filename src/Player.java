public class Player {
    private int point,nReservCard=-1,nRedCo, nblueCo,nBlackCo,nWhaiteCo,nGreenCo,nGoldCo,
            nDIsGreenCO,nDIsBlueCO,nDIsWhiteCO,nDIsBlackCO,nDIsRedCO;
    private String Username,colorPlayer;
    private Card[] myCards = new Card[30];
    private Card[] myRservedCards = new Card[3];
    private int numberCards;
    public void setUsername(String username) {
        Username = username;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setMyCards(Card myCards) {
        this.myCards[getNumberCards()] = myCards;
        setNumberCards(getNumberCards()+1);
    }

    public void setNumberCards(int numberCards) {
        this.numberCards = numberCards;
    }

    public void setnReservCard(int nReservCard) {
        this.nReservCard = nReservCard;
    }

    public void setnBlackCo(int nBlackCo) {
        this.nBlackCo = nBlackCo;
    }
    public void setnDIsBlackCO(int nDIsBlackCO) {
        this.nDIsBlackCO = nDIsBlackCO;
    }

    public void setNblueCo(int nblueCo) {
        this.nblueCo = nblueCo;
    }
    public void setnDIsBlueCO(int nDIsBlueCO) {
        this.nDIsBlueCO = nDIsBlueCO;
    }

    public void setMyRservedCards(Card card) {
        this.myRservedCards[getnReservCard()] = card;
    }

    public Card[] getMyRservedCards() {return myRservedCards;}

    public void setnDIsGreenCO(int nDIsGreenCO) {
        this.nDIsGreenCO = nDIsGreenCO;
    }
    public void setnGreenCo(int nGreenCo) {
        this.nGreenCo = nGreenCo;
    }

    public void setnDIsRedCO(int nDIsRedCO) {
        this.nDIsRedCO = nDIsRedCO;
    }
    public void setnRedCo(int nRedCo) {
        this.nRedCo = nRedCo;
    }

    public void setnDIsWhiteCO(int nDIsWhiteCO) {
        this.nDIsWhiteCO = nDIsWhiteCO;
    }
    public void setnWhaiteCo(int nWhaiteCo) {
        this.nWhaiteCo = nWhaiteCo;
    }

    public int getNumberCards() {
        return numberCards;
    }

    public String getUsername() {
        return Username;
    }

    public Card[] getMyCards() {
        return myCards;
    }

    public int getnBlackCo() {
        return nBlackCo;
    }

    public int getNblueCo() {
        return nblueCo;
    }

    public int getnDIsBlackCO() {
        return nDIsBlackCO;
    }

    public int getnDIsBlueCO() {
        return nDIsBlueCO;
    }

    public int getnDIsGreenCO() {
        return nDIsGreenCO;
    }

    public int getnDIsRedCO() {
        return nDIsRedCO;
    }

    public int getnDIsWhiteCO() {
        return nDIsWhiteCO;
    }

    public int getnGoldCo() {
        return nGoldCo;
    }

    public int getnGreenCo() {
        return nGreenCo;
    }

    public int getnRedCo() {
        return nRedCo;
    }

    public int getnReservCard() {
        return nReservCard;
    }

    public int getnWhaiteCo() {
        return nWhaiteCo;
    }

    public int getPoint() {
        return point;
    }

    public String getColorPlayer() {
        return colorPlayer;
    }

    public void setnGoldCo(int nGoldCo) {
        this.nGoldCo = nGoldCo;
    }

    public void addCard(Card card){
        myCards[getNumberCards()]=card;
        numberCards++;
    }
    public void setColorPlayer(String colorPlayer) {
        this.colorPlayer = colorPlayer;
    }

    public void IncreaseNGoldCo(int increase){
        nGoldCo+=increase;
    }
    public void DecreaseNGoldCo(int decrease){
        nGoldCo-=decrease;
    }

    public Player(String Username, String colorPlayer) {
        setColorPlayer(colorPlayer);
        setUsername(Username);
    }

}
