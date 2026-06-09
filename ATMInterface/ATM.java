import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATM extends JFrame implements ActionListener {

    private BankAccount account;

    private JLabel balanceLabel;
    private JTextField amountField;

    private JButton depositButton;
    private JButton withdrawButton;
    private JButton checkBalanceButton;
    private JButton exitButton;

    public ATM(BankAccount account) {
        this.account = account;

        setTitle("ATM Interface");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 10, 10));

        JLabel titleLabel = new JLabel("ATM SYSTEM", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        balanceLabel = new JLabel("Current Balance: ₹5000", SwingConstants.CENTER);

        amountField = new JTextField();

        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        checkBalanceButton = new JButton("Check Balance");
        exitButton = new JButton("Exit");

        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        checkBalanceButton.addActionListener(this);
        exitButton.addActionListener(this);

        panel.add(titleLabel);
        panel.add(balanceLabel);
        panel.add(amountField);
        panel.add(depositButton);
        panel.add(withdrawButton);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(checkBalanceButton);
        bottomPanel.add(exitButton);

        add(panel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            if (e.getSource() == depositButton) {

                double amount = Double.parseDouble(amountField.getText());

                if (amount > 0) {
                    account.deposit(amount);
                    JOptionPane.showMessageDialog(this,
                            "₹" + amount + " Deposited Successfully");
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Enter a valid amount");
                }

            } else if (e.getSource() == withdrawButton) {

                double amount = Double.parseDouble(amountField.getText());

                if (amount > 0) {
                    account.withdraw(amount);
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Enter a valid amount");
                }

            } else if (e.getSource() == checkBalanceButton) {

                balanceLabel.setText(
                        "Current Balance: ₹" + account.getBalance());

            } else if (e.getSource() == exitButton) {

                JOptionPane.showMessageDialog(this,
                        "Thank You for using ATM!");
                System.exit(0);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid number");
        }
    }
}