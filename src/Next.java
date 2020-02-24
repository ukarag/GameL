import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Next {

    public int i = 0;
    private Game game;
    public boolean open;
    public boolean click = false;

    public Next(Game game){
        this.game = game;

        JFrame guiFrame = new JFrame();

        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Game");
        guiFrame.setSize(500,500);

        guiFrame.setLocationRelativeTo(null);

        final JPanel seasonPanel = new JPanel();

        JLabel s = new JLabel("Season: " + game.getSeason());
        seasonPanel.add(s);

        JButton next = new JButton("Next");
        next.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {

                game.changeSeason();
                game.newRound();
                game.printstuff();

                s.setText("Season: " + game.getSeason());
                click = true;

            }
        });

        guiFrame.add(seasonPanel, BorderLayout.NORTH);
        guiFrame.add(next, BorderLayout.SOUTH);
        guiFrame.setVisible(true);

    }

}