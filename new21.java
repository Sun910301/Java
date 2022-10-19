import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class new21 {

    static int b[] = new int[5];
    static int i[] = new int[5];
    static int n[] = new int[4];
    static int g[] = new int[5];
    static int o[] = new int[5];

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }
        start();
    }

    public static void start() {
        //Creating Variables for the frame...
        JFrame k = new JFrame("Bingo!");
        JLabel bk = new JLabel(new ImageIcon("images/bk.png"));
        JButton Play = new JButton();
        JButton view = new JButton();
        JLabel nice = new JLabel(new ImageIcon("images/bk2.png"));

        //Setting size of JFrame...
        k.setSize(600, 680);
        k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Setting the location of the labels
        bk.setBounds(-10, 170, 600, 200);
        Play.setBounds(190, 400, 190, 100);
        nice.setBounds(0, 0, 600, 680);
        view.setBounds(235, 520, 100, 50);

        Play.setForeground(Color.BLACK);//sets foreground/background/font
        Play.setContentAreaFilled(false);
        Play.setFocusPainted(false);
        Play.setFont(new Font("Helvetica", Font.BOLD, 12));
        Play.setText("Generate Card");

        view.setForeground(Color.WHITE);//sets foreground/background/font
        view.setContentAreaFilled(false);
        view.setFocusPainted(false);
        view.setFont(new Font("Helvetica", Font.BOLD, 10));
        view.setText("Cards");

        k.add(bk);
        k.add(Play);
        k.add(view);
        k.add(nice);
        k.setLayout(null);
        k.setVisible(true);

        Play.addActionListener(new ActionListener() { //Action Listener when called, calls random();
            public void actionPerformed(ActionEvent e) {
                k.dispose();
                random();
            }

        });
        view.addActionListener(new ActionListener() { //Action Listener when pressing "Generate Card"
            public void actionPerformed(ActionEvent e) {
                k.dispose();
                stats();
            }

        }); //Action listener when called, calls stats();
    }

    public static void stats() {
        JFrame k = new JFrame();//creating variables for all labels
        JLabel bk = new JLabel(new ImageIcon("images/bk2.png"));
        JLabel title = new JLabel(new ImageIcon("images/title.png"));
        JLabel star = new JLabel(new ImageIcon("images/star.png"));
        JButton gen = new JButton();
        JButton back = new JButton("Back");
        back.setForeground(Color.WHITE);//sets foreground/background/font
        back.setContentAreaFilled(false);
        back.setFocusPainted(false);

        gen.setText("Generate Card");//sets foreground/background/font
        gen.setForeground(Color.WHITE);
        gen.setContentAreaFilled(false);
        gen.setFocusPainted(false);
        int x = 175;

        JTextField B[] = new JTextField[5];//Jtextfield arrays for user input
        JTextField I[] = new JTextField[5];
        JTextField N[] = new JTextField[4];
        JTextField G[] = new JTextField[5];
        JTextField O[] = new JTextField[5];

        for (int p = 0; p < B.length; p++) {//for loops that set bounds to each index in each Jtextfield array
            B[p] = new JTextField();
            B[p].setBounds(100, x, 75, 75);
            x = x + 75;
            B[p].setOpaque(false);
            k.add(B[p]);

        }
        x = 175;
        for (int p = 0; p < I.length; p++) {
            I[p] = new JTextField();
            I[p].setBounds(175, x, 75, 75);
            x = x + 75;
            I[p].setOpaque(false);
            k.add(I[p]);
        }
        x = 175;
        for (int p = 0; p < N.length; p++) {
            N[p] = new JTextField();
            while (x == 325) {
                x = x + 75;
            }
            N[p].setBounds(250, x, 75, 75);
            x = x + 75;
            N[p].setOpaque(false);
            k.add(N[p]);
        }
        x = 175;
        for (int p = 0; p < G.length; p++) {
            G[p] = new JTextField();
            G[p].setBounds(325, x, 75, 75);
            x = x + 75;
            G[p].setOpaque(false);
            k.add(G[p]);
        }
        x = 175;
        for (int p = 0; p < O.length; p++) {
            O[p] = new JTextField();
            O[p].setBounds(400, x, 75, 75);
            x = x + 75;
            O[p].setOpaque(false);
            k.add(O[p]);
        }

        for (int p = 0; p < B.length; p++) {
            try {
                N[p].setFont(new Font("Comic Sans MS", Font.BOLD, 18));
            } catch (Exception e) {

            }
            B[p].setFont(new Font("Comic Sans MS", Font.BOLD, 18));//sets font of the text field
            I[p].setFont(new Font("Comic Sans MS", Font.BOLD, 18));
            G[p].setFont(new Font("Comic Sans MS", Font.BOLD, 18));
            O[p].setFont(new Font("Comic Sans MS", Font.BOLD, 18));

        }

        B[0].setText("1-15");// sets range in text field that user is instructed to input
        I[0].setText("16-30");
        N[0].setText("31-45");
        G[0].setText("46-60");
        O[0].setText("61-75");

        back.setBounds(400, 570, 75, 40);
        title.setBounds(40, 60, 500, 114);
        gen.setBounds(190, 570, 190, 50);// sets bounds of all labels/button
        bk.setBounds(0, 0, 600, 680);
        star.setBounds(250, 325, 75, 75);
        k.setSize(600, 680);
        k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        k.add(back);
        k.add(star);
        k.add(title);
        k.add(gen);
        k.add(bk);
        k.setLayout(null);
        k.setVisible(true);

        gen.addActionListener(new ActionListener() { //Action Listener when called, check
            String BS[] = new String[5];
            String IS[] = new String[5];
            String NS[] = new String[4];
            String GS[] = new String[5];
            String OS[] = new String[5];
            int Bi[] = new int[5];
            int Ii[] = new int[5];
            int Ni[] = new int[4];
            int Gi[] = new int[5];
            int Oi[] = new int[5];

            public void actionPerformed(ActionEvent e) {
                boolean isGood = true;
                try {
                    for (int p = 0; p < B.length; p++) {
                        try {
                            BS[p] = B[p].getText();
                            Bi[p] = Integer.parseInt(BS[p]);
                            IS[p] = I[p].getText();
                            Ii[p] = Integer.parseInt(IS[p]);
                            NS[p] = N[p].getText();
                            Ni[p] = Integer.parseInt(NS[p]);
                            GS[p] = G[p].getText();
                            Gi[p] = Integer.parseInt(GS[p]);
                            OS[p] = O[p].getText();
                            Oi[p] = Integer.parseInt(OS[p]);
                        } catch (Exception ign) {
                        }
                    }
                } catch (Exception ignored) {
                    isGood = false;
                }

                if (isGood == false) {
                    card(Bi, Ii, Ni, Gi, Oi);
                    k.dispose();
                } else{
                    B[0].setText("Invalid!");
                    I[0].setText("Enter");
                    N[0].setText("Numbers");
                    G[0].setText("To");
                    O[0].setText("Continue");
                }

            }
        });
        back.addActionListener(new ActionListener() { //Action Listener when pressing "Generate Card"
            public void actionPerformed(ActionEvent e) {
                k.dispose();
                start();
            }
        });
    }

    public static void random() { // Random number Generator method, is called when action listener runs
        Random random = new Random();

        for (int p = 0; p < b.length; p++) { //The loops are to check for duplication in random numbers
            b[p] = (int) (random.nextDouble() * 14 + 1);
            do {
                b[1] = (int) (random.nextDouble() * 14 + 1);
            } while (b[1] == b[0]);
            do {
                b[2] = (int) (random.nextDouble() * 14 + 1);
            } while (b[2] == b[1] || b[2] == b[0]);
            do {
                b[3] = (int) (random.nextDouble() * 14 + 1);
            } while (b[3] == b[0] || b[3] == b[1] || b[3] == b[2]);
            do {
                b[4] = (int) (random.nextDouble() * 14 + 1);
            } while (b[4] == b[0] || b[4] == b[1] || b[4] == b[2] || b[4] == b[3]);

        }

        for (int p = 0; p < i.length; p++) {  //The loops are to check for duplication in random numbers
            i[p] = (int) (random.nextDouble() * 14 + 16);
            do {
                i[1] = (int) (random.nextDouble() * 14 + 16);
            } while (i[1] == i[0]);
            do {
                i[2] = (int) (random.nextDouble() * 14 + 16);
            } while (i[2] == i[1] || i[2] == i[0]);
            do {
                i[3] = (int) (random.nextDouble() * 14 + 16);
            } while (i[3] == i[0] || i[3] == i[1] || i[3] == i[2]);
            do {
                i[4] = (int) (random.nextDouble() * 14 + 16);
            } while (i[4] == i[0] || i[4] == i[1] || i[4] == i[2] || i[4] == i[3]);

        }

        for (int p = 0; p < n.length; p++) {  //The loops are to check for duplication in random numbers
            n[p] = (int) (random.nextDouble() * 14 + 31);
            do {
                n[1] = (int) (random.nextDouble() * 14 + 31);
            } while (n[1] == n[0]);
            do {
                n[2] = (int) (random.nextDouble() * 14 + 31);
            } while (n[2] == n[1] || n[2] == n[0]);
            do {
                n[3] = (int) (random.nextDouble() * 14 + 31);
            } while (n[3] == n[0] || n[3] == n[1] || n[3] == n[2]);

        }
        for (int p = 0; p < n.length; p++) {  //The loops are to check for duplication in random numbers
            g[p] = (int) (random.nextDouble() * 14 + 46);
            do {
                g[1] = (int) (random.nextDouble() * 14 + 46);
            } while (g[1] == g[0]);
            do {
                g[2] = (int) (random.nextDouble() * 14 + 46);
            } while (g[2] == g[1] || g[2] == g[0]);
            do {
                g[3] = (int) (random.nextDouble() * 14 + 46);
            } while (g[3] == g[0] || g[3] == g[1] || g[3] == g[2]);
            do {
                g[4] = (int) (random.nextDouble() * 14 + 46);
            } while (g[4] == g[0] || g[4] == g[1] || g[4] == g[2] || g[4] == g[3]);

        }
        for (int p = 0; p < n.length; p++) {  //The loops are to check for duplication in random numbers
            o[p] = (int) (random.nextDouble() * 14 + 61);
            do {
                o[1] = (int) (random.nextDouble() * 14 + 61);
            } while (o[1] == o[0]);
            do {
                o[2] = (int) (random.nextDouble() * 14 + 61);
            } while (o[2] == o[1] || o[2] == o[0]);
            do {
                o[3] = (int) (random.nextDouble() * 14 + 61);
            } while (o[3] == o[0] || o[3] == o[1] || o[3] == o[2]);
            do {
                o[4] = (int) (random.nextDouble() * 14 + 61);
            } while (o[4] == o[0] || o[4] == o[1] || o[4] == o[2] || o[4] == o[3]);

        }
        card(b, i, n, g, o);

    }

    public static void card(int[] b, int[] i, int[] n, int[] g, int[] o) { //Creates frame for card
        JFrame R = new JFrame("Bingo!");
        int x = 175;
        JButton reset = new JButton();
        reset.setText("Generate New  Card");
        reset.setBounds(195, 570, 190, 40);
        reset.setForeground(Color.WHITE);
        reset.setContentAreaFilled(false);
        reset.setFocusPainted(false);

        R.setSize(600, 680);
        R.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel(new ImageIcon("images/title.png"));
        JLabel star = new JLabel(new ImageIcon("images/star.png"));
        JLabel nice = new JLabel(new ImageIcon("images/bk2.png"));
        JButton back = new JButton("Back");
        back.setForeground(Color.WHITE);
        back.setContentAreaFilled(false);
        back.setFocusPainted(false);

        back.setBounds(400, 570, 75, 40);
        title.setBounds(40, 60, 500, 114);
        star.setBounds(250, 325, 75, 75);
        nice.setBounds(0, 0, 600, 680);

        //Creating JButtons for Bingo card
        JButton B[] = new JButton[5];
        String b1[] = new String[5];
        JButton I[] = new JButton[5];
        String i1[] = new String[5];
        JButton N[] = new JButton[4];
        String n1[] = new String[4];
        JButton G[] = new JButton[5];
        String g1[] = new String[5];
        JButton O[] = new JButton[5];
        String o1[] = new String[5];

        //For loops to setText to all of the buttons
        for (int p = 0; p < b.length; p++) {
            b1[p] = String.valueOf(b[p]);
            B[p] = new JButton();
            B[p].setText(b1[p]);
            B[p].setForeground(Color.BLACK);
            B[p].setContentAreaFilled(false);
            B[p].setFocusPainted(false);
            B[p].setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
            R.add(B[p]);
        }
        for (int p = 0; p < i.length; p++) {
            i1[p] = String.valueOf(i[p]);
            I[p] = new JButton();
            I[p].setText(i1[p]);
            I[p].setForeground(Color.BLACK);
            I[p].setContentAreaFilled(false);
            I[p].setFocusPainted(false);
            I[p].setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
            R.add(I[p]);
        }
        for (int p = 0; p < n.length; p++) {
            n1[p] = String.valueOf(n[p]);
            N[p] = new JButton();
            N[p].setText(n1[p]);
            N[p].setForeground(Color.BLACK);
            N[p].setContentAreaFilled(false);
            N[p].setFocusPainted(false);
            N[p].setFont(new Font("Comnc Sans MS", Font.PLAIN, 26));
            R.add(N[p]);
        }
        for (int p = 0; p < g.length; p++) {
            g1[p] = String.valueOf(g[p]);
            G[p] = new JButton();
            G[p].setText(g1[p]);
            G[p].setForeground(Color.BLACK);
            G[p].setContentAreaFilled(false);
            G[p].setFocusPainted(false);
            G[p].setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
            R.add(G[p]);
        }
        for (int p = 0; p < o.length; p++) {
            o1[p] = String.valueOf(o[p]);
            O[p] = new JButton();
            O[p].setText(o1[p]);
            O[p].setForeground(Color.BLACK);
            O[p].setContentAreaFilled(false);
            O[p].setFocusPainted(false);
            O[p].setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
            R.add(O[p]);
        }

        for (int p = 0; p < b.length; p++) {
            B[p].setBounds(100, x, 75, 75);
            x = x + 75;
        }
        x = 175;
        for (int p = 0; p < I.length; p++) {
            I[p].setBounds(175, x, 75, 75);
            x = x + 75;
        }
        x = 175;
        for (int p = 0; p < N.length; p++) {
            while (x == 325) {
                x = x + 75;
            }
            N[p].setBounds(250, x, 75, 75);

            x = x + 75;
        }
        x = 175;
        for (int p = 0; p < G.length; p++) {
            G[p].setBounds(325, x, 75, 75);
            x = x + 75;
        }
        x = 175;
        for (int p = 0; p < O.length; p++) {
            O[p].setBounds(400, x, 75, 75);
            x = x + 75;
        }

        R.add(title);//adds all of the components to the Frame...
        R.add(back);
        R.add(reset);
        R.add(star);
        R.add(nice);
        R.setLayout(null);
        R.setVisible(true);

        reset.addActionListener(new ActionListener() { //Action Listener when pressing "Generate Card"
            public void actionPerformed(ActionEvent e) {
                R.dispose();
                random();

            }

        });
        back.addActionListener(new ActionListener() { //Action Listener when pressing "Generate Card"
            public void actionPerformed(ActionEvent e) {
                R.dispose();
                start();

            }

        });
        B[0].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    B[0].setForeground(Color.red);
                } else if (right) {
                    B[0].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        B[1].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    B[1].setForeground(Color.red);
                } else if (right) {
                    B[1].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        B[2].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    B[2].setForeground(Color.red);
                } else if (right) {
                    B[2].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        B[3].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    B[3].setForeground(Color.red);
                } else if (right) {
                    B[3].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        B[4].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    B[4].setForeground(Color.red);
                } else if (right) {
                    B[4].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        I[0].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    I[0].setForeground(Color.red);
                } else if (right) {
                    I[0].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        I[1].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    I[1].setForeground(Color.red);
                } else if (right) {
                    I[1].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        I[2].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    I[2].setForeground(Color.red);
                } else if (right) {
                    I[2].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        I[3].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    I[3].setForeground(Color.red);
                } else if (right) {
                    I[3].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        I[4].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    I[4].setForeground(Color.red);
                } else if (right) {
                    I[4].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        N[0].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    N[0].setForeground(Color.red);
                } else if (right) {
                    N[0].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        N[1].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    N[1].setForeground(Color.red);
                } else if (right) {
                    N[1].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        N[2].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    N[2].setForeground(Color.red);
                } else if (right) {
                    N[2].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        N[3].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    N[3].setForeground(Color.red);
                } else if (right) {
                    N[3].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        G[0].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    G[0].setForeground(Color.red);
                } else if (right) {
                    G[0].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        G[1].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    G[1].setForeground(Color.red);
                } else if (right) {
                    G[1].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        G[2].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    G[2].setForeground(Color.red);
                } else if (right) {
                    G[2].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        G[3].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    G[3].setForeground(Color.red);
                } else if (right) {
                    G[3].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        G[4].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    G[4].setForeground(Color.red);
                } else if (right) {
                    G[4].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        O[0].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    O[0].setForeground(Color.red);
                } else if (right) {
                    O[0].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        O[1].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    O[1].setForeground(Color.red);
                } else if (right) {
                    O[1].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        O[2].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    O[2].setForeground(Color.red);
                } else if (right) {
                    O[2].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        O[3].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    O[3].setForeground(Color.red);
                } else if (right) {
                    O[3].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });
        O[4].addActionListener(new ActionListener() {
            private boolean right = false;

            public void actionPerformed(ActionEvent e) {
                if (!right) {
                    O[4].setForeground(Color.red);
                } else if (right) {
                    O[4].setForeground(Color.BLACK);
                }
                right = !right;
            }
        });

    }

}