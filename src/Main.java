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
    private static JFrame winerFrame;
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
       JTextField PlayerUername1txt = new JTextField();
        PlayerUername1txt.setHorizontalAlignment(JTextField.CENTER);
        PlayerUername1txt.getDocument().putProperty("owner", "width");
       JTextField PlayerUername2txt = new JTextField();
        PlayerUername2txt.setHorizontalAlignment(JTextField.CENTER);
        PlayerUername2txt.getDocument().putProperty("Player username 1", "Player username 2");

        centerPanel.add(PlayerUername1);
        centerPanel.add(PlayerUername2);
        centerPanel.add(PlayerUername1txt);
        centerPanel.add(PlayerUername2txt);

        centerPanel.setBorder(new EmptyBorder(300, 100, 100, 100));
        frame1.getContentPane().add(centerPanel, BorderLayout.CENTER);

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
        labels = new JLabel[25];

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username1 = PlayerUername1txt.getText(); // دریافت مقدار وارد شده در فیلد یوزرنیم اول
                String username2 = PlayerUername2txt.getText(); // دریافت مقدار وارد شده در فیلد یوزرنیم دوم

                Player Player1 = new Player(username1, null); // ایجاد یک شیء از کلاس Player با استفاده از مقدار یوزرنیم اول
                Player Player2 = new Player(username2, null); // ایجاد یک شیء از کلاس Player با استفاده از مقدار یوزرنیم دوم


                frame1.setVisible(false);
                ScorePage.showScore(Player1, Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins,labels);
            }
        });


        //نمایش بک گراند

        frame1.getContentPane().add(startButton, BorderLayout.SOUTH);
        frame1.setVisible(true);

    }

        static class ScorePage {
            public static void showScore(Player Player1, Player Player2, Card[] CardsT1, Card[] CardsT2, Card[] CardsT3, Card[] CardsT4, Coin[] coins, JLabel[] labels) {

               ByCard metodBuyCards = new ByCard();

                scoreFrame = new JFrame("امتیازها");
                scoreFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                scoreFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                JLabel player1DisBlackCo = new JLabel("×"+Player1.getnDIsBlackCO());
                player1DisBlackCo.setFont(new Font("Arial", Font.BOLD, 24));
                player1DisBlackCo.setForeground(Color.BLACK);
                JLabel player2DisBlackCo = new JLabel("×"+Player2.getnDIsBlackCO());
                player2DisBlackCo.setFont(new Font("Arial", Font.BOLD, 24));
                player2DisBlackCo.setForeground(Color.BLACK);

                JLabel player2DisWhiteCo = new JLabel("×"+Player2.getnDIsWhiteCO());
                player2DisWhiteCo.setFont(new Font("Arial", Font.BOLD, 24));
                player2DisWhiteCo.setForeground(Color.WHITE);
                JLabel player1DisWhiteCo = new JLabel("×"+Player1.getnDIsWhiteCO());
                player1DisWhiteCo.setFont(new Font("Arial", Font.BOLD, 24));
                player1DisWhiteCo.setForeground(Color.WHITE);

                JLabel player2DisBlueCo = new JLabel("×"+Player2.getnDIsBlueCO());
                player2DisBlueCo.setFont(new Font("Arial", Font.BOLD, 24));
                player2DisBlueCo.setForeground(Color.BLUE);
                JLabel player1DisBlueCo = new JLabel("×"+Player1.getnDIsBlueCO());
                player1DisBlueCo.setFont(new Font("Arial", Font.BOLD, 24));
                player1DisBlueCo.setForeground(Color.BLUE);

                JLabel player2DisRedCo = new JLabel("×"+Player2.getnDIsRedCO());
                player2DisRedCo.setFont(new Font("Arial", Font.BOLD, 24));
                player2DisRedCo.setForeground(Color.RED);
                JLabel player1DisRedCo = new JLabel("×"+Player1.getnDIsRedCO());
                player1DisRedCo.setFont(new Font("Arial", Font.BOLD, 24));
                player1DisRedCo.setForeground(Color.RED);

                JLabel player2DisGreenCo = new JLabel("×"+Player2.getnDIsGreenCO());
                player2DisGreenCo.setFont(new Font("Arial", Font.BOLD, 24));
                player2DisGreenCo.setForeground(Color.GREEN);
                JLabel player1DisGreenCo = new JLabel("×"+Player1.getnDIsGreenCO());
                player1DisGreenCo.setFont(new Font("Arial", Font.BOLD, 24));
                player1DisGreenCo.setForeground(Color.GREEN);

                JLabel player2GoldCo = new JLabel("×"+Player2.getnGoldCo());
                player2GoldCo.setFont(new Font("Arial", Font.BOLD, 24));
                player2GoldCo.setForeground(Color.ORANGE);
                JLabel player1GoldCo = new JLabel("×"+Player1.getnGoldCo());
                player1GoldCo.setFont(new Font("Arial", Font.BOLD, 24));
                player1GoldCo.setForeground(Color.ORANGE);

                JLabel player1ScoreLabel = new JLabel(Player2.getUsername() + ": " + Player1.getPoint());
                JLabel player2ScoreLabel = new JLabel(Player1.getUsername() + ": " + Player2.getPoint());

                JPanel panelReserveCards = new JPanel();

                Font font = new Font("Arial", Font.BOLD, 24);

                scoreFrame.add(panelReserveCards);


                JButton goToGameButton1 = new JButton("خرید کارت");
                goToGameButton1.setPreferredSize(new Dimension(200, 50));
                goToGameButton1.setBackground(new Color(255,215,0));
                goToGameButton1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        scoreFrame.setVisible(false);
                      //  showGamePageByCard(Player1,Player2,CardsT1,CardsT2,CardsT3,coins,labels);
                        ByCard byCard = new ByCard();
                        byCard.ShowByCard(Player1,Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins,currentPlayer,labels,scoreFrame,frame1);
                    }
                });

                JButton goToGameButton2 = new JButton("دریافت سکه");
                goToGameButton2.setPreferredSize(new Dimension(200, 50));
                goToGameButton2.setBackground(new Color(255,215,0));
                goToGameButton2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        scoreFrame.setVisible(false);
                        showGamePageByCoin(Player1,Player2,CardsT1,CardsT2,CardsT3,CardsT4,coins,labels);
                    }
                });

                for (int i = 0, j = 110; i < 4; i++, j += 22) {
                    if (coins[i].getOwner() == 1) {
                        ImageIcon icon = new ImageIcon("images/blackCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 50, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }
                for (int i = 0, j = 1090; i < 4; i++, j += 22) {
                    if (coins[i].getOwner() == 2) {
                        ImageIcon icon = new ImageIcon("images/blackCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 50, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }

                for (int i = 4, j = 110; i < 8; i++, j += 22) {
                    if (coins[i].getOwner() == 1) {
                        ImageIcon icon = new ImageIcon("images/whiteCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 150, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }
                for (int i = 4, j = 1090; i < 8; i++, j += 22) {
                    if (coins[i].getOwner() == 2) {
                        ImageIcon icon = new ImageIcon("images/whiteCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 150, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }

                for (int i = 8, j = 110; i < 12; i++, j += 22) {
                    if (coins[i].getOwner() == 1) {
                        ImageIcon icon = new ImageIcon("images/blueCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 250, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }
                for (int i = 8, j =1090; i < 12; i++, j += 22) {
                    if (coins[i].getOwner() == 2) {
                        ImageIcon icon = new ImageIcon("images/blueCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 250, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }

                for (int i = 12, j = 110; i < 16; i++, j += 22) {
                    if (coins[i].getOwner() == 1) {
                        ImageIcon icon = new ImageIcon("images/redCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 350, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }
                for (int i = 12, j = 1090; i < 16; i++, j += 22) {
                    if (coins[i].getOwner() == 2) {
                        ImageIcon icon = new ImageIcon("images/redCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 350, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }

                for (int i = 16, j = 110; i < 20; i++, j += 22) {
                    if (coins[i].getOwner() == 1) {
                        ImageIcon icon = new ImageIcon("images/greenCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 450, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }
                for (int i = 16, j = 1090; i < 20; i++, j += 22) {
                    if (coins[i].getOwner() == 2) {
                        ImageIcon icon = new ImageIcon("images/greenCoin.png");
                        labels[i] = new JLabel(icon);
                        labels[i].setBounds(j, 450, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                        scoreFrame.add(labels[i]);
                    }
                }

                //نمایش تعداد سکه های تخفیف
                do {
                    // اضافه کردن لیبل امتیاز بازیکن ۱ به بالا چپ صفحه
                    player1ScoreLabel.setBounds(50, 20, 200, 100);
                    player1ScoreLabel.setFont(new Font("Arial", Font.BOLD, 24));
                    player1ScoreLabel.setForeground(Color.ORANGE);
                    scoreFrame.add(player1ScoreLabel);

                    // اضافه کردن لیبل امتیاز بازیکن ۲ به بالا راست صفحه
                    player2ScoreLabel.setBounds(1080, 10, 200, 100);
                    player2ScoreLabel.setFont(new Font("Arial", Font.BOLD, 24));
                    player2ScoreLabel.setForeground(Color.ORANGE);
                    scoreFrame.add(player2ScoreLabel);

                    JLabel[] disCoins;
                    disCoins = new JLabel[12];
                    int i = 0;
                    ImageIcon icon = new ImageIcon("images/DISblackCoin.png");
                    disCoins[i] = new JLabel(icon);
                    disCoins[i].setBounds(110, 50, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                    scoreFrame.add(disCoins[i]);
                    player1DisBlackCo.setBounds(95, 80, 50, 50);
                    scoreFrame.add(player1DisBlackCo);
                    i++;

                    icon = new ImageIcon("images/DISwhiteCoin.png");
                    disCoins[i] = new JLabel(icon);
                    disCoins[i].setBounds(110, 150, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                    scoreFrame.add(disCoins[i]);
                    player1DisWhiteCo.setBounds(95, 180, 50, 50);
                    scoreFrame.add(player1DisWhiteCo);
                    i++;
                    icon = new ImageIcon("images/DISblueCoin.png");
                    disCoins[i] = new JLabel(icon);
                    disCoins[i].setBounds(110, 250, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                    scoreFrame.add(disCoins[i]);
                    player1DisBlueCo.setBounds(95, 280, 50, 50);
                    scoreFrame.add(player1DisBlueCo);
                    i++;
                    icon = new ImageIcon("images/DISredCoin.png");
                    disCoins[i] = new JLabel(icon);
                    disCoins[i].setBounds(110, 350, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                    scoreFrame.add(disCoins[i]);
                    player1DisRedCo.setBounds(95, 380, 50, 50);
                    scoreFrame.add(player1DisRedCo);
                    i++;
                    icon = new ImageIcon("images/DISgreenCoin.png");
                    disCoins[i] = new JLabel(icon);
                    disCoins[i].setBounds(110, 450, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                    scoreFrame.add(disCoins[i]);
                    player1DisGreenCo.setBounds(165, 480, 50, 50);
                    scoreFrame.add(player1DisGreenCo);
                    i++;
                     icon = new ImageIcon("images/goldCoin.png");
                    disCoins[i] = new JLabel(icon);
                    disCoins[i].setBounds(110, 530, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                    scoreFrame.add(disCoins[i]);
                    player1GoldCo.setBounds(175, 560, 50, 50);
                    scoreFrame.add(player1GoldCo);
                    i++;




                    icon = new ImageIcon("images/DISblackCoin.png");
                    disCoins[i] = new JLabel(icon);
                    disCoins[i].setBounds(1000, 50, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                    scoreFrame.add(disCoins[i]);
                    player2DisBlackCo.setBounds(1075, 80, 50, 50);
                    scoreFrame.add(player2DisBlackCo);
                    i++;
                    icon = new ImageIcon("images/DISwhiteCoin.png");
                    disCoins[i] = new JLabel(icon);
                    disCoins[i].setBounds(1000, 150, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                    scoreFrame.add(disCoins[i]);
                    player2DisWhiteCo.setBounds(1075, 180, 50, 50);
                    scoreFrame.add(player2DisWhiteCo);
                    i++;
                    icon = new ImageIcon("images/DISblueCoin.png");
                    disCoins[i] = new JLabel(icon);
                    disCoins[i].setBounds(1000, 250, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                    scoreFrame.add(disCoins[i]);
                    player2DisBlueCo.setBounds(1075, 280, 50, 50);
                    scoreFrame.add(player2DisBlueCo);
                    i++;
                    icon = new ImageIcon("images/DISredCoin.png");
                    disCoins[i] = new JLabel(icon);
                    disCoins[i].setBounds(1000, 350, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                    scoreFrame.add(disCoins[i]);
                    player2DisRedCo.setBounds(1075, 380, 50, 50);
                    scoreFrame.add(player2DisRedCo);
                    i++;
                    icon = new ImageIcon("images/DISgreenCoin.png");
                    disCoins[i] = new JLabel(icon);
                    disCoins[i].setBounds(1000, 450, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                    scoreFrame.add(disCoins[i]);
                    player2DisGreenCo.setBounds(1075, 480, 50, 50);
                    scoreFrame.add(player2DisGreenCo);
                    i++;
                    icon = new ImageIcon("images/goldCoin.png");
                    disCoins[i] = new JLabel(icon);
                    disCoins[i].setBounds(1000, 550, 100, 100); // تنظیم موقعیت و اندازه به صورت دقیق
                    scoreFrame.add(disCoins[i]);
                    player2GoldCo.setBounds(1085, 580, 50, 50);
                    scoreFrame.add(player2GoldCo);
                    i++;

                }while(false);



                JButton PurchaseOfReservedCards = new JButton("reserved cards");

                // تنظیم اندازه JButton به 50x50
              //  PurchaseOfReservedCards.setSize(50, 50);

                // قرار دادن JButton در موقعیت دلخواه
                PurchaseOfReservedCards.setBounds(415, 738, 120, 50);

                // اضافه کردن ActionListener به JButton
                PurchaseOfReservedCards.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // ساخت گزینه‌ها با عکس‌های مورد نظر
                        JButton option1Button = null;// = new JButton(new ImageIcon("images/photo_5823325941244477760_y.jpg"));
                        JButton option2Button = null;
                        JButton option3Button = null;

                        if(Player1.getnReservCard()==0){}
                        else if(Player1.getnReservCard()==1){
                            option1Button = new JButton(new ImageIcon(Player1.getMyRservedCards()[0].getPath()));
                            option2Button = new JButton(new ImageIcon("null"));
                            option3Button = new JButton(new ImageIcon("null"));
                        }
                        else if(Player1.getnReservCard()==2){
                            option1Button = new JButton(new ImageIcon(Player1.getMyRservedCards()[0].getPath()));
                            option2Button = new JButton(new ImageIcon(Player1.getMyRservedCards()[1].getPath()));
                            option3Button = new JButton(new ImageIcon("null"));
                        }
                        else if(Player1.getnReservCard()==3){
                            option1Button = new JButton(new ImageIcon(Player1.getMyRservedCards()[0].getPath()));
                            option2Button = new JButton(new ImageIcon(Player1.getMyRservedCards()[1].getPath()));
                            option3Button = new JButton(new ImageIcon(Player1.getMyRservedCards()[2].getPath()));
                        }

                        // ایجاد ActionListener برای هر گزینه
                        JButton finalOption1Button = option1Button;
                        JButton finalOption2Button = option2Button;
                        JButton finalOption3Button = option3Button;

                        ActionListener option1Listener = new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                               boolean buying =  metodBuyCards.Checkbuying(coins,Player1.getMyRservedCards()[0], currentPlayer,Player1,Player2);
                               if(buying==true){
                                   Player1.setnReservCard(Player1.getnReservCard()-1);
                                   finalOption1Button.setVisible(false);
                               }
                               else JOptionPane.showMessageDialog(null, "شما نمیتوانید این کارت را بخرید");
                            }
                        };

                        ActionListener option2Listener = new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                boolean buying =  metodBuyCards.Checkbuying(coins,Player1.getMyRservedCards()[1], currentPlayer,Player1,Player2);
                                if(buying==true){
                                    Player1.setnReservCard(Player1.getnReservCard()-1);
                                    finalOption2Button.setVisible(false);
                                }
                                else JOptionPane.showMessageDialog(null, "شما نمیتوانید این کارت را بخرید");
                            }
                        };

                        ActionListener option3Listener = new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                boolean buying =  metodBuyCards.Checkbuying(coins,Player1.getMyRservedCards()[2], currentPlayer,Player1,Player2);
                                if(buying==true){
                                    Player1.setnReservCard(Player1.getnReservCard()-1);
                                    finalOption3Button.setVisible(false);
                                }
                                else JOptionPane.showMessageDialog(null, "شما نمیتوانید این کارت را بخرید");
                            }
                        };

                        // اضافه کردن ActionListener به هر گزینه
                        option1Button.addActionListener(option1Listener);
                        option2Button.addActionListener(option2Listener);
                        option3Button.addActionListener(option3Listener);

                        // نمایش پیام در JOptionPane با استفاده از دکمه‌های تصویری
                        Object[] options = {option1Button, option2Button, option3Button};
                        JOptionPane.showOptionDialog(scoreFrame,
                                "Choose one of the following options:",
                                "Options",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                options,
                                options[0]);
                    }
                });

                // اضافه کردن JButton به JFrame
                scoreFrame.add(PurchaseOfReservedCards);


                JButton PurchaseOfReservedCardsP2 = new JButton("reserved cards");

                // تنظیم اندازه JButton به 50x50
                //  PurchaseOfReservedCards.setSize(50, 50);

                // قرار دادن JButton در موقعیت دلخواه
                PurchaseOfReservedCardsP2.setBounds(1000, 738, 120, 50);

                // اضافه کردن ActionListener به JButton
                PurchaseOfReservedCardsP2.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // ساخت گزینه‌ها با عکس‌های مورد نظر
                        JButton option1Button = null;// = new JButton(new ImageIcon("images/photo_5823325941244477760_y.jpg"));
                        JButton option2Button = null;
                        JButton option3Button = null;

                        if(Player2.getnReservCard()==0){}
                        else if(Player2.getnReservCard()==1){
                            option1Button = new JButton(new ImageIcon(Player2.getMyRservedCards()[0].getPath()));
                            option2Button = new JButton(new ImageIcon("null"));
                            option3Button = new JButton(new ImageIcon("null"));
                        }
                        else if(Player2.getnReservCard()==2){
                            option1Button = new JButton(new ImageIcon(Player2.getMyRservedCards()[0].getPath()));
                            option2Button = new JButton(new ImageIcon(Player2.getMyRservedCards()[1].getPath()));
                            option3Button = new JButton(new ImageIcon("null"));
                        }
                        else if(Player2.getnReservCard()==3){
                            option1Button = new JButton(new ImageIcon(Player2.getMyRservedCards()[0].getPath()));
                            option2Button = new JButton(new ImageIcon(Player2.getMyRservedCards()[1].getPath()));
                            option3Button = new JButton(new ImageIcon(Player2.getMyRservedCards()[2].getPath()));
                        }

                        // ایجاد ActionListener برای هر گزینه
                        JButton finalOption1Button = option1Button;
                        JButton finalOption2Button = option2Button;
                        JButton finalOption3Button = option3Button;

                        ActionListener option1Listener = new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                boolean buying =  metodBuyCards.Checkbuying(coins,Player2.getMyRservedCards()[0], currentPlayer,Player1,Player2);
                                if(buying==true){
                                    Player2.setnReservCard(Player2.getnReservCard()-1);
                                    finalOption1Button.setVisible(false);
                                }
                                else JOptionPane.showMessageDialog(null, "شما نمیتوانید این کارت را بخرید");
                            }
                        };

                        ActionListener option2Listener = new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                boolean buying =  metodBuyCards.Checkbuying(coins,Player2.getMyRservedCards()[1], currentPlayer,Player1,Player2);
                                if(buying==true){
                                    Player2.setnReservCard(Player2.getnReservCard()-1);
                                    finalOption2Button.setVisible(false);
                                }
                                else JOptionPane.showMessageDialog(null, "شما نمیتوانید این کارت را بخرید");
                            }
                        };

                        ActionListener option3Listener = new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                boolean buying =  metodBuyCards.Checkbuying(coins,Player2.getMyRservedCards()[2], currentPlayer,Player1,Player2);
                                if(buying==true){
                                    Player2.setnReservCard(Player2.getnReservCard()-1);
                                    finalOption3Button.setVisible(false);
                                }
                                else JOptionPane.showMessageDialog(null, "شما نمیتوانید این کارت را بخرید");
                            }
                        };

                        // اضافه کردن ActionListener به هر گزینه
                        option1Button.addActionListener(option1Listener);
                        option2Button.addActionListener(option2Listener);
                        option3Button.addActionListener(option3Listener);

                        // نمایش پیام در JOptionPane با استفاده از دکمه‌های تصویری
                        Object[] options = {option1Button, option2Button, option3Button};
                        JOptionPane.showOptionDialog(scoreFrame,
                                "Choose one of the following options:",
                                "Options",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.INFORMATION_MESSAGE,
                                null,
                                options,
                                options[0]);
                    }
                });

                // اضافه کردن JButton به JFrame
                scoreFrame.add(PurchaseOfReservedCardsP2);



                // تنظیم لایه‌بندی برای قرار دادن کلیدهای شروع بازی در پایین صفحه
                JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
                buttonsPanel.add(goToGameButton1);
                buttonsPanel.add(goToGameButton2);
                scoreFrame.setLayout(new BorderLayout());
                scoreFrame.add(buttonsPanel, BorderLayout.SOUTH);

                scoreFrame.setVisible(true);

                if((Player1.getPoint()>=15 || Player2.getPoint()>=15) && currentPlayer==0){
        //           frame2.dispose();
                   frame1.dispose();
                   scoreFrame.dispose();
                    javax.swing.SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            CenteredFrame frame = new CenteredFrame(Player1,Player2);
                            // نمایش فریم
                            frame.setVisible(true);
                        }
                    });

                }

                JLabel coinBackPlayer1;
                ImageIcon coinsbackP1 = new ImageIcon("images/coinBack.jpg");
                coinBackPlayer1 = new JLabel(coinsbackP1);
                coinBackPlayer1.setBounds(-10, 0, 700, 700); // تنظیم موقعیت و اندازه به صورت دقیق
                scoreFrame.add(coinBackPlayer1);

                JLabel coinBackPlayer2;
                ImageIcon coinsbackP2 = new ImageIcon("images/coinBack.jpg");
                coinBackPlayer2 = new JLabel(coinsbackP2);
                coinBackPlayer2.setBounds(850, 0, 700, 700); // تنظیم موقعیت و اندازه به صورت دقیق
                scoreFrame.add(coinBackPlayer2);

                //نمایش بک گراند
                JLabel background;
                ImageIcon back = new ImageIcon("images/BackGround.jpg");
                background = new JLabel(back);
                background.setBounds(500, 600, 1520, 855); // تنظیم موقعیت و اندازه به صورت دقیق
                scoreFrame.add(background);
                scoreFrame.add(background);
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
/*
                            SwingUtilities.invokeLater(new Runnable() {
                                public void run() {
                                    CenteredFrame.startAnimation("images/blackCoin.png",250 ,250,frame2);
                                }
                            });*/


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
                        if((Player1.getnBlackCo()+Player1.getnWhaiteCo()+Player1.getNblueCo()+Player1.getnRedCo()+Player1.getnGreenCo())>10){
                            returnCoins( Player1, Player2,coins);
                        };
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
                        if((Player1.getnBlackCo()+Player1.getnWhaiteCo()+Player1.getNblueCo()+Player1.getnRedCo()+Player1.getnGreenCo())>10){
                            returnCoins( Player1, Player2,coins);
                        };
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
                        if((Player1.getnBlackCo()+Player1.getnWhaiteCo()+Player1.getNblueCo()+Player1.getnRedCo()+Player1.getnGreenCo())>10){
                            returnCoins( Player1, Player2,coins);
                        };
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
                        if((Player2.getnBlackCo()+Player2.getnWhaiteCo()+Player2.getNblueCo()+Player2.getnRedCo()+Player2.getnGreenCo())>10){
                            returnCoins( Player1, Player2,coins);
                        };
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
                                j++;
                            }
                        }
                    }
                        else{
                            JOptionPane.showMessageDialog(null, "سکه آبی وجود ندارد");
                        }
                        if((Player1.getnBlackCo()+Player1.getnWhaiteCo()+Player1.getNblueCo()+Player1.getnRedCo()+Player1.getnGreenCo())>10){
                            returnCoins( Player1, Player2,coins);
                        };
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
                        if((Player2.getnBlackCo()+Player2.getnWhaiteCo()+Player2.getNblueCo()+Player2.getnRedCo()+Player2.getnGreenCo())>10){
                            returnCoins( Player1, Player2,coins);
                        };
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
                        if((Player1.getnBlackCo()+Player1.getnWhaiteCo()+Player1.getNblueCo()+Player1.getnRedCo()+Player1.getnGreenCo())>10){
                            returnCoins( Player1, Player2,coins);
                        };
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
                        if((Player2.getnBlackCo()+Player2.getnWhaiteCo()+Player2.getNblueCo()+Player2.getnRedCo()+Player2.getnGreenCo())>10){
                            returnCoins( Player1, Player2,coins);
                        };
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
                        if((Player1.getnBlackCo()+Player1.getnWhaiteCo()+Player1.getNblueCo()+Player1.getnRedCo()+Player1.getnGreenCo())>10){
                            returnCoins( Player1, Player2,coins);
                        };
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
                        if((Player2.getnBlackCo()+Player2.getnWhaiteCo()+Player2.getNblueCo()+Player2.getnRedCo()+Player2.getnGreenCo())>10){
                            returnCoins( Player1, Player2,coins);
                        };
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


        returnButton.addActionListener(actionListener);
        changeTurnButton.addActionListener(actionListener);
        goToScorePageButton.addActionListener(actionListener);

        returnButton.setBounds(600,745,200,50);
        changeTurnButton.setBounds(800,745,200,50);
        goToScorePageButton.setBounds(1000,745,200,50);

     //   frame2.setLayout(new FlowLayout());

        frame2.getContentPane().add(returnButton);
        frame2.getContentPane().add(changeTurnButton);
        frame2.getContentPane().add(goToScorePageButton);


        JLabel background;
        ImageIcon back = new ImageIcon("images/BackGround.jpg");
        background = new JLabel(back);
        background.setBounds(10, 0, 1520, 855); // تنظیم موقعیت و اندازه به صورت دقیق
        frame2.add(background);



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

    public static void returnCoins(Player player1, Player player2, Coin[] coins){
        if (currentPlayer==0){
            String[] options = {"return a black coin", "return a white coin", "return a blue coin", "return a red coin", "return a green coin"};
            ActionListener[] optionListeners = {
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(player1.getnBlackCo()>0){
                                for(int i=0,j=0;j<1;i++){
                                    if(coins[i].getOwner()==1){
                                        j++;
                                        coins[i].setOwner(3);
                                       player1.setnBlackCo(player1.getnBlackCo()-1);
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "There are no black coins!");
                                returnCoins(player1,player2,coins);
                            }
                        }
                    },
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(player1.getnWhaiteCo()>0){
                                for(int i=4,j=0;j<1;i++){
                                    if(coins[i].getOwner()==1){
                                        j++;
                                        coins[i].setOwner(3);
                                        player1.setnWhaiteCo(player1.getnWhaiteCo()-1);
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "There are no white coins!");
                                returnCoins(player1,player2,coins);
                            }
                        }
                    },
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(player1.getNblueCo()>0){
                                for(int i=8,j=0;j<1;i++){
                                    if(coins[i].getOwner()==1){
                                        j++;
                                        coins[i].setOwner(3);
                                        player1.setNblueCo(player1.getNblueCo()-1);
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "There are no blue coins!");
                                returnCoins(player1,player2,coins);
                            }
                        }
                    },
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(player1.getnRedCo()>0){
                                for(int i=12,j=0;j<1;i++){
                                    if(coins[i].getOwner()==1){
                                        j++;
                                        coins[i].setOwner(3);
                                        player1.setnRedCo(player1.getnRedCo()-1);
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "There are no red coins!");
                                returnCoins(player1,player2,coins);
                            }
                        }
                    },
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(player1.getnGreenCo()>0){
                                for(int i=16,j=0;j<1;i++){
                                    if(coins[i].getOwner()==1){
                                        j++;
                                        coins[i].setOwner(3);
                                        player1.setnGreenCo(player1.getnGreenCo()-1);
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "There are no green coins!");
                                returnCoins(player1,player2,coins);
                            }
                        }
                    }
            };

            int choice = JOptionPane.showOptionDialog(null,
                    "Your number of coins has increased from 10!",
                    "Options",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (choice != JOptionPane.CLOSED_OPTION) {
                optionListeners[choice].actionPerformed(null);
            } else {
                System.out.println("You closed the dialog.");
            }
        }else
        if (currentPlayer==1){
            String[] options = {"return a black coin", "return a white coin", "return a blue coin", "return a red coin", "return a green coin"};
            ActionListener[] optionListeners = {
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(player2.getnBlackCo()>0){
                                for(int i=0,j=0;j<1;i++){
                                    if(coins[i].getOwner()==1){
                                        j++;
                                        coins[i].setOwner(3);
                                        player2.setnBlackCo(player2.getnBlackCo()-1);
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "There are no black coins!");
                                returnCoins(player1,player2,coins);
                            }
                        }
                    },
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(player2.getnWhaiteCo()>0){
                                for(int i=4,j=0;j<1;i++){
                                    if(coins[i].getOwner()==1){
                                        j++;
                                        coins[i].setOwner(3);
                                        player2.setnWhaiteCo(player2.getnWhaiteCo()-1);
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "There are no white coins!");
                                returnCoins(player1,player2,coins);
                            }
                        }
                    },
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(player2.getnBlackCo()>0){
                                for(int i=4,j=0;j<1;i++){
                                    if(coins[i].getOwner()==1){
                                        j++;
                                        coins[i].setOwner(3);
                                        player2.setnBlackCo(player2.getnBlackCo()-1);
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "There are no blue coins!");
                                returnCoins(player1,player2,coins);
                            }
                        }
                    },
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(player2.getnRedCo()>0){
                                for(int i=12,j=0;j<1;i++){
                                    if(coins[i].getOwner()==1){
                                        j++;
                                        coins[i].setOwner(3);
                                        player2.setnRedCo(player2.getnRedCo()-1);
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "There are no red coins!");
                                returnCoins(player1,player2,coins);
                            }
                        }
                    },
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(player2.getnGreenCo()>0){
                                for(int i=16,j=0;j<1;i++){
                                    if(coins[i].getOwner()==1){
                                        j++;
                                        coins[i].setOwner(3);
                                        player2.setnGreenCo(player2.getnGreenCo()-1);
                                    }
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "There are no green coins!");
                                returnCoins(player1,player2,coins);
                            }
                        }
                    }
            };

            int choice = JOptionPane.showOptionDialog(null,
                    "Your number of coins has increased from 10!",
                    "Options",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);

            if (choice != JOptionPane.CLOSED_OPTION) {
                optionListeners[choice].actionPerformed(null);
            } else {
                System.out.println("You closed the dialog.");
            }
        }
    }
}
class CenteredFrame extends JFrame {
    public CenteredFrame(Player player1,Player player2) {
        setTitle("Centered Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = null;
        // تعیین ابعاد فریم
        setSize(400, 300);
        if(player1.getPoint()>=15 && player2.getPoint()>=15){
            if(player1.getNumberCards()>player2.getNumberCards())
             label= new JLabel("         player2 is winer");
            else
                label= new JLabel("         player1 is winer");
        }else if(player1.getPoint()>=15)
            label= new JLabel("         player1 is winer");
        else if(player2.getPoint()>=15)
            label= new JLabel("         player2 is winer");


        add(label);
        // تنظیم مرکزی برای فریم
        setLocationRelativeTo(null);
    }


/*
    public static void startAnimation(String path,int x,int y,JFrame frame) {
        int[] map = new int[2];
        map[0] = x;
        map[1] = y;
        final int[] deltaX = {1};
        int delay = 10;
        frame {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE);
                g.fillOval(map[0], map[1], 50, 50); // رسم یک دایره
            }
        };

        frame.add(panel);

        Timer timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                map[0] -= deltaX[0]; // انتقال دایره به سمت راست
                map[1] -= deltaX[0];
                if (map[0] >= 350) {
                    deltaX[0] = -1;
                }
                if (map[0] <= -50) {
                    deltaX[0] = 0; // توقف حرکت دایره
                    ((Timer) e.getSource()).stop(); // توقف تایمر
                }
                panel.repaint(); // بازسازی پنل برای نمایش تغییرات
            }
        });
        timer.start(); // شروع تایمر برای اجرای انیمیشن
    }*/

}
