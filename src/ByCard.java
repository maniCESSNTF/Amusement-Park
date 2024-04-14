import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ByCard extends JFrame {
    private Image backgroundImage;

    JFrame ShowCards  = new JFrame();
    public void ShowByCard(Player player1,Player player2,Card[] cardsT1,Card[] cardsT2,Card[] cardsT3,Card[] cardsT4,Coin[] coins,int turn,JLabel[] labels,JFrame scoreFrame,JFrame frame1) {
        JButton returnButton = new JButton("بازگشت به صفحه اصلی");
        JButton changeTurnButton = new JButton("تغییر نوبت");
        JButton goToScorePageButton = new JButton("نمایش امتیازها");
        ShowCards = new JFrame("خرید کارت");
        ShowCards.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ShowCards.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Grid Layout Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create a panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        // Create a panel for grid layouts (center)
        JPanel gridPanel = new JPanel(new GridLayout(3, 1));

        // Create three panels with FlowLayout (left-aligned)
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        // Set the default layout manager (FlowLayout) for each panel
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new FlowLayout());
        panel3.setLayout(new FlowLayout());


        JButton[] buttons = new JButton[48];
// buttons type 1
        buttons[0]  = new JButton();
        buttons[0].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[0].setActionCommand("C11");
        buttons[0].setIcon(new ImageIcon("images\\card11.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[0].setVisible(false);
        buttons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C11")){
                        int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                        // Process user choice
                        if (option == JOptionPane.YES_OPTION) {
                            if(Checkbuying(coins,cardsT1[0],turn,player1,player2)){
                                buttons[0].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }
                            else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                        } else if (option == JOptionPane.NO_OPTION) {
                            System.out.println("reservvvvvvvvvvvvvvvvvvvvvvvvvvvvv");

                            if(turn==0) {
                                if(player1.getnReservCard()<3) {
                                    player1.setnGoldCo(player1.getnGoldCo() + 1);
                                    player1.setMyRservedCards(cardsT1[0]);
                                    player1.setnReservCard(player1.getnReservCard()+1);
                                    cardsT1[0].setOwner(41);
                                    buttons[0].setVisible(false);
                                    ShowCards.dispose();
                                    scoreFrame.dispose();
                                    Main.changeTurn();
                                    Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                                }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                            }
                            else if(player2.getnReservCard()<3) {
                                player2.setnGoldCo(player1.getnGoldCo() + 1);
                                player2.setMyRservedCards(cardsT1[0]);
                                player2.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[0].setOwner(42);
                                buttons[0].setVisible(false);
                                ShowCards.dispose();
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                    }
                }

        });
        panel1.add(buttons[0]);

        buttons[1]= new JButton();
        buttons[1].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[1].setActionCommand("C12");
        buttons[1].setIcon(new ImageIcon("images\\card12.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[1].setVisible(false);
        buttons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C12")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT1[1],turn,player1,player2)){
                            buttons[1].setVisible(false);
                            ShowCards.dispose();
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT1[1]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[1].setOwner(41);
                                buttons[1].setVisible(false);
                                ShowCards.dispose();
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT1[1]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT1[1].setOwner(42);
                            buttons[1].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel1.add(buttons[1]);

        buttons[2] = new JButton();
        buttons[2].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[2].setActionCommand("C13");
        buttons[2].setIcon(new ImageIcon("images\\card13.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[2].setVisible(false);
        buttons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C13")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT1[2],turn,player1,player2)){
                            buttons[2].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT1[2]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[2].setOwner(41);
                                buttons[2].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT1[2]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT1[2].setOwner(42);
                            buttons[2].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel1.add(buttons[2]);

        buttons[3] = new JButton();
        buttons[3].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[3].setActionCommand("C14");
        buttons[3].setIcon(new ImageIcon("images\\card14.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[3].setVisible(false);
        buttons[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C14")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT1[3],turn,player1,player2)){
                            buttons[3].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT1[3]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[3].setOwner(41);
                                buttons[3].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT1[3]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT1[3].setOwner(42);
                            buttons[3].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel1.add(buttons[3]);

        buttons[4] = new JButton();
        buttons[4].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[4].setActionCommand("C15");
        buttons[4].setIcon(new ImageIcon("images\\card15.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[4].setVisible(false);
        buttons[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C15")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT1[4],turn,player1,player2)){
                            buttons[4].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT1[4]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[4].setOwner(41);
                                buttons[4].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT1[4]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT1[4].setOwner(42);
                            buttons[4].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel1.add(buttons[4]);

        buttons[5] = new JButton();
        buttons[5].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[5].setActionCommand("C16");
        buttons[5].setIcon(new ImageIcon("images\\card16.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[5].setVisible(false);
        buttons[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C16")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT1[1],turn,player1,player2)){
                            buttons[8].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT1[5]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[5].setOwner(41);
                                buttons[5].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT1[5]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT1[5].setOwner(42);
                            buttons[5].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel1.add( buttons[5]);

        buttons[6] = new JButton();
        buttons[6].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[6].setActionCommand("C17");
        buttons[6].setIcon(new ImageIcon("images\\card17.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[6].setVisible(false);
        buttons[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C17")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT1[6],turn,player1,player2)){
                            buttons[6].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT1[6]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[6].setOwner(41);
                                buttons[6].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            player2.setMyRservedCards(cardsT1[6]);
                            cardsT1[6].setOwner(42);
                            buttons[6].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel1.add(buttons[6]);

        buttons[7] = new JButton();
        buttons[7].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[7].setActionCommand("C18");
        buttons[7].setIcon(new ImageIcon("images\\card18.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[7].setVisible(false);
        buttons[7].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C18")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT1[7],turn,player1,player2)){
                            buttons[7].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT1[7]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[7].setOwner(41);
                                buttons[7].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT1[7]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT1[7].setOwner(42);
                            buttons[7].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel1.add(buttons[7]);

        buttons[8] = new JButton();
        buttons[8].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[8].setActionCommand("C19");
        buttons[8].setIcon(new ImageIcon("images\\card19.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[8].setVisible(false);
        buttons[8].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C19")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT1[8],turn,player1,player2)){
                            buttons[8].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT1[8]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[8].setOwner(41);
                                buttons[8].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT1[8]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT1[8].setOwner(42);
                            buttons[8].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel1.add(buttons[8]);

        buttons[9] = new JButton();
        buttons[9].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[9].setActionCommand("C110");
        buttons[9].setIcon(new ImageIcon("images\\card110.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[9].setVisible(false);
        buttons[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C110")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT1[9],turn,player1,player2)){
                            buttons[9].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT1[9]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[9].setOwner(41);
                                buttons[9].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT1[9]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT1[9].setOwner(42);
                            buttons[9].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel1.add(  buttons[9]);

        buttons[10] = new JButton();
        buttons[10].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[10].setActionCommand("C111");
        buttons[10].setIcon(new ImageIcon("images\\card111.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[10].setVisible(false);
        buttons[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C111")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT1[10],turn,player1,player2)){
                            buttons[10].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT1[10]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[10].setOwner(41);
                                buttons[10].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT1[10]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT1[10].setOwner(42);
                            buttons[10].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel1.add(buttons[10]);

        buttons[11] = new JButton();
        buttons[11].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[11].setActionCommand("C112");
        buttons[11].setIcon(new ImageIcon("images\\card112.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[11].setVisible(false);
        buttons[11].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C112")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT1[11],turn,player1,player2)){
                            buttons[11].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT1[11]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[11].setOwner(41);
                                buttons[11].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT1[11]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT1[11].setOwner(42);
                            buttons[11].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel1.add(buttons[11]);

        buttons[12] = new JButton();
        buttons[12].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[12].setActionCommand("C113");
        buttons[12].setIcon(new ImageIcon("images\\card113.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[12].setVisible(false);
        buttons[12].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C113")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT1[12],turn,player1,player2)){
                            buttons[12].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT1[12]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[12].setOwner(41);
                                buttons[12].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT1[12]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT1[12].setOwner(42);
                            buttons[12].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel1.add(buttons[12]);

        buttons[13] = new JButton();
        buttons[13].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[13].setActionCommand("C114");
        buttons[13].setIcon(new ImageIcon("images\\card114.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[13].setVisible(false);
        buttons[13].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C114")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT1[13],turn,player1,player2)){
                            buttons[13].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT1[13]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[13].setOwner(41);
                                buttons[13].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT1[13]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT1[13].setOwner(42);
                            buttons[13].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel1.add(buttons[13]);

        buttons[14] = new JButton();
        buttons[14].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[14].setActionCommand("C115");
        buttons[14].setIcon(new ImageIcon("images\\card115.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[14].setVisible(false);
        buttons[14].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C115")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT1[14],turn,player1,player2)){
                            buttons[14].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT1[14]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT1[14].setOwner(41);
                                buttons[14].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT1[14]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT1[14].setOwner(42);
                            buttons[14].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel1.add(buttons[14]);

        //buttens type2

        buttons[15]  = new JButton();
        buttons[15].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[15].setActionCommand("C21");
        buttons[15].setIcon(new ImageIcon("images\\card21.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[15].setVisible(false);
        buttons[15].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C21")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[0],turn,player1,player2)){
                            buttons[15].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[0]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[0].setOwner(41);
                                buttons[15].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[0]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[0].setOwner(42);
                            buttons[15].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add(buttons[15]);

        buttons[16]= new JButton();
        buttons[16].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[16].setActionCommand("C22");
        buttons[16].setIcon(new ImageIcon("images\\card22.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[16].setVisible(false);
        buttons[16].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C22")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[1],turn,player1,player2)){
                            buttons[16].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[1]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[1].setOwner(41);
                                buttons[16].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[1]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[1].setOwner(42);
                            buttons[16].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add(buttons[16]);

        buttons[17] = new JButton();
        buttons[17].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[17].setActionCommand("C23");
        buttons[17].setIcon(new ImageIcon("images\\card23.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[17].setVisible(false);
        buttons[17].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C23")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[2],turn,player1,player2)){
                            buttons[17].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[2]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[2].setOwner(41);
                                buttons[17].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[2]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[2].setOwner(42);
                            buttons[17].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add(buttons[17]);

        buttons[18] = new JButton();
        buttons[18].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[18].setActionCommand("C24");
        buttons[18].setIcon(new ImageIcon("images\\card24.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[18].setVisible(false);
        buttons[18].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C24")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[3],turn,player1,player2)){
                            buttons[18].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[3]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[3].setOwner(41);
                                buttons[18].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[3]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[3].setOwner(42);
                            buttons[18].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add(buttons[18]);

        buttons[19] = new JButton();
        buttons[19].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[19].setActionCommand("C25");
        buttons[19].setIcon(new ImageIcon("images\\card25.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[19].setVisible(false);
        buttons[19].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C25")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[4],turn,player1,player2)){
                            buttons[19].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[4]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[4].setOwner(41);
                                buttons[19].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[4]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[4].setOwner(42);
                            buttons[19].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add(buttons[19]);

        buttons[20] = new JButton();
        buttons[20].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[20].setActionCommand("C26");
        buttons[20].setIcon(new ImageIcon("images\\card26.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[20].setVisible(false);
        buttons[20].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C26")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[5],turn,player1,player2)){
                            buttons[20].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[5]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[5].setOwner(41);
                                buttons[20].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[5]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[5].setOwner(42);
                            buttons[20].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add( buttons[20]);

        buttons[21] = new JButton();
        buttons[21].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[21].setActionCommand("C27");
        buttons[21].setIcon(new ImageIcon("images\\card27.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[21].setVisible(false);
        buttons[21].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C27")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[6],turn,player1,player2)){
                            buttons[21].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[6]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[6].setOwner(41);
                                buttons[21].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[6]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[6].setOwner(42);
                            buttons[21].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add(buttons[21]);

        buttons[22] = new JButton();
        buttons[22].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[22].setActionCommand("C28");
        buttons[22].setIcon(new ImageIcon("images\\card28.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[22].setVisible(false);
        buttons[22].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C28")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[7],turn,player1,player2)){
                            buttons[22].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[7]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[7].setOwner(41);
                                buttons[22].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[7]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[7].setOwner(42);
                            buttons[22].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add(buttons[22]);

        buttons[23] = new JButton();
        buttons[23].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[23].setActionCommand("C29");
        buttons[23].setIcon(new ImageIcon("images\\card29.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[23].setVisible(false);
        buttons[23].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C29")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[8],turn,player1,player2)){
                            buttons[23].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[8]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[8].setOwner(41);
                                buttons[23].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[8]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[8].setOwner(42);
                            buttons[23].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add(buttons[23]);

        buttons[24] = new JButton();
        buttons[24].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[24].setActionCommand("C210");
        buttons[24].setIcon(new ImageIcon("images\\card210.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[24].setVisible(false);
        buttons[24].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C210")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[9],turn,player1,player2)){
                            buttons[24].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[9]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[9].setOwner(41);
                                buttons[24].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[9]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[9].setOwner(42);
                            buttons[24].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add(  buttons[24]);

        buttons[25] = new JButton();
        buttons[25].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[25].setActionCommand("C211");
        buttons[25].setIcon(new ImageIcon("images\\card211.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[25].setVisible(false);
        buttons[25].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C211")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[10],turn,player1,player2)){
                            buttons[25].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[10]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[10].setOwner(41);
                                buttons[25].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[10]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[10].setOwner(42);
                            buttons[25].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add(buttons[25]);

        buttons[26] = new JButton();
        buttons[26].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[26].setActionCommand("C212");
        buttons[26].setIcon(new ImageIcon("images\\card212.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[26].setVisible(false);
        buttons[26].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C212")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[11],turn,player1,player2)){
                            buttons[26].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[11]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[11].setOwner(41);
                                buttons[26].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[11]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[11].setOwner(42);
                            buttons[26].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add(buttons[26]);

        buttons[27] = new JButton();
        buttons[27].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[27].setActionCommand("C213");
        buttons[27].setIcon(new ImageIcon("images\\card213.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[27].setVisible(false);
        buttons[27].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C213")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[12],turn,player1,player2)){
                            buttons[27].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[12]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[12].setOwner(41);
                                buttons[27].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[12]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[12].setOwner(42);
                            buttons[27].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add(buttons[27]);

        buttons[28] = new JButton();
        buttons[28].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[28].setActionCommand("C214");
        buttons[28].setIcon(new ImageIcon("images\\card214.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[28].setVisible(false);
        buttons[28].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C214")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[13],turn,player1,player2)){
                            buttons[28].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[13]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[13].setOwner(41);
                                buttons[28].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[13]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[13].setOwner(42);
                            buttons[28].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add(buttons[28]);

        buttons[29] = new JButton();
        buttons[29].setPreferredSize(new Dimension(140, 197)); // Set preferred size
        buttons[29].setActionCommand("C215");
        buttons[29].setIcon(new ImageIcon("images\\card215.jpg")); // تنظیم تصویر برای دکمه گرد
        buttons[29].setVisible(false);
        buttons[29].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C215")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT2[14],turn,player1,player2)){
                            buttons[29].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT2[14]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT2[14].setOwner(41);
                                buttons[29].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT2[14]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT2[14].setOwner(42);
                            buttons[29].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
        panel2.add(buttons[29]);

            //buttens type3

            buttons[30]  = new JButton();
            buttons[30].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[30].setActionCommand("C31");
            buttons[30].setIcon(new ImageIcon("images\\card31.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[30].setVisible(false);
        buttons[30].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C31")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[0],turn,player1,player2)){
                            buttons[30].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[0]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[0].setOwner(41);
                                buttons[30].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[0]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[0].setOwner(42);
                            buttons[30].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
            panel3.add(buttons[30]);


            buttons[31]= new JButton();
            buttons[31].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[31].setActionCommand("C32");
            buttons[31].setIcon(new ImageIcon("images\\card32.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[31].setVisible(false);
        buttons[31].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C32")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[1],turn,player1,player2)){
                            buttons[31].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[1]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[1].setOwner(41);
                                buttons[31].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[1]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[1].setOwner(42);
                            buttons[31].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
            panel3.add(buttons[31]);

            buttons[32] = new JButton();
            buttons[32].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[32].setActionCommand("C33");
            buttons[32].setIcon(new ImageIcon("images\\card33.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[32].setVisible(false);
        buttons[32].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C33")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[2],turn,player1,player2)){
                            buttons[32].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[2]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[2].setOwner(41);
                                buttons[32].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[2]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[2].setOwner(42);
                            buttons[32].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }
        });
            panel3.add(buttons[32]);

            buttons[33] = new JButton();
            buttons[33].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[33].setActionCommand("C34");
            buttons[33].setIcon(new ImageIcon("images\\card34.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[33].setVisible(false);
        buttons[33].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C34")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[3],turn,player1,player2)){
                            buttons[33].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[3]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[3].setOwner(41);
                                buttons[33].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[3]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[3].setOwner(42);
                            buttons[33].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
            panel3.add(buttons[33]);

            buttons[34] = new JButton();
            buttons[34].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[34].setActionCommand("C35");
            buttons[34].setIcon(new ImageIcon("images\\card35.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[34].setVisible(false);
        buttons[34].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C35")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[4],turn,player1,player2)){
                            buttons[34].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[4]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[4].setOwner(41);
                                buttons[34].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[4]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[4].setOwner(42);
                            buttons[34].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
            panel3.add(buttons[34]);

            buttons[35] = new JButton();
            buttons[35].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[35].setActionCommand("C36");
            buttons[35].setIcon(new ImageIcon("images\\card36.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[35].setVisible(false);
        buttons[35].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C36")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[5],turn,player1,player2)){
                            buttons[35].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[5]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[5].setOwner(41);
                                buttons[35].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[5]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[5].setOwner(42);
                            buttons[35].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
            panel3.add( buttons[35]);

            buttons[36] = new JButton();
            buttons[36].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[36].setActionCommand("C37");
            buttons[36].setIcon(new ImageIcon("images\\card37.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[36].setVisible(false);
        buttons[36].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C37")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[6],turn,player1,player2)){
                            buttons[36].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[6]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[6].setOwner(41);
                                buttons[36].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[6]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[6].setOwner(42);
                            buttons[36].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
            panel3.add(buttons[36]);

            buttons[37] = new JButton();
            buttons[37].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[37].setActionCommand("C38");
            buttons[37].setIcon(new ImageIcon("images\\card38.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[37].setVisible(false);
        buttons[37].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C38")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[7],turn,player1,player2)){
                            buttons[37].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[7]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[7].setOwner(41);
                                buttons[37].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[7]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[7].setOwner(42);
                            buttons[37].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
            panel3.add(buttons[37]);

            buttons[38] = new JButton();
            buttons[38].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[38].setActionCommand("C39");
            buttons[38].setIcon(new ImageIcon("images\\card39.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[38].setVisible(false);
        buttons[38].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C39")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[8],turn,player1,player2)){
                            buttons[38].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[8]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[8].setOwner(41);
                                buttons[38].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[8]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[8].setOwner(42);
                            buttons[38].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
            panel3.add(buttons[38]);

            buttons[39] = new JButton();
            buttons[39].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[39].setActionCommand("C310");
            buttons[39].setIcon(new ImageIcon("images\\card310.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[39].setVisible(false);
        buttons[39].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C310")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[9],turn,player1,player2)){
                            buttons[39].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[9]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[9].setOwner(41);
                                buttons[39].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[9]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[9].setOwner(42);
                            buttons[39].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
            panel3.add(  buttons[39]);

            buttons[40] = new JButton();
            buttons[40].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[40].setActionCommand("C311");
            buttons[40].setIcon(new ImageIcon("images\\card311.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[40].setVisible(false);
        buttons[40].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C311")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[10],turn,player1,player2)){
                            buttons[40].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[10]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[10].setOwner(41);
                                buttons[40].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[10]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[10].setOwner(42);
                            buttons[40].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
            panel3.add(buttons[40]);

            buttons[41] = new JButton();
            buttons[41].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[41].setActionCommand("C312");
            buttons[41].setIcon(new ImageIcon("images\\card312.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[41].setVisible(false);
        buttons[41].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C312")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[11],turn,player1,player2)){
                            buttons[41].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[11]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[11].setOwner(41);
                                buttons[41].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[11]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[11].setOwner(42);
                            buttons[41].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
            panel3.add(buttons[41]);

            buttons[42] = new JButton();
            buttons[42].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[42].setActionCommand("C313");
            buttons[42].setIcon(new ImageIcon("images\\card313.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[42].setVisible(false);
        buttons[42].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C313")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[12],turn,player1,player2)){
                            buttons[42].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[12]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[12].setOwner(41);
                                buttons[42].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[12]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[12].setOwner(42);
                            buttons[42].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
            panel3.add(buttons[42]);

            buttons[43] = new JButton();
            buttons[43].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[43].setActionCommand("C314");
            buttons[43].setIcon(new ImageIcon("images\\card314.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[43].setVisible(false);
        buttons[43].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C314")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[13],turn,player1,player2)){
                            buttons[43].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[13]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[13].setOwner(41);
                                buttons[43].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[13]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[13].setOwner(42);
                            buttons[43].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
            panel3.add(buttons[43]);

            buttons[44] = new JButton();
            buttons[44].setPreferredSize(new Dimension(140, 197)); // Set preferred size
            buttons[44].setActionCommand("C315");
            buttons[44].setIcon(new ImageIcon("images\\card315.jpg")); // تنظیم تصویر برای دکمه گرد
            buttons[44].setVisible(false);
        buttons[44].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getActionCommand().equals("C315")){
                    int option = JOptionPane.showOptionDialog(ByCard.this, "Buy or Rserve", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Buy","Rserve"}, "Buy");
                    // Process user choice
                    if (option == JOptionPane.YES_OPTION) {
                        if(Checkbuying(coins,cardsT3[14],turn,player1,player2)){
                            buttons[44].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }
                        else{JOptionPane.showMessageDialog(ByCard.this, "You can not buy this card!");}
                    } else if (option == JOptionPane.NO_OPTION) {
                        if(turn==0) {
                            if(player1.getnReservCard()<3) {
                                player1.setnGoldCo(player1.getnGoldCo() + 1);
                                player1.setMyRservedCards(cardsT3[14]);
                                player1.setnReservCard(player1.getnReservCard()+1);
                                cardsT3[14].setOwner(41);
                                buttons[44].setVisible(false);
                                ShowCards.setVisible(false);
                                scoreFrame.dispose();
                                Main.changeTurn();
                                Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                            }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                        }
                        else if(player2.getnReservCard()<3) {
                            player2.setnGoldCo(player2.getnGoldCo() + 1);
                            player2.setMyRservedCards(cardsT3[14]);
                            player2.setnReservCard(player2.getnReservCard()+1);
                            cardsT3[14].setOwner(42);
                            buttons[44].setVisible(false);
                            ShowCards.setVisible(false);
                            scoreFrame.dispose();
                            Main.changeTurn();
                            Main.ScorePage.showScore(player1,player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                        }else JOptionPane.showMessageDialog(ByCard.this, "You have reserved 3 cards!");
                    }
                }
            }

        });
            panel3.add(buttons[44]);

            Random number = new Random();

        //جایگزینی کارت های جدید از نوع 1
            int CardsVisibelTrue=0;
            int avilableCards=4;
            int CardsBought=0;
            for(int i=0;i<15;i++){
                    if(buttons[i].isVisible()==true){
                            CardsVisibelTrue++;}
            }

            for(int i=0;i<15;i++){
                if(cardsT1[i].getBought()==true){
                    CardsBought++;}
            }

            if(CardsBought>11){
                avilableCards=15-CardsBought;}

            for(int i=0;(i+CardsVisibelTrue)<avilableCards;) {
                    int x = number.nextInt(15);
                    if(buttons[x].isVisible()==false && cardsT1[x].getOwner()==3 && cardsT1[x].getBought()==false) {
                            buttons[x].setVisible(true);
                            i++;
                    }
            }


            //جایگزینی کارت های جدید از نوع 2
            CardsVisibelTrue=0;
            CardsBought=0;
            avilableCards=4;
        for(int i=0;i<15;i++){
            if(cardsT2[i].getBought()==true){
                CardsBought++;}
        }

        if(CardsBought>11){
            avilableCards=15-CardsBought;}

            for(int i=15;i<30;i++){
                    if(buttons[i].isVisible()==true)
                            CardsVisibelTrue++;
            }

            for(int i=0;(i+CardsVisibelTrue)<avilableCards;) {
                    int x = number.nextInt(15)+15;
                    if(buttons[x].isVisible()==false && cardsT2[x-15].getOwner()==3 && cardsT2[x-15].getBought()==false) {
                            buttons[x].setVisible(true);
                            i++;
                    }
            }


        //جایگزینی کارت های جدید از نوع 3
        CardsVisibelTrue=0;
        CardsBought=0;
        avilableCards=4;

        for(int i=0;i<15;i++){
            if(cardsT3[i].getBought()==true){
                CardsBought++;}
        }

        if(CardsBought>11){
            avilableCards=15-CardsBought;}


        for(int i=30;i<45;i++){
                    if(buttons[i].isVisible()==true)
                            CardsVisibelTrue++;
            }
            for(int i=0;(i+CardsVisibelTrue)<avilableCards;) {
                    int x = number.nextInt(15)+30;
                    if(buttons[x].isVisible()==false && cardsT3[x-30].getOwner()==3 && cardsT3[x-30].getBought()==false) {
                            buttons[x].setVisible(true);
                            i++;
                    }
            }
        // Add panels to the grid panel
        gridPanel.add(panel1);
        gridPanel.add(panel2);
        gridPanel.add(panel3);

        // Create a panel for bottom buttons (south)
        JPanel bottomPanel = new JPanel();

        // Add the grid panel and bottom panel to the main panel
        mainPanel.add(gridPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton sourceButton = (JButton) e.getSource();

                if (sourceButton == returnButton) {
                    ShowCards.setVisible(false);
                    frame1.setVisible(true);
                } else if (sourceButton == changeTurnButton) {
                    Main.changeTurn();
                    ShowCards.setVisible(false);
                    scoreFrame.dispose();
                    Main.ScorePage.showScore(player1, player2,cardsT1,cardsT2,cardsT3,cardsT4,coins, labels);
                } else if (sourceButton == goToScorePageButton) {
                    ShowCards.setVisible(false);
                    scoreFrame.setVisible(true);
                } else {
                    int currentButtonIndex = Integer.parseInt(sourceButton.getText().split(" ")[1]) - 1;
                }
            }
        };
        returnButton.addActionListener(actionListener);
        changeTurnButton.addActionListener(actionListener);
        goToScorePageButton.addActionListener(actionListener);
        returnButton.setBounds(600,745,200,50);
        changeTurnButton.setBounds(800,745,200,50);
        goToScorePageButton.setBounds(1000,745,200,50);
        ShowCards.add(returnButton);
        ShowCards.add(changeTurnButton);
        ShowCards.add(goToScorePageButton);
        // Add the main panel to the frame
        getContentPane().add(mainPanel);

        // Adjust the frame size
        pack();

        ShowCards.add(mainPanel);
        ShowCards.setVisible(true);
    }

    boolean Checkbuying(Coin[] coins,Card thisCard,int turn,Player player1,Player player2) {
        if (turn == 0) {
            if ((thisCard.getBlackCo() <= (player1.getnBlackCo() + player1.getnDIsBlackCO())) && (thisCard.getWhiteCo() <= (player1.getnWhaiteCo() + player1.getnDIsWhiteCO())) && (thisCard.getBlueCo() <= (player1.getNblueCo() + player1.getnDIsBlueCO())) && (thisCard.getRedCo() <= (player1.getnRedCo() + player1.getnDIsRedCO())) && (thisCard.getGreenCo() <= (player1.getnGreenCo() + player1.getnDIsGreenCO()))) {

                thisCard.setOwner(1);
                player1.setPoint(player1.getPoint()+thisCard.getPoint());

                player1.setNumberCards(player1.getNumberCards()+1);
                //برگرداندن سکه ها به بانک
                if(player1.getnDIsBlackCO() >= thisCard.getBlackCo()){}
                else {
                    for (int i = 0, j = 0; j <  thisCard.getBlackCo()-player1.getnDIsBlackCO(); i++) {
                        if (coins[i].getOwner() == 1){
                            coins[i].setOwner(3);
                            j++;}
                    }
                }

                if(player1.getnDIsWhiteCO()>= thisCard.getWhiteCo()){}
                else {
                    for (int i = 4, j = 0; j <  thisCard.getWhiteCo()-player1.getnDIsWhiteCO(); i++) {
                        if (coins[i].getOwner() == 1){
                            coins[i].setOwner(3);
                            j++;}
                    }
                }

                if(player1.getnDIsBlueCO() >= thisCard.getBlueCo()){}
                else {
                    for (int i = 8, j = 0; j < thisCard.getBlueCo()-player1.getnDIsBlueCO() ; i++) {
                        if (coins[i].getOwner() == 1){
                            coins[i].setOwner(3);
                            j++;}
                    }
                }

                if(player1.getnDIsRedCO() >= thisCard.getRedCo()){}
                else{
                    for (int i = 12, j = 0; j < thisCard.getRedCo()-player1.getnDIsRedCO(); i++) {
                        if (coins[i].getOwner() == 1){
                            coins[i].setOwner(3);
                            j++;}
                    }
                }

                if(player1.getnDIsGreenCO() >= thisCard.getGreenCo()){}
               else {
                    for (int i = 16, j = 0; j <  thisCard.getGreenCo()-player1.getnDIsGreenCO(); i++) {
                        if (coins[i].getOwner() == 1){
                            coins[i].setOwner(3);
                            j++;}
                    }
                }

                //کاهش سکه های درج شده روی کارت
                if(player1.getnDIsBlackCO() >= thisCard.getBlackCo()){}
                else    player1.setnBlackCo(player1.getnBlackCo() + player1.getnDIsBlackCO() - thisCard.getBlackCo());

                if(player1.getnDIsWhiteCO()>= thisCard.getWhiteCo()){}
                else  player1.setnWhaiteCo(player1.getnWhaiteCo() + player1.getnDIsWhiteCO() - thisCard.getWhiteCo());

                if(player1.getnDIsBlueCO() >= thisCard.getBlueCo()){}
                else   player1.setNblueCo(player1.getNblueCo() + player1.getnDIsBlueCO() - thisCard.getBlueCo());

                if(player1.getnDIsRedCO() >= thisCard.getRedCo()){}
                else  player1.setnRedCo(player1.getnRedCo() + player1.getnDIsRedCO() - thisCard.getRedCo());

                if(player1.getnDIsGreenCO() >= thisCard.getGreenCo()){}
                else  player1.setnGreenCo(player1.getnGreenCo() + player1.getnDIsGreenCO() - thisCard.getGreenCo());

                //افزایش سکه های تخفیف
                if (thisCard.getColorDisCo() == 1)
                    player1.setnDIsBlackCO(player1.getnDIsBlackCO() + thisCard.getnDicCo());
                if (thisCard.getColorDisCo() == 2)
                    player1.setnDIsWhiteCO(player1.getnDIsWhiteCO() + thisCard.getnDicCo());
                if (thisCard.getColorDisCo() == 3)
                    player1.setnDIsBlueCO(player1.getnDIsBlueCO() + thisCard.getnDicCo());
                if (thisCard.getColorDisCo() == 4)
                    player1.setnDIsRedCO(player1.getnDIsRedCO() + thisCard.getnDicCo());
                if (thisCard.getColorDisCo() == 5)
                    player1.setnDIsGreenCO(player1.getnDIsGreenCO() + thisCard.getnDicCo());

                return true;
            } else {//در صورت نیاز به سکه های طلایی
                int needGoldCoin = 0;
                if (thisCard.getBlackCo() > player1.getnBlackCo()+player1.getnDIsBlackCO())
                    needGoldCoin += (thisCard.getBlackCo() - player1.getnBlackCo()-player1.getnDIsBlackCO());

                if (thisCard.getWhiteCo() > player1.getnWhaiteCo()+player1.getnDIsWhiteCO())
                    needGoldCoin += (thisCard.getWhiteCo() - player1.getnWhaiteCo()-player1.getnDIsWhiteCO());

                if (thisCard.getBlueCo() > player1.getNblueCo()+player1.getnDIsBlueCO())
                    needGoldCoin += (thisCard.getBlueCo() - player1.getNblueCo()-player1.getnDIsBlueCO());

                if (thisCard.getRedCo() > player1.getnRedCo()+player1.getnDIsRedCO())
                    needGoldCoin += (thisCard.getRedCo() - player1.getnRedCo()-player1.getnDIsRedCO());

                if (thisCard.getGreenCo() > player1.getnGreenCo() + player1.getnDIsGreenCO())
                    needGoldCoin += (thisCard.getGreenCo() - player1.getnGreenCo() - player1.getnDIsGreenCO());

                if (needGoldCoin <= player1.getnGoldCo()) {
                        player1.setNumberCards(player1.getNumberCards()+1);
                        thisCard.setOwner(1);
                        player1.setPoint(player1.getPoint()+thisCard.getPoint());

                    //برگرداندن سکه ها به بانک
                    if(player1.getnDIsBlackCO() >= thisCard.getBlackCo()){}
                    else if(player1.getnDIsBlackCO()+player1.getnBlackCo()>=thisCard.getBlackCo()){
                        for (int i = 0, j = 0; j < -player1.getnDIsBlackCO() + thisCard.getBlackCo(); i++) {
                            if (coins[i].getOwner() == 1){
                                coins[i].setOwner(3);j++;}
                        }
                        player1.setnBlackCo(player1.getnBlackCo() + player1.getnDIsBlackCO() - thisCard.getBlackCo());
                    }else {
                        for (int i = 0, j = 0; j < player1.getnBlackCo(); i++) {
                            if (coins[i].getOwner() == 1){
                                coins[i].setOwner(3);j++;}
                        }
                        player1.setnGoldCo(player1.getnGoldCo() - thisCard.getBlackCo() + player1.getnBlackCo()+ player1.getnDIsBlackCO());
                        player1.setnBlackCo(0);
                    }

                    if(player1.getnDIsWhiteCO()>= thisCard.getWhiteCo()){}
                    else if(player1.getnDIsWhiteCO()+player1.getnWhaiteCo()>=thisCard.getWhiteCo()){
                        for (int i = 4, j = 0; j < -player1.getnDIsWhiteCO() + thisCard.getWhiteCo(); i++) {
                            if (coins[i].getOwner() == 1)
                                coins[i].setOwner(3);j++;
                        }
                        player1.setnWhaiteCo(player1.getnWhaiteCo() + player1.getnDIsWhiteCO() - thisCard.getWhiteCo());
                    }else {
                        for (int i = 4, j = 0; j < player1.getnWhaiteCo(); i++) {
                            if (coins[i].getOwner() == 1){
                                coins[i].setOwner(3);j++;}
                        }
                        player1.setnGoldCo(player1.getnGoldCo() - thisCard.getWhiteCo() + player1.getnWhaiteCo()+ player1.getnDIsWhiteCO());
                        player1.setnWhaiteCo(0);
                    }

                    if(player1.getnDIsBlueCO()>= thisCard.getBlueCo()){}
                    else if(player1.getnDIsBlackCO()+player1.getNblueCo()>=thisCard.getBlueCo()){
                        for (int i = 8, j = 0; j < -player1.getnDIsBlueCO() + thisCard.getBlueCo(); i++) {
                            if (coins[i].getOwner() == 1){
                                coins[i].setOwner(3);j++;}
                        }
                        player1.setNblueCo(player1.getNblueCo() + player1.getnDIsBlueCO() - thisCard.getBlueCo());
                    }else {
                        for (int i = 8, j = 0; j < player1.getNblueCo(); i++) {
                            if (coins[i].getOwner() == 1){
                                coins[i].setOwner(3);j++;}
                        }
                        player1.setnGoldCo(player1.getnGoldCo() - thisCard.getBlueCo() + player1.getNblueCo()+ player1.getnDIsBlueCO());
                        player1.setNblueCo(0);
                    }


                    if(player1.getnDIsRedCO()>= thisCard.getRedCo()){}
                    else if(player1.getnDIsRedCO()+player1.getnRedCo()>=thisCard.getRedCo()){
                        for (int i = 12, j = 0; j < -player1.getnDIsRedCO() + thisCard.getRedCo(); i++) {
                            if (coins[i].getOwner() == 1){
                                coins[i].setOwner(3);j++;}
                        }
                        player1.setnRedCo(player1.getnRedCo() + player1.getnDIsRedCO() - thisCard.getRedCo());
                    }else {
                        for (int i = 12, j = 0; j < player1.getnRedCo(); i++) {
                            if (coins[i].getOwner() == 1){
                                coins[i].setOwner(3);j++;}
                        }
                        player1.setnGoldCo(player1.getnGoldCo() - thisCard.getRedCo() + player1.getnRedCo()+ player1.getnDIsRedCO());
                        player1.setnRedCo(0);
                    }


                    if(player1.getnDIsGreenCO()>= thisCard.getGreenCo()){}
                    else if(player1.getnDIsGreenCO()+player1.getnGreenCo()>=thisCard.getGreenCo()){
                        for (int i = 16, j = 0; j < -player1.getnDIsGreenCO() + thisCard.getGreenCo(); i++) {
                            if (coins[i].getOwner() == 1){
                                coins[i].setOwner(3);j++;}
                        }
                        player1.setnGreenCo(player1.getnGreenCo() + player1.getnDIsGreenCO() - thisCard.getGreenCo());
                    }else {
                        for (int i = 16, j = 0; j < player1.getnGreenCo(); i++) {
                            if (coins[i].getOwner() == 1){
                                coins[i].setOwner(3);j++;}
                        }
                        player1.setnGoldCo(player1.getnGoldCo() - thisCard.getGreenCo() + player1.getnGreenCo()+ player1.getnDIsGreenCO());
                        player1.setnGreenCo(0);
                    }
                    return true;
                } else
                    return false;
            }
        }
        else {
            if ((thisCard.getBlackCo() <= (player2.getnBlackCo() + player2.getnDIsBlackCO()) )&& (thisCard.getWhiteCo() <= (player2.getnWhaiteCo() + player2.getnDIsWhiteCO())) && (thisCard.getBlueCo() <= (player2.getNblueCo() + player2.getnDIsBlueCO())) && (thisCard.getRedCo() <= (player2.getnRedCo() + player2.getnDIsRedCO() ))&& (thisCard.getGreenCo() <= (player2.getnGreenCo() + player2.getnDIsGreenCO()))) {

                player2.setNumberCards(player2.getNumberCards()+1);
                thisCard.setOwner(2);
                player2.setPoint(player2.getPoint()+thisCard.getPoint());

                //برگرداندن سکه ها به بانک
                if(player2.getnDIsBlackCO() >= thisCard.getBlackCo()){}
                else {
                    for (int i = 0, j = 0; j <  thisCard.getBlackCo()-player2.getnDIsBlackCO(); i++) {
                        if (coins[i].getOwner() == 2){
                            coins[i].setOwner(3);
                        j++;}
                    }
                }

                if(player2.getnDIsWhiteCO()>= thisCard.getWhiteCo()){}
                else {
                    for (int i = 4, j = 0; j <  thisCard.getWhiteCo()-player2.getnDIsWhiteCO(); i++) {
                        if (coins[i].getOwner() == 2){
                            coins[i].setOwner(3);
                        j++;}
                    }
                }

                if(player2.getnDIsBlueCO() >= thisCard.getBlueCo()){}
                else {
                    for (int i = 8, j = 0; j <  thisCard.getBlueCo()-player2.getnDIsBlueCO(); i++) {
                        if (coins[i].getOwner() == 2){
                            coins[i].setOwner(3);
                        j++;}
                    }
                }

                if(player2.getnDIsRedCO() >= thisCard.getRedCo()){}
                else{
                    for (int i = 12, j = 0; j <   thisCard.getRedCo()-player2.getnDIsRedCO(); i++) {
                    if (coins[i].getOwner() == 2){
                        coins[i].setOwner(3);
                    j++;}
                }
                }

                if(player2.getnDIsGreenCO() >= thisCard.getGreenCo()){}
                else {
                    for (int i = 16, j = 0; j <   thisCard.getGreenCo()-player2.getnDIsGreenCO(); i++) {
                        if (coins[i].getOwner() == 2){
                            coins[i].setOwner(3);
                            j++;}
                    }
                }

                //کاهش سکه های درج شده روی کارت
                if(player2.getnDIsBlackCO() >= thisCard.getBlackCo()){}
                else    player2.setnBlackCo(player2.getnBlackCo() + player2.getnDIsBlackCO() - thisCard.getBlackCo());

                if(player2.getnDIsWhiteCO()>= thisCard.getWhiteCo()){}
                else  player2.setnWhaiteCo(player2.getnWhaiteCo() + player2.getnDIsWhiteCO() - thisCard.getWhiteCo());

                if(player2.getnDIsBlueCO() >= thisCard.getBlueCo()){}
                else   player2.setNblueCo(player2.getNblueCo() + player2.getnDIsBlueCO() - thisCard.getBlueCo());

                if(player2.getnDIsRedCO() >= thisCard.getRedCo()){}
                else  player2.setnRedCo(player2.getnRedCo() + player2.getnDIsRedCO() - thisCard.getRedCo());

                if(player2.getnDIsGreenCO() >= thisCard.getGreenCo()){}
                else  player2.setnGreenCo(player2.getnGreenCo() + player2.getnDIsGreenCO() - thisCard.getGreenCo());

                //افزایش سکه های تخفیف
                if (thisCard.getColorDisCo() == 1)
                    player2.setnDIsBlackCO(player2.getnDIsBlackCO() + thisCard.getnDicCo());
                if (thisCard.getColorDisCo() == 2)
                    player2.setnDIsWhiteCO(player2.getnDIsWhiteCO() + thisCard.getnDicCo());
                if (thisCard.getColorDisCo() == 3)
                    player2.setnDIsBlueCO(player2.getnDIsBlueCO() + thisCard.getnDicCo());
                if (thisCard.getColorDisCo() == 4)
                    player2.setnDIsRedCO(player2.getnDIsRedCO() + thisCard.getnDicCo());
                if (thisCard.getColorDisCo() == 5)
                    player2.setnDIsGreenCO(player2.getnDIsGreenCO() + thisCard.getnDicCo());

                return true;
            } else {//در صورت نیاز به سکه های طلایی
                int needGoldCoin = 0;
                if (thisCard.getBlackCo() > player2.getnBlackCo()+player2.getnDIsBlackCO())
                    needGoldCoin += (thisCard.getBlackCo() - player2.getnBlackCo()-player2.getnDIsBlackCO());

                if (thisCard.getWhiteCo() > player2.getnWhaiteCo()+player2.getnDIsWhiteCO())
                    needGoldCoin += (thisCard.getWhiteCo() - player2.getnWhaiteCo()-player2.getnDIsWhiteCO());

                if (thisCard.getBlueCo() > player2.getNblueCo()+player2.getnDIsBlueCO())
                    needGoldCoin += (thisCard.getBlueCo() - player2.getNblueCo()-player2.getnDIsBlueCO());

                if (thisCard.getRedCo() > player2.getnRedCo()+player2.getnDIsRedCO())
                    needGoldCoin += (thisCard.getRedCo() - player2.getnRedCo()-player2.getnDIsRedCO());

                if (thisCard.getGreenCo() > player2.getnGreenCo() + player2.getnDIsGreenCO())
                    needGoldCoin += (thisCard.getGreenCo() - player2.getnGreenCo() - player2.getnDIsGreenCO());

                if (needGoldCoin <= player2.getnGoldCo()) {

                    player2.setNumberCards(player2.getNumberCards()+1);
                    thisCard.setOwner(1);
                    player2.setPoint(player2.getPoint()+thisCard.getPoint());

                    //برگرداندن سکه ها به بانک
                    if(player2.getnDIsBlackCO() >= thisCard.getBlackCo()){}
                    else if(player2.getnDIsBlackCO()+player2.getnBlackCo()>=thisCard.getBlackCo()){
                        for (int i = 0, j = 0; j < -player2.getnDIsBlackCO() + thisCard.getBlackCo(); i++) {
                            if (coins[i].getOwner() == 2)
                                coins[i].setOwner(3);j++;
                        }
                        player2.setnBlackCo(player2.getnBlackCo() + player2.getnDIsBlackCO() - thisCard.getBlackCo());
                    }else {
                        for (int i = 0, j = 0; j < player2.getnBlackCo(); i++) {
                            if (coins[i].getOwner() == 2)
                                coins[i].setOwner(3);j++;
                        }
                        player2.setnGoldCo(player2.getnGoldCo() - thisCard.getBlackCo() + player2.getnBlackCo()+ player2.getnDIsBlackCO());
                        player2.setnBlackCo(0);
                    }

                    if(player2.getnDIsWhiteCO()>= thisCard.getWhiteCo()){}
                    else if(player2.getnDIsWhiteCO()+player2.getnWhaiteCo()>=thisCard.getWhiteCo()){
                        for (int i = 4, j = 0; j < -player2.getnDIsWhiteCO() + thisCard.getWhiteCo(); i++) {
                            if (coins[i].getOwner() == 2)
                                coins[i].setOwner(3);j++;
                        }
                        player2.setnWhaiteCo(player2.getnWhaiteCo() + player2.getnDIsWhiteCO() - thisCard.getWhiteCo());
                    }else {
                        for (int i = 4, j = 0; j < player2.getnWhaiteCo(); i++) {
                            if (coins[i].getOwner() == 2)
                                coins[i].setOwner(3);j++;
                        }
                        player2.setnGoldCo(player2.getnGoldCo() - thisCard.getWhiteCo() + player2.getnWhaiteCo()+ player2.getnDIsWhiteCO());
                        player2.setnWhaiteCo(0);
                    }

                    if(player2.getnDIsBlueCO()>= thisCard.getBlueCo()){}
                    else if(player2.getnDIsBlackCO()+player2.getNblueCo()>=thisCard.getBlueCo()){
                        for (int i = 8, j = 0; j < -player2.getnDIsBlueCO() + thisCard.getBlueCo(); i++) {
                            if (coins[i].getOwner() == 2)
                                coins[i].setOwner(3);j++;
                        }
                        player2.setNblueCo(player2.getNblueCo() + player2.getnDIsBlueCO() - thisCard.getBlueCo());
                    }else {
                        for (int i = 8, j = 0; j < player2.getNblueCo(); i++) {
                            if (coins[i].getOwner() == 2)
                                coins[i].setOwner(3);j++;
                        }
                        player2.setnGoldCo(player2.getnGoldCo() - thisCard.getBlueCo() + player2.getNblueCo()+ player2.getnDIsBlueCO());
                        player2.setNblueCo(0);
                    }


                    if(player2.getnDIsRedCO()>= thisCard.getRedCo()){}
                    else if(player2.getnDIsRedCO()+player2.getnRedCo()>=thisCard.getRedCo()){
                        for (int i = 12, j = 0; j < -player2.getnDIsRedCO() + thisCard.getRedCo(); i++) {
                            if (coins[i].getOwner() == 2)
                                coins[i].setOwner(3);j++;
                        }
                        player2.setnRedCo(player2.getnRedCo() + player2.getnDIsRedCO() - thisCard.getRedCo());
                    }else {
                        for (int i = 12, j = 0; j < player2.getnRedCo(); i++) {
                            if (coins[i].getOwner() == 2)
                                coins[i].setOwner(3);j++;
                        }
                        player2.setnGoldCo(player2.getnGoldCo() - thisCard.getRedCo() + player2.getnRedCo()+ player2.getnDIsRedCO());
                        player2.setnRedCo(0);
                    }


                    if(player2.getnDIsGreenCO()>= thisCard.getGreenCo()){}
                    else if(player2.getnDIsGreenCO()+player2.getnGreenCo()>=thisCard.getGreenCo()){
                        for (int i = 16, j = 0; j < -player2.getnDIsGreenCO() + thisCard.getGreenCo(); i++) {
                            if (coins[i].getOwner() == 2)
                                coins[i].setOwner(3);j++;
                        }
                        player2.setnGreenCo(player2.getnGreenCo() + player2.getnDIsGreenCO() - thisCard.getGreenCo());
                    }else {
                        for (int i = 16, j = 0; j < player2.getnGreenCo(); i++) {
                            if (coins[i].getOwner() == 1)
                                coins[i].setOwner(3);j++;
                        }
                        player2.setnGoldCo(player2.getnGoldCo() - thisCard.getGreenCo() + player2.getnGreenCo()+ player2.getnDIsGreenCO());
                        player2.setnGreenCo(0);
                    }

                    return true;
                } else
                    return false;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ByCard example = new ByCard();
            example.setVisible(true);
        });
    }
}