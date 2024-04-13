import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Card {
    private int point,typeCard,redCo,blackCo,blueCo,whiteCo,greenCo,nDicCo;
    private String path;
    private int owner;// 42 ==> rserve ==> player 2 // 41 ==> rserve ==> player 1 // 3==>have not owner // 2==>player 2 // 1==>player 1
    private int typePicture,colorDisCo;//1==>black//2==>white//3==>blue//4==>red//5==>green
    boolean bought;

    public void setBought(boolean bought) {
        this.bought = bought;
    }
    public boolean getBought(){
        return bought;
    }
    public void setBlackCo(int blackCo) {
        this.blackCo = blackCo;
    }

    public void setWhiteCo(int whiteCo) {
        this.whiteCo = whiteCo;
    }

    public void setGreenCo(int greenCo) {
        this.greenCo = greenCo;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setBlueCo(int blueCo) {
        this.blueCo = blueCo;
    }

    public void setRedCo(int redCo) {
        this.redCo = redCo;
    }

    public void setColorDisCo(int colorDisCo) {
        this.colorDisCo = colorDisCo;
    }

    public void setnDicCo(int nDicCo) {
        this.nDicCo = nDicCo;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setTypeCard(int typeCard) {
        this.typeCard = typeCard;
    }

    public void setTypePicture(int typePicture) {
        this.typePicture = typePicture;
    }


    public String getPath() {
        return path;
    }


    public int getOwner() {
        return owner;
    }

    public int getBlackCo() {
        return blackCo;
    }

    public int getWhiteCo() {
        return whiteCo;
    }

    public int getBlueCo() {
        return blueCo;
    }

    public int getRedCo() {
        return redCo;
    }

    public int getGreenCo() {
        return greenCo;
    }

    public int getColorDisCo() {
        return colorDisCo;
    }

    public int getnDicCo() {
        return nDicCo;
    }

    public int getTypeCard() {
        return typeCard;
    }

    public int getPoint() {
        return point;
    }

    public Card(int point, int blackCo, int whiteCo, int greenCo, int blueCo, int redCo, int nDicCo, int typePicture, int colorDisCo, String path, boolean show, int owner,boolean bought){
        setOwner(owner);
        setBought(bought);
        setPoint(point);
        setBlackCo(blackCo);
        setWhiteCo(whiteCo);
        setGreenCo(greenCo);
        setBlueCo(blueCo);
        setRedCo(redCo);
        setColorDisCo(colorDisCo);
        setnDicCo(nDicCo);
        setTypePicture(typePicture);
        setPath(path);
    }

}