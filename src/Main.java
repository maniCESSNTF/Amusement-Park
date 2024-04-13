import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

//this cooment is alaki
//you are good?
public class  Main extends JFrame{
    private static JFrame frame1;
    private static JFrame frame2;
    private static int turn;
    private static JFrame scoreFrame;
    private static int currentPlayer = 0;
    private static Font defaultFont = new Font("tahoma", Font.BOLD, 20);
    private static JTextField PlayerUername2txt;
    private static JTextField PlayerUername1txt;
    private static JFrame ShowCards;

    public static void main(String[] args) {
        frame1 = new JFrame("صفحه اول");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JButton startButton = new JButton("شروع");

        for(int g=0;g<5;g++);

        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 0, 10));

        JLabel PlayerUername1 = new JLabel("Player username 1");
        PlayerUername1.setFont(defaultFont);
        PlayerUername1.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel PlayerUername2 = new JLabel("Player username 2");
        PlayerUername2.setFont(defaultFont);
        PlayerUername2.setHorizontalAlignment(SwingConstants.CENTER);
        PlayerUername1txt = new JTextField("");
        PlayerUername1txt.setHorizontalAlignment(JTextField.CENTER);
        PlayerUername1txt.getDocument().putProperty("owner", "width");
        PlayerUername2txt = new JTextField("");
        PlayerUername2txt.setHorizontalAlignment(JTextField.CENTER);
        PlayerUername2txt.getDocument().putProperty("Player username 1", "Player username 2");

        centerPanel.add(PlayerUername1);
        centerPanel.add(PlayerUername2);
        centerPanel.add(PlayerUername1txt);
        centerPanel.add(PlayerUername2txt);

        centerPanel.setBorder(new EmptyBorder(300, 100, 100, 100));
        frame1.getContentPane().add(centerPanel, BorderLayout.CENTER);
//////////////

        Card[] CardsT0 = new Card[3];
        Card CardsT1[] = new Card[15];
        Card CardsT2[] = new Card[15];
        Card CardsT3[] = new Card[15];
        Card CardsT4[] = new Card[3];


        CardsT1[0] = new Card( 1, 0, 0, 0, 2, 2, 1, 11, 1, "images/card11.jpg", false, 3,false);
        CardsT1[1] = new Card( 0, 2, 0, 0, 0, 2, 1, 12, 2, "images/card12.jpg", false, 3,false);
        CardsT1[2] = new Card( 1, 0, 2, 0, 2, 0, 1, 13, 4, "images/card13.jpg", false, 3,false);
        CardsT1[3] = new Card( 1, 2, 2, 0, 0, 0, 1, 14, 3, "images/card14.jpg", false, 3,false);
        CardsT1[4] = new Card( 0, 0, 2, 0, 0, 2, 1, 15, 1, "images/card15.jpg", false, 3,false);
        CardsT1[5] = new Card( 1, 1, 0, 1, 0, 2, 1, 16, 1, "images/card16.jpg", false, 3,false);
        CardsT1[6] = new Card( 1, 2, 0, 0, 2, 0, 1, 17, 5, "images/card17.jpg", false, 3,false);
        CardsT1[7] = new Card( 1, 0, 2, 0, 1, 1, 1, 18, 4, "images/card18.jpg", false, 3,false);
        CardsT1[8] = new Card( 0, 2, 2, 0, 0, 0, 1, 19, 5, "images/card19.jpg", false, 3,false);
        CardsT1[9] = new Card( 1, 0, 2, 0, 0, 2, 1, 110, 1, "images/card110.jpg", false, 3,false);
        CardsT1[10] = new Card( 0, 0, 2, 0, 2, 0, 1, 111, 4, "images/card111.jpg", false, 3,false);
        CardsT1[11] = new Card( 1, 2, 0, 2, 0, 0, 1, 112, 2, "images/card112.jpg", false, 3,false);
        CardsT1[12] = new Card( 1, 1, 0, 0, 1, 2, 1, 113, 5, "images/card113.jpg", false, 3,false);
        CardsT1[13] = new Card( 1, 0, 1, 3, 0, 0, 1, 114, 3, "images/card114.jpg", false, 3,false);
        CardsT1[14] = new Card( 1, 2, 0, 0, 0, 2, 1, 115, 5, "images/card115.jpg", false, 3,false);

        CardsT2[0] = new Card( 2, 2, 2, 0, 2, 0, 1, 21, 4, "images/card21.jpg", false, 3,false);
        CardsT2[1] = new Card( 3, 2, 1, 0, 0, 3, 1, 22, 4, "images/card22.jpg", false, 3,false);
        CardsT2[2] = new Card( 3, 2, 1, 0, 0, 3, 1, 23, 3, "images/card23.jpg", false, 3,false);
        CardsT2[3] = new Card( 4, 0, 0, 1, 4, 1, 1, 24, 2, "images/card24.jpg", false, 3,false);
        CardsT2[4] = new Card( 3, 0, 2, 2, 0, 2, 1, 25, 3, "images/card25.jpg", false, 3,false);
        CardsT2[5] = new Card( 4, 0, 0, 0, 3, 3, 1, 26, 2, "images/card26.jpg", false, 3,false);
        CardsT2[6] = new Card( 4, 0, 0, 3, 2, 2, 1, 27, 1, "images/card27.jpg", false, 3,false);
        CardsT2[7] = new Card( 2, 2, 2, 2, 0, 2, 1, 28, 2, "images/card28.jpg", false, 3,false);
        CardsT2[8] = new Card( 4, 3, 2, 3, 0, 0, 1, 29, 2, "images/card29.jpg", false, 3,false);
        CardsT2[9] = new Card( 4, 2, 0, 2, 0, 3, 2, 210, 3, "images/card210.jpg", false, 3,false);
        CardsT2[10] = new Card( 2, 0, 2, 2, 2, 0, 1, 211, 1, "images/card211.jpg", false, 3,false);
        CardsT2[11] = new Card( 4, 2, 0, 2, 0, 3, 2, 212, 2, "images/card212.jpg", false, 3,false);
        CardsT2[12] = new Card( 4, 2, 2, 3, 0, 0, 2, 213, 3, "images/card213.jpg", false, 3,false);
        CardsT2[13] = new Card( 3, 3, 0, 0, 0, 3, 1, 214, 5, "images/card214.jpg", false, 3,false);
        CardsT2[14] = new Card( 3, 2, 2, 0, 0, 3, 1, 215, 3, "images/card215.jpg", false, 3,false);

        CardsT3[0] = new Card( 5, 0, 1, 4, 2, 2, 1, 31, 1, "images/card31.jpg", false, 3,false);
        CardsT3[1] = new Card( 5, 0, 0, 3, 4, 3, 1, 32, 1, "images/card32.jpg", false, 3,false);
        CardsT3[2] = new Card( 5, 4, 2, 0, 2, 2, 1, 33, 3, "images/card33.jpg", false, 3,false);
        CardsT3[3] = new Card( 5, 2, 2, 4, 0, 1, 1, 34, 3, "images/card34.jpg", false, 3,false);
        CardsT3[4] = new Card( 5, 1, 2, 2, 2, 0, 2, 35, 4, "images/card35.jpg", false, 3,false);
        CardsT3[5] = new Card( 5, 1, 0, 2, 2, 2, 2, 36, 1, "images/card36.jpg", false, 3,false);
        CardsT3[6] = new Card( 5, 0, 1, 3, 3, 3, 1, 37, 1, "images/card37.jpg", false, 3,false);
        CardsT3[7] = new Card( 4, 2, 3, 3, 0, 1, 1, 38, 3, "images/card38.jpg", false, 3,false);
        CardsT3[8] = new Card( 4, 4, 0, 1, 2, 2, 1, 39, 2, "images/card39.jpg", false, 3,false);
        CardsT3[9] = new Card( 3, 1, 0, 1, 3, 2, 1, 310, 4, "images/card310.jpg", false, 3,false);
        CardsT3[10] = new Card( 4, 3, 2, 2, 1, 0, 1, 311, 4, "images/card311.jpg", false, 3,false);
        CardsT3[11] = new Card( 4, 1, 3, 0, 1, 3, 1, 312, 5, "images/card312.jpg", false, 3,false);
        CardsT3[12] = new Card( 5, 0, 3, 3, 1, 3, 1, 313, 1, "images/card313.jpg", false, 3,false);
        CardsT3[13] = new Card( 4, 2, 0, 3, 1, 4, 1, 314, 2, "images/card314.jpg", false, 3,false);
        CardsT3[14] = new Card( 4, 3, 3, 0, 2, 2, 1, 315, 5, "images/card315.jpg", false, 3,false);

        CardsT4[0] = new Card(0,0,0,0,0,0,0,0,0,"aaa",false,3,false);
        CardsT4[1] = new Card(0,0,0,0,0,0,0,0,0,"aaa",false,3,false);
        CardsT4[2] = new Card(0,0,0,0,0,0,0,0,0,"aaa",false,3,false);

        Coin[] coins = new Coin[25];
        for(int i = 0;i<4;i++){
            coins[i]=new Coin(3,1);
        }
        for(int i = 4;i<8;i++){
            coins[i]=new Coin(3,2);
        }
        for(int i = 8;i<12;i++){
            coins[i]=new Coin(3,3);
        }
        for(int i = 12;i<16;i++){
            coins[i]=new Coin(3,4);
        }
        for(int i = 16;i<20;i++){
            coins[i]=new Coin(3,5);
        }
        for(int i = 20;i<25;i++){
            coins[i]=new Coin(3,6);
        }

        JLabel[] labels;
        labels = new JLabel[15];

        String username1 = PlayerUername1txt.getText();
        String username2 = PlayerUername2txt.getText();

        Player Player1 = new Player(username1, null);
        Player Player2 = new Player(username2, null);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                frame1.setVisible(false);
                ScorePage.showScore(Player1, Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins,labels);
            }
        });

        frame1.getContentPane().add(startButton, BorderLayout.SOUTH);
        frame1.setVisible(true);
    }

        static class ScorePage {
            public static void showScore(Player Player1, Player Player2, Card[] CardsT1, Card[] CardsT2, Card[] CardsT3, Card[] CardsT4, Coin[] coins, JLabel[] labels) {
                scoreFrame = new JFrame("امتیازها");
                scoreFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                scoreFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                JLabel player1ScoreLabel = new JLabel(Player1.getUsername() + ": " + Player1.getPoint());
                JLabel player2ScoreLabel = new JLabel(Player2.getUsername() + ": " + Player2.getPoint());
                JLabel Turn = new JLabel(" turn : "+currentPlayer);
                JLabel DislBackp1 = new JLabel(" DislBackp1 : "+Player1.getnDIsBlackCO());
                JLabel DisWhaitp1 = new JLabel(" DisWhaitp1 : "+Player1.getnDIsWhiteCO());
                JLabel DisBluep1 = new JLabel(" DisBluep1 : "+Player1.getnDIsBlueCO());
                JLabel DisRedp1 = new JLabel(" DisRedp1 : "+Player1.getnDIsRedCO());
                JLabel DisGreenp1 = new JLabel(" DisGreenp1 : "+Player1.getnDIsGreenCO());

                JLabel DislBackp2 = new JLabel(" DislBackp2 : "+Player1.getnBlackCo());
                JLabel DisWhaitp2 = new JLabel(" DisWhaitp2 : "+Player1.getnWhaiteCo());
                JLabel DisBluep2 = new JLabel(" DisBluep2 : "+Player1.getNblueCo());
                JLabel DisRedp2 = new JLabel(" DisRedp2 : "+Player1.getnRedCo());
                JLabel DisGreenp2 = new JLabel(" DisGreenp2 : "+Player1.getnGreenCo());

                JLabel blue1 = new JLabel(" blue1 : "+coins[8].getOwner());
                JLabel blue2 = new JLabel(" blue2 : "+coins[9].getOwner());
                JLabel blue3 = new JLabel(" blue3 : "+coins[10].getOwner());
                JLabel blue4 = new JLabel(" blue4 : "+coins[11].getOwner());

                JPanel scoresPanel = new JPanel();

                scoresPanel.add(Turn);
                scoresPanel.add(DislBackp1);
                scoresPanel.add(DisWhaitp1);
                scoresPanel.add(DisBluep1);
                scoresPanel.add(DisRedp1);
                scoresPanel.add(DisGreenp1);
                scoresPanel.add(DislBackp2);
                scoresPanel.add(DisWhaitp2);
                scoresPanel.add(DisBluep2);
                scoresPanel.add(DisRedp2);
                scoresPanel.add(DisGreenp2);

                scoresPanel.add(blue4);
                scoresPanel.add(blue3);
                scoresPanel.add(blue2);
                scoresPanel.add(blue1);

                System.out.println("###########################"+coins[8].getOwner());

                JButton goToGameButton1 = new JButton("خرید کارت");
                goToGameButton1.setPreferredSize(new Dimension(200, 100));
                goToGameButton1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        scoreFrame.setVisible(false);
                      //  showGamePageByCard(Player1,Player2,CardsT1,CardsT2,CardsT3,coins,labels);
                        ByCard byCard = new ByCard();
                        byCard.ShowByCard(Player1,Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins,currentPlayer,labels,scoreFrame,frame2,frame1);
                    }
                });

                JButton goToGameButton2 = new JButton("دریافت سکه");
                goToGameButton2.setPreferredSize(new Dimension(200, 100));
                goToGameButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        scoreFrame.setVisible(false);
                        showGamePageByCoin(Player1,Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins,labels);
                    }
                });

                for (int i = 0, j = 20; i < 4; i++, j += 22) {
                    if (coins[i].getOwner() == 1) {
                        ImageIcon icon = new ImageIcon("images/blackCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 50, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }
                for (int i = 0, j = 750; i < 4; i++, j += 22) {
                    if (coins[i].getOwner() == 2) {
                        ImageIcon icon = new ImageIcon("images/blackCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 50, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }

                for (int i = 4, j = 150; i < 8; i++, j += 22) {
                    if (coins[i].getOwner() == 1) {
                        ImageIcon icon = new ImageIcon("images/whiteCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 50, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }
                for (int i = 4, j = 880; i < 8; i++, j += 22) {
                    if (coins[i].getOwner() == 2) {
                        ImageIcon icon = new ImageIcon("images/whiteCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 50, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }

                for (int i = 8, j = 280; i < 12; i++, j += 22) {
                    if (coins[i].getOwner() == 1) {
                        ImageIcon icon = new ImageIcon("images/blueCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 50, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }
                for (int i = 8, j =1010; i < 12; i++, j += 22) {
                    if (coins[i].getOwner() == 2) {
                        ImageIcon icon = new ImageIcon("images/blueCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 50, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }

                for (int i = 12, j = 410; i < 16; i++, j += 22) {
                    if (coins[i].getOwner() == 1) {
                        ImageIcon icon = new ImageIcon("images/redCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 50, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }
                for (int i = 12, j = 1140; i < 16; i++, j += 22) {
                    if (coins[i].getOwner() == 2) {
                        ImageIcon icon = new ImageIcon("images/redCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 50, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }

                for (int i = 16, j = 540; i < 20; i++, j += 22) {
                    if (coins[i].getOwner() == 1) {
                        ImageIcon icon = new ImageIcon("images/greenCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 50, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }
                for (int i = 16, j = 1270; i < 20; i++, j += 22) {
                    if (coins[i].getOwner() == 2) {
                        ImageIcon icon = new ImageIcon("images/greenCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 50, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }

                // اضافه کردن لیبل امتیاز بازیکن ۱ به بالا چپ صفحه
                player1ScoreLabel.setBounds(50, 50, 200, 100);
                scoreFrame.add(player1ScoreLabel);

                // اضافه کردن لیبل امتیاز بازیکن ۲ به بالا راست صفحه
                player2ScoreLabel.setBounds(800, 50, 200, 100);
                scoreFrame.add(player2ScoreLabel);

                // تنظیم لایه‌بندی برای قرار دادن کلیدهای شروع بازی در پایین صفحه
                JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                buttonsPanel.add(goToGameButton1);
                buttonsPanel.add(goToGameButton2);
                scoreFrame.setLayout(new BorderLayout());
                scoreFrame.add(scoresPanel, BorderLayout.CENTER);
                scoreFrame.add(buttonsPanel, BorderLayout.SOUTH);

                scoreFrame.setVisible(true);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            }
        }

    private static void showGamePageByCoin(Player Player1,Player Player2,Card[] CardsT1,Card[] CardsT2,Card[] CardsT3,Card[] CardsT4,Coin[] coins,JLabel[] labels) {
        frame2 = new JFrame("صفحه بازی");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);

        JLabel[] playerScoreLabels = {
                new JLabel(Player1.getUsername() + ": " + Player1.getPoint()),
                new JLabel(Player2.getUsername() + ": " + Player2.getPoint())
        };

        JButton button1 = new JButton("دکمه ۱");
        JButton button2 = new JButton("دکمه ۲");
        JButton button3 = new JButton("دکمه ۳");
        JButton returnButton = new JButton("بازگشت به صفحه اصلی");
        JButton changeTurnButton = new JButton("تغییر نوبت");
        JButton goToScorePageButton = new JButton("نمایش امتیازها");

        labels = new JLabel[30];


        int[] size = new int[2]; // اندازه تصویر (عرض و ارتفاع)

         int[]typeGiving =new int[3];
         typeGiving[0]=0;
        typeGiving[1]=0;
        typeGiving[2]=0;

        //black Coins
        JButton BlackButton = new JButton();
        BlackButton.setBounds(530, 140, 55, 55);
        BlackButton.setActionCommand("blackCoin");
        BlackButton.setOpaque(false); // افزودن ویژگی شفافیت به دکمه
        BlackButton.setContentAreaFilled(false); // حذف پر کردن محتوا
        BlackButton.setMargin(new Insets(0, 0, 0, 0)); // حذف همه حاشیه‌ها
        BlackButton.setIcon(new ImageIcon("images/click.png")); // تنظیم تصویر برای دکمه گرد

        frame2.add(BlackButton);
        JLabel[] finalLabels1 = labels;
        BlackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("blackCoin")) {
                    if(currentPlayer==0) {
                        if ((typeGiving[0] == 1 && typeGiving[1]!=0 && typeGiving[1]!=1)||(typeGiving[1]==1)) {
                            JOptionPane.showMessageDialog(null, "شما نمیتوانید چنین انتخابی داشته باشید");
                        } else if(coins[0].getOwner() ==3||coins[1].getOwner() ==3||coins[2].getOwner() ==3||coins[3].getOwner() ==3){

                            if(typeGiving[0] ==0)
                                typeGiving[0]=1;
                            else
                            if(typeGiving[0] !=0) {
                                if(typeGiving[1] ==0)
                                    typeGiving[1]=1;
                                else
                                if(typeGiving[1] !=0) {
                                    typeGiving[2] = 1;
                                }

                            }
                            Player1.setnBlackCo((Player1.getnBlackCo() + 1));
                            for (int i = 0, j = 0; i < 4 && j == 0; i++) {
                                if ( coins[i].getOwner() == 3) {
                                    coins[i].setOwner(1);
                                    j++;
                                }
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "سکه سیاه وجود ندارد");
                        }
                    }
                    else {
                        if ((typeGiving[0] == 1 && typeGiving[1]!=0 && typeGiving[1]!=1)||(typeGiving[1]==1)) {
                            JOptionPane.showMessageDialog(null, "شما نمیتوانید چنین انتخابی داشته باشید");
                        } else if(coins[0].getOwner() ==3||coins[1].getOwner() ==3||coins[2].getOwner() ==3||coins[3].getOwner() ==3){

                            if(typeGiving[0] ==0)
                                typeGiving[0]=1;
                            else
                            if(typeGiving[0] !=0) {
                                if(typeGiving[1] ==0)
                                    typeGiving[1]=1;
                                else
                                if(typeGiving[1] !=0) {
                                    typeGiving[2] = 1;
                                }

                            }
                            Player2.setnBlackCo(Player2.getnBlackCo() + 1);
                            for (int i = 0, j = 0; i < 4 && j == 0; i++) {
                                if ( coins[i].getOwner() == 3) {
                                    coins[i].setOwner(2);
                                    j++;
                                }
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "سکه سیاه وجود ندارد");
                        }
                    }
                    if(typeGiving[0]==typeGiving[1]) {

                        typeGiving[0]=0;
                        typeGiving[1]=0;
                        typeGiving[2]=0;
                        changeTurn();
                        frame2.setVisible(false);
                        scoreFrame.dispose();

                        ScorePage.showScore(Player1, Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins, finalLabels1);
                    }
                    if(((typeGiving[0]!= 0) && (typeGiving[1] != 0) && (typeGiving[2] != 0)) && (typeGiving[0] != typeGiving[2])) {
                        changeTurn();
                        frame2.setVisible(false);
                        scoreFrame.dispose();

                        ScorePage.showScore(Player1, Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins, finalLabels1);
                    }
                }
            }
        });
        try {
            File file = new File("images/blackCoin.png");
            BufferedImage image = ImageIO.read(file); // خواندن تصویر از فایل
            if (image != null) {
                size[0] = image.getWidth(); // عرض تصویر
                size[1] = image.getHeight(); // ارتفاع تصویر
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0, j = 270; i < 4; i++, j += 42) {
            if (coins[i].getOwner() == 3) {
                ImageIcon icon = new ImageIcon("images/blackCoin.png");
                labels[i] = new JLabel(icon);
                labels[i].setBounds(j, 200, size[0], size[1]); // تنظیم موقعیت و اندازه به صورت دقیق
                frame2.add(labels[i]); // اضافه کردن JLabel به JPanel
            }
        }
        //White Coins
        JButton WhiteButton = new JButton();
        WhiteButton.setBounds(1280, 140, 55, 55);
        WhiteButton.setActionCommand("whiteCoin");
        WhiteButton.setOpaque(false); // افزودن ویژگی شفافیت به دکمه
        WhiteButton.setContentAreaFilled(false); // حذف پر کردن محتوا
        WhiteButton.setMargin(new Insets(0, 0, 0, 0)); // حذف همه حاشیه‌ها
        WhiteButton.setIcon(new ImageIcon("images/click.png")); // تنظیم تصویر برای دکمه گرد

        frame2.add(WhiteButton);
        JLabel[] finalLabels2 = labels;
        WhiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("whiteCoin")) {

                    if(currentPlayer==0) {
                        if ((typeGiving[0] == 2 && typeGiving[1]!=0 && typeGiving[1]!=2)||(typeGiving[1]==2)) {
                            JOptionPane.showMessageDialog(null, "شما نمیتوانید چنین انتخابی داشته باشید");
                        } else if(coins[4].getOwner() ==3 ||coins[5].getOwner() ==3||coins[6].getOwner() ==3||coins[7].getOwner() ==3){
                            if(typeGiving[0] ==0)
                                typeGiving[0]=2;
                            else
                            if(typeGiving[0] !=0) {
                                if(typeGiving[1] ==0)
                                    typeGiving[1]=2;
                                else
                                if(typeGiving[1] !=0) {
                                    typeGiving[2] = 2;
                                }

                            }
                        Player1.setnWhaiteCo((Player1.getnWhaiteCo() + 1));
                        for (int i = 4, j = 0; i < 8 && j == 0; i++) {
                            if ( coins[i].getOwner() == 3) {
                                coins[i].setOwner(1);
                                j++;
                            }
                        }
                    }
                        else{
                            JOptionPane.showMessageDialog(null, "سکه سفید وجود ندارد");
                        }
                    }
                    else {
                        if ((typeGiving[0] == 2 && typeGiving[1]!=0 && typeGiving[1]!=2)||(typeGiving[1]==2)) {
                            JOptionPane.showMessageDialog(null, "شما نمیتوانید چنین انتخابی داشته باشید");
                        } else if(coins[4].getOwner() ==3||coins[5].getOwner() ==3||coins[6].getOwner() ==3||coins[7].getOwner() ==3){
                            if(typeGiving[0] ==0)
                                typeGiving[0]=2;
                            else
                            if(typeGiving[0] !=0) {
                                if(typeGiving[1] ==0)
                                    typeGiving[1]=2;
                                else
                                if(typeGiving[1] !=0) {
                                    typeGiving[2] = 2;
                                }

                            }
                        Player2.setnWhaiteCo(Player2.getnWhaiteCo() + 1);
                        for (int i = 4, j = 0; i < 8 && j == 0; i++) {
                            if ( coins[i].getOwner() == 3) {
                                coins[i].setOwner(2);
                                j++;
                            }
                        }
                    }
                        else{
                            JOptionPane.showMessageDialog(null, "سکه سفید وجود ندارد");
                        }
                    }
                    if(typeGiving[0]==typeGiving[1]) {
                        typeGiving[0]=0;
                        typeGiving[1]=0;
                        typeGiving[2]=0;
                        changeTurn();
                        frame2.setVisible(false);
                        scoreFrame.dispose();

                        ScorePage.showScore(Player1, Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins, finalLabels2);
                    }
                    if((typeGiving[0]!= 0 && typeGiving[1] != 0 && typeGiving[2] != 0) && (typeGiving[0] !=  typeGiving[2] )) {
                        changeTurn();
                        frame2.setVisible(false);
                        scoreFrame.dispose();
                        ScorePage.showScore(Player1, Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins, finalLabels2);
                    }
                }
            }
        });
        try {
            File file = new File("images/whiteCoin.png");
            BufferedImage image = ImageIO.read(file); // خواندن تصویر از فایل
            if (image != null) {
                size[0] = image.getWidth(); // عرض تصویر
                size[1] = image.getHeight(); // ارتفاع تصویر
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 4, j = 1020; i < 8; i++, j += 42) {
            if (coins[i].getOwner() == 3) {
                ImageIcon icon = new ImageIcon("images/whiteCoin.png");
                labels[i] = new JLabel(icon);
                labels[i].setBounds(j, 205, size[0], size[1]); // تنظیم موقعیت و اندازه به صورت دقیق
                frame2.add(labels[i]); // اضافه کردن JLabel به JPanel
            }
        }
        //blue Coins
        JButton BlueButton = new JButton();
        BlueButton.setBounds(530, 410, 55, 55);
        BlueButton.setActionCommand("blueCoin");
        BlueButton.setOpaque(false); // افزودن ویژگی شفافیت به دکمه
        BlueButton.setContentAreaFilled(false); // حذف پر کردن محتوا
        //  roundButton.setBorderPainted(false); // حذف مرز دکمه
        BlueButton.setMargin(new Insets(0, 0, 0, 0)); // حذف همه حاشیه‌ها
        BlueButton.setIcon(new ImageIcon("images/click.png")); // تنظیم تصویر برای دکمه گرد

        frame2.add(BlueButton);
        JLabel[] finalLabels3 = labels;
        BlueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("blueCoin")) {

                    if(currentPlayer==0) {
                        if ((typeGiving[0] == 3 && typeGiving[1]!=0 && typeGiving[1]!=3)||(typeGiving[1]==3)) {
                            JOptionPane.showMessageDialog(null, "شما نمیتوانید چنین انتخابی داشته باشید");
                        } else if(coins[8].getOwner() ==3||coins[9].getOwner() ==3||coins[10].getOwner() ==3||coins[11].getOwner() ==3){
                            if(typeGiving[0] ==0)
                                typeGiving[0]=3;
                            else
                            if(typeGiving[0] !=0) {
                                if(typeGiving[1] ==0)
                                    typeGiving[1]=3;
                                else
                                if(typeGiving[1] !=0) {
                                    typeGiving[2] = 3;
                                }

                            }
                        Player1.setNblueCo((Player1.getNblueCo() + 1));
                        for (int i = 8, j = 0; i < 12 && j == 0; i++) {
                            if (coins[i].getOwner() == 3) {
                                coins[i].setOwner(1);
                                System.out.println(" : @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+i);
                                System.out.println(" : @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+coins[i].getOwner());
                                j++;
                            }
                        }
                    }
                        else{
                            JOptionPane.showMessageDialog(null, "سکه آبی وجود ندارد");
                        }
                    }
                    else {
                        if ((typeGiving[0] == 3 && typeGiving[1]!=0 && typeGiving[1]!=3)||(typeGiving[1]==3)) {
                            JOptionPane.showMessageDialog(null, "شما نمیتوانید چنین انتخابی داشته باشید");
                        } else  if(coins[8].getOwner() ==3||coins[9].getOwner() ==3||coins[10].getOwner() ==3||coins[11].getOwner() ==3){
                            if(typeGiving[0] ==0)
                                typeGiving[0]=3;
                            else
                            if(typeGiving[0] !=0) {
                                if(typeGiving[1] ==0)
                                    typeGiving[1]=3;
                                else
                                if(typeGiving[1] !=0) {
                                    typeGiving[2] = 3;
                                }

                            }
                            Player2.setNblueCo(Player2.getNblueCo() + 1);
                            for (int i = 8, j = 0; i < 12 && j == 0; i++) {
                                if ( coins[i].getOwner() == 3) {
                                    coins[i].setOwner(2);
                                    j++;
                                }
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "سکه آبی وجود ندارد");
                        }
                    }
                    if(typeGiving[0]==typeGiving[1]) {
                        typeGiving[0]=0;
                        typeGiving[1]=0;
                        typeGiving[2]=0;
                        changeTurn();
                        frame2.setVisible(false);
                        scoreFrame.dispose();

                        ScorePage.showScore(Player1, Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins, finalLabels3);
                    }
                    if((typeGiving[0]!= 0 && typeGiving[1] != 0 && typeGiving[2] != 0) && (typeGiving[0] !=  typeGiving[2] )) {
                        changeTurn();
                        frame2.setVisible(false);
                        scoreFrame.dispose();

                        ScorePage.showScore(Player1, Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins, finalLabels3);
                    }
                }
            }
        });
        try {
            File file = new File("images/blueCoin.png");
            BufferedImage image = ImageIO.read(file); // خواندن تصویر از فایل
            if (image != null) {
                size[0] = image.getWidth(); // عرض تصویر
                size[1] = image.getHeight(); // ارتفاع تصویر
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 8, j = 270; i < 12; i++, j += 42) {
            if (coins[i].getOwner() == 3) {
                ImageIcon icon = new ImageIcon("images/blueCoin.png");
                labels[i] = new JLabel(icon);
                labels[i].setBounds(j, 475, size[0], size[1]); // تنظیم موقعیت و اندازه به صورت دقیق
                frame2.add(labels[i]); // اضافه کردن JLabel به JPanel
            }
        }
        //red Coins
        JButton RedButton = new JButton();
        RedButton.setBounds(1280, 410, 55, 55);
        RedButton.setActionCommand("redCoin");
        RedButton.setOpaque(false); // افزودن ویژگی شفافیت به دکمه
        RedButton.setContentAreaFilled(false); // حذف پر کردن محتوا
        //  roundButton.setBorderPainted(false); // حذف مرز دکمه
        RedButton.setMargin(new Insets(0, 0, 0, 0)); // حذف همه حاشیه‌ها
        RedButton.setIcon(new ImageIcon("images/click.png")); // تنظیم تصویر برای دکمه گرد

        frame2.add(RedButton);
        JLabel[] finalLabels4 = labels;
        RedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getActionCommand().equals("redCoin")) {

                    if(currentPlayer==0){
                        if ((typeGiving[0] == 4 && typeGiving[1]!=0 && typeGiving[1]!=4)||(typeGiving[1]==4)) {
                            JOptionPane.showMessageDialog(null, "شما نمیتوانید چنین انتخابی داشته باشید");
                        } else if(coins[12].getOwner() ==3||coins[14].getOwner() ==3||coins[13].getOwner() ==3||coins[15].getOwner() ==3){
                            if(typeGiving[0] ==0)
                                typeGiving[0]=4;
                            else
                            if(typeGiving[0] !=0) {
                                if(typeGiving[1] ==0)
                                    typeGiving[1]=4;
                                else
                                if(typeGiving[1] !=0) {
                                    typeGiving[2] = 4;
                                }

                            }
                            Player1.setnRedCo((Player1.getnRedCo() + 1));
                            for (int i = 12, j = 0; i < 16 && j == 0; i++) {
                                if ( coins[i].getOwner() == 3) {
                                    coins[i].setOwner(1);
                                    j++;
                                }
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "سکه قرمز وجود ندارد");
                        }
                    }
                    else {
                        if ((typeGiving[0] == 4 && typeGiving[1] != 0 && typeGiving[1] != 4)||(typeGiving[1]==4)) {
                            JOptionPane.showMessageDialog(null, "شما نمیتوانید چنین انتخابی داشته باشید");
                        } else if(coins[12].getOwner() ==3||coins[14].getOwner() ==3||coins[13].getOwner() ==3||coins[15].getOwner() ==3){
                            if(typeGiving[0] ==0)
                                typeGiving[0]=4;
                            else
                            if(typeGiving[0] !=0) {
                                if(typeGiving[1] ==0)
                                    typeGiving[1]=4;
                                else
                                if(typeGiving[1] !=0) {
                                    typeGiving[2] = 4;
                                }

                            }
                        Player2.setnRedCo(Player2.getnRedCo() + 1);
                        for (int i = 12, j = 0; i < 16 && j == 0; i++) {
                            if ( coins[i].getOwner() == 3) {
                                coins[i].setOwner(2);
                                j++;
                            }
                        }
                    }
                        else{
                            JOptionPane.showMessageDialog(null, "سکه قرمز وجود ندارد");
                        }
                    }

                    if(typeGiving[0]==typeGiving[1]) {
                        typeGiving[0]=0;
                        typeGiving[1]=0;
                        typeGiving[2]=0;
                        changeTurn();
                        frame2.setVisible(false);
                        scoreFrame.dispose();

                        ScorePage.showScore(Player1, Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins, finalLabels4);
                    }
                    if((typeGiving[0]!= 0 && typeGiving[1] != 0 && typeGiving[2] != 0) && (typeGiving[0] !=  typeGiving[2] )) {
                        changeTurn();
                        frame2.setVisible(false);
                        scoreFrame.dispose();

                        ScorePage.showScore(Player1, Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins, finalLabels4);
                    }               }
            }
        });
        try {
            File file = new File("images/redCoin.png");
            BufferedImage image = ImageIO.read(file); // خواندن تصویر از فایل
            if (image != null) {
                size[0] = image.getWidth(); // عرض تصویر
                size[1] = image.getHeight(); // ارتفاع تصویر
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 12, j = 1020; i < 16; i++, j += 42) {
            if (coins[i].getOwner() == 3) {
                ImageIcon icon = new ImageIcon("images/redCoin.png");
                labels[i] = new JLabel(icon);
                labels[i].setBounds(j, 475, size[0], size[1]); // تنظیم موقعیت و اندازه به صورت دقیق
                frame2.add(labels[i]); // اضافه کردن JLabel به JPanel
            }
        }
        //green Coins
        JButton GreenButton = new JButton();
        GreenButton.setBounds(900, 280, 55, 55);
        GreenButton.setActionCommand("greenCoin");
        GreenButton.setOpaque(false); // افزودن ویژگی شفافیت به دکمه
        GreenButton.setContentAreaFilled(false); // حذف پر کردن محتوا
        //  roundButton.setBorderPainted(false); // حذف مرز دکمه
        GreenButton.setMargin(new Insets(0, 0, 0, 0)); // حذف همه حاشیه‌ها
        GreenButton.setIcon(new ImageIcon("images/click.png")); // تنظیم تصویر برای دکمه گرد

        frame2.add(GreenButton);
        JLabel[] finalLabels = labels;
        GreenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("greenCoin")) {

                    if(currentPlayer==0){
                        if ((typeGiving[0] == 5 && typeGiving[1]!=5 && typeGiving[1]!=0)||(typeGiving[1]==5)) {
                            JOptionPane.showMessageDialog(null, "شما نمیتوانید چنین انتخابی داشته باشید");
                        } else  if(coins[16].getOwner() ==3||coins[17].getOwner() ==3||coins[18].getOwner() ==3||coins[19].getOwner() ==3){
                            if(typeGiving[0] ==0)
                                typeGiving[0]=5;
                            else
                            if(typeGiving[0] !=0) {
                                if(typeGiving[1] ==0)
                                    typeGiving[1]=5;
                                else
                                if(typeGiving[1] !=0) {
                                    typeGiving[2] = 5;
                                }

                            }
                            Player1.setnGreenCo(Player1.getnGreenCo() + 1);
                            for (int i = 16, j = 0; i < 20 && j == 0; i++) {
                                if ( coins[i].getOwner() == 3) {
                                    coins[i].setOwner(1);
                                    j++;

                                }
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "سکه سبز وجود ندارد");
                        }
                    }
                    else {
                        if ((typeGiving[0] == 5 && typeGiving[1]!=0  && typeGiving[1]!=5)||(typeGiving[1]==5)) {
                            JOptionPane.showMessageDialog(null, "شما نمیتوانید چنین انتخابی داشته باشید");
                        } else if(coins[16].getOwner() ==3||coins[17].getOwner() ==3||coins[18].getOwner() ==3||coins[19].getOwner() ==3){
                            if(typeGiving[0] ==0)
                                typeGiving[0]=5;
                            else
                            if(typeGiving[0] !=0) {
                                if(typeGiving[1] ==0)
                                    typeGiving[1]=5;
                                else
                                if(typeGiving[1] !=0) {
                                    typeGiving[2] = 5;
                                }

                            }
                            Player2.setnGreenCo(Player2.getnGreenCo() + 1);
                            for (int i = 16, j = 0; i < 20 && j == 0; i++) {
                                if ( coins[i].getOwner() == 3) {//coins[i].getShow() == true &&
                                    coins[i].setOwner(2);
                                    j++;
                                }
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "سکه سبز وجود ندارد");
                        }
                    }
                    if(typeGiving[0]==typeGiving[1]) {
                        typeGiving[0]=0;
                        typeGiving[1]=0;
                        typeGiving[2]=0;
                        changeTurn();
                        frame2.setVisible(false);
                        scoreFrame.dispose();

                        ScorePage.showScore(Player1, Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins, finalLabels);
                    }
                    if((typeGiving[0]!= 0 && typeGiving[1] != 0 && typeGiving[2] != 0) && (typeGiving[0] !=  typeGiving[2] )) {
                        changeTurn();
                        frame2.setVisible(false);
                        scoreFrame.dispose();

                        ScorePage.showScore(Player1, Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins, finalLabels);
                    }
                }
            }
        });
        try {
            File file = new File("images/greenCoin.png");
            BufferedImage image = ImageIO.read(file); // خواندن تصویر از فایل
            if (image != null) {
                size[0] = image.getWidth(); // عرض تصویر
                size[1] = image.getHeight(); // ارتفاع تصویر
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 16, j = 645; i < 20; i++, j += 42) {
            if (coins[i].getOwner() == 3) {
                ImageIcon icon = new ImageIcon("images/greenCoin.png");
                labels[i] = new JLabel(icon);
                labels[i].setBounds(j, 340, size[0], size[1]); // تنظیم موقعیت و اندازه به صورت دقیق
                frame2.add(labels[i]); // اضافه کردن JLabel به JPanel
            }
        }
        //Gold Coins
        try {
            File file = new File("images/goldCoin.png");
            BufferedImage image = ImageIO.read(file); // خواندن تصویر از فایل
            if (image != null) {
                size[0] = image.getWidth(); // عرض تصویر
                size[1] = image.getHeight(); // ارتفاع تصویر
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 20, j = 590; i < 25; i++, j += 70) {
            if (coins[i].getOwner() == 3) {
                ImageIcon icon = new ImageIcon("images/goldCoin.png");
                labels[i] = new JLabel(icon);
                labels[i].setBounds(j, 50, size[0], size[1]); // تنظیم موقعیت و اندازه به صورت دقیق
                frame2.add(labels[i]); // اضافه کردن JLabel به JPanel
            }
        }

        try {
            File file = new File("images/slotMachine.png");
            BufferedImage image = ImageIO.read(file); // خواندن تصویر از فایل
            if (image != null) {
                size[0] = image.getWidth(); // عرض تصویر
                size[1] = image.getHeight(); // ارتفاع تصویر
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        do {
            ImageIcon icon = new ImageIcon("images/slotMachine.png");
            labels[25] = new JLabel(icon);
            labels[25].setBounds(225, 30, size[0], size[1]); // تنظیم موقعیت و اندازه به صورت دقیق
            frame2.add(labels[25]); // اضافه کردن JLabel به JPanel

            labels[26] = new JLabel(icon);
            labels[26].setBounds(975, 30, size[0], size[1]); // تنظیم موقعیت و اندازه به صورت دقیق
            frame2.add(labels[26]); // اضافه کردن JLabel به JPanel

            labels[27] = new JLabel(icon);
            labels[27].setBounds(225, 300, size[0], size[1]); // تنظیم موقعیت و اندازه به صورت دقیق
            frame2.add(labels[27]); // اضافه کردن JLabel به JPanel

            labels[28] = new JLabel(icon);
            labels[28].setBounds(975, 300, size[0], size[1]); // تنظیم موقعیت و اندازه به صورت دقیق
            frame2.add(labels[28]); // اضافه کردن JLabel به JPanel

            labels[29] = new JLabel(icon);
            labels[29].setBounds(600, 165, size[0], size[1]); // تنظیم موقعیت و اندازه به صورت دقیق
            frame2.add(labels[29]); // اضافه کردن JLabel به JPanel
        } while (false);


        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton sourceButton = (JButton) e.getSource();

                if (sourceButton == returnButton) {
                    frame2.setVisible(false);
                    frame1.setVisible(true);
                } else if (sourceButton == changeTurnButton) {
                    if(currentPlayer==0)
                    currentPlayer = 1;
                    else currentPlayer=0;
                    System.out.println("@@@@@@"+currentPlayer);
                    frame2.setVisible(false);
                    scoreFrame.dispose();
                    ScorePage.showScore(Player1, Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins, finalLabels);
                } else if (sourceButton == goToScorePageButton) {
                    frame2.setVisible(false);
                    scoreFrame.setVisible(true);
                } else {
                    int currentButtonIndex = Integer.parseInt(sourceButton.getText().split(" ")[1]) - 1;
                    }
                    // بروزرسانی نمایش امتیاز هر بازیکن
                    playerScoreLabels[0].setText(Player1.getUsername() + ": " + Player1.getPoint());
                    playerScoreLabels[1].setText(Player2.getUsername() + ": " + Player2.getPoint());
                }
            };

        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        returnButton.addActionListener(actionListener);
        changeTurnButton.addActionListener(actionListener);
        goToScorePageButton.addActionListener(actionListener);

        button1.setBounds(0,745,200,50);
        button2.setBounds(200,745,200,50);
        button3.setBounds(400,745,200,50);
        returnButton.setBounds(600,745,200,50);
        changeTurnButton.setBounds(800,745,200,50);
        goToScorePageButton.setBounds(1000,745,200,50);

     //   frame2.setLayout(new FlowLayout());
        frame2.getContentPane().add(button1);
        frame2.getContentPane().add(button2);
        frame2.getContentPane().add(button3);
        frame2.getContentPane().add(returnButton);
        frame2.getContentPane().add(changeTurnButton);
        frame2.getContentPane().add(goToScorePageButton);

        // اضافه کردن label ها به frame
       for (JLabel label : playerScoreLabels) {
            frame2.getContentPane().add(label);
        }
        frame2.setVisible(true);
    }

    public static void changeTurn(){
        if(currentPlayer==0)
            currentPlayer=1;
        else currentPlayer=0;
    }
}
